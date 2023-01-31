/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db;

import domain.GenericEntity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Jelena
 */
public class DbRepositoryImpl implements DbRepository<GenericEntity> {

    @Override
    public void add(GenericEntity entity) throws Exception {
        try {
            //prvo nam treba konekcija
            Connection connection = DbConnectionFactory.getInstance().getConnection();
            //zatim definisemo upit koji zelimo da izvrsimo
            StringBuilder sb = new StringBuilder();
            //razlikuju nam se naziv tabele, kolone koje se koriste za upit
            //kada imamo autoinkrement tada moramo da navedemo imena kolona koje koristimo za ovu operaciju
            //dok kad koristimo sve kolone za upit tad ne moramo da navedemo kazive kolona(ili uzmemo i navedemo sve)
            //razlikuju se i vrednosti koje treba da ubacimo u bazu
            sb.append("INSERT INTO ").append(entity.getTableName()).append(" (").append(entity.getColumnNamesForInsert()).append(") VALUES (").append(entity.getInsertValues()).append(")");
            String query = sb.toString();
            System.out.println(query);
            //pravimo statement
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                Long id = rs.getLong(1);
                //int id = rs.getInt(1);
                entity.setId(id);
                System.out.println(id);
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Sistem ne moÅ¾e da zapamti " + entity.getTableName() + "!\n");
        }
    }

    @Override
    public void edit(GenericEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(GenericEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<GenericEntity> getAll(GenericEntity t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
