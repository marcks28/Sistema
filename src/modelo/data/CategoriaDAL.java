/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.data;

import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import modelo.Categoria;
import modelo.data.interfaces.ICategoriaDAL;

/**
 *
 * @author edsonmarcks
 */
public class CategoriaDAL extends ComandosSQL implements ICategoriaDAL{

    @Override
    public void Save(Categoria entity) throws SQLException {
        String sql = "INSERT INTO Categoria (descricao) VALUES (?)";
        execute(sql, new Object[]{entity.getDescricao()});
    }

    @Override
    public void Update(Categoria entity) throws SQLException {
        String sql = "UPDATE Categoria SET descricao =? WHERE id=?";
        execute(sql, new Object[]{entity.getDescricao(), entity.getId()});
    }

    @Override
    public void Delete(Categoria entity) throws SQLException {
           String sql = "DELETE FROM Categoria  WHERE id=?";
        execute(sql, new Object[]{entity.getId()});
    }

    @Override
    public Categoria FindId(long id) throws SQLException {
        String sql = "SELECT * FROM Categoria WHERE id=?";
        executeQuery(sql, new Object[]{id});
        Categoria categoria = null;
        if(rs.next())
        {
            categoria = new Categoria();
            categoria.setId(rs.getLong("id"));
            categoria.setDescricao(rs.getString("descricao"));
        }
        rs.close();
        ps.closeOnCompletion();
        return categoria;
    }

    @Override
    public List<Categoria> GetAll() throws SQLException {
        String sql = "SELECT * FROM Categoria";
        List<Categoria> categorias = new ArrayList<>();
        executeQuery(sql, null);
        while(rs.next())
        {
            Categoria categoria =new Categoria();
            categoria.setId(rs.getLong("id"));
            categoria.setDescricao(rs.getString("descricao"));
            categorias.add(categoria);
            categoria = null;
        }
        rs.close();
        ps.closeOnCompletion();
        return  categorias;
    }

    @Override
    public List<Categoria> GetAll(Predicate<Categoria> predicate) throws SQLException {
        List<Categoria> categorias = new ArrayList<>();
        try {
            categorias = GetAll().stream().filter(predicate).collect(Collectors.<Categoria>toList());
        } catch (NoSuchElementException e) {
            System.err.println("Erro a carregar");
        }
        return categorias;
    }

    @Override
    public Categoria Find(Predicate<Categoria> predicate) throws SQLException {
        Categoria categoria = null;
        try {
            categoria = GetAll(predicate).stream().findFirst().get();
        } catch (NoSuchElementException e) {
            System.err.println("Erro a carregar");
        }
        
        return  categoria;
    }
    
}
