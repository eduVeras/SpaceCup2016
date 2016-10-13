/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceCup.Forms;

import SpaceCup.Business.Filter.Message;
import SpaceCup.Business.Repositories.*;
import SpaceCup.Business.Utils;
import SpaceCup.Entity.Entities.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruno
 */
public class LancamentoForm extends javax.swing.JFrame {

    private LancamentoRepository repository = new LancamentoRepository();
    private GrupoRepository gRepository = new GrupoRepository();
    private ProjetoRepository pRepository = new ProjetoRepository();
    private Message m = new Message();

    public LancamentoForm() {
        initComponents();
        PreencherCombos();
        LimparCampos();
        PesquisarLancamento();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        cbdatalancamento = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbgrupo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbprojeto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtdistancialancamento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtangulolancamento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtvelocidadevento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtpesofoquete = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtaltitudemaxima = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtvelocidademaxima = new javax.swing.JTextField();
        txttempopropulsao = new javax.swing.JTextField();
        txtapogeudescida = new javax.swing.JTextField();
        txttempoejecao = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txttaxadescida = new javax.swing.JTextField();
        txtduracaovoo = new javax.swing.JTextField();
        btnsalvar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        btnpesquisar = new javax.swing.JButton();
        btnsair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLancamento = new javax.swing.JTable();
        txtAceleracaoMedia = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtAltitudeEjecao = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtPicoAceleracao = new javax.swing.JTextField();
        hfIdLancamento = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setTitle("Controle de Lançamentos");
        jInternalFrame1.setVisible(true);

        jLabel1.setText("Data do Lançamento:");

        jLabel2.setText("Grupo:");

        cbgrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Projeto:");

        cbprojeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Distancia de Lançamento:");

        jLabel6.setText("Angulo de Lancamento:");

        jLabel7.setText("Velocidade do Vento:");

        jLabel8.setText("Peso do Foquete:");

        jLabel9.setText("Altitude Maxima:");

        jLabel10.setText("Velocidade Maxima:");

        jLabel11.setText("Tempo de Propulsao:");

        jLabel12.setText("Tempo Apogeu/Descida:");

        jLabel13.setText("Tempo de Ejeção:");

        jLabel14.setText("Duracao de voo:");

        jLabel15.setText("Taxa de Descida: ");

        btnsalvar.setText("Salvar");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        btnpesquisar.setText("Pesquisar");
        btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarActionPerformed(evt);
            }
        });

        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        tableLancamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableLancamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableLancamento.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tableLancamento.setName("tableLancamentos"); // NOI18N
        jScrollPane1.setViewportView(tableLancamento);

        jLabel16.setText("Aceleração Média: ");

        jLabel17.setText("Altitude Ejeção:");

        jLabel18.setText("Pico Aceleração: ");

        jButton1.setLabel("Novo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hfIdLancamento)
                    .addComponent(jLabel17)
                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnsalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnsair, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbdatalancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbprojeto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtvelocidadevento, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(txtdistancialancamento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtpesofoquete, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(txtangulolancamento)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAltitudeEjecao, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtduracaovoo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                        .addComponent(txttempoejecao, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txttempopropulsao, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtaltitudemaxima, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel15))
                                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtapogeudescida, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtvelocidademaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(txttaxadescida, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAceleracaoMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPicoAceleracao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbdatalancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbprojeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtdistancialancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtangulolancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtvelocidadevento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtpesofoquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtaltitudemaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(txtvelocidademaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtapogeudescida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txttempopropulsao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(8, 8, 8)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txttempoejecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)
                                .addComponent(txttaxadescida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtduracaovoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(txtAceleracaoMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(txtPicoAceleracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAltitudeEjecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17)))
                        .addGap(62, 62, 62)
                        .addComponent(hfIdLancamento))
                    .addComponent(jButton1))
                .addGap(35, 35, 35)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalvar)
                    .addComponent(btneditar)
                    .addComponent(btnexcluir)
                    .addComponent(btnpesquisar)
                    .addComponent(btnsair))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(154, 154, 154))
        );

        jButton1.getAccessibleContext().setAccessibleName("btnNovo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        SalvarLancamento();
    }//GEN-LAST:event_btnsalvarActionPerformed
    private void SalvarLancamento() {
        int IdGrupo = Integer.parseInt(String.valueOf(cbgrupo.getSelectedItem()).split("|")[0]);
        int IdProjeto = Integer.parseInt(String.valueOf(cbprojeto.getSelectedItem()).split("|")[0]);
        Lancamento lancamento = new Lancamento();
        lancamento.setAceleracaoMedia(Double.parseDouble(txtAceleracaoMedia.getText()));
        lancamento.setAltitudeMaxima(Double.parseDouble(txtaltitudemaxima.getText()));
        lancamento.setAltitudeEjecao(Double.parseDouble(txtAltitudeEjecao.getText()));
        lancamento.setAngulolancamento(Double.parseDouble(txtangulolancamento.getText()));
        java.util.Date utilDate = cbdatalancamento.getDate();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        lancamento.setDataLancamento(sqlDate);
        lancamento.setDistanciaLancamento(Double.parseDouble(txtdistancialancamento.getText()));
        lancamento.setDuracaovoo(Double.parseDouble(txtduracaovoo.getText()));
        lancamento.setGrupo(new Grupo(IdGrupo));
        lancamento.setIdLancamento(0);
        lancamento.setPesoFoguete(Double.parseDouble(txtpesofoquete.getText()));
        lancamento.setPicoAceleracao(Double.parseDouble(txtPicoAceleracao.getText()));
        lancamento.setProjeto(new Projeto(IdProjeto));
        lancamento.setTaxaDescida(Double.parseDouble(txttaxadescida.getText()));
        lancamento.setTempoApogeuDescida(Double.parseDouble(txtapogeudescida.getText()));
        lancamento.setTempoEjecao(Double.parseDouble(txttempoejecao.getText()));
        lancamento.setTempoPropulsao(Double.parseDouble(txttempopropulsao.getText()));
        lancamento.setVelocidadeMaxima(Double.parseDouble(txtvelocidademaxima.getText()));
        lancamento.setVelocidadeVento(Double.parseDouble(txtvelocidadevento.getText()));

        try {
            lancamento.IsValid();
            if (hfIdLancamento.getText().equals("") || hfIdLancamento.getText().equals(null)) {
                repository.Insert(lancamento);
                LimparCampos();
                throw new Exception("Lançamento Salvo com sucesso!");
            } else {
                repository.Update(lancamento);
                LimparCampos();
                throw new Exception("Lançamento atualizado com sucesso!");
            }

        } catch (Exception e) {

            Message m = new Message();
            m.ErrorMessage(e.getMessage());
        }
    }

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesquisarActionPerformed
        PesquisarLancamento();
    }//GEN-LAST:event_btnpesquisarActionPerformed
    private void LimparCampos() {
        hfIdLancamento.setVisible(false);
        txtAceleracaoMedia.setText("");
        txtAltitudeEjecao.setText("");
        txtPicoAceleracao.setText("");
        txtaltitudemaxima.setText("");
        txtangulolancamento.setText("");
        txtapogeudescida.setText("");
        txtdistancialancamento.setText("");
        txtduracaovoo.setText("");
        txtpesofoquete.setText("");
        txttaxadescida.setText("");
        txttempoejecao.setText("");
        txttempopropulsao.setText("");
        txtvelocidademaxima.setText("");
        txtvelocidadevento.setText("");
        cbdatalancamento.setDate(new java.util.Date());
        hfIdLancamento.setText("");
        String[] tableColumnsName = {"IdLancamento", "AltitudeMaxima", "Grupo", "Projeto"};
        DefaultTableModel aModel = (DefaultTableModel) tableLancamento.getModel();
        aModel.setColumnIdentifiers(tableColumnsName);
        tableLancamento.setModel(aModel);

    }

    private void PesquisarLancamento() {
        
        DefaultTableModel dm = (DefaultTableModel)tableLancamento.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
        dm.removeRow(i);
}
        ArrayList<Lancamento> Lancamentos = repository.GetAll();
        try {
            if (Lancamentos == null) {
                return;
            }
            String[] tableColumnsName = {"IdLancamento", "AltitudeMaxima", "Grupo", "Projeto"};
            DefaultTableModel aModel = (DefaultTableModel) tableLancamento.getModel();
            aModel.setColumnIdentifiers(tableColumnsName);
            int colNo = 4;
            for (Lancamento l : Lancamentos) {
                Object[] objects = new Object[colNo];
                objects[0] = l.getIdLancamento();
                objects[1] = l.getAltitudeMaxima();
                objects[2] = l.getGrupo().getNomeGrupo();
                objects[3] = l.getProjeto().getNomeProjeto();
                aModel.addRow(objects);
            }
            tableLancamento.removeAll();
            tableLancamento.setModel(aModel);
        } catch (Exception e) {
        }

    }

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        ExcluirLancamento();
        PesquisarLancamento();
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        EditarLancamento();
    }//GEN-LAST:event_btneditarActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LimparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed
    private void EditarLancamento() {
        Integer row = null;
        Integer column = null;
        try {
            row = tableLancamento.getSelectedRow();
            column = tableLancamento.getSelectedColumn();
            if (row == null || column == null) {
                throw new Exception("Selecione o Código do lançamento para editar o mesmo!");
            }

            Object selectedObject = (Object) tableLancamento.getModel().getValueAt(row, 0);
            int idLancamento = 0;
            try {
                idLancamento = Integer.parseInt(String.valueOf(selectedObject));
            } catch (Exception e) {
                throw new Exception("Selecione a coluna do  Código do lançamento para editar o mesmo!");
            }

            Lancamento lanc = repository.GetById(idLancamento);
            hfIdLancamento.setText(String.valueOf(idLancamento));
            String itemGrupo = String.valueOf(lanc.getGrupo().getIdGrupo()) + " | " + lanc.getGrupo().getNomeGrupo();
            String itemProjeto = String.valueOf(lanc.getProjeto().getIdProjeto()) + " | " + lanc.getProjeto().getNomeProjeto();
            cbgrupo.setSelectedItem(itemGrupo);
            cbprojeto.setSelectedItem(itemProjeto);
            cbdatalancamento.setDate(lanc.getDataLancamento());
            txtAceleracaoMedia.setText(String.valueOf(lanc.getAceleracaoMedia()));
            txtAltitudeEjecao.setText(String.valueOf(lanc.getAltitudeEjecao()));
            txtPicoAceleracao.setText(String.valueOf(lanc.getPicoAceleracao()));
            txtaltitudemaxima.setText(String.valueOf(lanc.getAltitudeMaxima()));
            txtangulolancamento.setText(String.valueOf(lanc.getAngulolancamento()));
            txtapogeudescida.setText(String.valueOf(lanc.getTempoApogeuDescida()));
            txtdistancialancamento.setText(String.valueOf(lanc.getDistanciaLancamento()));
            txtduracaovoo.setText(String.valueOf(lanc.getDuracaovoo()));
            txtpesofoquete.setText(String.valueOf(lanc.getPesoFoguete()));
            txttaxadescida.setText(String.valueOf(lanc.getTaxaDescida()));
            txttempoejecao.setText(String.valueOf(lanc.getTempoEjecao()));
            txttempopropulsao.setText(String.valueOf(lanc.getTempoPropulsao()));
            txtvelocidademaxima.setText(String.valueOf(lanc.getVelocidadeMaxima()));
            txtvelocidadevento.setText(String.valueOf(lanc.getVelocidadeVento()));
        } catch (Exception e) {

            m.ErrorMessage(e.getMessage());
        }
    }

    private void ExcluirLancamento() {
        Integer row = null;
        Integer column = null;
        try {
            row = tableLancamento.getSelectedRow();
            column = tableLancamento.getSelectedColumn();
            if (row == null || column == null) {
                throw new Exception("Selecione o Código do lançamento para remover o mesmo!");
            }

            Object selectedObject = (Object) tableLancamento.getModel().getValueAt(row, column);
            int idLancamento = Integer.parseInt(String.valueOf(selectedObject));
            repository.Delete(new Lancamento(idLancamento));
            m.SucessMessage("Lançamento removido com sucesso!");
        } catch (Exception e) {

            m.ErrorMessage(e.getMessage());
        }

    }

    private void PreencherCombos() {

        ArrayList<Grupo> Grupos = gRepository.GetAll();
        cbgrupo.removeAllItems();
        for (Grupo g : Grupos) {
            String item = String.valueOf(g.getIdGrupo()) + " | " + g.getNomeGrupo();
            cbgrupo.addItem(item);
        }
        ArrayList<Projeto> Projetos = pRepository.GetAll();
        cbprojeto.removeAllItems();
        for (Projeto p : Projetos) {
            String item = String.valueOf(p.getIdProjeto()) + " | " + p.getNomeProjeto();
            cbprojeto.addItem(item);
        }
        String[] tableColumnsName = {"IdLancamento", "AltitudeMaxima", "Grupo", "Projeto"};
        DefaultTableModel aModel = (DefaultTableModel) tableLancamento.getModel();
        aModel.setColumnIdentifiers(tableColumnsName);
        tableLancamento.setModel(aModel);

    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LancamentoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LancamentoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LancamentoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LancamentoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LancamentoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnpesquisar;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnsalvar;
    private com.toedter.calendar.JDateChooser cbdatalancamento;
    private javax.swing.JComboBox<String> cbgrupo;
    private javax.swing.JComboBox<String> cbprojeto;
    private javax.swing.JLabel hfIdLancamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLancamento;
    private javax.swing.JTextField txtAceleracaoMedia;
    private javax.swing.JTextField txtAltitudeEjecao;
    private javax.swing.JTextField txtPicoAceleracao;
    private javax.swing.JTextField txtaltitudemaxima;
    private javax.swing.JTextField txtangulolancamento;
    private javax.swing.JTextField txtapogeudescida;
    private javax.swing.JTextField txtdistancialancamento;
    private javax.swing.JTextField txtduracaovoo;
    private javax.swing.JTextField txtpesofoquete;
    private javax.swing.JTextField txttaxadescida;
    private javax.swing.JTextField txttempoejecao;
    private javax.swing.JTextField txttempopropulsao;
    private javax.swing.JTextField txtvelocidademaxima;
    private javax.swing.JTextField txtvelocidadevento;
    // End of variables declaration//GEN-END:variables
}
