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
import modelo.Material;
import modelo.data.interfaces.IMaterialDAL;

/**
 *
 * @author edsonmarcks
 */
public class MaterialDAL extends ComandosSQL implements IMaterialDAL {

    @Override
    public void Save(Material entity) throws SQLException {
        String sql = "INSERT INTO Material (fornecedorId, categoriaId,descricao,dataCadastro,unidade)"
                + " VALUES (?,?,?,?,?)";
        execute(sql, new Object[]{
            entity.getFornecedorId(),
            entity.getCategoriaId(),
            entity.getDescricao(),
            entity.getDataCadastro(),
            entity.getUnidade()
        });
    }

    @Override
    public void Update(Material entity) throws SQLException {
        String sql = "UPDATE Material SET fornecedorId=?, categoriaId=?,descricao=?,dataCadastro=?,unidade=?"
                + " WHERE id=?";
        execute(sql, new Object[]{
            entity.getFornecedorId(),
            entity.getCategoriaId(),
            entity.getDescricao(),
            entity.getDataCadastro(),
            entity.getUnidade(),
            entity.getId()
        });
    }

    @Override
    public void Delete(Material entity) throws SQLException {
        String sql = "DELETE FROM Material  WHERE id=?";
        execute(sql, new Object[]{
            entity.getId()
        });
    }

    @Override
    public Material FindId(long id) throws SQLException {
        String sql = "SELECT * FROM Material WHERE id=?";
        Material material = null;
        executeQuery(sql, new Object[]{id});
        if (rs.next()) {
            material = new Material();
            material.setId(rs.getLong("id"));
            material.setFornecedorId(rs.getLong("fornecedorId"));
            material.setCategoriaId(rs.getLong("categoriaId"));
            material.setDescricao(rs.getString("descricao"));
            material.setDataCadastro(rs.getTimestamp("dataCadastro").toLocalDateTime());
            material.setUnidade(rs.getString("unidade"));
        }
        rs.close();
        ps.closeOnCompletion();
        return material;
    }

    @Override
    public List<Material> GetAll() throws SQLException {
        String sql = "SELECT * FROM Material ORDER BY id DESC LIMIT 20";
        executeQuery(sql, null);
        List<Material> materiais = new ArrayList<>();
        FornecedorDAL fDal;
        CategoriaDAL cDal;
        while (rs.next()) {
            fDal = new FornecedorDAL();
            cDal  = new CategoriaDAL();
            Material material = new Material();
            material.setId(rs.getLong("id"));
            material.setFornecedorId(rs.getLong("fornecedorId"));
            material.setFornecedor( fDal.FindId(material.getFornecedorId()));
            
            material.setCategoriaId(rs.getLong("categoriaId"));
            material.setCategoria(cDal.FindId(material.getCategoriaId()));
            material.setDescricao(rs.getString("descricao"));
            material.setDataCadastro(rs.getTimestamp("dataCadastro").toLocalDateTime());
            material.setUnidade(rs.getString("unidade"));
            materiais.add(material);
            material = null;
            fDal = null;
            cDal = null;
        }
        rs.close();
        ps.closeOnCompletion();
        return materiais;
    }

    @Override
    public List<Material> GetAll(Predicate<Material> predicate) throws SQLException {
        List<Material> materiais = new ArrayList<>();
        try {
            materiais = All().stream().filter(predicate).collect(Collectors.<Material>toList());
        } catch (NoSuchElementException e) {
            System.err.println("Nenhum registro encontrado!");
        }
        return  materiais;
    }

    @Override
    public Material Find(Predicate<Material> predicate) throws SQLException {
        Material material = null;
        try {
            material = GetAll(predicate).stream().findFirst().get();
        } catch (NoSuchElementException e) {
            System.err.println("Nenhum registro encontrado!");
        }
        return  material;
    }

    
    //Modificações
    //Traz todos os registros do banco
        public List<Material> All() throws SQLException {
        String sql = "SELECT * FROM Material ORDER BY descricao";
        executeQuery(sql, null);
        List<Material> materiais = new ArrayList<>();
        FornecedorDAL fDal;
        CategoriaDAL cDal;
        while (rs.next()) {
            fDal = new FornecedorDAL();
            cDal  = new CategoriaDAL();
            Material material = new Material();
            material.setId(rs.getLong("id"));
            material.setFornecedorId(rs.getLong("fornecedorId"));
            material.setFornecedor( fDal.FindId(material.getFornecedorId()));
            
            material.setCategoriaId(rs.getLong("categoriaId"));
            material.setCategoria(cDal.FindId(material.getCategoriaId()));
            material.setDescricao(rs.getString("descricao"));
            material.setDataCadastro(rs.getTimestamp("dataCadastro").toLocalDateTime());
            material.setUnidade(rs.getString("unidade"));
            materiais.add(material);
            material = null;
            fDal = null;
            cDal = null;
        }
        rs.close();
        ps.closeOnCompletion();
        return materiais;
    }
}
