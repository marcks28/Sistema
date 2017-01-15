/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.SQLException;
import java.util.List;
import java.util.function.Predicate;
import modelo.InstituicaoDestino;
import modelo.data.InstituicaoDestinoDAL;
import modelo.data.interfaces.IControle;

/**
 *
 * @author edsonmarcks
 */
public class ControleInstituicaoDestino implements IControle<InstituicaoDestino>{
    private InstituicaoDestinoDAL dal;

    public ControleInstituicaoDestino() {
        this.dal = new InstituicaoDestinoDAL();
    }
    
    
    
    @Override
    public void saveUpdate(InstituicaoDestino entity) throws SQLException {
        if(entity.getId()>= 0)
        {
            dal.Update(entity);
        }else
        {
            dal.Save(entity);
        }
    }

    @Override
    public void delete(InstituicaoDestino entity) throws SQLException {
        dal.Delete(entity);
    }

    @Override
    public InstituicaoDestino findById(long id) throws SQLException {
        return  dal.FindId(id);
    }

    @Override
    public List<InstituicaoDestino> getAll() throws SQLException {
        return dal.GetAll();
    }

    @Override
    public List<InstituicaoDestino> getAll(Predicate<InstituicaoDestino> predicate) throws SQLException {
        return dal.GetAll(predicate);
    }

    @Override
    public InstituicaoDestino find(Predicate<InstituicaoDestino> predicate) throws SQLException {
        return dal.Find(predicate);
    }
    
}
