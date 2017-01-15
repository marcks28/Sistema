
package controle;

import java.sql.SQLException;
import java.util.List;
import java.util.function.Predicate;
import modelo.TipoMovimentacao;
import modelo.data.TipoMovimentacaoDAL;
import modelo.data.interfaces.IControle;


public class ControleTipoMovimentacao implements IControle<TipoMovimentacao>{
    private TipoMovimentacaoDAL dal;

    public ControleTipoMovimentacao() {
        this.dal = new TipoMovimentacaoDAL();
    }
    
    
    
    @Override
    public void saveUpdate(TipoMovimentacao entity) throws SQLException {
        if(entity.getId()>=0)
        {
            dal.Update(entity);
        }else
        {
            dal.Save(entity);
        }
    }

    @Override
    public void delete(TipoMovimentacao entity) throws SQLException {
        dal.Delete(entity);
    }

    @Override
    public TipoMovimentacao findById(long id) throws SQLException {
        return dal.FindId(id);
    }

    @Override
    public List<TipoMovimentacao> getAll() throws SQLException {
        return dal.GetAll();
    }

    @Override
    public List<TipoMovimentacao> getAll(Predicate<TipoMovimentacao> predicate) throws SQLException {
        return dal.GetAll(predicate);
    }

    @Override
    public TipoMovimentacao find(Predicate<TipoMovimentacao> predicate) throws SQLException {
        return dal.Find(predicate);
    }
    
}
