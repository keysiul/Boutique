package ClasesBD;

public class Proveedor {
    private int id_proveedor;
    private String nombre_proveedor, dirección_proveedor, telefono_proveedor;

    public Proveedor() {
    }

    public Proveedor(int id_proveedor, String nombre_proveedor, String dirección_proveedor, String telefono_proveedor) {
        this.id_proveedor = id_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.dirección_proveedor = dirección_proveedor;
        this.telefono_proveedor = telefono_proveedor;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getDirección_proveedor() {
        return dirección_proveedor;
    }

    public void setDirección_proveedor(String dirección_proveedor) {
        this.dirección_proveedor = dirección_proveedor;
    }

    public String getTelefono_proveedor() {
        return telefono_proveedor;
    }

    public void setTelefono_proveedor(String telefono_proveedor) {
        this.telefono_proveedor = telefono_proveedor;
    }
}
