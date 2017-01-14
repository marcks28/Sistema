
package controle;

import java.sql.SQLException;
import java.util.List;
import java.util.function.Predicate;
import modelo.Categoria;
import modelo.data.CategoriaDAL;
import modelo.data.interfaces.IControle;

public class ControleCategoria implements IControle<Categoria>{

    private final CategoriaDAL dal;

    public ControleCategoria() {
        dal = new CategoriaDAL();
    }
    
    
    
    @Override
    public void saveUpdate(Categoria entity) throws SQLException {
        if(entity.getId()>0)
        {
            //update
            dal.Update(entity);
        }
        else
        {
            dal.Save(entity);
        }
    }

    @Override
    public void delete(Categoria entity) throws SQLException {
        dal.Delete(entity);
    }

    @Override
    public Categoria findById(long id) throws SQLException {
        return dal.FindId(id);
    }

    @Override
    public List<Categoria> getAll() throws SQLException {
        return dal.GetAll();
    }

    @Override
    public List<Categoria> getAll(Predicate<Categoria> predicate) throws SQLException {
        return dal.GetAll(predicate);
    }

    @Override
    public Categoria find(Predicate<Categoria> predicate) throws SQLException {
        return dal.Find(predicate);
    }
    
}
