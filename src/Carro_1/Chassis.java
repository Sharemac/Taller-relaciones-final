/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro_1;

/**
 *
 * @author Estudiante
 */
public class Chassis {
    private String color;
    private int lote;

    public Chassis(String color, int lote) {
        this.color = color;
        this.lote = lote;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Chassis{" + "color=" + color + ", lote=" + lote + '}';
    }
    
}
