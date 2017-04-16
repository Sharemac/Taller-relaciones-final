/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro_1;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Persona {
    private String nombre;
    private int cedula;
    private int telefono;
    private ArrayList<Carro>c;

    public Persona(String nombre, int cedula, int telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.c=new ArrayList<Carro>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Carro> getC() {
        return c;
    }

    public void setC(ArrayList<Carro> c) {
        this.c = c;
    }
    public void addCarro(Carro c){
     this.c.add(c);
    }
    
    public void listar(){
        for(int i = 0; i < this.c.size(); i++){
            System.out.println("Modelo caro: "+c.get(i).getModelo());
            System.out.println("Placa: "+c.get(i).getPlaca());
            System.out.println("Color Chassis: "+c.get(i).getChassis().getColor());
            System.out.println("Lote Chassis: "+c.get(i).getChassis().getLote());
            System.out.println("Caballos de fuerza del Motor: "+c.get(i).getMotor().getCaballos());
            System.out.println("Lote del motor: "+c.get(i).getMotor().getLote());
            for(int j=0;j<c.get(i).getRuedas().length;j++){
                System.out.println("Rueda: "+c.get(i).getRuedas()[j].getDiametro());
                System.out.println("Rueda: "+c.get(i).getRuedas()[j].getTipo());
            }
        }
    }
}
