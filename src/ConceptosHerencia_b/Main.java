
package ConceptosHerencia_b;


public class Main {
    public static void main(String[] args) {
        G[] elements = {new G(), new F(), new H(), new E()};
        
        for (int i = 0; i <elements.length; i++){
            System.out.println(elements[i]);
            elements[i].method1();
            System.out.println();
            elements[i].method2();
            System.out.println();
        }
    }
}
/*
G      Segun el orden al declarar el arreglo G corresponde a la posicion 0  
G1     G no extiende de nadie asi que imprime los datos proporcionados en el toString, el method1 y method2 
G2 
        F corresponde a la posicion 1 del arreglo
F      <-- F extiende de G y sobreescribe toString por eso sale F
G1     <-- F extiende de G y NO sobreescribe el method1 por lo cual imprime por herencia "G1"
F2  G2 <-- F extiende de G y sobreescribe el method2 pata que imprima "F2" e imprime el method2 del padre "G2"
        H corresponde a la posicion 2 del arreglo
F       <-- H extiende de E pero a su vez E extiende F y F sobreescribio el toString de G por eso imprime F
H1      <-- H extiende de E y sobreescribe el method1 e imprime "H1"
E2  H1  <-- H extiende de E y toma el method2 que imprime "E2" y seguido el method1 que fue sobreescrito en H e imprime "H1"
        E corresponde a la posicion 3 del arreglo
F       <-- E extiende de F y NO sobreescribe el toString asi que imprime el que hereda de F "F"
G1      <-- E extiende de F y NO sobreescribe el method1 asi que lo hereda de F que lo hereda de G y al no sobreescribirlo imprime "G1"
E2  G1  <-- E extiende de F y sobreescribe el method2 e imprime "E2" y seguido el method1 "G1"
*/