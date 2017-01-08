/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDateTime;
import modelo.data.interfaces.IModelBase;

/**
 *
 * @author edsonmarcks
 */
public class Movimentacao implements IModelBase{
    private long id;
    private long materialId;
    private long destinoId;
    private long tipoMovId;
    private LocalDateTime dataMov;
    private long  quantidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(long materialId) {
        this.materialId = materialId;
    }

    public long getDestinoId() {
        return destinoId;
    }

    public void setDestinoId(long destinoId) {
        this.destinoId = destinoId;
    }

    public long getTipoMovId() {
        return tipoMovId;
    }

    public void setTipoMovId(long tipoMovId) {
        this.tipoMovId = tipoMovId;
    }

    public LocalDateTime getDataMov() {
        return dataMov;
    }

    public void setDataMov(LocalDateTime dataMov) {
        this.dataMov = dataMov;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }    
    
}
