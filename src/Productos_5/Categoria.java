
package Productos_5;

import java.util.ArrayList;


public class Categoria extends Dominio{
   private String nombre;
   private String descripcion;
   private ArrayList<Producto> producto;

    public Categoria(String nombre, String descripcion, ArrayList<Producto> producto, String id) {
        super(id);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.producto = producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void addProducto(Producto p){
     this.producto.add(p);
    }
    public void MostrarProducto(){
        for(int i = 0; i< producto.size(); i++){
            System.out.println("Producto id: "+ producto.get(i).getId());
            System.out.println("Nombre: "+ producto.get(i).getNombre());
            System.out.println("Descripcion: "+ producto.get(i).getDescipcion());
            producto.get(i).MostrarItem();
            System.out.println("\n");
        }
    }
}


