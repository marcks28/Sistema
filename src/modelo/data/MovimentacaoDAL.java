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
import modelo.Movimentacao;
import modelo.data.interfaces.IMovimentacaoDAL;

/**
 *
 * @author edsonmarcks
 */
public class MovimentacaoDAL extends ComandosSQL implements IMovimentacaoDAL {

    @Override
    public void Save(Movimentacao entity) throws SQLException {
        String sql = "INSERT INTO Movimentacao (materialId,destinoId,tipoMovId,data_mov,quant) "
                + " VALUES (?,?,?,?,?)";
        execute(sql, new Object[]{
            entity.getMaterialId(),
            entity.getDestinoId(),
            entity.getTipoMovId(),
            entity.getDataMov(),
            entity.getQuantidade()
        });
    }

    @Override
    public void Update(Movimentacao entity) throws SQLException {
        String sql = "UPDATE Movimentacao SET materialId=?,destinoId=?,tipoMovId=?,data_mov=?,quant=?"
                + " WHERE id=?";
        execute(sql, new Object[]{
            entity.getMaterialId(),
            entity.getDestinoId(),
            entity.getTipoMovId(),
            entity.getDataMov(),
            entity.getQuantidade(),
            entity.getId()
        });
    }

    @Override
    public void Delete(Movimentacao entity) throws SQLException {
        String sql = "DELETE FROM Movimentacao WHERE id=?";
        execute(sql, new Object[]{
            entity.getId()
        });
    }

    @Override
    public Movimentacao FindId(long id) throws SQLException {
        String sql = "SELECT * FROM Movimentacao WHERE id=?";
        executeQuery(sql, new Object[]{id});
        Movimentacao movimentacao = null;
        if (rs.next()) {
            movimentacao = new Movimentacao();
            movimentacao.setId(rs.getLong("id"));
            movimentacao.setMaterialId(rs.getLong("materialId"));
            movimentacao.setDestinoId(rs.getLong("destinoId"));
            movimentacao.setTipoMovId(rs.getLong("tipoMovId"));
            movimentacao.setDataMov(rs.getTimestamp("data_mov").toLocalDateTime());
            movimentacao.setQuantidade(rs.getLong("quant"));
        }
        rs.close();
        ps.closeOnCompletion();
        return movimentacao;
    }

    @Override
    public List<Movimentacao> GetAll() throws SQLException {
        String sql = "SELECT * FROM Movimentacao";
        executeQuery(sql, null);
        List<Movimentacao> movimentacoes = new ArrayList<>();
        while (rs.next()) {
            Movimentacao movimentacao = new Movimentacao();
            movimentacao.setId(rs.getLong("id"));
            movimentacao.setMaterialId(rs.getLong("materialId"));
            movimentacao.setDestinoId(rs.getLong("destinoId"));
            movimentacao.setTipoMovId(rs.getLong("tipoMovId"));
            movimentacao.setDataMov(rs.getTimestamp("data_mov").toLocalDateTime());
            movimentacao.setQuantidade(rs.getLong("quant"));
            movimentacoes.add(movimentacao);
            movimentacao=null;
        }
        rs.close();
        ps.closeOnCompletion();
        return movimentacoes;
    }

    @Override
    public List<Movimentacao> GetAll(Predicate<Movimentacao> predicate) throws SQLException {
        List<Movimentacao> movimentacoes = new ArrayList<>();
        try {
            movimentacoes = GetAll().stream().filter(predicate).collect(Collectors.<Movimentacao>toList());
        } catch (NoSuchElementException e) {
            System.err.println("Nenhum registro encontrado a expressão falhou \n"+e.getMessage());
        }
        return  movimentacoes;
    }

    @Override
    public Movimentacao Find(Predicate<Movimentacao> predicate) throws SQLException {
        Movimentacao movimentacao = null;
        try {
            movimentacao = GetAll(predicate).stream().findFirst().get();
        } catch (NoSuchElementException e) {
            System.err.println("Nenhum registro encontrado a expressão falhou \n"+e.getMessage());
        }
        
        return  movimentacao;
    }

}
