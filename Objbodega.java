public class Objbodega {
    private String Articulos;
    private int Stock;
    public Objbodega() {
    }
    public Objbodega(String articulos, int stock) {
        Articulos = articulos;
        Stock = stock;
    }
    public String getArticulos() {
        return Articulos;
    }
    public void setArticulos(String articulos) {
        Articulos = articulos;
    }
    public int getStock() {
        return Stock;
    }
    public void setStock(int stock) {
        Stock = stock;
    }
}
