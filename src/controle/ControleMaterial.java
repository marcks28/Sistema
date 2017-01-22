package controle;

import java.sql.SQLException;
import java.util.List;
import java.util.function.Predicate;
import modelo.Material;
import modelo.data.MaterialDAL;
import modelo.data.interfaces.IControle;

public class ControleMaterial implements IControle<Material>{
    private MaterialDAL dal;

    public ControleMaterial() {
        this.dal = new MaterialDAL();
    }
      
    
    @Override
    public void saveUpdate(Material entity) throws SQLException {
        if(entity.getId() > 0)
        {
            dal.Update(entity);
            
        }else
        {
            dal.Save(entity);
        }
    }

    @Override
    public void delete(Material entity) throws SQLException {
        dal.Delete(entity);
    }

    @Override
    public Material findById(long id) throws SQLException {
        return dal.FindId(id);
    }

    @Override
    public List<Material> getAll() throws SQLException {
        return dal.GetAll();
    }

    @Override
    public List<Material> getAll(Predicate<Material> predicate) throws SQLException {
        return dal.GetAll(predicate);
    }

    @Override
    public Material find(Predicate<Material> predicate) throws SQLException {
        return find(predicate);
    }
    
}
