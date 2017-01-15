package controle;

import java.sql.SQLException;
import java.util.List;
import java.util.function.Predicate;
import modelo.Estoque;
import modelo.data.EstoqueDAL;
import modelo.data.interfaces.IControle;

public class ControleEstoque implements IControle<Estoque> {

    private EstoqueDAL dal;

    public ControleEstoque() {
        this.dal = new EstoqueDAL();
    }

    @Override
    public void saveUpdate(Estoque entity) throws SQLException {
        if (entity.getId() >= 0) {
            dal.Update(entity);
        } else {
            dal.Save(entity);
        }
    }

    @Override
    public void delete(Estoque entity) throws SQLException {
        dal.Delete(entity);
    }

    @Override
    public Estoque findById(long id) throws SQLException {
        return dal.FindId(id);
    }

    @Override
    public List<Estoque> getAll() throws SQLException {
        return dal.GetAll();
    }

    @Override
    public List<Estoque> getAll(Predicate<Estoque> predicate) throws SQLException {
        return dal.GetAll(predicate);
    }

    @Override
    public Estoque find(Predicate<Estoque> predicate) throws SQLException {
        return dal.Find(predicate);
    }

}
