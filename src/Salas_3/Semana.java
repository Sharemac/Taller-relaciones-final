package Salas_3;

import java.util.ArrayList;


public class Semana {
   private int numero;
   private ArrayList<Dia> dias;

    public Semana(int numero, ArrayList<Dia> dias) {
        this.numero = numero;
        this.dias = dias;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Dia> getDias() {
        return dias;
    }

    public void setDias(ArrayList<Dia> dias) {
        this.dias = dias;
    }
    
    public void addDia(Dia a){
        this.dias.add(a);
    }
    public void mostrarDias(){
        System.out.println("\nSemana: "+ numero);
        for(int i=0; i < dias.size(); i++){
            System.out.println(""+ dias.get(i).getFecha());
            System.out.println(""+ dias.get(i).getNombre());
            dias.get(i).mostrarSegmento();
        }
    }
}
  
