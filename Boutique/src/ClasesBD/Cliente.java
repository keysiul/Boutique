package ClasesBD;

public class Cliente {
    private int id_cliente;
    private String nombre, ap_paterno_c, ap_materno_c, tipo_cliente_c;
    private int compras_c;
    private String telefono;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nombre, String ap_paterno_c, String ap_materno_c, String tipo_cliente_c, int compras_c, String telefono) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.ap_paterno_c = ap_paterno_c;
        this.ap_materno_c = ap_materno_c;
        this.tipo_cliente_c = tipo_cliente_c;
        this.compras_c = compras_c;
        this.telefono = telefono;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_paterno_c() {
        return ap_paterno_c;
    }

    public void setAp_paterno_c(String ap_paterno_c) {
        this.ap_paterno_c = ap_paterno_c;
    }

    public String getAp_materno_c() {
        return ap_materno_c;
    }

    public void setAp_materno_c(String ap_materno_c) {
        this.ap_materno_c = ap_materno_c;
    }

    public String getTipo_cliente_c() {
        return tipo_cliente_c;
    }

    public void setTipo_cliente_c(String tipo_cliente_c) {
        this.tipo_cliente_c = tipo_cliente_c;
    }

    public int getCompras_c() {
        return compras_c;
    }

    public void setCompras_c(int compras_c) {
        this.compras_c = compras_c;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
