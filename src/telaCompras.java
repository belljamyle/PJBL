import javax.swing.*;

public class telaCompras extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;

    public telaCompras() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        telaCompras dialog = new telaCompras();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
