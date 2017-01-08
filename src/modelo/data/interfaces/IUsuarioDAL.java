/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.data.interfaces;

import java.sql.SQLException;
import modelo.Usuario;

/**
 *
 * @author edsonmarcks
 */
public interface IUsuarioDAL extends IOperation<Usuario>{
    
    public Usuario  verificaUsuario(String login, String senha) throws SQLException;
    
}
