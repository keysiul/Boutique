package ClasesBD;

public class Pedido {
    private int id_pedido;
    private String rfc_empleado;
    private int id_proveedor;
    private String fecha_pedido;

    public Pedido() {
    }

    public Pedido(int id_pedido, String rfc_empleado, int id_proveedor, String fecha_pedido) {
        this.id_pedido = id_pedido;
        this.rfc_empleado = rfc_empleado;
        this.id_proveedor = id_proveedor;
        this.fecha_pedido = fecha_pedido;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getRfc_empleado() {
        return rfc_empleado;
    }

    public void setRfc_empleado(String rfc_empleado) {
        this.rfc_empleado = rfc_empleado;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(String fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }
}
