/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.data.interfaces;

import java.sql.SQLException;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author edsonmarcks
 * @param <T>
 */
public interface IControle<T extends IModelBase>{
    public void saveUpdate(T entity) throws SQLException;
    public void delete(T entity) throws SQLException;
    public T findById(long id) throws SQLException;
    public List<T> getAll() throws SQLException;
    public List<T> getAll(Predicate<T> predicate) throws SQLException;
    public T find(Predicate<T> predicate ) throws SQLException;    
}
