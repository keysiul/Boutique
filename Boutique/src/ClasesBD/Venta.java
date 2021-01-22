package ClasesBD;

public class Venta {
    private int id_venta;
    private String rfc_empleado;
    private int id_cliente;
    private String fecha_venta;

    public Venta() {
    }

    public Venta(int id_venta, String rfc_empleado, int id_cliente, String fecha_venta) {
        this.id_venta = id_venta;
        this.rfc_empleado = rfc_empleado;
        this.id_cliente = id_cliente;
        this.fecha_venta = fecha_venta;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getRfc_empleado() {
        return rfc_empleado;
    }

    public void setRfc_empleado(String rfc_empleado) {
        this.rfc_empleado = rfc_empleado;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }
}
