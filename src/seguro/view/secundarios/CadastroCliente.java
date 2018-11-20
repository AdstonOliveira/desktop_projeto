package seguro.view.secundarios;

import com.toedter.calendar.JDateChooser;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CadastroCliente extends javax.swing.JInternalFrame {
   /**
    * Creates new form CadastroCliente
    */
   
   public CadastroCliente() {
      initComponents();
      this.getRootPane().setDefaultButton(this.btSalvar);
   }

  
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jPanel2 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jLabel11 = new javax.swing.JLabel();
      jPanel3 = new javax.swing.JPanel();
      btSalvar = new seguro.resources.RSButtonMetro();
      btCancelar = new seguro.resources.RSButtonMetro();
      jPanel4 = new javax.swing.JPanel();
      jPanel5 = new javax.swing.JPanel();
      jPanel6 = new javax.swing.JPanel();
      jLabel2 = new javax.swing.JLabel();
      jPanel8 = new javax.swing.JPanel();
      jPanel12 = new javax.swing.JPanel();
      jLabel12 = new javax.swing.JLabel();
      textSobrenome = new javax.swing.JTextField();
      jLabel6 = new javax.swing.JLabel();
      dtNasc = new com.toedter.calendar.JDateChooser();
      jLabel13 = new javax.swing.JLabel();
      textConfEmail = new javax.swing.JTextField();
      jPanel11 = new javax.swing.JPanel();
      jLabel3 = new javax.swing.JLabel();
      textNome = new javax.swing.JTextField();
      jLabel4 = new javax.swing.JLabel();
      textNick = new javax.swing.JTextField();
      jLabel5 = new javax.swing.JLabel();
      textEmail = new javax.swing.JTextField();
      jPanel7 = new javax.swing.JPanel();
      jPanel9 = new javax.swing.JPanel();
      jLabel8 = new javax.swing.JLabel();
      jLabel9 = new javax.swing.JLabel();
      jLabel10 = new javax.swing.JLabel();
      senhaAtual = new javax.swing.JPasswordField();
      novaSenha = new javax.swing.JPasswordField();
      confirmaSenha = new javax.swing.JPasswordField();
      jPanel10 = new javax.swing.JPanel();
      jLabel7 = new javax.swing.JLabel();
      jLabel14 = new javax.swing.JLabel();

      setClosable(true);
      setIconifiable(true);
      setMaximizable(true);
      setResizable(true);
      setTitle("Meus Dados");

      jPanel1.setBackground(new java.awt.Color(0, 0, 0));
      jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

      jPanel2.setBackground(new java.awt.Color(0, 0, 0));

      jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(255, 255, 255));
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setText("Dados Cadastrais");
      jLabel1.setToolTipText("");

      jLabel11.setBackground(new java.awt.Color(255, 255, 255));
      jLabel11.setForeground(new java.awt.Color(255, 255, 255));
      jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/web.png"))); // NOI18N

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      jPanel3.setBackground(new java.awt.Color(0, 143, 143));

      btSalvar.setBackground(new java.awt.Color(0, 204, 51));
      btSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btSalvar.setMnemonic('s');
      btSalvar.setText("Salvar");
      btSalvar.setToolTipText("Para atualizar, certifique-se de que sua senha atual esteja preenchida");
      btSalvar.setColorBorde(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btSalvar.setColorHover(new java.awt.Color(0, 153, 204));
      btSalvar.setColorNormal(new java.awt.Color(0, 204, 51));
      btSalvar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btSalvarActionPerformed(evt);
         }
      });

      btCancelar.setBackground(new java.awt.Color(204, 51, 0));
      btCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      btCancelar.setMnemonic('c');
      btCancelar.setText("Cancelar");
      btCancelar.setColorHover(new java.awt.Color(0, 153, 204));
      btCancelar.setColorNormal(new java.awt.Color(204, 51, 0));

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
               .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addContainerGap())
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap(91, Short.MAX_VALUE)
            .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 91, Short.MAX_VALUE)
            .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(93, Short.MAX_VALUE))
      );

      jPanel4.setBackground(new java.awt.Color(255, 255, 255));
      jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

      jPanel5.setBackground(new java.awt.Color(255, 255, 255));
      jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 142, 142)));

      jPanel6.setBackground(new java.awt.Color(0, 143, 143));
      jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(255, 255, 255));
      jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel2.setText("Dados:");

      javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
      jPanel6.setLayout(jPanel6Layout);
      jPanel6Layout.setHorizontalGroup(
         jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
      );
      jPanel6Layout.setVerticalGroup(
         jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      jPanel8.setBackground(new java.awt.Color(255, 255, 255));
      jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jPanel12.setBorder(new javax.swing.border.MatteBorder(null));

      jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel12.setText("Sobrenome:");

      textSobrenome.setNextFocusableComponent(textNick);

      jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel6.setText("Dt Nasc:");

      dtNasc.setNextFocusableComponent(textEmail);

      jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel13.setText("Confirmar E-mail:");

      textConfEmail.setNextFocusableComponent(senhaAtual);

      javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
      jPanel12.setLayout(jPanel12Layout);
      jPanel12Layout.setHorizontalGroup(
         jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel12Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(textSobrenome)
               .addGroup(jPanel12Layout.createSequentialGroup()
                  .addGap(1, 1, 1)
                  .addComponent(dtNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
               .addComponent(textConfEmail)
               .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      jPanel12Layout.setVerticalGroup(
         jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel12Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel12)
            .addGap(3, 3, 3)
            .addComponent(textSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6)
            .addGap(3, 3, 3)
            .addComponent(dtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13)
            .addGap(3, 3, 3)
            .addComponent(textConfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      jPanel11.setBorder(new javax.swing.border.MatteBorder(null));

      jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel3.setText("Nome: ");

      textNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
      textNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      textNome.setNextFocusableComponent(textSobrenome);

      jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel4.setText("Nick:");

      textNick.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
      textNick.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      textNick.setNextFocusableComponent(dtNasc);

      jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel5.setText("Email:");

      textEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
      textEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      textEmail.setNextFocusableComponent(textConfEmail);

      javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
      jPanel11.setLayout(jPanel11Layout);
      jPanel11Layout.setHorizontalGroup(
         jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel11Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(textEmail)
               .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(textNick, javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(textNome)
               .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      jPanel11Layout.setVerticalGroup(
         jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel11Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel3)
            .addGap(3, 3, 3)
            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4)
            .addGap(3, 3, 3)
            .addComponent(textNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5)
            .addGap(3, 3, 3)
            .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
      jPanel8.setLayout(jPanel8Layout);
      jPanel8Layout.setHorizontalGroup(
         jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
         .addGroup(jPanel8Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );
      jPanel8Layout.setVerticalGroup(
         jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel8Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(9, 9, 9))
      );

      jPanel7.setBackground(new java.awt.Color(255, 255, 255));
      jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel8.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
      jLabel8.setText("Senha AtuaL:");

      jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      jLabel9.setText("Nova Senha:");

      jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      jLabel10.setText("Confirmar: ");

      senhaAtual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      senhaAtual.setText("123");
      senhaAtual.setNextFocusableComponent(novaSenha);

      novaSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      novaSenha.setNextFocusableComponent(confirmaSenha);
      novaSenha.setRequestFocusEnabled(false);
      novaSenha.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            novaSenhaActionPerformed(evt);
         }
      });

      confirmaSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

      javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
      jPanel9.setLayout(jPanel9Layout);
      jPanel9Layout.setHorizontalGroup(
         jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel9Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(novaSenha, javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(senhaAtual, javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(confirmaSenha))
            .addContainerGap())
      );
      jPanel9Layout.setVerticalGroup(
         jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel9Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel8)
               .addComponent(senhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel9)
               .addComponent(novaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel10)
               .addComponent(confirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      jPanel10.setBackground(new java.awt.Color(0, 142, 142));
      jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
      jLabel7.setForeground(new java.awt.Color(255, 255, 255));
      jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel7.setText("Senha:");

      javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
      jPanel10.setLayout(jPanel10Layout);
      jPanel10Layout.setHorizontalGroup(
         jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel10Layout.createSequentialGroup()
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel10Layout.setVerticalGroup(
         jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
      jPanel7.setLayout(jPanel7Layout);
      jPanel7Layout.setHorizontalGroup(
         jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
         .addGroup(jPanel7Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel7Layout.setVerticalGroup(
         jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel7Layout.createSequentialGroup()
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
      jPanel5.setLayout(jPanel5Layout);
      jPanel5Layout.setHorizontalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel5Layout.createSequentialGroup()
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(jPanel5Layout.createSequentialGroup()
                  .addContainerGap()
                  .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addContainerGap())
      );
      jPanel5Layout.setVerticalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel5Layout.createSequentialGroup()
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      jLabel14.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
      jLabel14.setText("Para realizar alterações, mantenha o campo de senha preenchido");

      javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
      jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(jPanel4Layout.createSequentialGroup()
                  .addComponent(jLabel14)
                  .addGap(0, 281, Short.MAX_VALUE)))
            .addContainerGap())
      );
      jPanel4Layout.setVerticalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel4Layout.createSequentialGroup()
            .addComponent(jLabel14)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(0, 0, 0)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(1, 1, 1)
                  .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGap(0, 0, 0))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

   private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_btSalvarActionPerformed

    private void novaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_novaSenhaActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private seguro.resources.RSButtonMetro btCancelar;
   private seguro.resources.RSButtonMetro btSalvar;
   private javax.swing.JPasswordField confirmaSenha;
   private com.toedter.calendar.JDateChooser dtNasc;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel12;
   private javax.swing.JLabel jLabel13;
   private javax.swing.JLabel jLabel14;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel10;
   private javax.swing.JPanel jPanel11;
   private javax.swing.JPanel jPanel12;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPanel jPanel4;
   private javax.swing.JPanel jPanel5;
   private javax.swing.JPanel jPanel6;
   private javax.swing.JPanel jPanel7;
   private javax.swing.JPanel jPanel8;
   private javax.swing.JPanel jPanel9;
   private javax.swing.JPasswordField novaSenha;
   private javax.swing.JPasswordField senhaAtual;
   private javax.swing.JTextField textConfEmail;
   private javax.swing.JTextField textEmail;
   private javax.swing.JTextField textNick;
   private javax.swing.JTextField textNome;
   private javax.swing.JTextField textSobrenome;
   // End of variables declaration//GEN-END:variables

   public JPasswordField getConfirmaSenha() {
      return confirmaSenha;
   }

   public void setConfirmaSenha(JPasswordField confirmaSenha) {
      this.confirmaSenha = confirmaSenha;
   }

   public JPasswordField getNovaSenha() {
      return novaSenha;
   }

   public void setNovaSenha(JPasswordField novaSenha) {
      this.novaSenha = novaSenha;
   }

   public JPasswordField getSenhaAtual() {
      return senhaAtual;
   }

   public void setSenhaAtual(JPasswordField senhaAtual) {
      this.senhaAtual = senhaAtual;
   }

   public JTextField getTextEmail() {
      return textEmail;
   }

   public void setTextEmail(JTextField textEmail) {
      this.textEmail = textEmail;
   }

   public JTextField getTextNick() {
      return textNick;
   }

   public void setTextNick(JTextField textNick) {
      this.textNick = textNick;
   }

   public JTextField getTextNome() {
      return textNome;
   }

   public void setTextNome(JTextField textNome) {
      this.textNome = textNome;
   }

    public JDateChooser getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(JDateChooser dtNasc) {
        this.dtNasc = dtNasc;
    }




}
