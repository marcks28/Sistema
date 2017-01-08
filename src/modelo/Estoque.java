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
public class Estoque implements IModelBase{
    private long id;
    private long materialId;
    private LocalDateTime dataEntrada;
    private long quantidadeAtual;
    private long quantidadeMinima;

    @Override
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

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public long getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(long quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public long getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(long quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }
    
    
    
    
}
