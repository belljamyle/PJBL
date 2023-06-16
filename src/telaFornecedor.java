import javax.swing.*;

public class telaFornecedor extends JDialog {
    private JPanel contentPane;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField TextField;
    private JTextField textField7;
    private JButton btnGravar;
    private JButton btnDeletar;
    private JButton btnEditar;
    private JButton buttonOK;

    public telaFornecedor() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        telaFornecedor dialog = new telaFornecedor();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
