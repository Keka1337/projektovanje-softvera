/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db;

import domain.GenericEntity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jelena
 */
public class DbRepositoryImpl implements DbRepository<GenericEntity> {

    @Override
    public void add(GenericEntity entity) throws Exception {
        try {
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT INTO ").append(entity.getTableName()).append(" (").append(entity.getColumnNamesForInsert()).append(") VALUES (").append(entity.getInsertValues()).append(")");
            String query = sb.toString();
            System.out.println(query);
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                Long id = rs.getLong(1);
                entity.setId(id);
                System.out.println(id);
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Sistem ne može da zapamti " + entity.getTableName() + "!\n");
        }
    }

    @Override
    public void edit(GenericEntity entity) throws Exception {
        try {
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            //
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE ").append(entity.getTableName()).append(" SET ").append(entity.getColumnNamesValuesUpdate()).append(" WHERE ").append(entity.getWhereClauseDeleteEdit());
            String sql = sb.toString();
            System.out.println(sql);
            //
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Sistem ne može da zapamti " + entity.getTableName() + "!\n");
        }
    }

    @Override
    public void delete(GenericEntity entity) throws Exception {
        try {
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM ").append(entity.getTableName()).append(" WHERE ").append(entity.getWhereClauseDeleteEdit());
            String sql = sb.toString();
            System.out.println(sql);

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Sistem ne može da obriše  " + entity.getTableName() + "!\n");
        }
    }

    @Override
    public List<GenericEntity> getAll(GenericEntity entity) throws Exception {
        try {
            List<GenericEntity> list = new ArrayList<>();
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT ").append(entity.getColumnNamesForGetAll()).append(" FROM ").append(entity.getTableName()).append(" ").append(entity.getJoinClause()).append(" ")
                    .append(entity.getWhereForGetAll()).append(" ")
                    .append(entity.getOrderByClause());
            String sql = sb.toString();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                list.add(Mapper.map(entity, rs));
            }
            rs.close();
            statement.close();
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Sistem ne može da učita listu " + entity.getTableName() + "!\n");
        }
    }

}
