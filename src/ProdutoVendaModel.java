import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.HashMap;

public class ProdutoVendaModel extends AbstractTableModel {
    ArrayList<ProdutoVenda> produtos = new ArrayList<>();
    HashMap<Integer, ProdutoVenda> ProdutoVenda;
    String[] colunas = {"Venda", "Produto", "Quantidade", "Valor"};

    public void adicionarProduto(ProdutoVenda p) {
        produtos.add(p);
        this.fireTableDataChanged();
    }

    public void adicionarProdutoVenda(ProdutoVenda p) {
        ProdutoVenda.put(p.getVenda(), p);
    }

    public double returnValorTotal(int id) {
        double valorTotal = 0;
        for(Integer key: ProdutoVenda.keySet()){
            ProdutoVenda p = ProdutoVenda.get(key);
            if(key == id) {
                valorTotal += p.getValor();
            }
        }
        return valorTotal;
    }

    public ProdutoVenda returnProduto(int index) {
        return produtos.get(index);
    }

    public void editarProduto(int index, ProdutoVenda p) {
        produtos.set(index, p);
        this.fireTableDataChanged();
    }

    public void deletarProdutos(int index) {
        produtos.remove(index);
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
