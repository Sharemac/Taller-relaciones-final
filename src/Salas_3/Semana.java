package Salas_3;

import java.util.ArrayList;


public class Semana {
   private int numero;
   private Dia[] dias;
  

    public Semana(int numero, Dia[]dias) {
        this.numero = numero;
        this.dias = dias;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
       
    }
    public void setDias(Dia[]dias) {
        for(int i=0; i < dias.length; i++){
        this.dias = dias;
    }
    } 
    
    public void mostrarDias(){
        System.out.println("\nSemana: "+ numero);
        for(int i=0; i < dias.length; i++){
            System.out.println(" "+ dias[i].getFecha() );
            System.out.println(" "+ dias[i].getNombre());
            dias[i].mostrarSegmento();
        }
    }
}
