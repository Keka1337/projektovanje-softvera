/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.db;

import constants.ServerConstants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jelena
 */
public class DbConnectionFactory {
    
    private Connection connection;
    private static DbConnectionFactory instance;
    private static final Logger LOG = Logger.getLogger(DbConnectionFactory.class.getName());
    
    private DbConnectionFactory() {
    }

    public static DbConnectionFactory getInstance() {
        if(instance == null)
            instance = new DbConnectionFactory();
        return instance;
    }

    public Connection getConnection() throws FileNotFoundException, SQLException, IOException {
        if(connection == null || connection.isClosed()){
            try{
                Properties properties = new Properties();
                properties.load(new FileInputStream(ServerConstants.CONFIG_FILE));
                String url = properties.getProperty(ServerConstants.DB_URL);
                String username = properties.getProperty(ServerConstants.DB_USER);
                String password = properties.getProperty(ServerConstants.DB_PASSWORD);
                connection = DriverManager.getConnection(url, username, password);
                connection.setAutoCommit(false);
                LOG.log(Level.INFO, "***Uspešno uspostavljanje konekcije sa bazom!***");
            }catch(SQLException e){
                e.printStackTrace();
                throw new SQLException("Neuspešno uspostavljanje konekcije sa bazom!");
            }
        }
        return connection;
    }
    
    
    
}
