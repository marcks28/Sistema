/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 *
 * @author edsonmarcks
 */
public class ComandosSQL {

    protected ConnectionFactory fabrica;
    protected PreparedStatement ps;
    protected ResultSet rs;

    protected void execute(String sql, Object[] values) throws SQLException {
        if (sql.trim().isEmpty() || sql.trim().equals("")) {
            throw new SQLException("SQL inválida");
        }

        if (values == null || values.length <= 0) {
            throw new SQLException("Informe os valores");
        }

        ps = fabrica.getConnection().prepareStatement(sql);
        int positiion = 1;
        for (Object obj : values) {
            if (obj instanceof LocalDateTime) {
                ps.setTimestamp(positiion, java.sql.Timestamp.valueOf((LocalDateTime) obj));
            } 
            else if( obj instanceof Long)
            {
                ps.setLong(positiion, (long) obj );
            }
            else {
                ps.setObject(positiion, obj);
            }

            positiion++;
        }
        ps.executeUpdate();
        ps.closeOnCompletion();
        System.out.println("comando realizado com sucesso!");
    }

    protected ResultSet executeQuery(String sql, Object[] values) throws SQLException {
        if (sql.trim().isEmpty() || sql.trim().equals("")) {
            throw new SQLException("SQL inválida");
        }

        ps = fabrica.getConnection().prepareStatement(sql);
        if (values.length > 0) {
            int positiion = 1;

            for (Object obj : values) {
                if (obj instanceof LocalDateTime) {
                    ps.setTimestamp(positiion, java.sql.Timestamp.valueOf((LocalDateTime) obj));
                } else {
                    ps.setObject(positiion, obj);
                }
                positiion++;
            }
        }
        
        rs = ps.executeQuery();
        return rs;
    }
}
