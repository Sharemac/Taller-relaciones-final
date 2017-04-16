
package Salas_3;

import java.util.ArrayList;


public class Dia {
    private String fecha;
    private String nombre;
    private ArrayList<Segmento> segmentos;

    public Dia(String fecha, String nombre, ArrayList<Segmento> segmentos) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.segmentos = segmentos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Segmento> getSegmentos() {
        return segmentos;
    }

    public void setSegmentos(ArrayList<Segmento> segmentos) {
        this.segmentos = segmentos;
    }

    public void addSegmento(Segmento a){
        this.segmentos.add(a);
    }
   public void mostrarSegmento(){
       for(int i=0; i < segmentos.size();i++){
           System.out.println("Hora Inicial: "+segmentos.get(i).getHoraInicio());
           System.out.println("Hora Final: "+ segmentos.get(i).getHoraFinal());
       }
   }

}
