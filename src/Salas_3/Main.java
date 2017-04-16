
package Salas_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Segmento> seg;
        ArrayList<Semana> sem;
        ArrayList<Semana> sema;
        ArrayList<Sala> salas;
        Dia di1[]= new Dia[2];
        Dia di2[]= new Dia[2];
        Segmento segmento1 = new Segmento(2,4);
        Segmento segmento2 = new Segmento(8,10);
        
        seg = new ArrayList<Segmento>();
        seg.add(segmento1);
        seg.add(segmento2);
        
        Dia dia1 = new Dia("17/04/2017", "Lunes", seg);
        Dia dia2 = new Dia("18/05/2018", "Martes", seg);
        Dia dia3 = new Dia("19/06/2019", "Miercoles", seg);
        Dia dia4 = new Dia("20/07/2016", "Jueves", seg);
        
        di1[0]= dia1;
        di1[1]= dia2;
                
        di2[0]= dia3;
        di2[1]= dia4;  
                
        Semana semana1 = new Semana(1, di1);
        Semana semana2 = new Semana(2, di1);
        
        Semana seman1 = new Semana(1,di2);
        Semana seman2 = new Semana(2,di2);
        
        sem = new ArrayList<Semana>();
        sem.add(semana1);
        sem.add(semana2);
        
        sema = new ArrayList<Semana>();
        sema.add(seman1);
        sema.add(seman2);
        
        Sala sala1 = new Sala(1, sem);
        Sala sala2 = new Sala(2, sema);
        
        salas = new ArrayList<Sala>();
        salas.add(sala1);
        salas.add(sala2);
        
        Programacion pro = new Programacion(salas);
        pro.listar();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     /*   System.out.println("es: "+ dia1.getFecha()+ dia1.getNombre());
              System.out.println("\n");
              for(int i=0 ; i < seg.size();i++){
                  System.out.println("asi: "+ dia1.getSegmentos().get(i).getHoraInicio());
                  System.out.println("asi: "+ dia1.getSegmentos().get(i).getHoraFinal());
              }*/
    }
}
