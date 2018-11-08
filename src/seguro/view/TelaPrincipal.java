package seguro.view;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import seguro.DAO.Conexao;
import seguro.model.Usuario;
import seguro.view.control.ControlTelaInicial;
import seguro.view.secundarios.Agendamento;
/**
 * @author Adston at self
 */
public class TelaPrincipal extends javax.swing.JFrame {
   public static Conexao conexao;
   public static Usuario usuario;
   private ControlTelaInicial control;
   
   /**
    * Creates new form TelaPrincipal
    */
   public TelaPrincipal() {
      initComponents();
      this.control = new ControlTelaInicial();
      this.setLocationRelativeTo(null);
   }

   




   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      painel_Topo = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      desktop = new javax.swing.JDesktopPane();
      painelLateral = new javax.swing.JPanel();
      painelCadastros = new javax.swing.JPanel();
      btDados = new seguro.resources.RSButtonMetro();
      jPanel2 = new javax.swing.JPanel();
      jLabel2 = new javax.swing.JLabel();
      btDispositivo = new seguro.resources.RSButtonMetro();
      pnRelatorios = new javax.swing.JPanel();
      jPanel3 = new javax.swing.JPanel();
      jLabel3 = new javax.swing.JLabel();
      rSButtonMetro3 = new seguro.resources.RSButtonMetro();
      rSButtonMetro4 = new seguro.resources.RSButtonMetro();
      rSButtonMetro5 = new seguro.resources.RSButtonMetro();
      rSButtonMetro6 = new seguro.resources.RSButtonMetro();
      jPanel4 = new javax.swing.JPanel();
      jPanel5 = new javax.swing.JPanel();
      jLabel4 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Software de Gerenciador de Consumo Elétrico");
      addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            formMouseEntered(evt);
         }
      });

      jPanel1.setBackground(new java.awt.Color(0, 0, 0));
      jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

      painel_Topo.setBackground(new java.awt.Color(0, 102, 102));
      painel_Topo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel1.setBackground(new java.awt.Color(0, 0, 0));
      jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(255, 255, 255));
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setText("ENERGY SAVER");

      javax.swing.GroupLayout painel_TopoLayout = new javax.swing.GroupLayout(painel_Topo);
      painel_Topo.setLayout(painel_TopoLayout);
      painel_TopoLayout.setHorizontalGroup(
         painel_TopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
      );
      painel_TopoLayout.setVerticalGroup(
         painel_TopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
      );

      desktop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

      javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
      desktop.setLayout(desktopLayout);
      desktopLayout.setHorizontalGroup(
         desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 617, Short.MAX_VALUE)
      );
      desktopLayout.setVerticalGroup(
         desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 391, Short.MAX_VALUE)
      );

      painelLateral.setBackground(new java.awt.Color(0, 153, 153));
      painelLateral.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      painelCadastros.setBackground(new java.awt.Color(51, 51, 51));

      btDados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btDados.setText("Meus Dados");
      btDados.setColorBorde(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btDados.setFocusPainted(false);
      btDados.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btDadosActionPerformed(evt);
         }
      });

      jPanel2.setBackground(new java.awt.Color(0, 0, 0));
      jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel2.setBackground(new java.awt.Color(255, 255, 255));
      jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(255, 255, 255));
      jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel2.setText("Cadastros");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      btDispositivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btDispositivo.setText("Dispositivo");
      btDispositivo.setColorBorde(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btDispositivo.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btDispositivoActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout painelCadastrosLayout = new javax.swing.GroupLayout(painelCadastros);
      painelCadastros.setLayout(painelCadastrosLayout);
      painelCadastrosLayout.setHorizontalGroup(
         painelCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(btDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(btDispositivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      painelCadastrosLayout.setVerticalGroup(
         painelCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(painelCadastrosLayout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addComponent(btDados, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(btDispositivo, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
            .addGap(0, 0, 0))
      );

      pnRelatorios.setBackground(new java.awt.Color(51, 51, 51));

      jPanel3.setBackground(new java.awt.Color(0, 0, 0));
      jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      jLabel3.setForeground(new java.awt.Color(255, 255, 255));
      jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel3.setText("Relatórios");

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      rSButtonMetro3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      rSButtonMetro3.setText("Diário");
      rSButtonMetro3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            rSButtonMetro3ActionPerformed(evt);
         }
      });

      rSButtonMetro4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      rSButtonMetro4.setText("Semanal");
      rSButtonMetro4.setColorBorde(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      rSButtonMetro5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      rSButtonMetro5.setText("Mensal");
      rSButtonMetro5.setColorBorde(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      rSButtonMetro6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      rSButtonMetro6.setText("Anual");
      rSButtonMetro6.setColorBorde(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      javax.swing.GroupLayout pnRelatoriosLayout = new javax.swing.GroupLayout(pnRelatorios);
      pnRelatorios.setLayout(pnRelatoriosLayout);
      pnRelatoriosLayout.setHorizontalGroup(
         pnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addGroup(pnRelatoriosLayout.createSequentialGroup()
            .addGroup(pnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(rSButtonMetro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(rSButtonMetro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(rSButtonMetro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(rSButtonMetro6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 0, Short.MAX_VALUE))
      );
      pnRelatoriosLayout.setVerticalGroup(
         pnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(pnRelatoriosLayout.createSequentialGroup()
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addComponent(rSButtonMetro3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(rSButtonMetro4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(rSButtonMetro5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(rSButtonMetro6, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
            .addGap(0, 0, 0))
      );

      jPanel5.setBackground(new java.awt.Color(0, 0, 0));

      jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      jLabel4.setForeground(new java.awt.Color(255, 255, 255));
      jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel4.setText("Agenda");

      javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
      jPanel5.setLayout(jPanel5Layout);
      jPanel5Layout.setHorizontalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel5Layout.setVerticalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
      );

      javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
      jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel4Layout.setVerticalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel4Layout.createSequentialGroup()
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout painelLateralLayout = new javax.swing.GroupLayout(painelLateral);
      painelLateral.setLayout(painelLateralLayout);
      painelLateralLayout.setHorizontalGroup(
         painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(painelCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(pnRelatorios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      painelLateralLayout.setVerticalGroup(
         painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(painelLateralLayout.createSequentialGroup()
            .addComponent(painelCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(pnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(painel_Topo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(painelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(desktop)
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(painel_Topo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(painelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(desktop))
            .addContainerGap())
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

   private void rSButtonMetro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro3ActionPerformed
      Agendamento a = null;
      try {
         a = new Agendamento();
      } catch (ParseException ex) {
         Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
      }
      desktop.add(a);
      a.setVisible(true);
   }//GEN-LAST:event_rSButtonMetro3ActionPerformed

   private void btDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDadosActionPerformed
      this.control.cad_cliente();
   }//GEN-LAST:event_btDadosActionPerformed

   private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
      
   }//GEN-LAST:event_formMouseEntered

   private void btDispositivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDispositivoActionPerformed
      this.control.dispositivo();
   }//GEN-LAST:event_btDispositivoActionPerformed




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
      java.awt.EventQueue.invokeLater( new Runnable() {
         public void run() {
            new TelaPrincipal().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private seguro.resources.RSButtonMetro btDados;
   private seguro.resources.RSButtonMetro btDispositivo;
   public static javax.swing.JDesktopPane desktop;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPanel jPanel4;
   private javax.swing.JPanel jPanel5;
   private javax.swing.JPanel painelCadastros;
   private javax.swing.JPanel painelLateral;
   private javax.swing.JPanel painel_Topo;
   private javax.swing.JPanel pnRelatorios;
   private seguro.resources.RSButtonMetro rSButtonMetro3;
   private seguro.resources.RSButtonMetro rSButtonMetro4;
   private seguro.resources.RSButtonMetro rSButtonMetro5;
   private seguro.resources.RSButtonMetro rSButtonMetro6;
   // End of variables declaration//GEN-END:variables

   public static Conexao getConexao() {
      return conexao;
   }

   public static void setConexao(Conexao conexao) {
      TelaPrincipal.conexao = conexao;
   }

   public JDesktopPane getDesktop() {
      return desktop;
   }

   public void setDesktop(JDesktopPane desktop) {
      this.desktop = desktop;
   }





}
