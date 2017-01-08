package modelo.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.sqlite.SQLiteConfig;

public class ConnectionFactory {

    private static Connection connection;

    private static Connection openConnection() throws SQLException {
          
        //preciso pegar o local do banco
        String localDb = ConnectionFactory.class.getResource("/modelo/data/base/dbLocal.db").getFile();
        
        //Se a conexão for diferente de nula 
        //quer dizer que ela já foi instaciada
        if (connection != null) {
            //verifico se a mesma não está fechada, caso não esteja retorno
            if (!connection.isClosed()) {
                return connection;
            }
        }
        //Registra o driver
        DriverManager.registerDriver(new org.sqlite.JDBC());
        SQLiteConfig config = new SQLiteConfig();
        config.enforceForeignKeys(true);
        connection = DriverManager.getConnection("jdbc:sqlite:"+localDb, config.toProperties());
        return connection;
    }

    public static Connection getConnection() throws SQLException {
        return openConnection();
    }
}
