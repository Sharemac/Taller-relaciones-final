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
public class Ruedas {
    private int diametro;
    private String tipo;

    public Ruedas(int diametro, String tipo) {
        this.diametro = diametro;
        this.tipo = tipo;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ruedas{" + "diametro=" + diametro + ", tipo=" + tipo + '}';
    }
    
}
