
package Salas_3;

import java.util.ArrayList;


public class Programacion {
   private ArrayList<Sala> salas;

    public Programacion(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
    
    public void addSala(Sala a){
        this.salas.add(a);                
    }
    
    public void mostarSala(){
        for(int i = 0; i < salas.size();i++){
            System.out.println("\nSala: "+ salas.get(i).getNumero());
            salas.get(i).mostrarSemana();
        }
        System.out.println("\n");
    }
}
