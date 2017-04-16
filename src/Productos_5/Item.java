
package Productos_5;


public class Item extends Dominio{
    private String name;
    private double costoUnd;
    private Producto producto;

    public Item(String name, double costoUnd, String id) {
        super(id);
        this.name = name;
        this.costoUnd = costoUnd;
        this.producto = producto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostoUnd() {
        return costoUnd;
    }

    public void setCostoUnd(double costoUnd) {
        this.costoUnd = costoUnd;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
  

}
