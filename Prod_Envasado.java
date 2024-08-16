package TP1;

public class Prod_Envasado extends Producto{

    private String tipoEnvase;
    private boolean importado;

    public Prod_Envasado(String id,
                         String descripcion,
                         int stock,
                         int precio,
                         int ganancia,
                         boolean disponible) {
        super(id, descripcion, stock, precio, ganancia, disponible);
    }


}
