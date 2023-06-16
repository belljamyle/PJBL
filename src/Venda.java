import java.util.HashMap;

public class Venda {
    private Cliente cliente;
    private int id;
    private double valorTotal;
    private HashMap<String, ProdutoVenda> ProdutoVenda;
    public Venda() {}
    public Venda(Cliente cliente, int id, double valorTotal, HashMap<String, ProdutoVenda> ProdutoVenda) {
        this.cliente = cliente;
        this.id = id;
        this.valorTotal = valorTotal;
        this.ProdutoVenda = ProdutoVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public HashMap<String, ProdutoVenda> getProdutoVenda() {
        return ProdutoVenda;
    }
    public void setProdutoVenda(HashMap<String, ProdutoVenda> produtoVenda) {
        ProdutoVenda = produtoVenda;
    }
}
