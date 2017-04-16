
package Salas_3;

import java.util.ArrayList;


public class Sala {
    private int numero;
    private ArrayList<Semana> sem;

    public Sala(int numero, ArrayList<Semana> sem) {
        this.numero = numero;
        this.sem = sem;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Semana> getSem() {
        return sem;
    }

    public void setSem(ArrayList<Semana> sem) {
        this.sem = sem;
    }
     
    public void addSem(Semana a){
        this.sem.add(a);
    }
    
    public void mostrarSemana(){
        for(int i=0; i < sem.size(); i++){
           sem.get(i).mostrarDias();
            
        }
    }
}
