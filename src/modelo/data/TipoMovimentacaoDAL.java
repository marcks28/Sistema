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
import modelo.TipoMovimentacao;
import modelo.data.interfaces.ITipoMovimentacaoDAL;

/**
 *
 * @author edsonmarcks
 */
public class TipoMovimentacaoDAL extends ComandosSQL implements ITipoMovimentacaoDAL {

    @Override
    public void Save(TipoMovimentacao entity) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(TipoMovimentacao entity) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete(TipoMovimentacao entity) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoMovimentacao FindId(long id) throws SQLException {
        String sql = "SELECT * FROM TipoMovimentacao WHERE id=?";
        executeQuery(sql, new Object[]{id});
        TipoMovimentacao tipoMovimentacao = null;
        if (rs.next()) {
            tipoMovimentacao = new TipoMovimentacao();
            tipoMovimentacao.setId(rs.getLong("id"));
            tipoMovimentacao.setDescricao(rs.getString("descricao"));
        }
        rs.close();
        ps.closeOnCompletion();
        return tipoMovimentacao;
    }

    @Override
    public List<TipoMovimentacao> GetAll() throws SQLException {
        String sql = "SELECT * FROM TipoMovimentacao";
        executeQuery(sql, null);
        List<TipoMovimentacao> ListTipo = new ArrayList<>();
        while (rs.next()) {
            TipoMovimentacao tipoMovimentacao = new TipoMovimentacao();
            tipoMovimentacao.setId(rs.getLong("id"));
            tipoMovimentacao.setDescricao(rs.getString("descricao"));
            ListTipo.add(tipoMovimentacao);
            tipoMovimentacao=null;
        }
        rs.close();
        ps.closeOnCompletion();
        return ListTipo;
    }

    @Override
    public List<TipoMovimentacao> GetAll(Predicate<TipoMovimentacao> predicate) throws SQLException {
        List<TipoMovimentacao> tipoMovimentacoes = new ArrayList<>();
        try {
            tipoMovimentacoes = GetAll().stream().filter(predicate).collect(Collectors.<TipoMovimentacao>toList());
        } catch (NoSuchElementException e) {
            System.err.println("Expressão retornou um erro");
        }
        return  tipoMovimentacoes;
    }

    @Override
    public TipoMovimentacao Find(Predicate<TipoMovimentacao> predicate) throws SQLException {
        TipoMovimentacao tipoMovimentacao = null;
        try {
            tipoMovimentacao = GetAll(predicate).stream().findFirst().get();
        } catch (NoSuchElementException e) {
            System.err.println("Expressão retornou um erro");
        }
        return tipoMovimentacao;
    }

}
