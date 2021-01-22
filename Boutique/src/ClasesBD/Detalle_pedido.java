package ClasesBD;

public class Detalle_pedido {
    private int id_pedido, id_prenda, cantidad;

    public Detalle_pedido() {
    }

    public Detalle_pedido(int id_pedido, int id_prenda, int cantidad) {
        this.id_pedido = id_pedido;
        this.id_prenda = id_prenda;
        this.cantidad = cantidad;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_prenda() {
        return id_prenda;
    }

    public void setId_prenda(int id_prenda) {
        this.id_prenda = id_prenda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
