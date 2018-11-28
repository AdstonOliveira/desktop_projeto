package seguro.view;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import seguro.DAO.Conexao;
import seguro.model.Usuario;
import seguro.view.control.Abrir;
import seguro.view.control.ControlAgendamento;
import seguro.view.control.ControlTelaInicial;
import seguro.view.control.ControladoraClasses;

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
      this.control = new ControlTelaInicial();
      initComponents();
      this.setLocationRelativeTo( null );
      this.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
      
      if( ControladoraClasses.modo_teste ){
         this.setTitle("Modo Demonstração");
      }
      
   }

   




   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      painel_Topo = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      desktop = new javax.swing.JDesktopPane();
      jLabel6 = new javax.swing.JLabel();
      painelLateral = new javax.swing.JPanel();
      painelCadastros = new javax.swing.JPanel();
      btDados = new seguro.resources.RSButtonMetro();
      jPanel2 = new javax.swing.JPanel();
      jLabel2 = new javax.swing.JLabel();
      btGerenciador = new seguro.resources.RSButtonMetro();
      dispositivos = new seguro.resources.RSButtonMetro();
      pnRelatorios = new javax.swing.JPanel();
      jPanel3 = new javax.swing.JPanel();
      jLabel3 = new javax.swing.JLabel();
      btGrafMultiplo = new seguro.resources.RSButtonMetro();
      btTotais = new seguro.resources.RSButtonMetro();
      pnAgenda = new javax.swing.JPanel();
      jPanel5 = new javax.swing.JPanel();
      jLabel4 = new javax.swing.JLabel();
      btAgendar = new seguro.resources.RSButtonMetro();
      rSButtonMetro2 = new seguro.resources.RSButtonMetro();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Software de Gerenciador de Consumo Elétrico");
      setLocationByPlatform(true);
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
      jLabel1.setText("Seja Bem-Vindo");

      jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo Solo PNG.png"))); // NOI18N

      javax.swing.GroupLayout painel_TopoLayout = new javax.swing.GroupLayout(painel_Topo);
      painel_Topo.setLayout(painel_TopoLayout);
      painel_TopoLayout.setHorizontalGroup(
         painel_TopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_TopoLayout.createSequentialGroup()
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      painel_TopoLayout.setVerticalGroup(
         painel_TopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(painel_TopoLayout.createSequentialGroup()
            .addGroup(painel_TopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
               .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
               .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
            .addGap(0, 3, Short.MAX_VALUE))
      );

      desktop.setBackground(new java.awt.Color(0, 153, 0));
      desktop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
      desktop.setAutoscrolls(true);
      desktop.setOpaque(false);

      jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Energy Saver PNG.png"))); // NOI18N

      desktop.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

      javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
      desktop.setLayout(desktopLayout);
      desktopLayout.setHorizontalGroup(
         desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
      );
      desktopLayout.setVerticalGroup(
         desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

      btGerenciador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btGerenciador.setText("Gerenciadores");
      btGerenciador.setColorBorde(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btGerenciador.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btGerenciadorActionPerformed(evt);
         }
      });

      dispositivos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      dispositivos.setText("Dispositivos");
      dispositivos.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            dispositivosActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout painelCadastrosLayout = new javax.swing.GroupLayout(painelCadastros);
      painelCadastros.setLayout(painelCadastrosLayout);
      painelCadastrosLayout.setHorizontalGroup(
         painelCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(btDados, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
         .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(btGerenciador, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
         .addComponent(dispositivos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
      );
      painelCadastrosLayout.setVerticalGroup(
         painelCadastrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(painelCadastrosLayout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addComponent(btDados, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(btGerenciador, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(dispositivos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
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
         .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      btGrafMultiplo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btGrafMultiplo.setText("Gerar Gráficos");
      btGrafMultiplo.setToolTipText("Exibe varios equipamentos em unico grafico");
      btGrafMultiplo.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btGrafMultiploActionPerformed(evt);
         }
      });

      btTotais.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btTotais.setText("Totais");
      btTotais.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btTotaisActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout pnRelatoriosLayout = new javax.swing.GroupLayout(pnRelatorios);
      pnRelatorios.setLayout(pnRelatoriosLayout);
      pnRelatoriosLayout.setHorizontalGroup(
         pnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(btGrafMultiplo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
         .addComponent(btTotais, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
      );
      pnRelatoriosLayout.setVerticalGroup(
         pnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(pnRelatoriosLayout.createSequentialGroup()
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addComponent(btGrafMultiplo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(btTotais, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
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
         .addGroup(jPanel5Layout.createSequentialGroup()
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel5Layout.setVerticalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
      );

      btAgendar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btAgendar.setText("Agendar");
      btAgendar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btAgendarActionPerformed(evt);
         }
      });

      rSButtonMetro2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      rSButtonMetro2.setText("Histórico");
      rSButtonMetro2.setToolTipText("Histórico de desligamento (futuros e passados)");
      rSButtonMetro2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            rSButtonMetro2ActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout pnAgendaLayout = new javax.swing.GroupLayout(pnAgenda);
      pnAgenda.setLayout(pnAgendaLayout);
      pnAgendaLayout.setHorizontalGroup(
         pnAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(btAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
         .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
      );
      pnAgendaLayout.setVerticalGroup(
         pnAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(pnAgendaLayout.createSequentialGroup()
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addComponent(btAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      javax.swing.GroupLayout painelLateralLayout = new javax.swing.GroupLayout(painelLateral);
      painelLateral.setLayout(painelLateralLayout);
      painelLateralLayout.setHorizontalGroup(
         painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLateralLayout.createSequentialGroup()
            .addGroup(painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(pnAgenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(pnRelatorios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(painelCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(0, 0, 0))
      );
      painelLateralLayout.setVerticalGroup(
         painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(painelLateralLayout.createSequentialGroup()
            .addComponent(painelCadastros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(pnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(pnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(210, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(painel_Topo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(painelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addComponent(desktop))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(painel_Topo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(painelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(desktop))
            .addGap(1, 1, 1))
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

   private void btDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDadosActionPerformed
      ControladoraClasses.abrir( Abrir.MEUS_DADOS.getDescricao() );
   }//GEN-LAST:event_btDadosActionPerformed

   private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
      
   }//GEN-LAST:event_formMouseEntered

   private void btGerenciadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerenciadorActionPerformed
      ControladoraClasses.abrir( Abrir.GERENCIADOR.getDescricao() );
   }//GEN-LAST:event_btGerenciadorActionPerformed

    private void btAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgendarActionPerformed
       ControladoraClasses.abrir(Abrir.AGENDAR.getDescricao());
    }//GEN-LAST:event_btAgendarActionPerformed

    
    
   private void btGrafMultiploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGrafMultiploActionPerformed
      ControladoraClasses.abrir( Abrir.GERAR_GRAFICOS.getDescricao() );
   }//GEN-LAST:event_btGrafMultiploActionPerformed

   private void btTotaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTotaisActionPerformed
      ControladoraClasses.abrir( Abrir.TOTAIS.getDescricao() );
   }//GEN-LAST:event_btTotaisActionPerformed

   private void rSButtonMetro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMetro2ActionPerformed
      ControladoraClasses.abrir(Abrir.AGENDADOS.getDescricao());
   }//GEN-LAST:event_rSButtonMetro2ActionPerformed

   private void dispositivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispositivosActionPerformed
      ControladoraClasses.abrir(Abrir.DISPOSITIVO.getDescricao());
   }//GEN-LAST:event_dispositivosActionPerformed




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
   private seguro.resources.RSButtonMetro btAgendar;
   private seguro.resources.RSButtonMetro btDados;
   private seguro.resources.RSButtonMetro btGerenciador;
   private seguro.resources.RSButtonMetro btGrafMultiplo;
   private seguro.resources.RSButtonMetro btTotais;
   public static javax.swing.JDesktopPane desktop;
   private seguro.resources.RSButtonMetro dispositivos;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPanel jPanel5;
   private javax.swing.JPanel painelCadastros;
   private javax.swing.JPanel painelLateral;
   private javax.swing.JPanel painel_Topo;
   private javax.swing.JPanel pnAgenda;
   private javax.swing.JPanel pnRelatorios;
   private seguro.resources.RSButtonMetro rSButtonMetro2;
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
