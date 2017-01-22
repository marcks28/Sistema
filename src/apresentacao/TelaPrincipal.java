/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.awt.Dimension;

/**
 *
 * @author edsonmarcks
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private TelaCadastroUsuario telaCadastroUsuario;
    private TelaFornecedor telaFornecedor;
    private TelaCategoria telaCategoria;
    private TelaMaterial telaMaterial;
    private Dimension desktopSize, internalSize;

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        desktopSize = this.getSize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnCadastrar = new javax.swing.JButton();
        btnEntrada = new javax.swing.JButton();
        btnSaida = new javax.swing.JButton();
        btnDestino = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        mnCadFornecedores = new javax.swing.JMenuItem();
        mnCadCategoria = new javax.swing.JMenuItem();
        mnCadMateriais = new javax.swing.JMenuItem();
        mnCadInstituicoes = new javax.swing.JMenuItem();
        mnUsuario = new javax.swing.JMenuItem();
        mnMovimentacao = new javax.swing.JMenu();
        mnEntrada = new javax.swing.JMenuItem();
        mnSaida = new javax.swing.JMenuItem();
        mnRelatorios = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de controle de estoque");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/icons/material.png"))); // NOI18N
        btnCadastrar.setToolTipText("Cadastro de materiais");
        btnCadastrar.setBorder(null);
        btnCadastrar.setFocusable(false);
        btnCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCadastrar);

        btnEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/icons/entrada_estoque.png"))); // NOI18N
        btnEntrada.setToolTipText("Entrada de produtos no estoque");
        btnEntrada.setBorder(null);
        btnEntrada.setFocusable(false);
        btnEntrada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntrada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEntrada);

        btnSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/icons/retirar_estoque2.png"))); // NOI18N
        btnSaida.setToolTipText("Efetue uma retirada no estoque");
        btnSaida.setBorder(null);
        btnSaida.setFocusable(false);
        btnSaida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSaida.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnSaida);

        btnDestino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/icons/destino.png"))); // NOI18N
        btnDestino.setToolTipText("Cadastre as instituíções de ensino");
        btnDestino.setBorder(null);
        btnDestino.setFocusable(false);
        btnDestino.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDestino.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnDestino);

        jDesktopPane1.setBackground(new java.awt.Color(238, 238, 238));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        mnCadastro.setText("Cadastros");

        mnCadFornecedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        mnCadFornecedores.setText("Fornecedores");
        mnCadFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadFornecedoresActionPerformed(evt);
            }
        });
        mnCadastro.add(mnCadFornecedores);

        mnCadCategoria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnCadCategoria.setText("Categoria");
        mnCadCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadCategoriaActionPerformed(evt);
            }
        });
        mnCadastro.add(mnCadCategoria);

        mnCadMateriais.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mnCadMateriais.setText("Materiais");
        mnCadMateriais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadMateriaisActionPerformed(evt);
            }
        });
        mnCadastro.add(mnCadMateriais);

        mnCadInstituicoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        mnCadInstituicoes.setText("Instituições");
        mnCadInstituicoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadInstituicoesActionPerformed(evt);
            }
        });
        mnCadastro.add(mnCadInstituicoes);

        mnUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnUsuario.setText("Usuários");
        mnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUsuarioActionPerformed(evt);
            }
        });
        mnCadastro.add(mnUsuario);

        jMenuBar1.add(mnCadastro);

        mnMovimentacao.setText("Movimentações");

        mnEntrada.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnEntrada.setText("Entrada");
        mnMovimentacao.add(mnEntrada);

        mnSaida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnSaida.setText("Saída");
        mnMovimentacao.add(mnSaida);

        jMenuBar1.add(mnMovimentacao);

        mnRelatorios.setText("Relatórios");
        jMenuBar1.add(mnRelatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnCadInstituicoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadInstituicoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnCadInstituicoesActionPerformed

    private void mnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUsuarioActionPerformed

        if (telaCadastroUsuario != null) {
            if (telaCadastroUsuario.isClosed()) {
                telaCadastroUsuario = new TelaCadastroUsuario();
                jDesktopPane1.add(telaCadastroUsuario);
                telaCadastroUsuario.setVisible(true);
            }
        } else if (telaCadastroUsuario == null) {
            telaCadastroUsuario = new TelaCadastroUsuario();
            jDesktopPane1.add(telaCadastroUsuario);
            telaCadastroUsuario.setVisible(true);
        }

    }//GEN-LAST:event_mnUsuarioActionPerformed

    private void mnCadFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadFornecedoresActionPerformed
        if (telaFornecedor == null) {
            telaFornecedor = new TelaFornecedor();
            jDesktopPane1.add(telaFornecedor);
            telaFornecedor.setVisible(true);
        } else if (telaFornecedor != null) {
            if (telaFornecedor.isClosed()) {
                telaFornecedor = new TelaFornecedor();
                jDesktopPane1.add(telaFornecedor);
                telaFornecedor.setVisible(true);
            }
        }
    }//GEN-LAST:event_mnCadFornecedoresActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void mnCadCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadCategoriaActionPerformed

        if (telaCategoria == null) {
            telaCategoria = new TelaCategoria();
            jDesktopPane1.add(telaCategoria);
            telaCategoria.setVisible(true);
        } else if (telaCategoria != null) {
            if (telaCategoria.isClosed()) {
                telaCategoria = new TelaCategoria();
                jDesktopPane1.add(telaCategoria);
                telaCategoria.setVisible(true);
            }
        }

    }//GEN-LAST:event_mnCadCategoriaActionPerformed

    private void mnCadMateriaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadMateriaisActionPerformed
        if (telaMaterial == null) {
   
                telaMaterial = new TelaMaterial();
                internalSize = telaMaterial.getSize();
                jDesktopPane1.add(telaMaterial);
                telaMaterial.setLocation((desktopSize.width / 2  - internalSize.width / 2),
                        (desktopSize.height - internalSize.height)/ 2);
                telaMaterial.setVisible(true);

        } else if (telaMaterial != null) {
            if (telaMaterial.isClosed()) {
                telaMaterial = new TelaMaterial();
                internalSize = telaMaterial.getSize();
                telaMaterial.setLocation((desktopSize.width/2 - internalSize.width/2),
                        (desktopSize.height - internalSize.height)/2);
                jDesktopPane1.add(telaMaterial);
                telaMaterial.setVisible(true);
            }
        }
    }//GEN-LAST:event_mnCadMateriaisActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDestino;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnSaida;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnCadCategoria;
    private javax.swing.JMenuItem mnCadFornecedores;
    private javax.swing.JMenuItem mnCadInstituicoes;
    private javax.swing.JMenuItem mnCadMateriais;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenuItem mnEntrada;
    private javax.swing.JMenu mnMovimentacao;
    private javax.swing.JMenu mnRelatorios;
    private javax.swing.JMenuItem mnSaida;
    private javax.swing.JMenuItem mnUsuario;
    // End of variables declaration//GEN-END:variables
}
