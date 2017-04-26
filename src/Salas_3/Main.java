
package Salas_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Segmento> seg;
        ArrayList<Semana> sem;
        ArrayList<Semana> sema;
        ArrayList<Sala> salas;
        Dia[] dia;
        Dia[] dias;
        dia = new Dia[2];
        dias = new Dia[2];
        Segmento segmento1 = new Segmento(2,4);
        Segmento segmento2 = new Segmento(8,10);
        
        seg = new ArrayList<Segmento>();
        seg.add(segmento1);
        seg.add(segmento2);
               
        Dia dia1 = new Dia("13/04/2017", "Jueves", seg);
        Dia dia2 = new Dia("14/04/2017", "Viernes", seg);
        Dia dia3 = new Dia("18/04/2017", "Martes", seg);
        Dia dia4 = new Dia("19/04/2017", "Miercoles", seg);
        
        dia[0]= dia1;
        dia[1]= dia2;
        dias[0]= dia3;
        dias[1]= dia4;      
        
        Semana semana1 = new Semana(1, dia);
        Semana semana2 = new Semana(2, dias);
        
        Semana seman1 = new Semana(1,dia);
        Semana seman2 = new Semana(2,dias);
        
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
        pro.mostarSala();
    }
}