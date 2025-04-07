package TelasPizzaria;

public class TelaCardapio extends javax.swing.JFrame {

    public TelaCardapio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlCardapio = new javax.swing.JPanel();
        pnlListaCardapio = new javax.swing.JPanel();
        lblBuscarPedido = new javax.swing.JLabel();
        txtBuscarPedido = new javax.swing.JTextField();
        lblFiltros = new javax.swing.JLabel();
        cmbFiltros = new javax.swing.JComboBox<>();
        jsListaCardapio = new javax.swing.JSeparator();
        pnlImagemProduto = new javax.swing.JPanel();
        lblNomedoProduto = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        pnlImagemProduto2 = new javax.swing.JPanel();
        lblNomedoProduto2 = new javax.swing.JLabel();
        lblPreco2 = new javax.swing.JLabel();
        pnlImagemProduto3 = new javax.swing.JPanel();
        lblNomedoProduto3 = new javax.swing.JLabel();
        lblPreco3 = new javax.swing.JLabel();
        pnlImagemProduto4 = new javax.swing.JPanel();
        lblNomedoProduto4 = new javax.swing.JLabel();
        lblPreco4 = new javax.swing.JLabel();
        pnlImagemProduto5 = new javax.swing.JPanel();
        lblNomedoProduto5 = new javax.swing.JLabel();
        lblPreco5 = new javax.swing.JLabel();
        pnlImagemProduto6 = new javax.swing.JPanel();
        lblNomedoProduto6 = new javax.swing.JLabel();
        lblPreco6 = new javax.swing.JLabel();
        lblCardapio = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cardápio");

        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCardapio.setBackground(new java.awt.Color(255, 51, 0));
        pnlCardapio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlListaCardapio.setBackground(new java.awt.Color(255, 255, 255));
        pnlListaCardapio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBuscarPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBuscarPedido.setText("Buscar pedido:");
        pnlListaCardapio.add(lblBuscarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtBuscarPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pnlListaCardapio.add(txtBuscarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 250, -1));

        lblFiltros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFiltros.setText("Filtros:");
        pnlListaCardapio.add(lblFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        cmbFiltros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbFiltros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Comida", "Bebida", "Brindes" }));
        cmbFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFiltrosActionPerformed(evt);
            }
        });
        pnlListaCardapio.add(cmbFiltros, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 200, -1));
        pnlListaCardapio.add(jsListaCardapio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 750, 10));

        javax.swing.GroupLayout pnlImagemProdutoLayout = new javax.swing.GroupLayout(pnlImagemProduto);
        pnlImagemProduto.setLayout(pnlImagemProdutoLayout);
        pnlImagemProdutoLayout.setHorizontalGroup(
            pnlImagemProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        pnlImagemProdutoLayout.setVerticalGroup(
            pnlImagemProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlListaCardapio.add(pnlImagemProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 210, -1));

        lblNomedoProduto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNomedoProduto.setText("Nome do Produto:");
        pnlListaCardapio.add(lblNomedoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        lblPreco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPreco.setText("Preço: R$00,00");
        pnlListaCardapio.add(lblPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        javax.swing.GroupLayout pnlImagemProduto2Layout = new javax.swing.GroupLayout(pnlImagemProduto2);
        pnlImagemProduto2.setLayout(pnlImagemProduto2Layout);
        pnlImagemProduto2Layout.setHorizontalGroup(
            pnlImagemProduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        pnlImagemProduto2Layout.setVerticalGroup(
            pnlImagemProduto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlListaCardapio.add(pnlImagemProduto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 210, -1));

        lblNomedoProduto2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNomedoProduto2.setText("Nome do Produto:");
        pnlListaCardapio.add(lblNomedoProduto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        lblPreco2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPreco2.setText("Preço: R$00,00");
        pnlListaCardapio.add(lblPreco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        javax.swing.GroupLayout pnlImagemProduto3Layout = new javax.swing.GroupLayout(pnlImagemProduto3);
        pnlImagemProduto3.setLayout(pnlImagemProduto3Layout);
        pnlImagemProduto3Layout.setHorizontalGroup(
            pnlImagemProduto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        pnlImagemProduto3Layout.setVerticalGroup(
            pnlImagemProduto3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlListaCardapio.add(pnlImagemProduto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 210, -1));

        lblNomedoProduto3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNomedoProduto3.setText("Nome do Produto:");
        pnlListaCardapio.add(lblNomedoProduto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        lblPreco3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPreco3.setText("Preço: R$00,00");
        pnlListaCardapio.add(lblPreco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        javax.swing.GroupLayout pnlImagemProduto4Layout = new javax.swing.GroupLayout(pnlImagemProduto4);
        pnlImagemProduto4.setLayout(pnlImagemProduto4Layout);
        pnlImagemProduto4Layout.setHorizontalGroup(
            pnlImagemProduto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        pnlImagemProduto4Layout.setVerticalGroup(
            pnlImagemProduto4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlListaCardapio.add(pnlImagemProduto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 210, -1));

        lblNomedoProduto4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNomedoProduto4.setText("Nome do Produto:");
        pnlListaCardapio.add(lblNomedoProduto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        lblPreco4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPreco4.setText("Preço: R$00,00");
        pnlListaCardapio.add(lblPreco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        javax.swing.GroupLayout pnlImagemProduto5Layout = new javax.swing.GroupLayout(pnlImagemProduto5);
        pnlImagemProduto5.setLayout(pnlImagemProduto5Layout);
        pnlImagemProduto5Layout.setHorizontalGroup(
            pnlImagemProduto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        pnlImagemProduto5Layout.setVerticalGroup(
            pnlImagemProduto5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlListaCardapio.add(pnlImagemProduto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 210, -1));

        lblNomedoProduto5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNomedoProduto5.setText("Nome do Produto:");
        pnlListaCardapio.add(lblNomedoProduto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        lblPreco5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPreco5.setText("Preço: R$00,00");
        pnlListaCardapio.add(lblPreco5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        javax.swing.GroupLayout pnlImagemProduto6Layout = new javax.swing.GroupLayout(pnlImagemProduto6);
        pnlImagemProduto6.setLayout(pnlImagemProduto6Layout);
        pnlImagemProduto6Layout.setHorizontalGroup(
            pnlImagemProduto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        pnlImagemProduto6Layout.setVerticalGroup(
            pnlImagemProduto6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlListaCardapio.add(pnlImagemProduto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 210, -1));

        lblNomedoProduto6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNomedoProduto6.setText("Nome do Produto:");
        pnlListaCardapio.add(lblNomedoProduto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));

        lblPreco6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPreco6.setText("Preço: R$00,00");
        pnlListaCardapio.add(lblPreco6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        pnlCardapio.add(pnlListaCardapio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 740, 480));

        lblCardapio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCardapio.setText("CARDÁPIO");
        pnlCardapio.add(lblCardapio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 40));

        btnVoltar.setBackground(new java.awt.Color(204, 204, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\55549\\Downloads\\imgVoltar (1).png")); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        pnlCardapio.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        btnVoltar.getAccessibleContext().setAccessibleDescription("Botão para voltar para a página anterior");

        pnlPrincipal.add(pnlCardapio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 520));

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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCardapio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbFiltros;
    private javax.swing.JSeparator jsListaCardapio;
    private javax.swing.JLabel lblBuscarPedido;
    private javax.swing.JLabel lblCardapio;
    private javax.swing.JLabel lblFiltros;
    private javax.swing.JLabel lblNomedoProduto;
    private javax.swing.JLabel lblNomedoProduto2;
    private javax.swing.JLabel lblNomedoProduto3;
    private javax.swing.JLabel lblNomedoProduto4;
    private javax.swing.JLabel lblNomedoProduto5;
    private javax.swing.JLabel lblNomedoProduto6;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblPreco2;
    private javax.swing.JLabel lblPreco3;
    private javax.swing.JLabel lblPreco4;
    private javax.swing.JLabel lblPreco5;
    private javax.swing.JLabel lblPreco6;
    private javax.swing.JPanel pnlCardapio;
    private javax.swing.JPanel pnlImagemProduto;
    private javax.swing.JPanel pnlImagemProduto2;
    private javax.swing.JPanel pnlImagemProduto3;
    private javax.swing.JPanel pnlImagemProduto4;
    private javax.swing.JPanel pnlImagemProduto5;
    private javax.swing.JPanel pnlImagemProduto6;
    private javax.swing.JPanel pnlListaCardapio;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtBuscarPedido;
    // End of variables declaration//GEN-END:variables
}
