import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClienteModel extends AbstractTableModel {
    static ArrayList<Cliente> clientes = new ArrayList<>();
    String[] colunas = {"ID", "Nome", "CPF", "Logradouro", "Bairro", "Cidade", "Estado", "Telefone", "E-Mail"};

    public ArrayList<Cliente> listaProdutos() {
        ArrayList<Cliente> optCliente = clientes;
        return optCliente;
    }

    public void cadastrarCliente(Cliente c) {
        clientes.add(c);
        this.fireTableDataChanged();
    }

    public Cliente returnCliente(int index) {
        return clientes.get(index);
    }

    public void editarCliente(int index, Cliente c) {
        clientes.set(index, c);
        this.fireTableDataChanged();
    }

    public void deletarCliente(int index) {
        clientes.remove(index);
        this.fireTableDataChanged();
    }

<<<<<<< Updated upstream
=======
    public ArrayList<Cliente> listaClientes() {
        ArrayList<Cliente> optCliente = clientes;
        return optCliente;
    }



>>>>>>> Stashed changes
    public int getRowCount() {
        return clientes.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public String getColumnName(int column) {
        return colunas[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return clientes.get(rowIndex).getId();
        } else if (columnIndex == 1) {
            return clientes.get(rowIndex).getNome();
        } else if (columnIndex == 2) {
            return clientes.get(rowIndex).getCpf();
        } else if (columnIndex == 3) {
            return clientes.get(rowIndex).getLogradouro();
        } else if (columnIndex == 4) {
            return clientes.get(rowIndex).getBairro();
        } else if (columnIndex == 5) {
            return clientes.get(rowIndex).getCidade();
        } else if (columnIndex == 7) {
            return clientes.get(rowIndex).getEstado();
        } else if (columnIndex == 8){
            return clientes.get(rowIndex).getTelefone();
        }  else {
            return clientes.get(rowIndex).getEmail();
        }
    }
}
