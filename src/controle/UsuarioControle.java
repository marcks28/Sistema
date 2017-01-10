package controle;

import java.sql.SQLException;
import java.util.List;
import java.util.function.Predicate;
import modelo.Usuario;
import modelo.data.UsuarioDAL;
import modelo.data.interfaces.IControle;

/**
 *
 * @author edsonmarcks
 */
public class UsuarioControle implements IControle<Usuario> {

    private final UsuarioDAL usuarioDal;

    public UsuarioControle() {
        usuarioDal = new UsuarioDAL();
    }

    @Override
    public void saveUpdate(Usuario entity) throws SQLException {
        if (entity.getLogin().trim().isEmpty() || entity.getLogin().trim().equals("")) {
            throw new SQLException("O campo login não pode ser vazio!");

        } else if (entity.getPermissao().trim().isEmpty() || entity.getPermissao().trim().equals("")) {

            throw new SQLException("O campo permissão não pode ser vazio!");
        } else if (entity.getSenha().trim().isEmpty() || entity.getSenha().trim().equals("")) {

            throw new SQLException("A senha não pode ser vazia!");
        } else if (entity.getLogin().length() > 50) {

            throw new SQLException("Excedeu o tamanho máximo! de 50 caracteres");
        } else if (entity.getSenha().length() > 50) {

            throw new SQLException("Excedeu o tamanho máximo! de 50 caracteres");

        }

        if (entity.getId() > 0) {
            usuarioDal.Update(entity);
        } else {
            //save
            usuarioDal.Save(entity);
        }
    }

    @Override
    public void delete(Usuario entity) throws SQLException {
        usuarioDal.Delete(entity);
    }

    @Override
    public Usuario findById(long id) throws SQLException {
        return usuarioDal.FindId(id);
    }

    @Override
    public List<Usuario> getAll() throws SQLException {
        return usuarioDal.GetAll();
    }

    @Override
    public List<Usuario> getAll(Predicate<Usuario> predicate) throws SQLException {
        return getAll(predicate);
    }

    @Override
    public Usuario find(Predicate<Usuario> predicate) throws SQLException {
        return find(predicate);
    }

    public Usuario autorizar(String login, String senha) throws SQLException {
        if (login.trim().isEmpty() || login.trim().equals("")) {
            throw new SQLException("Preencha corretamente o campo login");
        } else if (senha.trim().isEmpty() || senha.trim().equals("")) {
            throw new SQLException("Preencha corretamente o campo senha");
        }

        return usuarioDal.verificaUsuario(login, senha);

    }
}
