/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.SQLException;
import java.util.List;
import java.util.function.Predicate;
import modelo.Fornecedor;
import modelo.data.FornecedorDAL;
import modelo.data.interfaces.IControle;

/**
 *
 * @author edsonmarcks
 */
public class ControleFornecedor implements IControle<Fornecedor>{
    FornecedorDAL dal;

    public ControleFornecedor() {
        dal = new FornecedorDAL();
    }
    
    
    
    @Override
    public void saveUpdate(Fornecedor entity) throws SQLException {
        if(entity.getId() > 0)
        {
            dal.Update(entity);
        }
        else
        {
            dal.Save(entity);
        }
    }

    @Override
    public void delete(Fornecedor entity) throws SQLException {
        dal.Delete(entity);
    }

    @Override
    public Fornecedor findById(long id) throws SQLException {
        return dal.FindId(id);
    }

    @Override
    public List<Fornecedor> getAll() throws SQLException {
        return dal.GetAll();
    }

    @Override
    public List<Fornecedor> getAll(Predicate<Fornecedor> predicate) throws SQLException {
        return dal.GetAll(predicate);
    }

    @Override
    public Fornecedor find(Predicate<Fornecedor> predicate) throws SQLException {
        return dal.Find(predicate);
    }
    
}
