import javax.swing.*;

public class telaVendas extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public telaVendas() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        telaVendas dialog = new telaVendas();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
