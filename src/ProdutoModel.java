import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ProdutoModel extends AbstractTableModel {

    static ArrayList<Produto> produtos = new ArrayList<>();
    String[] colunas = {"ID", "Nome", "Descrição", "Quantidade", "Unidade", "Valor Unitário"};

    public void cadastrarProduto(Produto p) {
        produtos.add(p);
        this.fireTableDataChanged();
    }

    public Produto returnProduto(int index) {
        return produtos.get(index);
    }

    public void editarProduto(int index, Produto p) {
        produtos.set(index, p);
        this.fireTableDataChanged();
    }

    public void deletarProdutos(int index) {
        produtos.remove(index);
        this.fireTableDataChanged();
    }

    public ArrayList<Produto> listaProdutos() {
        ArrayList<Produto> optProduto = produtos;
        return optProduto;
    }

    public int returnIndex(Produto p, String nome) {
        int i = 0;
        for(Produto produto: produtos) {
            if(produto.getNome() == nome){
                return i;
            } else {
                i++;
            }
        }
        return i;
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
            return produtos.get(rowIndex).getId();
        } else if (columnIndex == 1) {
            return produtos.get(rowIndex).getNome();
        } else if (columnIndex == 2) {
            return produtos.get(rowIndex).getDescricao();
        } else if (columnIndex == 3) {
            return produtos.get(rowIndex).getQuantidade();
        } else if (columnIndex == 4) {
            return produtos.get(rowIndex).getUnidade();
        } else {
            return produtos.get(rowIndex).getValorUnitario();
        }
    }
}
