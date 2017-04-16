package Productos_5;

import java.util.ArrayList;


public class Producto extends Dominio {
    private String nombre;
    private String descipcion;
    private ArrayList<Item> item;
    private Categoria cate;

    public Producto(String nombre, String descipcion, ArrayList<Item> item,  String id) {
        super(id);
        this.nombre = nombre;
        this.descipcion = descipcion;
        this.item = item;
        this.cate = cate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

    public Categoria getCate() {
        return cate;
    }

    public void setCate(Categoria cate) {
        this.cate = cate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void addItem(Item i){
     this.item.add(i);
    }
    public void MostrarItem(){
        for(int i = 0; i< item.size(); i++){
            System.out.println("Item id: "+ item.get(i).getId());
            System.out.println("Item nombre: "+ item.get(i).getName());
            System.out.println("Precio: "+ item.get(i).getCostoUnd());
        }
    }
    

}
