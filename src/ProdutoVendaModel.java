import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.HashMap;

public class ProdutoVendaModel extends AbstractTableModel {
    static ArrayList<ProdutoVenda> produtos = new ArrayList<>();
    static ArrayList<ProdutoVenda> produtoss = new ArrayList<>();
    HashMap<Integer, ProdutoVenda> ProdutoVenda;
    String[] colunas = {"Venda", "Produto", "Quantidade", "Valor"};

    public ArrayList<ProdutoVenda> listaProdutos() {
        ArrayList<ProdutoVenda> optProduto = produtos;
        return optProduto;
    }

    public void adicionarProduto(ProdutoVenda p) {
        produtos.add(p);
        produtoss.add(p);
        this.fireTableDataChanged();
    }

    public void removerProdutos() {
        produtos.clear();
        this.fireTableDataChanged();
    }

    public double returnValorTotal(int id) {
        double valorTotal = 0;
        for(ProdutoVenda pv: produtos){
            if(pv.getVenda() == id) {
                valorTotal += pv.getValor();
            }
        }
        return valorTotal;
    }

    public int returnQuantidade(int id, String produto) {
        int quantidade = 0;
        for(ProdutoVenda pv: produtos) {
            if(pv.getVenda() == id && pv.getProduto() == produto) {
                quantidade += pv.getQuantidade();
            }
        }
        return quantidade;
    }

    public ProdutoVenda returnProduto(int index) {
        return produtos.get(index);
    }

    public void editarProduto(int index, ProdutoVenda p) {
        produtos.set(index, p);
        produtoss.set(index, p);
        this.fireTableDataChanged();
    }

    public void deletarProdutos(int index) {
        produtos.remove(index);
        produtoss.remove(index);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return produtos.get(rowIndex).getVenda();
        } else if (columnIndex == 1) {
            return produtos.get(rowIndex).getProduto();
        } else if (columnIndex == 2) {
            return produtos.get(rowIndex).getQuantidade();
        } else {
            return produtos.get(rowIndex).getValor();
        }
    }
}
