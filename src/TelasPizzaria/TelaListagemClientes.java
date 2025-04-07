package TelasPizzaria;

import Clientes.Clientes;
import Clientes.ClientesDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TelaListagemClientes extends javax.swing.JFrame {

    public TelaListagemClientes() {
        initComponents();
        preencherTabela();
    }
    
    private void preencherTabela() {
        
        ClientesDAO clientesDAO = new ClientesDAO();
        String nome;
        
        nome = txtBuscar.getText();
        
        clientesDAO.conectar();

        List<Clientes> listaClientes = clientesDAO.buscarClientes(nome);

        DefaultTableModel tabelaClientes = (DefaultTableModel) tblClientes.getModel();

        tabelaClientes.setNumRows(0);

        tblClientes.setRowSorter(new TableRowSorter(tabelaClientes));
        
        for (Clientes clientes : listaClientes) {
            Object[] obj = new Object[]{
                clientes.getNome(),
                clientes.getSobrenome(),
                clientes.getGenero(),
                clientes.getTelefone(),
                clientes.getCpf(),
                clientes.getEndereco(),
                clientes.getPontoReferencia(),
                clientes.getEmail(),
                clientes.getSenha(),
                clientes.getDataDeNascimento()
            };

            tabelaClientes.addRow(obj);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlClientes = new javax.swing.JPanel();
        pnlListagemClientes = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lblFiltros = new javax.swing.JLabel();
        cmbFiltros = new javax.swing.JComboBox<>();
        jsListaClientes = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnNovoCliente = new javax.swing.JButton();
        lblClientes = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlClientes.setBackground(new java.awt.Color(255, 51, 0));
        pnlClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlListagemClientes.setBackground(new java.awt.Color(255, 255, 255));
        pnlListagemClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBuscar.setText("Buscar cliente:");
        pnlListagemClientes.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtBuscarCaretUpdate(evt);
            }
        });
        pnlListagemClientes.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 250, -1));

        lblFiltros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFiltros.setText("Filtros:");
        pnlListagemClientes.add(lblFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        cmbFiltros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbFiltros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Nome", "Sobrenome", "Gênero", "Telefone", "CPF", "Endereço", "Ponto de Referência", "Email", "Senha" }));
        cmbFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltrosActionPerformed(evt);
            }
        });
        pnlListagemClientes.add(cmbFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 200, -1));
        pnlListagemClientes.add(jsListaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 750, 10));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Sobrenome", "Gênero", "Telefone", "CPF", "Endereço", "Ponto de Referência"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);
        tblClientes.getAccessibleContext().setAccessibleName("Lista de Clientes");
        tblClientes.getAccessibleContext().setAccessibleDescription("Lista para mostrar todos os clientes");

        pnlListagemClientes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 67, 730, 410));

        btnNovoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNovoCliente.setText("NOVO CLIENTE");
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });
        pnlListagemClientes.add(btnNovoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        pnlClientes.add(pnlListagemClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 730, 480));

        lblClientes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblClientes.setText("CLIENTES");
        pnlClientes.add(lblClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 40));

        btnVoltar.setBackground(new java.awt.Color(204, 204, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgVoltar (1).png")); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        pnlClientes.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        btnVoltar.getAccessibleContext().setAccessibleDescription("Botão para voltar para a página anterior");

        jPanel1.add(pnlClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFiltrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFiltrosActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        TelaCadastroClientes telaCadastroClientes = new TelaCadastroClientes();
        telaCadastroClientes.setVisible(true);
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtBuscarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtBuscarCaretUpdate
        preencherTabela();
    }//GEN-LAST:event_txtBuscarCaretUpdate

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListagemClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbFiltros;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jsListaClientes;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblFiltros;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlListagemClientes;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
