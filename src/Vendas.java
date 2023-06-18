import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author bell
 */
public class Vendas extends javax.swing.JFrame {
    ProdutoVendaModel modelProduto = new ProdutoVendaModel();
    VendaModel modelVenda = new VendaModel();
    ClienteModel modelCliente = new ClienteModel();
    ProdutoModel modelProdutos = new ProdutoModel();
    /**
     * Creates new form Vendas
     */
    public Vendas() {
        initComponents();
        tbProdutosVenda.setModel(modelProduto);
        tbVendas.setModel(modelVenda);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        cbProduto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutosVenda = new javax.swing.JTable();
        btnCriarVenda = new javax.swing.JButton();
        btnDeletarVenda = new javax.swing.JButton();
        btnAdicionarProduto = new javax.swing.JButton();
        btnDeletarProduto = new javax.swing.JButton();
        btnEditarProduto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbVendas = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        cbCliente = new javax.swing.JComboBox<>();
        txtValorUnitário = new javax.swing.JTextField();
        txtQuantidadeDisponivel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Gerenciamento de Vendas");

        jLabel2.setText("ID");

        jLabel3.setText("Produto");

        jLabel4.setText("Valor Unitário:");

        jLabel5.setText("Quantidade Disponível:");

        jLabel6.setText("Quantidade");

        jLabel7.setText("______________________________________________________________");

        jLabel8.setText("Valor Total:");

        tbProdutosVenda.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        tbProdutosVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutosVendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProdutosVenda);

        btnCriarVenda.setText("Criar Venda");
        btnCriarVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCriarVendaMouseClicked(evt);
            }
        });

        btnDeletarVenda.setText("Deletar Venda");
        btnDeletarVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletarVendaMouseClicked(evt);
            }
        });

        btnAdicionarProduto.setText("Adicionar Produto");
        btnAdicionarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarProdutoMouseClicked(evt);
            }
        });

        btnDeletarProduto.setText("Deletar Produto");
        btnDeletarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeletarProdutoMouseClicked(evt);
            }
        });

        btnEditarProduto.setText("Editar Produto");
        btnEditarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarProdutoMouseClicked(evt);
            }
        });

        tbVendas.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        tbVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVendasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbVendas);

        jLabel9.setText("Cliente");

        txtValorUnitário.setEnabled(false);

        txtQuantidadeDisponivel.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel8)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnAdicionarProduto)
                                                                .addGap(32, 32, 32)
                                                                .addComponent(btnEditarProduto)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnDeletarProduto))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel6))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                        .addComponent(jLabel5)
                                                                                                        .addGap(18, 18, 18)
                                                                                                        .addComponent(txtQuantidadeDisponivel))
                                                                                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(115, 115, 115)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(cbCliente, 0, 266, Short.MAX_VALUE)
                                                                                        .addComponent(txtID))
                                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                                .addGap(12, 12, 12))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtValorUnitário, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(btnCriarVenda)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnDeletarVenda)
                                                .addGap(89, 89, 89)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(337, 337, 337)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(txtValorUnitário, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtQuantidadeDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnAdicionarProduto)
                                                        .addComponent(btnEditarProduto)
                                                        .addComponent(btnDeletarProduto))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnCriarVenda)
                                                        .addComponent(btnDeletarVenda))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2))
                                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>

    private void btnAdicionarProdutoMouseClicked(java.awt.event.MouseEvent evt) {
        int id = Integer.parseInt(txtID.getText());
        Produto produto = (Produto) cbProduto.getSelectedItem();
        int quantidade = Integer.parseInt(txtQuantidade.getText());
        double valor = 0;
        if (produto != null) {
            valor = produto.getValorUnitario() * quantidade;
        }

        ProdutoVenda p = new ProdutoVenda(id, produto, quantidade, valor);

        this.modelProduto.adicionarProduto(p);

        LimparCampos();
    }

    public void LimparCampos() {
        txtID.setText("");
        cbCliente.setSelectedItem("");
        cbProduto.setSelectedItem("");
        txtQuantidade.setText("");
    }

    public void comboBoxCliente() {
        ArrayList<Cliente> clientes = modelCliente.listaClientes();
        for(Cliente i: clientes) {
            cbCliente.addItem(String.valueOf(i));
        }
    }

    public void comboBoxProduto() {
        ArrayList<Produto> produtos = modelProdutos.listaProdutos();
        for(Produto i: produtos) {
            cbProduto.addItem(String.valueOf(i));
        }
    }

    private void btnEditarProdutoMouseClicked(java.awt.event.MouseEvent evt) {
        int id = Integer.parseInt(txtID.getText());
        Produto produto = (Produto) cbProduto.getSelectedItem();
        int quantidade = Integer.parseInt(txtQuantidade.getText());
        double valor = 0;
        if (produto != null) {
            valor = produto.getValorUnitario() * quantidade;
        }
        int index = tbProdutosVenda.getSelectedRow();

        ProdutoVenda p = new ProdutoVenda(id, produto, quantidade, valor);

        this.modelProduto.editarProduto(index, p);

        LimparCampos();
    }

    private void btnDeletarProdutoMouseClicked(java.awt.event.MouseEvent evt) {
        int index = tbProdutosVenda.getSelectedRow();

        this.modelProduto.deletarProdutos(index);

        LimparCampos();
    }

    private void tbProdutosVendaMouseClicked(java.awt.event.MouseEvent evt) {
        int index = tbProdutosVenda.getSelectedRow();
        ProdutoVenda p = this.modelProduto.returnProduto(index);

        txtID.setText(String.valueOf(p.getVenda()));
        cbProduto.setSelectedItem(p.getProduto());
        txtQuantidade.setText(String.valueOf(p.getQuantidade()));
    }

    private void btnCriarVendaMouseClicked(java.awt.event.MouseEvent evt) {
        Cliente cliente = (Cliente) cbCliente.getSelectedItem();
        int id = Integer.parseInt(txtID.getText());
        double valorTotal = modelProduto.returnValorTotal(id);
        HashMap<Integer, ProdutoVenda> produtos = modelProduto.ProdutoVenda;

        Venda v = new Venda(cliente, id, valorTotal, produtos);
        this.modelVenda.criarVenda(v);

        LimparCampos();
    }

    private void btnDeletarVendaMouseClicked(java.awt.event.MouseEvent evt) {
        int index = tbVendas.getSelectedRow();

        this.modelVenda.deletarVenda(index);

        LimparCampos();
    }

    private void tbVendasMouseClicked(java.awt.event.MouseEvent evt) {
        int index = tbProdutosVenda.getSelectedRow();
        Venda v = this.modelVenda.returnVenda(index);


        cbCliente.setSelectedItem(v.getCliente());
        txtID.setText(String.valueOf(v.getId()));
        txtValorUnitário.setText(String.valueOf(v.getValorTotal()));

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnCriarVenda;
    private javax.swing.JButton btnDeletarProduto;
    private javax.swing.JButton btnDeletarVenda;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbProdutosVenda;
    private javax.swing.JTable tbVendas;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtQuantidadeDisponivel;
    private javax.swing.JTextField txtValorUnitário;

    // End of variables declaration
}
