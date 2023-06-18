import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class VendaModel extends AbstractTableModel {
    ArrayList<Venda> vendas = new ArrayList<>();
    String[] colunas = {"Cliente", "ID", "Valor Total"};

    public void criarVenda(Venda v) {
        vendas.add(v);
        this.fireTableDataChanged();
    }

    public Venda returnVenda(int index) {
        return vendas.get(index);
    }

    public void deletarVenda(int index) {
        vendas.remove(index);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return vendas.size();
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
            return vendas.get(rowIndex).getCliente();
        } else if (columnIndex == 1) {
            return vendas.get(rowIndex).getId();
        } else {
            return vendas.get(rowIndex).getValorTotal();
        }
    }
}
