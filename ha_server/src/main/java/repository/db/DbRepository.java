/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository.db;

import java.io.IOException;
import java.sql.SQLException;
import repository.GenericRepository;

/**
 *
 * @author Jelena
 */
public interface DbRepository<T> extends GenericRepository<T> {

    default public void connect() throws SQLException, IOException, ClassNotFoundException {
        DbConnectionFactory.getInstance().getConnection();
    }

    default public void disconnect() throws SQLException, IOException, ClassNotFoundException {
        DbConnectionFactory.getInstance().getConnection().close();
    }

    default public void commit() throws SQLException, IOException, ClassNotFoundException {
        DbConnectionFactory.getInstance().getConnection().commit();
    }

    default public void rollback() throws SQLException, IOException, ClassNotFoundException {
        DbConnectionFactory.getInstance().getConnection().rollback();
    }

}
