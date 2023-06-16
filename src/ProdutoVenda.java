public class ProdutoVenda {
    private Venda venda;
    private Produto produto;
    private int quantidade;
    private double valor;

    public ProdutoVenda() {}

    public ProdutoVenda(Venda venda, Produto produto, int quantidade, double valor) {
        this.venda = venda;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Venda getVenda() {
        return venda;
    }
    public void setVenda(Venda venda) {
        this.venda = venda;
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
