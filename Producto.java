package TP1;

public class Producto {

    private String id;
    private String descripcion;
    private int stock;
    private int precio;
    private int ganancia;
    private boolean disponible;

    // Setters y Getters de los atributos de la clase Producto.

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getGanancia() {
        return ganancia;
    }
    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }

    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Producto(String id, String descripcion, int stock, int precio, int ganancia, boolean disponible) {
        this.id = id;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.ganancia = ganancia;
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "=== Detalles del Producto ===\n" +
                "ID: " + id + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Stock Disponible: " + stock + " unidades\n" +
                "Precio: $" + precio + "\n" +
                "Ganancia: " + ganancia + "%\n" +
                "Disponibilidad: " + (disponible ? "En stock" : "Agotado") + "\n" +
                "===============================";
    }
}
