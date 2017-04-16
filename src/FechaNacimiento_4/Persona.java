
package FechaNacimiento_4;


public class Persona {
    private String nombre;
    private Fecha fecha;
    
public Persona(String nombre,Fecha fecha ){
    this.nombre = nombre;
    this.fecha = fecha;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
public void MostrarFecha(){
        System.out.println("La Fecha de nacimiento de "+ nombre+" es el : " 
        + fecha.getNombreDia()+" "+fecha.getDia()+" del mes de "+fecha.getNombreMes()+" ("+fecha.getMes()+") de "+fecha.getAno());
    } 
}
