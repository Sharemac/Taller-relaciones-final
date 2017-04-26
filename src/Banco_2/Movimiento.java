/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco_2;

import java.util.ArrayList;

public class Movimiento {
    private String fecha;
    private double cantidad;
    private Tipo tipo;   
    int i = 0;
    
    public Movimiento(String fecha, double cantidad, Tipo tipo) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "fecha=" + fecha + ", cantidad=" + cantidad + ", tipo=" + tipo + ", i=" + i + '}';
    }
    
}
