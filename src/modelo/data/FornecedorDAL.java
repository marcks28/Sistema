/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.data;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import modelo.Fornecedor;
import modelo.data.interfaces.IFornecedorDAL;

/**
 *
 * @author edsonmarcks
 */
public class FornecedorDAL  extends ComandosSQL implements IFornecedorDAL{

    @Override
    public void Save(Fornecedor entity) throws SQLException {
        String sql = "INSERT INTO Fornecedor (nome,cnpj,tel,logradouro) VALUES (?,?,?,?)";
        execute(sql, new Object[]{
            entity.getRazaoSocial(),
            entity.getCNPJ(),
            entity.getTelefone(),
            entity.getLogradouro()
        });
    }

    @Override
    public void Update(Fornecedor entity) throws SQLException {
          String sql = "UPDATE  Fornecedor  SET nome=?,cnpj=?,tel=?,logradouro=? WHERE id=?";
        execute(sql, new Object[]{
            entity.getRazaoSocial(),
            entity.getCNPJ(),
            entity.getTelefone(),
            entity.getLogradouro(),
            entity.getId()
        });
    }

    @Override
    public void Delete(Fornecedor entity) throws SQLException {
         String sql = "DELETE FROM  Fornecedor  WHERE id=?";
        execute(sql, new Object[]{
            entity.getId()
        });
    }

    @Override
    public Fornecedor FindId(long id) throws SQLException {
        String sql = "SELECT * FROM Fornecedor WHERE id=?";
        executeQuery(sql, new Object[]{id});
        Fornecedor fornecedor = null;
        if(rs.next())
        {
            fornecedor = new Fornecedor();
            fornecedor.setId(rs.getLong("id"));
            fornecedor.setCNPJ(rs.getString("cnpj"));
            fornecedor.setRazaoSocial(rs.getString("nome"));
            fornecedor.setTelefone(rs.getString("tel"));
             fornecedor.setLogradouro(rs.getString("logradouro"));
        }
        rs.close();
        ps.closeOnCompletion();
        
        return fornecedor;
    }

    @Override
    public List<Fornecedor> GetAll() throws SQLException {
         String sql = "SELECT * FROM Fornecedor";
        executeQuery(sql, null);
        List<Fornecedor> fornecedores = new ArrayList<>();
        if(rs.next())
        {
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setId(rs.getLong("id"));
            fornecedor.setCNPJ(rs.getString("cnpj"));
            fornecedor.setRazaoSocial(rs.getString("nome"));
            fornecedor.setTelefone(rs.getString("tel"));
            fornecedor.setLogradouro(rs.getString("logradouro"));
            fornecedores.add(fornecedor);
            fornecedor = null;
            
        }
        rs.close();
        ps.closeOnCompletion();
        
        return fornecedores;
    }

    @Override
    public List<Fornecedor> GetAll(Predicate<Fornecedor> predicate) throws SQLException {
        List<Fornecedor> fornecedores = new ArrayList<>();
        try {
            fornecedores = GetAll().stream().filter(predicate).collect(Collectors.<Fornecedor>toList());
        } catch (NoSuchElementException e) {
            System.err.println("erro ao lista com predicate");
        }
        
        return fornecedores;
    }

    @Override
    public Fornecedor Find(Predicate<Fornecedor> predicate) throws SQLException {
        Fornecedor fornecedor = null;
        try {
            fornecedor = GetAll(predicate).stream().findFirst().get();
        } catch (NoSuchElementException e) {
            System.err.println("erro a buscar");
        }
        return fornecedor;
    }    
}
