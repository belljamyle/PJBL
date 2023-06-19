import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;

public class Venda implements Serializable{
    private String cliente;
    private int id;
    private double valorTotal;
<<<<<<< Updated upstream
    private HashMap<String, ProdutoVenda> ProdutoVenda;
    public Venda() {}
    public Venda(Cliente cliente, int id, double valorTotal, HashMap<String, ProdutoVenda> ProdutoVenda) {
=======
    private HashMap<Integer, ProdutoVenda> ProdutoVenda;

    public void gravarVenda(Venda v) {
        try {
            serializador.gravar(v.getId() + ".venda", v);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void recuperarVenda(Venda v, String nome_arquivo) {
        try {
            Venda venda = (Venda) serializador.ler(nome_arquivo);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void editarVenda(String nome_arquivo) {
        try {
            Venda venda = (Venda) serializador.ler(nome_arquivo);

            serializador.gravar(nome_arquivo, venda);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Venda() {}
    public Venda(String cliente, int id, double valorTotal, HashMap<Integer, ProdutoVenda> ProdutoVenda) {
>>>>>>> Stashed changes
        this.cliente = cliente;
        this.id = id;
        this.valorTotal = valorTotal;
        this.ProdutoVenda = ProdutoVenda;
    }

    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
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
