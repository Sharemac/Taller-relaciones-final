
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

    @Override
    public String toString() {
        return "Dia{" + "fecha=" + fecha + ", nombre=" + nombre + ", segmentos=" + segmentos + '}';
    }
   

}
