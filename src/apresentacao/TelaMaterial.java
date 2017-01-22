/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import apresentacao.utils.Mensagens;
import controle.ControleCategoria;
import controle.ControleFornecedor;
import controle.ControleMaterial;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Fornecedor;
import modelo.Material;

/**
 *
 * @author edsonmarcks
 */
public class TelaMaterial extends javax.swing.JInternalFrame {

    private List<Fornecedor> fornecedores;
    private List<Categoria> categorias;
    private ControleFornecedor ctlFornecedor;
    private ControleCategoria ctlCategoria;
    private ControleMaterial ctlMaterial;
    private TelaPrincipal telaPrincipal;
    private TelaFornecedor telaFornecedor;

    /**
     * Creates new form TelaMaterial
     */
    public TelaMaterial() {
        initComponents();
        ctlFornecedor = new ControleFornecedor();
        ctlCategoria = new ControleCategoria();
        ctlMaterial = new ControleMaterial();
        preencheComboFornecedor();
        preencheComboCategoria();
    }

    public TelaMaterial(TelaPrincipal telaPrincipal) {
        initComponents();
        ctlFornecedor = new ControleFornecedor();
        ctlCategoria = new ControleCategoria();
        ctlMaterial = new ControleMaterial();
        preencheComboFornecedor();
        preencheComboCategoria();
        this.telaPrincipal = telaPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelCadastro = new javax.swing.JPanel();
        jLbCodigo = new javax.swing.JLabel();
        lbFornecedor = new javax.swing.JLabel();
        lbCategoria = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        cbFornecedor = new javax.swing.JComboBox<>();
        cbCategoria = new javax.swing.JComboBox<>();
        btnAddFornecedor = new javax.swing.JButton();
        btnAddCategoria = new javax.swing.JButton();
        lbDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lbUnidadeMedida = new javax.swing.JLabel();
        cbUnidadeMedida = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCadastro = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jPanelConsultas = new javax.swing.JPanel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setIconifiable(true);
        setTitle("Cadastro/Consulta de Materiais");
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

        jLbCodigo.setText("Código");

        lbFornecedor.setText("Fornecedor");

        lbCategoria.setText("Categoria");

        txtCodigo.setEditable(false);
        txtCodigo.setEnabled(false);

        btnAddFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/icons/reload32.png"))); // NOI18N
        btnAddFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFornecedorActionPerformed(evt);
            }
        });

        btnAddCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/icons/reload32.png"))); // NOI18N
        btnAddCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCategoriaActionPerformed(evt);
            }
        });

        lbDescricao.setText("Descrição do produto");

        lbUnidadeMedida.setText("Unidade de medida");

        cbUnidadeMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CX", "DZ", "FD", "KG", "L", "M", "M²", "M³", "MIL", "PÇ", "SC" }));

        jTableCadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Fornecedor", "Categoria", "Descrição", "Dt. Cad", "Unid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCadastro);
        if (jTableCadastro.getColumnModel().getColumnCount() > 0) {
            jTableCadastro.getColumnModel().getColumn(0).setResizable(false);
            jTableCadastro.getColumnModel().getColumn(2).setResizable(false);
            jTableCadastro.getColumnModel().getColumn(3).setResizable(false);
            jTableCadastro.getColumnModel().getColumn(4).setResizable(false);
            jTableCadastro.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/icons/1483926636_No.png"))); // NOI18N
        btnCancelar.setText("Cancelar");

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/icons/1483926366_new10.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setName("novo"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnExcluir, btnNovo, btnSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCancelar, btnExcluir, btnNovo, btnSalvar});

        javax.swing.GroupLayout jPanelCadastroLayout = new javax.swing.GroupLayout(jPanelCadastro);
        jPanelCadastro.setLayout(jPanelCadastroLayout);
        jPanelCadastroLayout.setHorizontalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelCadastroLayout.createSequentialGroup()
                            .addComponent(txtDescricao)
                            .addGap(18, 18, 18)
                            .addComponent(cbUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelCadastroLayout.createSequentialGroup()
                            .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                    .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLbCodigo)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbFornecedor)
                                        .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                            .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnAddFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(lbDescricao))
                            .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                    .addGap(92, 92, 92)
                                    .addComponent(lbUnidadeMedida))
                                .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbCategoria)
                                        .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                            .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnAddCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCadastroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddCategoria, btnAddFornecedor});

        jPanelCadastroLayout.setVerticalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLbCodigo)
                            .addComponent(lbFornecedor)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbCategoria)))
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnAddCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAddFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUnidadeMedida)
                    .addComponent(lbDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao)
                    .addComponent(cbUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanelCadastroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddCategoria, btnAddFornecedor, cbFornecedor});

        jPanelCadastroLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbUnidadeMedida, txtCodigo, txtDescricao});

        jTabbedPane1.addTab("Cadastros", jPanelCadastro);

        javax.swing.GroupLayout jPanelConsultasLayout = new javax.swing.GroupLayout(jPanelConsultas);
        jPanelConsultas.setLayout(jPanelConsultasLayout);
        jPanelConsultasLayout.setHorizontalGroup(
            jPanelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        jPanelConsultasLayout.setVerticalGroup(
            jPanelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consultas", jPanelConsultas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        if (JOptionPane.YES_OPTION == Mensagens.questionYesNo(this, "Deseja realmente sair?")) {
            this.dispose();
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnAddFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFornecedorActionPerformed
        // TODO add your handling code here:
        preencheComboFornecedor();

    }//GEN-LAST:event_btnAddFornecedorActionPerformed

    private void btnAddCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCategoriaActionPerformed
        // TODO add your handling code here:
        preencheComboCategoria();
    }//GEN-LAST:event_btnAddCategoriaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            if (cbFornecedor.getItemCount() <= 0 || cbCategoria.getItemCount() <= 0) {
                throw new Exception("por favor informe o fornecedor e a categoria do produto!");
            }
            if (txtDescricao.getText().trim().equals("")) {
                throw new Exception("Descrição do produto é obrigatória");
            }
            //captura o fornecedor correspondente
            Fornecedor fornecedor = (Fornecedor) cbFornecedor.getSelectedItem();
            Categoria c = (Categoria) cbCategoria.getSelectedItem();
            Material material = new Material();
            material.setCategoriaId(c.getId());
            material.setFornecedorId(fornecedor.getId());
            material.setDescricao(txtDescricao.getText());
            material.setDataCadastro(LocalDateTime.now());
            material.setUnidade(cbCategoria.getSelectedItem().toString());
            if (!txtCodigo.getText().trim().equals("")) {
                material.setId(Long.parseLong(txtCodigo.getText()));
            }
            ctlMaterial.saveUpdate(material);
            Mensagens.sucess(this);
            //limpa
            
        } catch (Exception e) {
            Mensagens.error(this, "Não foi possível salvar", e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCategoria;
    private javax.swing.JButton btnAddFornecedor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<Categoria> cbCategoria;
    private javax.swing.JComboBox<Fornecedor> cbFornecedor;
    private javax.swing.JComboBox<String> cbUnidadeMedida;
    private javax.swing.JLabel jLbCodigo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPanel jPanelConsultas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableCadastro;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbFornecedor;
    private javax.swing.JLabel lbUnidadeMedida;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables

    public void preencheComboFornecedor() {
        try {

            fornecedores = ctlFornecedor.getAll();

            if (fornecedores.size() > 0) {
                cbFornecedor.removeAllItems();
                fornecedores.stream().forEach(f -> {
                    cbFornecedor.addItem(f);
                });
            }

        } catch (Exception e) {
            Mensagens.error(this, e.getMessage());
        }
    }

    public void preencheComboCategoria() {
        try {

            categorias = ctlCategoria.getAll();

            if (categorias.size() > 0) {
                cbCategoria.removeAllItems();
                categorias.stream().forEach(c -> {
                    cbCategoria.addItem(c);
                });
            }

        } catch (Exception e) {
            Mensagens.error(this, e.getMessage());
        }

    }

}
