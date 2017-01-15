/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.SQLException;
import java.util.List;
import java.util.function.Predicate;
import modelo.Movimentacao;
import modelo.data.MovimentacaoDAL;
import modelo.data.interfaces.IControle;

/**
 *
 * @author edsonmarcks
 */
public class ControleMovimentacao implements IControle<Movimentacao>{
    private MovimentacaoDAL dal;

    public ControleMovimentacao() {
        this.dal = new MovimentacaoDAL();
    }
    
    
    @Override
    public void saveUpdate(Movimentacao entity) throws SQLException {
        if(entity.getId()>=0)
        {
            dal.Update(entity);
        }else
        {
            dal.Save(entity);
        }
    }

    @Override
    public void delete(Movimentacao entity) throws SQLException {
        dal.Delete(entity);
    }

    @Override
    public Movimentacao findById(long id) throws SQLException {
        return dal.FindId(id);
    }

    @Override
    public List<Movimentacao> getAll() throws SQLException {
        return dal.GetAll();
    }

    @Override
    public List<Movimentacao> getAll(Predicate<Movimentacao> predicate) throws SQLException {
        return dal.GetAll(predicate);
    }

    @Override
    public Movimentacao find(Predicate<Movimentacao> predicate) throws SQLException {
        return dal.Find(predicate);
    }
    
}
