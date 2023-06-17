import java.util.HashMap;

public class Compra {

    private Fornecedor fornecedor;
    private int id;
    private double valorTotal;
    private HashMap<String, ProdutoCompra> ProdutoCompra;
    public Compra() {}
    public Compra(Fornecedor fornecedor, int id, double valorTotal, HashMap<String, ProdutoCompra> ProdutoCompra) {
        this.fornecedor = fornecedor;
        this.id = id;
        this.valorTotal = valorTotal;
        this.ProdutoCompra = ProdutoCompra;
    }


}
