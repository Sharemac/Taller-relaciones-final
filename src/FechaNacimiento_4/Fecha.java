
package FechaNacimiento_4;


public class Fecha {
    private int dia;
    private int mes;
    private int ano;
    private String nombreDia;
    private String nombreMes;

    public Fecha() {
    }
    
    

    public Fecha(int dia, int mes, int ano, String nombreDia, String nombreMes) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.nombreDia = nombreDia;
        this.nombreMes = nombreMes;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public String getNombreMes() {
        return nombreMes;
    }
  
public void Bisiesto(int ano){
    if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0)))
        System.out.println("Es bisiesto");
    else
        System.out.println("No es bisiesto");
}
}
