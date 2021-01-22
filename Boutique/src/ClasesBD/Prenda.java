package ClasesBD;

public class Prenda {
    private String id_prenda, nombre_prenda, talla_prenda, color_prenda, marca_prenda, genero_prenda;
    private double precio_venta, precio_compra;

    public Prenda() {
    }

    public Prenda(String id_prenda, String nombre_prenda, String talla_prenda, String color_prenda, String marca_prenda, String genero_prenda, double precio_venta, double precio_compra) {
        this.id_prenda = id_prenda;
        this.nombre_prenda = nombre_prenda;
        this.talla_prenda = talla_prenda;
        this.color_prenda = color_prenda;
        this.marca_prenda = marca_prenda;
        this.genero_prenda = genero_prenda;
        this.precio_venta = precio_venta;
        this.precio_compra = precio_compra;
    }

    public String getId_prenda() {
        return id_prenda;
    }

    public void setId_prenda(String id_prenda) {
        this.id_prenda = id_prenda;
    }

    public String getNombre_prenda() {
        return nombre_prenda;
    }

    public void setNombre_prenda(String nombre_prenda) {
        this.nombre_prenda = nombre_prenda;
    }

    public String getTalla_prenda() {
        return talla_prenda;
    }

    public void setTalla_prenda(String talla_prenda) {
        this.talla_prenda = talla_prenda;
    }

    public String getColor_prenda() {
        return color_prenda;
    }

    public void setColor_prenda(String color_prenda) {
        this.color_prenda = color_prenda;
    }

    public String getMarca_prenda() {
        return marca_prenda;
    }

    public void setMarca_prenda(String marca_prenda) {
        this.marca_prenda = marca_prenda;
    }

    public String getGenero_prenda() {
        return genero_prenda;
    }

    public void setGenero_prenda(String genero_prenda) {
        this.genero_prenda = genero_prenda;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }
}
