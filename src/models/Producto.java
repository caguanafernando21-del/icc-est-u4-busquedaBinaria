package models;

public class Producto {
    private String name;
    private int stock;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public Producto() {
    }

    public Producto(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "Producto [name=" + name + ", stock=" + stock + "]";
    }

    
    
}
