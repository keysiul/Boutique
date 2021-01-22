package ClasesBD;

public class Stock {
    private int id_prenda;
    private int cantidad_stock;

    public Stock() {
    }

    public Stock(int id_prenda, int cantidad_stock) {
        this.id_prenda = id_prenda;
        this.cantidad_stock = cantidad_stock;
    }

    public int getId_prenda() {
        return id_prenda;
    }

    public void setId_prenda(int id_prenda) {
        this.id_prenda = id_prenda;
    }

    public int getCantidad_stock() {
        return cantidad_stock;
    }

    public void setCantidad_stock(int cantidad_stock) {
        this.cantidad_stock = cantidad_stock;
    }
}
