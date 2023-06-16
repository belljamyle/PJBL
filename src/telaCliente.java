import javax.swing.*;

public class telaCliente extends JDialog {
    private JPanel contentPane;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton btnGravar;
    private JButton btnDeletar;
    private JButton btnEditar;
    private JButton buttonOK;
    private JButton buttonCancel;

    public telaCliente() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);


    }


    public static void main(String[] args) {
        telaCliente dialog = new telaCliente();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
