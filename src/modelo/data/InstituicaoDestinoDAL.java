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
import modelo.InstituicaoDestino;
import modelo.data.interfaces.IInstituicaoDestinoDAL;

/**
 *
 * @author edsonmarcks
 */
public class InstituicaoDestinoDAL extends ComandosSQL implements IInstituicaoDestinoDAL {

    @Override
    public void Save(InstituicaoDestino entity) throws SQLException {
        String sql = "INSERT INTO Destino (descricao,logradouro, tel) VALUES (?,?,?)";
        execute(sql, new Object[]{
            entity.getDescricao(),
            entity.getLogradouro(),
            entity.getTelefone()
        });

    }

    @Override
    public void Update(InstituicaoDestino entity) throws SQLException {
        String sql = "UPDATE Destino SET descricao=?,logradouro=?, tel=? WHERE id=?";
        execute(sql, new Object[]{
            entity.getDescricao(),
            entity.getLogradouro(),
            entity.getTelefone(),
            entity.getId()
        });
    }

    @Override
    public void Delete(InstituicaoDestino entity) throws SQLException {
        String sql = "DELETE FROM Destino WHERE id=?";
        execute(sql, new Object[]{
            entity.getId()
        });
    }

    @Override
    public InstituicaoDestino FindId(long id) throws SQLException {
        InstituicaoDestino instituicaoDestino = null;
        String sql = "SELECT * FROM Destino WHERE id=?";
        executeQuery(sql, new Object[]{id});
        if (rs.next()) {
            instituicaoDestino = new InstituicaoDestino();
            instituicaoDestino.setId(rs.getLong("id"));
            instituicaoDestino.setDescricao(rs.getString("descricao"));
            instituicaoDestino.setLogradouro(rs.getString("logradouro"));
            instituicaoDestino.setTelefone(rs.getString("tel"));
        }
        rs.close();
        ps.closeOnCompletion();
        return instituicaoDestino;
    }

    @Override
    public List<InstituicaoDestino> GetAll() throws SQLException {
        String sql = "SELECT * FROM Destino";
        executeQuery(sql, null);
        List<InstituicaoDestino> instituicoes = new ArrayList<>();
        while (rs.next()) {
            InstituicaoDestino instituicaoDestino = new InstituicaoDestino();
            instituicaoDestino.setId(rs.getLong("id"));
            instituicaoDestino.setDescricao(rs.getString("descricao"));
            instituicaoDestino.setLogradouro(rs.getString("logradouro"));
            instituicaoDestino.setTelefone(rs.getString("tel"));
            instituicoes.add(instituicaoDestino);
            instituicaoDestino = null;
        }
        rs.close();
        ps.closeOnCompletion();
        return  instituicoes;

    }

    @Override
    public List<InstituicaoDestino> GetAll(Predicate<InstituicaoDestino> predicate) throws SQLException {
        List<InstituicaoDestino> instituicoes = new ArrayList<>();
        try {
            instituicoes = GetAll().stream().filter(predicate).collect(Collectors.<InstituicaoDestino>toList());
        } catch (NoSuchElementException e) {
            System.err.println("falha ao executa \n"+e.getMessage());
        }
        return  instituicoes;
    }

    @Override
    public InstituicaoDestino Find(Predicate<InstituicaoDestino> predicate) throws SQLException {
      InstituicaoDestino instituicaoDestino = null;
        try {
            instituicaoDestino = GetAll(predicate).stream().findFirst().get();
        } catch (NoSuchElementException e) {
            System.err.println("falha ao executa \n"+e.getMessage());
        }
        
        return  instituicaoDestino;
    }



}
