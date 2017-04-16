
package Productos_5;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items;
        items = new ArrayList<Item>();
        Item item1 = new Item("deslactosada ", 3650, "3001 " );
        Item item2 = new Item("entera ", 2800, "3002 ");
        Item item3 = new Item("descremada ", 3200, "3003 ");
        items.add(item1);
        items.add(item2);
        items.add(item3);
        Producto producto1 = new Producto("Leche ", "Bebida lactea", items, "2001");
        
        ArrayList<Item> items2;
        items2 = new ArrayList<Item>();
        Item item4 = new Item("Mozzarela ", 12500, "3004 " );
        Item item5 = new Item("Doble crema ", 8950, "3005 ");
        Item item6 = new Item("Campesino ", 7500, "3006 ");
        items2.add(item4);
        items2.add(item5);
        items2.add(item6);
        Producto producto2 = new Producto("Queso ", "Derivado lacteo", items2, "2002");
        
        ArrayList<Producto> prod;
        prod = new ArrayList<Producto>();
        prod.add(producto1);
        prod.add(producto2);
        Categoria categoria = new Categoria("Lacteos", "Leche y sus derivados",prod ,"1001");
        System.out.println("Categoria id: "+ categoria.getId());
        System.out.println("Categoria nombre: " +categoria.getNombre());
        System.out.println("Descripcion: "+ categoria.getDescripcion()+ "\n");
        categoria.MostrarProducto();
    }
}
