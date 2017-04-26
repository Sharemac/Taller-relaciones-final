/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco_2;

import java.util.ArrayList;

/**
 *
 * @author JHOJAN
 */
public class Cuenta {
    private int i;
    private int j;
    private int numeroCuenta;
    private double saldoActual;
    private double saldo[];
    private String fechaCreacion;
    private String nombreCliente;
    private ArrayList<Movimiento> movimiento;

    public Cuenta(int numeroCuenta, double saldoActual, String fechaCreacion, String nombreCliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.fechaCreacion = fechaCreacion;
        this.nombreCliente = nombreCliente;
        this.movimiento = new ArrayList<Movimiento>();
        saldo = new double[3];
        this.saldo[0] = saldoActual;
    }
    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double[] getSaldo() {
        return saldo;
    }

    public void setSaldo(double[] saldo) {
        this.saldo = saldo;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<Movimiento> getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(ArrayList<Movimiento> movimiento) {
        this.movimiento = movimiento;
    } 
    
    public void addMovimiento(Movimiento movimiento){
        this.movimiento.add(movimiento);
    }
    
    public void deposito(){
        saldo[j+1] = ((saldo[j]) + (movimiento.get(i).getCantidad()));
        i++;
        j++;
    }
    public void retiro(){
        saldo[j+1] = ((saldo[j]) - (movimiento.get(i).getCantidad()));
        i++;
        j++;
    }
}
