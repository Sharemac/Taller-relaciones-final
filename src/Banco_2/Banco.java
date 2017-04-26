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
public class Banco {
    private String codigo;
    private ArrayList<Cuenta> cuenta;
    private ArrayList<Tipo> tipo;

    public Banco(String codigo) {
        this.codigo = codigo;
        this.cuenta = new ArrayList<Cuenta>();
        this.tipo = new ArrayList<Tipo>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Cuenta> getCuenta() {
        return cuenta;
    }

    public void setCuenta(ArrayList<Cuenta> cuenta) {
        this.cuenta = cuenta;
    }

    public ArrayList<Tipo> getTipo() {
        return tipo;
    }

    public void setTipo(ArrayList<Tipo> tipo) {
        this.tipo = tipo;
    }
    
    public void addCuenta(Cuenta cuenta){
        this.cuenta.add(cuenta);
    }
    public void addTipo(Tipo tipo){
        this.tipo.add(tipo);
    }
    public void listar(){
        for(int i = 0; i < this.cuenta.size();i++){
            System.out.println("Numero de cuenta: " + cuenta.get(i).getNumeroCuenta());
            System.out.println("Nombre cliente: "+ cuenta.get(i).getNombreCliente());
            System.out.println("Fecha de creación: "+ cuenta.get(i).getFechaCreacion());
            System.out.println("Saldo Actual: "+ cuenta.get(i).getSaldoActual());
            for(int j = 0; j<2; j++){
                System.out.println("Transacción: "+cuenta.get(i).getMovimiento().get(j).getTipo().getNombre()+" Codigo: "+cuenta.get(i).getMovimiento().get(j).getTipo().getCodigo());
                System.out.println("Cantidad: "+ cuenta.get(i).getMovimiento().get(j).getCantidad());
                System.out.println("Saldo Anterior: "+ cuenta.get(i).getSaldo()[j]);
                System.out.println("Saldo Actual: "+ cuenta.get(i).getSaldo()[j+1]);
            }
        }
    }
}
