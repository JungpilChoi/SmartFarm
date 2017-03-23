package com.example.xaid.smartfarm.Models;

import com.example.xaid.smartfarm.Interface.Tipo;

/**
 * Created by herib on 23/03/2017.
 */

public class Sensor {
    private int id, tipo;
    private boolean estado;
    private float leitura;

    public Sensor(int id, int tipo, boolean estado, float leitura) {
        this.id = id;
        this.tipo = tipo;
        this.estado = estado;
        this.leitura = leitura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public float getLeitura() {
        return leitura;
    }

    public void setLeitura(float leitura) {
        this.leitura = leitura;
    }
}
