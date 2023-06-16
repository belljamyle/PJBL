import javax.swing.*;

public class telaProduto extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public telaProduto() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        telaProduto dialog = new telaProduto();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
