/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.data.interfaces;

import java.sql.SQLException;
import java.util.List;
import java.util.function.Predicate;
import modelo.ImodelBase;

/**
 *
 * @author edsonmarcks
 * @param <T>
 */
public interface IOperation<T extends ImodelBase>{
    public void Save(T entity) throws SQLException;
    public void Update(T entity) throws SQLException;
    public void Delete(T entity) throws SQLException;
    public T FindId(long id) throws SQLException;
    public List<T> GetAll() throws SQLException;
    public List<T> GetAll(Predicate<T> predicate) throws SQLException;
    public T Find(Predicate<T> predicate) throws SQLException;
}
