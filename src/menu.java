import javax.swing.*;

public class menu extends JDialog {
    private JPanel contentPane;
    private JButton btnCliente;
    private JButton btnFornecedores;
    private JButton btnProdutos;
    private JButton btnCompras;
    private JButton btnVendas;
    private JButton buttonOK;

    public menu() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        menu dialog = new menu();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
