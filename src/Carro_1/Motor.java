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
public class Motor {
    private int caballos;
    private int lote;

    public Motor(int caballos, int lote) {
        this.caballos = caballos;
        this.lote = lote;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Motor{" + "caballos=" + caballos + ", lote=" + lote + '}';
    }
    
}
