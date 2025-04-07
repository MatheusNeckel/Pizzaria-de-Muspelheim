package TelasPizzaria;

import Pedidos.Pedidos;
import Pedidos.PedidosDAO;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TelaListagemPedidos extends javax.swing.JFrame {

    public TelaListagemPedidos() {
        initComponents();
        pnlPedidos.setBackground(new Color(242,242,242,100));
        preencherTabela();
    }
    
    private void preencherTabela() {
        
        PedidosDAO pedidosDAO = new PedidosDAO();
        String descricao;
        
        descricao = txtBuscarPedido.getText();
        
        pedidosDAO.conectar();

        List<Pedidos> listaPedidos = pedidosDAO.buscarPedidos(descricao);

        DefaultTableModel tabelaPedidos = (DefaultTableModel) tblPedidos.getModel();

        tabelaPedidos.setNumRows(0);

        tblPedidos.setRowSorter(new TableRowSorter(tabelaPedidos));
        
        for (Pedidos pedidos : listaPedidos) {
            Object[] obj = new Object[]{
                pedidos.getId(),
                pedidos.getDescricao(),
                pedidos.getValorTotal(),
                pedidos.getTipoDePagamento(),
                pedidos.getStatus(),
                pedidos.getData(),
            };

            tabelaPedidos.addRow(obj);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlPedidos = new javax.swing.JPanel();
        lblPedidos = new javax.swing.JLabel();
        lblBuscarPedido = new javax.swing.JLabel();
        txtBuscarPedido = new javax.swing.JTextField();
        lblFiltros = new javax.swing.JLabel();
        cmbFiltros = new javax.swing.JComboBox<>();
        lblData = new javax.swing.JLabel();
        ftfData = new javax.swing.JFormattedTextField();
        btnNovoPedido = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        pnlImagemUpload1 = new javax.swing.JPanel();
        lblImagemProduto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        imgMuspelheim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedidos");

        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPedidos.setBackground(new java.awt.Color(255, 255, 255));
        pnlPedidos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPedidos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPedidos.setText("PEDIDOS");
        pnlPedidos.add(lblPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        lblBuscarPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBuscarPedido.setText("Buscar pedido:");
        pnlPedidos.add(lblBuscarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtBuscarPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscarPedido.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtBuscarPedidoCaretUpdate(evt);
            }
        });
        pnlPedidos.add(txtBuscarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 250, -1));

        lblFiltros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFiltros.setText("Filtros:");
        pnlPedidos.add(lblFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        cmbFiltros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbFiltros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Número do Pedido", "Cliente", "Status do Pedido", "Data do Pedido", "Horário do Pedido", "Forma de Pagamento", "Pedidos Pagos", "Pedidos Não Pagos", "Tipo de Item", "Últimos Pedidos" }));
        cmbFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltrosActionPerformed(evt);
            }
        });
        pnlPedidos.add(cmbFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, -1));

        lblData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblData.setText("DATA:");
        pnlPedidos.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        ftfData.setText("    DD/MM/YYYY");
        pnlPedidos.add(ftfData, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 120, -1));

        btnNovoPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNovoPedido.setText("NOVO PEDIDO");
        btnNovoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPedidoActionPerformed(evt);
            }
        });
        pnlPedidos.add(btnNovoPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, -1));

        btnVoltar.setBackground(new java.awt.Color(204, 204, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgVoltar (1).png")); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        pnlPedidos.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        btnVoltar.getAccessibleContext().setAccessibleDescription("Botão para voltar para a página anterior");

        pnlImagemUpload1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout pnlImagemUpload1Layout = new javax.swing.GroupLayout(pnlImagemUpload1);
        pnlImagemUpload1.setLayout(pnlImagemUpload1Layout);
        pnlImagemUpload1Layout.setHorizontalGroup(
            pnlImagemUpload1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImagemUpload1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblImagemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnlImagemUpload1Layout.setVerticalGroup(
            pnlImagemUpload1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImagemUpload1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblImagemProduto)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pnlPedidos.add(pnlImagemUpload1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 110, 100));

        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPedidos);

        pnlPedidos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 680, 280));

        pnlPrincipal.add(pnlPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 550));

        imgMuspelheim.setBackground(new java.awt.Color(255, 255, 255));
        imgMuspelheim.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgMuspelheim (4).png")); // NOI18N
        pnlPrincipal.add(imgMuspelheim, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFiltrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFiltrosActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaMenuInicial telaMenuInicial = new TelaMenuInicial();
        telaMenuInicial.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnNovoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPedidoActionPerformed
        TelaCadastroPedidos telaCadastroPedidos = new TelaCadastroPedidos();
        telaCadastroPedidos.setVisible(true);
    }//GEN-LAST:event_btnNovoPedidoActionPerformed

    private void txtBuscarPedidoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtBuscarPedidoCaretUpdate
        preencherTabela();
    }//GEN-LAST:event_txtBuscarPedidoCaretUpdate

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListagemPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovoPedido;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbFiltros;
    private javax.swing.JFormattedTextField ftfData;
    private javax.swing.JLabel imgMuspelheim;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscarPedido;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblFiltros;
    private javax.swing.JLabel lblImagemProduto;
    private javax.swing.JLabel lblPedidos;
    private javax.swing.JPanel pnlImagemUpload1;
    private javax.swing.JPanel pnlPedidos;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTable tblPedidos;
    private javax.swing.JTextField txtBuscarPedido;
    // End of variables declaration//GEN-END:variables
}
