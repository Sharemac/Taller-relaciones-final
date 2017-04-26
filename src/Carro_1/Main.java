/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro_1;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Motor m = new Motor(300,10005);
        Ruedas[] ruedas = new Ruedas[4];
        for (int i = 0; i < 4; i++) {
          ruedas[i]=new Ruedas(30,"Delantera");    
        }
        Carro car = new Carro(1998,"HUR-97E",ruedas,m,"Negro",419865);
        Persona Joe = new Persona("Joe",88153956,3203911);
        Joe.addCarro(car);
        Joe.listar();
    }
    
}
