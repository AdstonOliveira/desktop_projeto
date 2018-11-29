package seguro.view.secundarios;

import com.toedter.calendar.JCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import seguro.configuracoes.ConfigBotao;
import seguro.resources.RSButtonMetro;
import seguro.view.control.ControlAgendamento;
/**
 * @author Adston at self
 */
public class Agendamento extends javax.swing.JInternalFrame {
   
   SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
   static public Date dMin;
   ThHora th;
   ControlAgendamento control;
   
   
   public Agendamento(){
      initComponents();
      
      ConfigBotao.btOK( this.btGravar );
      ConfigBotao.btCancela( this.btCancelar );
      
      this.getRootPane().setDefaultButton(btGravar);
   }
   
   public void setControl( ControlAgendamento control ){
      this.control = control;
   }
   
   
   
   
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel7 = new javax.swing.JLabel();
      jPanel1 = new javax.swing.JPanel();
      jPanel2 = new javax.swing.JPanel();
      jLabel4 = new javax.swing.JLabel();
      jPanel4 = new javax.swing.JPanel();
      jPanel5 = new javax.swing.JPanel();
      jLabel6 = new javax.swing.JLabel();
      jPanel6 = new javax.swing.JPanel();
      jLabel3 = new javax.swing.JLabel();
      data_hora = new javax.swing.JSpinner();
      jCalendar1 = new com.toedter.calendar.JCalendar();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      equipamentos = new javax.swing.JComboBox<>();
      jPanel3 = new javax.swing.JPanel();
      btGravar = new seguro.resources.RSButtonMetro();
      btCancelar = new seguro.resources.RSButtonMetro();
      rSButtonMetro1 = new seguro.resources.RSButtonMetro();

      jLabel7.setText("jLabel7");

      setClosable(true);
      setIconifiable(true);
      setTitle("Agendar horário desligamento");
      setToolTipText("");

      jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

      jPanel2.setBackground(new java.awt.Color(0, 0, 0));

      jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      jLabel4.setForeground(new java.awt.Color(255, 255, 255));
      jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bell.png"))); // NOI18N
      jLabel4.setText("Agendar Desligamento");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel4)
            .addGap(1, 1, 1))
      );

      jPanel4.setBackground(new java.awt.Color(255, 255, 255));
      jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

      jPanel5.setBackground(new java.awt.Color(0, 142, 142));
      jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      jLabel6.setForeground(new java.awt.Color(255, 255, 255));
      jLabel6.setText("Agendamento:");

      javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
      jPanel5.setLayout(jPanel5Layout);
      jPanel5Layout.setHorizontalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
      );
      jPanel5Layout.setVerticalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel5Layout.createSequentialGroup()
            .addComponent(jLabel6)
            .addGap(0, 0, Short.MAX_VALUE))
      );

      jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 142, 142)));

      jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      jLabel3.setText("Escolha Dia e Horario");

      data_hora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
      data_hora.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1543258298348L), null, java.util.Calendar.DAY_OF_MONTH));
      data_hora.setToolTipText("");
      data_hora.setDoubleBuffered(true);

      jCalendar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
      jCalendar1.setToolTipText("Visualização");
      jCalendar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
      jCalendar1.setMaxSelectableDate(new java.util.Date(1546225304000L));
      jCalendar1.setMinSelectableDate(new java.util.Date(1420081304000L));
      jCalendar1.setTodayButtonText("");
      jCalendar1.setTodayButtonVisible(true);

      jLabel1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
      jLabel1.setText("Clique na data desejada e em seguida escolher:");

      jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      jLabel2.setText("Equipamento para desligar:");

      equipamentos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

      jPanel3.setBackground(new java.awt.Color(255, 255, 255));

      btGravar.setBackground(new java.awt.Color(0, 204, 51));
      btGravar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btGravar.setMnemonic('a');
      btGravar.setText("Agendar");
      btGravar.setColorNormal(new java.awt.Color(0, 204, 51));
      btGravar.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            btGravarMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            btGravarMouseExited(evt);
         }
      });
      btGravar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btGravarActionPerformed(evt);
         }
      });

      btCancelar.setBackground(new java.awt.Color(204, 51, 0));
      btCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btCancelar.setMnemonic('c');
      btCancelar.setText("Cancelar");
      btCancelar.setColorNormal(new java.awt.Color(204, 51, 0));
      btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            btCancelarMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            btCancelarMouseExited(evt);
         }
      });
      btCancelar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btCancelarActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(3, 3, 3)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(3, 3, 3))
      );

      rSButtonMetro1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      rSButtonMetro1.setText("Escolher");
      rSButtonMetro1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            rSButtonMetro1ActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
      jPanel6.setLayout(jPanel6Layout);
      jPanel6Layout.setHorizontalGroup(
         jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(rSButtonMetro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                  .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(equipamentos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGap(10, 10, 10)
                  .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(data_hora)
                     .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
               .addGroup(jPanel6Layout.createSequentialGroup()
                  .addComponent(jLabel1)
                  .addGap(0, 0, Short.MAX_VALUE))
               .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      jPanel6Layout.setVerticalGroup(
         jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel6Layout.createSequentialGroup()
            .addGap(3, 3, 3)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel3)
               .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(data_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(equipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
      jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel4Layout.createSequentialGroup()
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
         .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel4Layout.setVerticalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

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

   private void btGravarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btGravarMouseEntered
      ConfigBotao.evtEntered(this.btGravar);
   }//GEN-LAST:event_btGravarMouseEntered

   private void btGravarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btGravarMouseExited
      ConfigBotao.evtExited(this.btGravar);
   }//GEN-LAST:event_btGravarMouseExited

   private void btCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseEntered
      ConfigBotao.evtEntered(this.btCancelar);
   }//GEN-LAST:event_btCancelarMouseEntered

   private void btCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseExited
      ConfigBotao.evtExited( this.btCancelar );
   }//GEN-LAST:event_btCancelarMouseExited

   private void btGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarActionPerformed
      if( !this.equipamentos.getSelectedItem().equals("Sem itens") && this.data_hora.getValue() != null)
         this.control.agendar();
      else
         JOptionPane.showMessageDialog(this, "Nenhuma Operação realizada","Itens inválidos selecionados",0);
   }//GEN-LAST:event_btGravarActionPerformed

   private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
      this.dispose();
   }//GEN-LAST:event_btCancelarActionPerformed

   private void rSButtonMetro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro1ActionPerformed
      this.data_hora.setValue( this.jCalendar1.getDate() );
   }//GEN-LAST:event_rSButtonMetro1ActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private seguro.resources.RSButtonMetro btCancelar;
   private seguro.resources.RSButtonMetro btGravar;
   private javax.swing.JSpinner data_hora;
   private javax.swing.JComboBox<String> equipamentos;
   private com.toedter.calendar.JCalendar jCalendar1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPanel jPanel4;
   private javax.swing.JPanel jPanel5;
   private javax.swing.JPanel jPanel6;
   private seguro.resources.RSButtonMetro rSButtonMetro1;
   // End of variables declaration//GEN-END:variables

   public ThHora getTh() {
      return th;
   }

   public void setTh(ThHora th) {
      this.th = th;
   }

   public JSpinner getSpinnerHr() {
      return data_hora;
   }

   public void setSpinnerHr(JSpinner SpinnerHr) {
      this.data_hora = SpinnerHr;
   }

   

   public RSButtonMetro getBtCancelar() {
      return btCancelar;
   }

   public void setBtCancelar(RSButtonMetro btCancelar) {
      this.btCancelar = btCancelar;
   }

   public RSButtonMetro getBtGravar() {
      return btGravar;
   }

   public void setBtGravar(RSButtonMetro btGravar) {
      this.btGravar = btGravar;
   }

   public SimpleDateFormat getFormatador() {
      return formatador;
   }

   public void setFormatador(SimpleDateFormat formatador) {
      this.formatador = formatador;
   }

   public static Date getdMin() {
      return dMin;
   }

   public static void setdMin(Date dMin) {
      Agendamento.dMin = dMin;
   }

   public JSpinner getData_hora() {
      return data_hora;
   }

   public void setData_hora(JSpinner data_hora) {
      this.data_hora = data_hora;
   }

   public JComboBox<String> getEquipamentos() {
      return equipamentos;
   }

   public void setEquipamentos(JComboBox<String> equipamentos) {
      this.equipamentos = equipamentos;
   }

   public JCalendar getjCalendar1() {
      return jCalendar1;
   }

   public void setjCalendar1(JCalendar jCalendar1) {
      this.jCalendar1 = jCalendar1;
   }

   public JLabel getjLabel1() {
      return jLabel1;
   }

   public void setjLabel1(JLabel jLabel1) {
      this.jLabel1 = jLabel1;
   }

   public JLabel getjLabel2() {
      return jLabel2;
   }

   public void setjLabel2(JLabel jLabel2) {
      this.jLabel2 = jLabel2;
   }

   public JLabel getjLabel3() {
      return jLabel3;
   }

   public void setjLabel3(JLabel jLabel3) {
      this.jLabel3 = jLabel3;
   }

   public JLabel getjLabel4() {
      return jLabel4;
   }

   public void setjLabel4(JLabel jLabel4) {
      this.jLabel4 = jLabel4;
   }

   public JLabel getjLabel6() {
      return jLabel6;
   }

   public void setjLabel6(JLabel jLabel6) {
      this.jLabel6 = jLabel6;
   }

   public JLabel getjLabel7() {
      return jLabel7;
   }

   public void setjLabel7(JLabel jLabel7) {
      this.jLabel7 = jLabel7;
   }

   public JPanel getjPanel1() {
      return jPanel1;
   }

   public void setjPanel1(JPanel jPanel1) {
      this.jPanel1 = jPanel1;
   }

   public JPanel getjPanel2() {
      return jPanel2;
   }

   public void setjPanel2(JPanel jPanel2) {
      this.jPanel2 = jPanel2;
   }

   public JPanel getjPanel3() {
      return jPanel3;
   }

   public void setjPanel3(JPanel jPanel3) {
      this.jPanel3 = jPanel3;
   }

   public JPanel getjPanel4() {
      return jPanel4;
   }

   public void setjPanel4(JPanel jPanel4) {
      this.jPanel4 = jPanel4;
   }

   public JPanel getjPanel5() {
      return jPanel5;
   }

   public void setjPanel5(JPanel jPanel5) {
      this.jPanel5 = jPanel5;
   }

   public JPanel getjPanel6() {
      return jPanel6;
   }

   public void setjPanel6(JPanel jPanel6) {
      this.jPanel6 = jPanel6;
   }


   
















}
