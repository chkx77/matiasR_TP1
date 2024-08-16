package TP1;

public class Prod_Limpieza extends Producto{

    private String tipoDeAplicacion;

    public Prod_Limpieza(String id,
                         String descripcion,
                         int stock,
                         int precio,
                         int ganancia,
                         boolean disponible) {
        super(id, descripcion, stock, precio, ganancia, disponible);
    }
}
