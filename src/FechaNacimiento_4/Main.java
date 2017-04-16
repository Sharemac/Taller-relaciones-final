/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FechaNacimiento_4;


public class Main {
     public static void main(String[] args) {
    Fecha f1 = new Fecha(14, 03, 1996, "Jueves", "Marzo");
    Fecha f2 = new Fecha(21, 01, 1998, "Miercoles", "Enero");
    Fecha f3 = new Fecha(28, 02, 1997, "Viernes", "Febrero");
    Persona p1 = new Persona("Sharem", f1);
    Persona p2 = new Persona("Jhojan", f2); 
    Persona p3 = new Persona("Camila", f3); 
   
    p1.MostrarFecha();
    p1.getFecha().Bisiesto(f1.getAno());
    p2.MostrarFecha();
    p2.getFecha().Bisiesto(f2.getAno());
    p3.MostrarFecha();
    p3.getFecha().Bisiesto(f3.getAno());
     }
}
