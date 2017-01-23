/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import apresentacao.utils.ControleCampos;
import apresentacao.utils.Mensagens;
import controle.ControleFornecedor;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Fornecedor;

/**
 *
 * @author edsonmarcks
 */
public class TelaFornecedor extends javax.swing.JInternalFrame {

    private ControleFornecedor controleFornecedor;
    private DefaultTableModel modelo;
    private TelaMaterial telaMaterial;

    /**
     * Creates new form TelaFornecedor
     */
    public TelaFornecedor() {
        initComponents();
        controleFornecedor = new ControleFornecedor();
        carregaDadosTable();
        habilite(false);
    }

    public TelaFornecedor(TelaMaterial telaMaterial) {
        initComponents();
        controleFornecedor = new ControleFornecedor();
        carregaDadosTable();
        this.telaMaterial = telaMaterial;
        habilite(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtRazao = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JFormattedTextField();
        txtTelafone = new javax.swing.JFormattedTextField();
        txtLogradouro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        FornecedorTable = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconifiable(true);
        setTitle("Fornecedores");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/icons/fornecedor.png"))); // NOI18N

        jLabel2.setText("Código :");

        jLabel3.setText("Razão social* :");

        jLabel4.setText("CNPJ* :");

        jLabel5.setText("Telefone* :");

        jLabel6.setText("Logradouro* :");

        txtCodigo.setEditable(false);
        txtCodigo.setEnabled(false);
        txtCodigo.setName("Código"); // NOI18N

        txtRazao.setName("Razão social"); // NOI18N

        txtCNPJ.setName("CNPJ"); // NOI18N

        txtTelafone.setName("Telefone"); // NOI18N

        txtLogradouro.setName("Logradouro"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelafone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCNPJ, txtCodigo, txtTelafone});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtLogradouro, txtRazao});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtRazao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTelafone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(19, 19, 19))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCNPJ, txtCodigo, txtLogradouro, txtRazao, txtTelafone});

        FornecedorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Razão Social", "CNPJ", "Telefone", "Log."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FornecedorTable.getTableHeader().setReorderingAllowed(false);
        FornecedorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FornecedorTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FornecedorTable);
        if (FornecedorTable.getColumnModel().getColumnCount() > 0) {
            FornecedorTable.getColumnModel().getColumn(0).setResizable(false);
            FornecedorTable.getColumnModel().getColumn(1).setResizable(false);
            FornecedorTable.getColumnModel().getColumn(2).setResizable(false);
            FornecedorTable.getColumnModel().getColumn(3).setResizable(false);
            FornecedorTable.getColumnModel().getColumn(4).setResizable(false);
        }

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/icons/1483926366_new10.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setName("novo"); // NOI18N
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/icons/1483926464_icons_save.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setName("salvar"); // NOI18N
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/icons/1483926575_trash_bin.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setName("excluir"); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/icons/1483926636_No.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setName("cancelar"); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnExcluir, btnNovo, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnExcluir, btnNovo, btnSalvar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        if (JOptionPane.YES_OPTION == Mensagens.questionYesNo(this, "Deseja realmente sair?")) {
            if (telaMaterial != null) {
                telaMaterial.preencheComboFornecedor();
            }
            this.dispose();
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        try {
            //valida o formulário
            ControleCampos.validadeCampos(new Object[]{
                txtRazao,
                txtCNPJ,
                txtTelafone,
                txtLogradouro

            });
            Fornecedor fornecedor = new Fornecedor();
            if (!txtCodigo.getText().trim().isEmpty() && !txtCodigo.getText().trim().equals("")) {
                fornecedor.setId(Long.parseLong(txtCodigo.getText()));
            }
            fornecedor.setRazaoSocial(txtRazao.getText());
            fornecedor.setCNPJ(txtCNPJ.getText());
            fornecedor.setTelefone(txtTelafone.getText());
            fornecedor.setLogradouro(txtLogradouro.getText());
            controleFornecedor.saveUpdate(fornecedor);
            Mensagens.sucess(this);
            limpar();
            carregaDadosTable();
            habilite(false);

        } catch (Exception e) {
            Mensagens.error(rootPane, "Falha na execução", e.getMessage());
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            Fornecedor fornecedor = new Fornecedor();
            if (!txtCodigo.getText().trim().isEmpty() && !txtCodigo.getText().trim().equals("")) {
                fornecedor.setId(Long.parseLong(txtCodigo.getText()));
            }
            controleFornecedor.delete(fornecedor);
            Mensagens.sucess(this);
            limpar();
            habilite(false);
            carregaDadosTable();

        } catch (SQLException e) {
            Mensagens.error(this, "Erro ao tentar excluir", e.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void FornecedorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FornecedorTableMouseClicked
        try {
            if (FornecedorTable.getRowCount() > 0) {
                txtCodigo.setText(modelo.getValueAt(FornecedorTable.getSelectedRow(), 0).toString());
                txtRazao.setText(modelo.getValueAt(FornecedorTable.getSelectedRow(), 1).toString());
                txtCNPJ.setText(modelo.getValueAt(FornecedorTable.getSelectedRow(), 2).toString());
                txtTelafone.setText(modelo.getValueAt(FornecedorTable.getSelectedRow(), 3).toString());
                txtLogradouro.setText(modelo.getValueAt(FornecedorTable.getSelectedRow(), 4).toString());
                habilite(true);
                txtRazao.requestFocus();;
            }
        } catch (Exception e) {
            Mensagens.error(rootPane);
        }
    }//GEN-LAST:event_FornecedorTableMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpar();
        habilite(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpar();
        habilite(true);
    }//GEN-LAST:event_btnNovoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FornecedorTable;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtRazao;
    private javax.swing.JFormattedTextField txtTelafone;
    // End of variables declaration//GEN-END:variables

    private void carregaDadosTable() {
        try {
            List<Fornecedor> fornecedores = controleFornecedor.getAll();
            modelo = (DefaultTableModel) FornecedorTable.getModel();
            modelo.setRowCount(0);
            if (fornecedores.size() > 0) {
                fornecedores.stream().forEach((Fornecedor f) -> {
                    modelo.addRow(new Object[]{
                        f.getId(),
                        f.getRazaoSocial(),
                        f.getCNPJ(),
                        f.getTelefone(),
                        f.getLogradouro()
                    });
                });
            }

        } catch (SQLException e) {
            Mensagens.error(this, "Erro ao carregar dados", e.getMessage());
        }
    }

    private void habilite(boolean b) {
        ControleCampos.habilitar(b, new Object[]{
            btnExcluir,
            btnNovo,
            btnSalvar,
            txtRazao,
            txtCNPJ,
            txtTelafone,
            txtLogradouro,
            txtCodigo});
    }

    private void limpar() {
        ControleCampos.limparCampos(new Object[]{
            txtRazao,
            txtCNPJ,
            txtTelafone,
            txtLogradouro,
            txtCodigo
        });
    }

}
