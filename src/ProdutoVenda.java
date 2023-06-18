public class ProdutoVenda {
    private int idVenda;
    private Produto produto;
    private int quantidade;
    private double valor;

    public ProdutoVenda() {}

    public ProdutoVenda(int idVenda, Produto produto, int quantidade, double valor) {
        this.idVenda = idVenda;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public int getVenda() {
        return idVenda;
    }
    public void setVenda(int idVenda) {
        this.idVenda = idVenda;
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
