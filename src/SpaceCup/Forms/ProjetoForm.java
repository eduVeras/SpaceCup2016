/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceCup.Forms;

import SpaceCup.Business.Filter.Message;
import SpaceCup.Business.Repositories.GrupoRepository;
import SpaceCup.Business.Repositories.ProjetoRepository;
import SpaceCup.Entity.Entities.Grupo;
import SpaceCup.Entity.Entities.Projeto;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class ProjetoForm extends javax.swing.JFrame {

    /**
     * Creates new form ProjetoForm
     */
    public ProjetoForm() {
        initComponents();
        btneditar.setEnabled(false);
        btnexcluir.setEnabled(false);
        PreencherCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        txtnomeprojeto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdetalhes = new javax.swing.JTextPane();
        btnsalvar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        cbdatainicio = new com.toedter.calendar.JDateChooser();
        cbdataentrega = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbgrupo = new javax.swing.JComboBox<>();
        btnpesquisar = new javax.swing.JButton();

        setResizable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jInternalFrame1, org.jdesktop.beansbinding.ELProperty.create("${closable}"), this, org.jdesktop.beansbinding.BeanProperty.create("defaultCloseOperation"));
        bindingGroup.addBinding(binding);

        jInternalFrame1.setTitle("Controle de Projeto");
        jInternalFrame1.setVisible(true);

        jLabel1.setText("Nome do Projeto:");

        jLabel2.setText("Detalhes do Projeto:");

        jScrollPane1.setViewportView(txtdetalhes);

        btnsalvar.setText("Salvar");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btneditar.setText("Editar");

        btnexcluir.setText("Excluir");

        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        jLabel3.setText("Data de Inicio:");

        jLabel4.setText("Data de Entrega:");

        jLabel5.setText("Grupo");

        cbgrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnpesquisar.setText("Buscar");
        btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtnomeprojeto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbgrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbdatainicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(cbdataentrega, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(btnsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnpesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(txtnomeprojeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(cbdatainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGap(4, 4, 4)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(cbgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(cbdataentrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalvar)
                    .addComponent(btneditar)
                    .addComponent(btnexcluir)
                    .addComponent(btnsair)
                    .addComponent(btnpesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void PreencherCombo() {
        ArrayList<Grupo> Grupos = new GrupoRepository().GetAll();
        cbgrupo.removeAllItems();
        for (Grupo g : Grupos) {
            String item = String.valueOf(g.getIdGrupo()) + " | " + g.getNomeGrupo();
            cbgrupo.addItem(item);
        }
    }
    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        ProjetoRepository projetorepository = new ProjetoRepository();
        Message msg = new Message();

        String NomeProjeto = "";
        //java.util.Date utilDate = cbdatalancamento.getDate();
        //java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        java.sql.Date DataInicio = null;
        java.sql.Date DataEntrega = null;
        java.util.Date utilDataInicio;
        java.util.Date utilDataEntrega;
        String DetalhesProjeto = "";
        Grupo Grupo;

        if (txtnomeprojeto.getText().isEmpty()) {
            msg.ErrorMessage("Digite um nome para o projeto");
        } else {
            NomeProjeto = txtnomeprojeto.getText();
        }
        if (cbdataentrega.getDate() == null) {
            msg.ErrorMessage("selecione uma data de entrega");
        } else {
            utilDataEntrega = cbdataentrega.getDate();
            DataEntrega = new java.sql.Date(utilDataEntrega.getTime());
        }
        if (cbdatainicio.getDate() == null) {
            msg.ErrorMessage("selecione uma data de inicio");
        } else {
            utilDataInicio = cbdatainicio.getDate();
            DataInicio = new java.sql.Date(utilDataInicio.getTime());
        }
        int IdGrupo = Integer.parseInt(String.valueOf(cbgrupo.getSelectedItem()).split("|")[0]);
        Grupo = new GrupoRepository().GetById(IdGrupo);
        DetalhesProjeto = txtdetalhes.getText();
        Projeto projeto = new Projeto(0, NomeProjeto, DataInicio, DataEntrega, DetalhesProjeto, Grupo);
        try {
            projeto.IsValid();
            projetorepository.Insert(projeto);
            msg.SucessMessage("Projeto inserido com sucesso");
        } catch (Exception e) {
            Message m = new Message();
            m.ErrorMessage(e.getMessage());
        }

        limparCampos();
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed
        ProjetoRepository projetorepository = new ProjetoRepository();
        Message msg = new Message();

        String NomeProjeto = "";
        Date DataInicio = null;
        Date DataEntrega = null;
        String DetalhesProjeto = "";
        Grupo Grupo;

        if (txtnomeprojeto.getText().isEmpty()) {
            msg.ErrorMessage("Digite um nome de projeto para pesquisar");
        } else {
            NomeProjeto = txtnomeprojeto.getText();
        }

        Grupo = new Grupo(cbgrupo.getSelectedIndex(), NomeProjeto, 0);
        Projeto projeto = new Projeto(0, NomeProjeto, null, null, "", null);

        projetorepository.Insert(projeto);
        msg.SucessMessage("Projeto inserido com sucesso");

    }//GEN-LAST:event_btnpesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(ProjetoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjetoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjetoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjetoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjetoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnpesquisar;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnsalvar;
    private com.toedter.calendar.JDateChooser cbdataentrega;
    private com.toedter.calendar.JDateChooser cbdatainicio;
    private javax.swing.JComboBox<String> cbgrupo;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtdetalhes;
    private javax.swing.JTextField txtnomeprojeto;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        txtdetalhes.setText("");
        txtnomeprojeto.setText("");
        cbdataentrega.setDate(null);
        cbdatainicio.setDate(null);
        cbgrupo.setSelectedIndex(0);
        btneditar.setEnabled(false);
        btnexcluir.setEnabled(false);
    }
}
