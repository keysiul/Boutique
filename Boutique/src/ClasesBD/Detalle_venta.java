package ClasesBD;

public class Detalle_venta {
    private int id_venta, id_prenda, cantidad;

    public Detalle_venta() {
    }

    public Detalle_venta(int id_venta, int id_prenda, int cantidad) {
        this.id_venta = id_venta;
        this.id_prenda = id_prenda;
        this.cantidad = cantidad;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
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
