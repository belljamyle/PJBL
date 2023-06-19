import java.io.IOException;
import java.io.Serializable;

public class Produto implements Serializable {
    private int id;
    private String nome;
    private String descricao;
    private int quantidade;
    private String unidade;
    private double valorUnitario;

    public void gravarProduto(Produto p) {
        try {
            serializador.gravar(p.getNome() + ".produto", p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void recuperarProduto(Produto p, String nome_arquivo) {
        try {
            Produto produto = (Produto) serializador.ler(nome_arquivo);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void editarProduto(String nome_arquivo) {
        try {
            Produto produto = (Produto) serializador.ler(nome_arquivo);

            serializador.gravar(nome_arquivo, produto);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Produto() {}
    public Produto(int id, String nome, String descricao, int quantidade, String unidade, double valorUnitario) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.valorUnitario = valorUnitario;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidade() {
        return unidade;
    }
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
