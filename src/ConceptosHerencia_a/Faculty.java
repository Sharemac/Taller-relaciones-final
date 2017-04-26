
package ConceptosHerencia_a;


public class Faculty extends Employee {
    public static void main(String[] args){
        new Faculty();
    }
    public Faculty(){
        System.out.println("Performs Faculty's tasks");
    }
}
class Employee extends Person{
    public Employee(){
        this("Invoke Employee's ");
        System.out.println("Performs Employee's tasks ");
    }
    public Employee(String s){
        System.out.println(s);
    }
}
class Person{
    public Person(){
        System.out.println(" Performs Person's tasks");
    }
}
/*
Performs Person's tasks 
Invoke Employee's       
Performs Employee's tasks 
Performs Faculty's tasks  

La salida se da por el orden de Jerarquia de la herencia donde 
Faculty extiende de Employee que a su vez extiende de Person
Imprime primero la clase padre principal (person) y luego hacia abajo
*/
