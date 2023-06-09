<<<<<<< Updated upstream
public class ProdutoVenda {
    private Venda venda;
    private Produto produto;
=======
import java.io.IOException;
import java.io.Serializable;

public class ProdutoVenda implements Serializable {
    private int idVenda;
    private String produto;
>>>>>>> Stashed changes
    private int quantidade;
    private double valor;

    public void gravarProdutoVenda(ProdutoVenda p) {
        try {
            serializador.gravar(p.getVenda() + ".produtoVenda", p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void recuperarProdutoVenda(ProdutoVenda p, String nome_arquivo) {
        try {
            ProdutoVenda produtoVenda = (ProdutoVenda) serializador.ler(nome_arquivo);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void editarProdutoVenda(String nome_arquivo) {
        try {
            ProdutoVenda produtoVenda = (ProdutoVenda) serializador.ler(nome_arquivo);

            serializador.gravar(nome_arquivo, produtoVenda);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ProdutoVenda() {}

<<<<<<< Updated upstream
    public ProdutoVenda(Venda venda, Produto produto, int quantidade, double valor) {
        this.venda = venda;
=======
    public ProdutoVenda(int idVenda, String produto, int quantidade, double valor) {
        this.idVenda = idVenda;
>>>>>>> Stashed changes
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

    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
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
