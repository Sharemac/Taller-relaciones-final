package Salas_3;

import java.util.ArrayList;


public class Semana {
   private int numero;
   private Dia[] dias;

    public Semana(int numero, Dia[] dias) {
        this.numero = numero;
        this.dias = dias;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Dia[] getDias() {
        return dias;
    }

    public void setDias(Dia[] dias) {
        this.dias = dias;
    }
   
  /*   public ArrayList<Segmento> calcularSegmentosLibres(Dia dia1,ArrayList<Segmento> a ){
       
    
    
    // de 8 a 4.. 8 10 12 14 16
       // dia 1
     ArrayList<Segmento> libres;
       libres = new ArrayList<Segmento>();
       
       boolean s8 = false, s10 = false, s12 = false, s14 = false, s16 = false;
       for(int i=0 ; i < dia1.getSegmentos().size();i++){
           if( dia1.getSegmentos().get(i).getHoraInicio()== 8){
               s8 = true;
           } else if( dia1.getSegmentos().get(i).getHoraInicio()== 10){
               s10 = true;
           } else if( dia1.getSegmentos().get(i).getHoraInicio()== 12){
               s12 = true;
           } else if( dia1.getSegmentos().get(i).getHoraInicio()== 14){
               s14 = true;
           }
           if (s8 == false){
               libres.add(a.);
           }
   return;
   }*/
}
