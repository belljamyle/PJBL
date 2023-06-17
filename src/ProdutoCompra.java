public class ProdutoCompra {
    private Compra compra;
    private Produto produto;
    private int quantidade;
    private double valor;

    public ProdutoCompra() {}

    public ProdutoCompra(Compra compra, Produto produto, int quantidade, double valor) {
        this.compra = compra;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
