/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tipo t1 = new Tipo("Deposito","5869ab");
        Tipo t2 = new Tipo("Retiro","79658cr");
        Cuenta c1 = new Cuenta(4766895,500000,"02/08/2004","Pedro Perez");
        Cuenta c2 = new Cuenta(4789456,255000,"24/11/2011","Miguel Angel");
        Banco Ban = new Banco("JLK-875");
        Ban.addCuenta(c1);
        Ban.addCuenta(c2);
        Ban.addTipo(t1);
        Ban.addTipo(t2);
        Movimiento m1 = new Movimiento("04/04/2017",400000,t1);
        c1.addMovimiento(m1);
        c1.deposito();
        Movimiento m2 = new Movimiento("05/04/2017",240000,t2);
        c1.addMovimiento(m2);
        c1.retiro();
        Movimiento m3 = new Movimiento("22/03/2017",140000,t1);
        c2.addMovimiento(m3);
        c2.deposito();
        Movimiento m4 = new Movimiento("15/04/2017",370000,t2);
        c2.addMovimiento(m4);
        c2.retiro();
        Ban.listar();
    }
}
