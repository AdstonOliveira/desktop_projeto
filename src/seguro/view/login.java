package seguro.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import seguro.view.control.ControlLogin;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
//import seguro.DAO.Conexao;
import seguro.Seguro;
import seguro.configuracoes.ConfigBotao;
import seguro.configuracoes.PreencheAleatorio;
import seguro.view.control.ControladoraClasses;


/**
 * @author root
 */
public class login extends javax.swing.JFrame {

    private ControlLogin control = new ControlLogin();
    
    public login() {
        initComponents();
        ConfigBotao.btOK( this.btConecta );
        ConfigBotao.btCancela( this.btCancela );
        
        this.setLocationRelativeTo( null );
        this.getRootPane().setDefaultButton( this.btConecta );
        //this.test();
        
    }

    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      painel_fundo = new javax.swing.JPanel();
      pnTop = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jPanel1 = new javax.swing.JPanel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      textLogin = new javax.swing.JTextField();
      textSenha = new javax.swing.JPasswordField();
      status = new javax.swing.JLabel();
      jPanel2 = new javax.swing.JPanel();
      btConecta = new javax.swing.JButton();
      btCancela = new javax.swing.JButton();
      jMenuBar1 = new javax.swing.JMenuBar();
      novoCad = new javax.swing.JMenu();
      configBanco = new javax.swing.JMenuItem();
      jMenuItem1 = new javax.swing.JMenuItem();
      linux = new javax.swing.JRadioButtonMenuItem();
      modo_teste = new javax.swing.JRadioButtonMenuItem();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("Login - Bem-Vindo");
      setLocationByPlatform(true);
      setResizable(false);

      painel_fundo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

      pnTop.setBackground(new java.awt.Color(0, 102, 102));
      pnTop.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(255, 255, 255));
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setText("LOGIN");

      javax.swing.GroupLayout pnTopLayout = new javax.swing.GroupLayout(pnTop);
      pnTop.setLayout(pnTopLayout);
      pnTopLayout.setHorizontalGroup(
         pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      pnTopLayout.setVerticalGroup(
         pnTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
      );

      jPanel1.setBackground(new java.awt.Color(255, 255, 255));
      jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      jLabel2.setText("Nick:");

      jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
      jLabel3.setText("Senha:");

      textLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
      textLogin.setText("tom");

      textSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
      textSenha.setText("123");

      status.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
      status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      status.setText("...Tentando conexao com o banco de dados ...");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap(71, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(textLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
               .addComponent(textSenha))
            .addContainerGap(73, Short.MAX_VALUE))
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2)
               .addComponent(textLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel3)
               .addComponent(textSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
            .addComponent(status))
      );

      jPanel2.setBackground(new java.awt.Color(255, 255, 255));
      jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      btConecta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      btConecta.setMnemonic('e');
      btConecta.setText("Conectar");
      btConecta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btConecta.setEnabled(false);
      btConecta.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            btConectaMouseClicked(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            btConectaMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            btConectaMouseExited(evt);
         }
      });
      btConecta.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btConectaActionPerformed(evt);
         }
      });

      btCancela.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      btCancela.setMnemonic('n');
      btCancela.setText("Cancelar");
      btCancela.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btCancela.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            btCancelaMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            btCancelaMouseExited(evt);
         }
      });
      btCancela.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btCancelaActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btConecta, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btCancela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(btConecta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(btCancela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );

      javax.swing.GroupLayout painel_fundoLayout = new javax.swing.GroupLayout(painel_fundo);
      painel_fundo.setLayout(painel_fundoLayout);
      painel_fundoLayout.setHorizontalGroup(
         painel_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(pnTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      painel_fundoLayout.setVerticalGroup(
         painel_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(painel_fundoLayout.createSequentialGroup()
            .addComponent(pnTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      novoCad.setMnemonic('x');
      novoCad.setText("Opções");
      novoCad.setToolTipText("para execução em linux");

      configBanco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
      configBanco.setText("Configurações");
      configBanco.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            configBancoActionPerformed(evt);
         }
      });
      novoCad.add(configBanco);

      jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
      jMenuItem1.setText("NovoCadastro");
      jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem1ActionPerformed(evt);
         }
      });
      novoCad.add(jMenuItem1);

      linux.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
      linux.setText("Linux");
      novoCad.add(linux);

      modo_teste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
      modo_teste.setText("Demonstração");
      modo_teste.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            modo_testeActionPerformed(evt);
         }
      });
      novoCad.add(modo_teste);

      jMenuBar1.add(novoCad);

      setJMenuBar(jMenuBar1);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(painel_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(painel_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void configBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configBancoActionPerformed
        ConfigBanco config = new ConfigBanco();
        config.defineConexao( Seguro.conexao );
        config.setVisible( true );
    }//GEN-LAST:event_configBancoActionPerformed

    /*
    public void test(){
       class Th extends Thread{
          Conexao conexao = Seguro.conexao;
          public boolean testeConexao = false;
          public login view;
          
            public Th( Conexao conexao, login view ){
               this.view = view;
                this.start();
            }
            
            
               @Override
               public void run(){
                  if( this.conexao.abrir() != null ){
                     testeConexao = true;
                     view.status.setText("Servidor disponível");
                     view.status.setForeground( Color.GREEN );
                     view.status.setEnabled(true);
                  }else{
                     view.status.setText("Servidor indisponível");
                     view.status.setForeground( Color.RED );
                     view.btConecta.setEnabled(false);
                  }
                     
               }
       }
       Th teste = new Th( Seguro.conexao, this );
    }
    */
   private void btConectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConectaActionPerformed
         if( linux.isSelected() ){
            PreencheAleatorio.randDia = "/tmp/randDia.txt";
            PreencheAleatorio.randMes = "/tmp/randMes.txt";
         }
         
      if( !modo_teste.isSelected() ){
         this.bt_conectar();
      }else{
         ControladoraClasses.modo_teste = true;
       
         new TelaPrincipal().setVisible(true);
         this.dispose();
     }
         
   }//GEN-LAST:event_btConectaActionPerformed

   private void btConectaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConectaMouseEntered
      ConfigBotao.evtEntered( this.btConecta );
   }//GEN-LAST:event_btConectaMouseEntered

   private void btConectaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConectaMouseExited
      ConfigBotao.evtExited( this.btConecta );
   }//GEN-LAST:event_btConectaMouseExited

   private void btConectaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConectaMouseClicked
      ConfigBotao.clicked( this.btConecta );
   }//GEN-LAST:event_btConectaMouseClicked

   private void btCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelaActionPerformed
      System.exit(0);
   }//GEN-LAST:event_btCancelaActionPerformed

   private void btCancelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelaMouseExited
      ConfigBotao.evtExited( this.btCancela );
   }//GEN-LAST:event_btCancelaMouseExited

   private void btCancelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelaMouseEntered
      ConfigBotao.evtEntered( this.btCancela );
   }//GEN-LAST:event_btCancelaMouseEntered

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        NovoCadastro novoCadastro = new NovoCadastro();
        novoCadastro.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

   private void modo_testeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modo_testeActionPerformed
      if( modo_teste.isSelected() )
         this.btConecta.setEnabled( true );
      else
         this.btConecta.setEnabled( false );
      
   }//GEN-LAST:event_modo_testeActionPerformed

      public void bt_conectar(){
         String[] dadosLogin = new String[2];
         
         dadosLogin[0] = this.textLogin.getText();
         dadosLogin[1] = new String( this.textSenha.getPassword() );
         System.out.println("bt" + dadosLogin[1]);
      
         if( this.control.Login( Seguro.conexao, dadosLogin ) ){
            JOptionPane.showMessageDialog( this, "Seja Bem-Vindo " + TelaPrincipal.usuario.getLogin(),"Bem-Vindo",1 );
            new TelaPrincipal().setVisible(true);
            this.dispose();
         }else
            JOptionPane.showMessageDialog( this, "Não foi possivel entrar!!!","Não Logado",0 );
      }
   
   
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btCancela;
   private javax.swing.JButton btConecta;
   private javax.swing.JMenuItem configBanco;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JMenuBar jMenuBar1;
   private javax.swing.JMenuItem jMenuItem1;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JRadioButtonMenuItem linux;
   private javax.swing.JRadioButtonMenuItem modo_teste;
   private javax.swing.JMenu novoCad;
   private javax.swing.JPanel painel_fundo;
   private javax.swing.JPanel pnTop;
   private javax.swing.JLabel status;
   private javax.swing.JTextField textLogin;
   private javax.swing.JPasswordField textSenha;
   // End of variables declaration//GEN-END:variables

   public ControlLogin getControl() {
      return control;
   }

   public void setControl(ControlLogin control) {
      this.control = control;
   }

   public JButton getBtCancela() {
      return btCancela;
   }

   public void setBtCancela(JButton btCancela) {
      this.btCancela = btCancela;
   }

   public JButton getBtConecta() {
      return btConecta;
   }

   public void setBtConecta(JButton btConecta) {
      this.btConecta = btConecta;
   }

   public JMenuItem getConfigBanco() {
      return configBanco;
   }

   public void setConfigBanco(JMenuItem configBanco) {
      this.configBanco = configBanco;
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

   public JMenuBar getjMenuBar1() {
      return jMenuBar1;
   }

   public void setjMenuBar1(JMenuBar jMenuBar1) {
      this.jMenuBar1 = jMenuBar1;
   }

   public JMenuItem getjMenuItem1() {
      return jMenuItem1;
   }

   public void setjMenuItem1(JMenuItem jMenuItem1) {
      this.jMenuItem1 = jMenuItem1;
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

   public JMenu getNovoCad() {
      return novoCad;
   }

   public void setNovoCad(JMenu novoCad) {
      this.novoCad = novoCad;
   }

   public JPanel getPainel_fundo() {
      return painel_fundo;
   }

   public void setPainel_fundo(JPanel painel_fundo) {
      this.painel_fundo = painel_fundo;
   }

   public JPanel getPnTop() {
      return pnTop;
   }

   public void setPnTop(JPanel pnTop) {
      this.pnTop = pnTop;
   }

   public JLabel getStatus() {
      return status;
   }

   public void setStatus(JLabel status) {
      this.status = status;
   }

   public JTextField getTextLogin() {
      return textLogin;
   }

   public void setTextLogin(JTextField textLogin) {
      this.textLogin = textLogin;
   }

   public JPasswordField getTextSenha() {
      return textSenha;
   }

   public void setTextSenha(JPasswordField textSenha) {
      this.textSenha = textSenha;
   }

   public JRadioButtonMenuItem getLinux() {
      return linux;
   }

   public void setLinux(JRadioButtonMenuItem linux) {
      this.linux = linux;
   }

   public JRadioButtonMenuItem getModo_teste() {
      return modo_teste;
   }

   public void setModo_teste(JRadioButtonMenuItem modo_teste) {
      this.modo_teste = modo_teste;
   }

}
