
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
   
 /*public void listar(){
     for(int i = 0; i < salas.size(); i++){
     System.out.println("Programacion sala "+ salas.get(i).getNumero() +":");
     for(int j=0 ; j < salas.get(i).getSem().size();j++){
         System.out.println("\nSemana: "+ salas.get(j).getSem().get(j).getNumero());
         for( int k = 0; k < salas.get(j).getSem().get(j).getDias().length; k++){
            System.out.println("Fecha: "+ salas.get(k).getSem().get(k).getDias()[k].getFecha());
            System.out.println("Dia: "+ salas.get(k).getSem().get(k).getDias()[k].getNombre());
              for(int l=0; l< (salas.get(k).getSem().get(k).getDias()[k].getSegmentos().size()-1); l++){
                  System.out.println("Hora inicio: "+ salas.get(k).getSem().get(k).getDias()[k].getSegmentos().get(k).getHoraInicio());
                  System.out.println("Hora Final: "+ salas.get(k).getSem().get(k).getDias()[k].getSegmentos().get(k).getHoraFinal());
           
              }
         }
     }   
     
     
     */

  
   
 
}
