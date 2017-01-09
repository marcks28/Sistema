/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.data;

import modelo.data.interfaces.IUsuarioDAL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import modelo.Usuario;

/**
 *
 * @author edsonmarcks
 */
public class UsuarioDAL extends ComandosSQL implements IUsuarioDAL {

    @Override
    public void Save(Usuario entity) throws SQLException {
        String sql = "INSERT INTO Usuario (login,senha,permissao) VALUES (?,?,?) ";
        execute(sql, new Object[ ]{
            entity.getLogin(),
            entity.getSenha(),
            entity.getPermissao()
        });
    }

    @Override
    public void Update(Usuario entity) throws SQLException {
        String sql = "UPDATE Usuario SET (login, permissao) WHERE id=? AND senha = ?";
        execute(sql, new Object[]{
            entity.getLogin(),
            entity.getPermissao(),
            entity.getId(),
            entity.getSenha()
        });
    }

    @Override
    public void Delete(Usuario entity) throws SQLException {
         String sql = "DELETE FROM  Usuario WHERE id=?";
        execute(sql, new Object[]{
            entity.getId()
        });
    }

    @Override
    public Usuario FindId(long id) throws SQLException {
        String sql = "SELECT * FROM Usuario WHERE id=?";
        Usuario user = null;
        executeQuery(sql, new Object[]{id});
        if(rs.next())
        {
            user = new Usuario();
            user.setId(rs.getLong("id"));
            user.setLogin(rs.getString("login"));
            user.setPermissao(rs.getString("permissao"));
            user.setSenha(rs.getString("senha"));
        }
        rs.close();
        ps.closeOnCompletion();
        return user;
    }

    @Override
    public List<Usuario> GetAll() throws SQLException {
        String sql = "SELECT * FROM Usuario";
        execute(sql, null);
        List<Usuario> usuarios = new ArrayList<>();
        while(rs.next())
        {
            Usuario   user = new Usuario();
            user.setId(rs.getLong("id"));
            user.setLogin(rs.getString("login"));
            user.setPermissao(rs.getString("permissao"));
            user.setSenha(rs.getString("senha"));
            usuarios.add(user);
            user = null;
        }
        rs.close();
        ps.closeOnCompletion();
        return usuarios;
    }

    @Override
    public List<Usuario> GetAll(Predicate<Usuario> predicate) throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            usuarios = GetAll().stream().filter(predicate).collect(Collectors.<Usuario>toList());
        } catch (NoSuchElementException e) {
            System.err.println("Não encontrado");
        }
        return  usuarios;
    }

    @Override
    public Usuario Find(Predicate<Usuario> predicate) throws SQLException {
        Usuario usuario = null;
        try {
            usuario = GetAll(predicate).stream().findFirst().get();
        } catch (NoSuchElementException e) {
            System.err.println("não encontrado");
        }
        return  usuario;
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
