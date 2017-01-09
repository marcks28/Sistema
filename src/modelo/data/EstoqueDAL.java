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
import modelo.Estoque;
import modelo.data.interfaces.IEstoque;

/**
 *
 * @author edsonmarcks
 */
public class EstoqueDAL extends ComandosSQL implements IEstoque {

    @Override
    public void Save(Estoque entity) throws SQLException {
        String sql = "INSERT INTO Estoque (materialId,dataEntrada,qntAtual,qntMinima) VALUES (?,?,?,?)";
        execute(sql, new Object[]{
            entity.getMaterialId(),
            entity.getDataEntrada(),
            entity.getQuantidadeAtual(),
            entity.getQuantidadeMinima()
        });
    }

    @Override
    public void Update(Estoque entity) throws SQLException {
        String sql = "UPDATE Estoque SET materialId=?,dataEntrada=?,qntAtual=?,qntMinima=? WHERE id=?";
        execute(sql, new Object[]{
            entity.getMaterialId(),
            entity.getDataEntrada(),
            entity.getQuantidadeAtual(),
            entity.getQuantidadeMinima(),
            entity.getId()
        });
    }

    @Override
    public void Delete(Estoque entity) throws SQLException {
        String sql = "DELETE FROM Estoque  WHERE id=?";
        execute(sql, new Object[]{
            entity.getId()
        });
    }

    @Override
    public Estoque FindId(long id) throws SQLException {
        Estoque estoque = null;
        String sql = "SELECT * FROM Estoque WHERE id=?";
        executeQuery(sql, new Object[]{id});
        if(rs.next())
        {
            estoque = new Estoque();
            estoque.setId(rs.getLong("id"));
            estoque.setMaterialId(rs.getLong("materialId"));
            estoque.setDataEntrada( rs.getTimestamp("dataEntrada").toLocalDateTime() );
            estoque.setQuantidadeAtual(rs.getLong("qntAtual"));
            estoque.setQuantidadeMinima(rs.getLong("qntMinima"));
        }
        rs.close();
        ps.closeOnCompletion();
        return  estoque;
    }

    @Override
    public List<Estoque> GetAll() throws SQLException {
        String sql = "SELECT * FROM Estoque";
        executeQuery(sql, null);
        List<Estoque> estoques = new ArrayList<>();
        while(rs.next())
        {
            Estoque estoque = new Estoque();
            estoque.setId(rs.getLong("id"));
            estoque.setMaterialId(rs.getLong("materialId"));
            estoque.setDataEntrada( rs.getTimestamp("dataEntrada").toLocalDateTime() );
            estoque.setQuantidadeAtual(rs.getLong("qntAtual"));
            estoque.setQuantidadeMinima(rs.getLong("qntMinima"));
        }
        rs.close();
        ps.closeOnCompletion();
        return  estoques;
    }

    @Override
    public List<Estoque> GetAll(Predicate<Estoque> predicate) throws SQLException {
        List<Estoque> estoques = new ArrayList<>();
        try {
            estoques = GetAll().stream().filter(predicate).collect(Collectors.<Estoque>toList());
        } catch (NoSuchElementException e) {
            System.err.println("erro de aplications");
        }
        return  estoques;
    }

    @Override
    public Estoque Find(Predicate<Estoque> predicate) throws SQLException {
        Estoque estoque = null;
        try {
            estoque = GetAll(predicate).stream().findFirst().get();
        } catch (NoSuchElementException e) {
            System.err.println("nenhum registro encontrado!");
        }
        return estoque;
    }

}
