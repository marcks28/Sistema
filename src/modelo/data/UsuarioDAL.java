/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.data;

import modelo.data.interfaces.IUsuarioDAL;
import java.sql.SQLException;
import java.util.List;
import java.util.function.Predicate;
import modelo.Usuario;

/**
 *
 * @author edsonmarcks
 */
public class UsuarioDAL extends ComandosSQL implements IUsuarioDAL {

    @Override
    public void Save(Usuario entity) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(Usuario entity) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete(Usuario entity) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario FindId(long id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> GetAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> GetAll(Predicate<Usuario> predicate) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario Find(Predicate<Usuario> predicate) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario verificaUsuario(String login, String senha) throws SQLException {
        String sql = "SELECT * From Usuario WHERE login = ? AND senha = ?";
        executeQuery(sql, new Object[]{login, senha});
        Usuario usuario = null;
        if (rs.next()) {
            usuario = new Usuario();
            usuario.setId(rs.getInt("id"));
            usuario.setLogin(rs.getString("login"));
            usuario.setSenha(rs.getString("senha"));
            usuario.setPermissao(rs.getString("permissao"));
        }
        rs.close();
        ps.closeOnCompletion();
        return usuario;
    }

}
