
package ConceptosHerencia_b;


public class F extends G {
    public String toString(){
        return "F";
    }
    
    public void method2(){
        System.out.print(" F2 ");
        super.method2();
    }
}
