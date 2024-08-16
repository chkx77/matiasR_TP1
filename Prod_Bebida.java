package TP1;

public class Prod_Bebida extends Producto{

    private double graduacionAlcoholica;
    private boolean importado;

    public Prod_Bebida(String id,
                         String descripcion,
                         int stock,
                         int precio,
                         int ganancia,
                         boolean disponible) {
        super(id, descripcion, stock, precio, ganancia, disponible);
    }
}
