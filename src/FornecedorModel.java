import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class FornecedorModel extends AbstractTableModel {
    ArrayList<Fornecedor> fornecedores = new ArrayList<>();
    String[] colunas = {"ID", "Nome", "CPF", "Logradouro", "Bairro", "Cidade", "Estado", "Telefone", "E-Mail"};

    public void cadastrarFornecedor(Fornecedor f) {
        fornecedores.add(f);
        this.fireTableDataChanged();
    }

    public int getRowCount() {
        return fornecedores.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public String getColumnName(int column) {
        return colunas[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0) {
            return fornecedores.get(rowIndex).getId();
        } else if (columnIndex == 1) {
            return fornecedores.get(rowIndex).getNome();
        } else if (columnIndex == 2) {
            return fornecedores.get(rowIndex).getCpf();
        } else if (columnIndex == 3) {
            return fornecedores.get(rowIndex).getLogradouro();
        } else if (columnIndex == 4) {
            return fornecedores.get(rowIndex).getBairro();
        } else if (columnIndex == 5) {
            return fornecedores.get(rowIndex).getCidade();
        } else if (columnIndex == 7) {
            return fornecedores.get(rowIndex).getEstado();
        } else if (columnIndex == 8){
            return fornecedores.get(rowIndex).getTelefone();
        } else {
            return fornecedores.get(rowIndex).getEmail();
        }
    }
}
