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
public class Carro {
    private int modelo;
    private String placa;
    private Ruedas[] ruedas;
    private Chassis chassis;
    private Motor motor;

    public Carro(int modelo, String placa, Ruedas[] ruedas, Motor motor, String color , int lote) {
        this.modelo = modelo;
        this.placa = placa;
        this.ruedas = ruedas;
        this.motor = motor;
        this.chassis= new Chassis(color, lote);
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Ruedas[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Ruedas[] ruedas) {
        this.ruedas = ruedas;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    
    
}
