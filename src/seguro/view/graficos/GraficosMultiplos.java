package seguro.view.graficos;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import java.io.IOException;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import seguro.configuracoes.ConfigBotao;
import seguro.control.graficos.ControlGraficos;
import seguro.resources.RSButtonMetro;

/**
 * @author Adston at self
*/
public class GraficosMultiplos extends javax.swing.JInternalFrame {
   private ControlGraficos control;
   
   public GraficosMultiplos() {
      initComponents();
      this.coresBt();
   }
   
   
   public void coresBt(){
      ConfigBotao.btOK( this.gerarDiario );
      ConfigBotao.btOK( this.gerarMensal );
      ConfigBotao.btOK( this.gerarAnual );
   }
   
   
   public void setControl(ControlGraficos control){
      this.control = control;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jPanel2 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jPanel4 = new javax.swing.JPanel();
      jTabbedPane1 = new javax.swing.JTabbedPane();
      jPanel10 = new javax.swing.JPanel();
      jPanel8 = new javax.swing.JPanel();
      jPanel9 = new javax.swing.JPanel();
      jLabel3 = new javax.swing.JLabel();
      dt_inicial = new com.toedter.calendar.JDateChooser();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      dt_final = new com.toedter.calendar.JDateChooser();
      gerarDiario = new seguro.resources.RSButtonMetro();
      grafico_diario = new javax.swing.JPanel();
      jPanel12 = new javax.swing.JPanel();
      jPanel13 = new javax.swing.JPanel();
      jPanel14 = new javax.swing.JPanel();
      jPanel15 = new javax.swing.JPanel();
      jLabel6 = new javax.swing.JLabel();
      gerarMensal = new seguro.resources.RSButtonMetro();
      selecao_mes = new com.toedter.calendar.JMonthChooser();
      ano_pnMes = new com.toedter.calendar.JYearChooser();
      grafico_mensal = new javax.swing.JPanel();
      jPanel18 = new javax.swing.JPanel();
      jPanel25 = new javax.swing.JPanel();
      jPanel26 = new javax.swing.JPanel();
      jPanel27 = new javax.swing.JPanel();
      jLabel8 = new javax.swing.JLabel();
      gerarAnual = new seguro.resources.RSButtonMetro();
      ano_pnAnual = new com.toedter.calendar.JYearChooser();
      grafico_anual = new javax.swing.JPanel();
      jPanel5 = new javax.swing.JPanel();
      jPanel6 = new javax.swing.JPanel();
      jLabel2 = new javax.swing.JLabel();
      painel_equipamentos = new javax.swing.JPanel();
      jCheckBox1 = new javax.swing.JCheckBox();
      jCheckBox2 = new javax.swing.JCheckBox();
      jCheckBox3 = new javax.swing.JCheckBox();
      jPanel3 = new javax.swing.JPanel();
      salvarPDF = new seguro.resources.RSButtonMetro();
      jPanel16 = new javax.swing.JPanel();
      jLabel13 = new javax.swing.JLabel();
      SalvarPNG = new seguro.resources.RSButtonMetro();
      SalvarXLS = new seguro.resources.RSButtonMetro();

      setClosable(true);
      setIconifiable(true);
      setMaximizable(true);
      setTitle("Gráficos de Consumo");

      jPanel1.setBackground(new java.awt.Color(0, 0, 0));
      jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

      jPanel2.setBackground(new java.awt.Color(0, 0, 0));

      jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(255, 255, 255));
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setText("Gráficos de Consumo");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
      );

      jPanel4.setBackground(new java.awt.Color(255, 255, 255));

      jTabbedPane1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N

      jPanel10.setBackground(new java.awt.Color(255, 255, 255));
      jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

      jPanel9.setBackground(new java.awt.Color(0, 153, 153));
      jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      jLabel3.setForeground(new java.awt.Color(255, 255, 255));
      jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel3.setText("Selecione o período:");

      javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
      jPanel9.setLayout(jPanel9Layout);
      jPanel9Layout.setHorizontalGroup(
         jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel9Layout.setVerticalGroup(
         jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      jLabel4.setText("Data Inicial:");

      jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      jLabel5.setText("Data Final:");

      gerarDiario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      gerarDiario.setText("Gerar");
      gerarDiario.setToolTipText("Para períodos de até 30 dias");
      gerarDiario.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            gerarDiarioMouseClicked(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            gerarDiarioMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            gerarDiarioMouseExited(evt);
         }
      });
      gerarDiario.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            gerarDiarioActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
      jPanel8.setLayout(jPanel8Layout);
      jPanel8Layout.setHorizontalGroup(
         jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel8Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(dt_inicial, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
               .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(dt_final, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
               .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(gerarDiario, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
            .addContainerGap())
         .addGroup(jPanel8Layout.createSequentialGroup()
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );
      jPanel8Layout.setVerticalGroup(
         jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel8Layout.createSequentialGroup()
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(dt_inicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(dt_final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(gerarDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addContainerGap())
      );

      grafico_diario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

      javax.swing.GroupLayout grafico_diarioLayout = new javax.swing.GroupLayout(grafico_diario);
      grafico_diario.setLayout(grafico_diarioLayout);
      grafico_diarioLayout.setHorizontalGroup(
         grafico_diarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      grafico_diarioLayout.setVerticalGroup(
         grafico_diarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 203, Short.MAX_VALUE)
      );

      javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
      jPanel10.setLayout(jPanel10Layout);
      jPanel10Layout.setHorizontalGroup(
         jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel10Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(grafico_diario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(jPanel10Layout.createSequentialGroup()
                  .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGap(116, 116, 116)))
            .addContainerGap())
      );
      jPanel10Layout.setVerticalGroup(
         jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel10Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(grafico_diario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      jTabbedPane1.addTab("Diário", jPanel10);

      jPanel13.setBackground(new java.awt.Color(255, 255, 255));
      jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

      jPanel15.setBackground(new java.awt.Color(0, 153, 153));
      jPanel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      jLabel6.setForeground(new java.awt.Color(255, 255, 255));
      jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel6.setText("Selecione o mês e ano");

      javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
      jPanel15.setLayout(jPanel15Layout);
      jPanel15Layout.setHorizontalGroup(
         jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel15Layout.setVerticalGroup(
         jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      gerarMensal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      gerarMensal.setText("Gerar");
      gerarMensal.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            gerarMensalMouseClicked(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            gerarMensalMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            gerarMensalMouseExited(evt);
         }
      });

      javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
      jPanel14.setLayout(jPanel14Layout);
      jPanel14Layout.setHorizontalGroup(
         jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel14Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(selecao_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(ano_pnMes, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(gerarMensal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(15, 15, 15))
         .addGroup(jPanel14Layout.createSequentialGroup()
            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );
      jPanel14Layout.setVerticalGroup(
         jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel14Layout.createSequentialGroup()
            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(selecao_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(ano_pnMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(gerarMensal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addContainerGap())
      );

      grafico_mensal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

      javax.swing.GroupLayout grafico_mensalLayout = new javax.swing.GroupLayout(grafico_mensal);
      grafico_mensal.setLayout(grafico_mensalLayout);
      grafico_mensalLayout.setHorizontalGroup(
         grafico_mensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      grafico_mensalLayout.setVerticalGroup(
         grafico_mensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 219, Short.MAX_VALUE)
      );

      javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
      jPanel13.setLayout(jPanel13Layout);
      jPanel13Layout.setHorizontalGroup(
         jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(grafico_mensal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(jPanel13Layout.createSequentialGroup()
                  .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(85, 85, 85)))
            .addContainerGap())
      );
      jPanel13Layout.setVerticalGroup(
         jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel13Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(grafico_mensal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
      jPanel12.setLayout(jPanel12Layout);
      jPanel12Layout.setHorizontalGroup(
         jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 521, Short.MAX_VALUE)
         .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel12Layout.setVerticalGroup(
         jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 316, Short.MAX_VALUE)
         .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      jTabbedPane1.addTab("Mensal", jPanel12);

      jPanel25.setBackground(new java.awt.Color(255, 255, 255));
      jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

      jPanel27.setBackground(new java.awt.Color(0, 153, 153));
      jPanel27.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      jLabel8.setForeground(new java.awt.Color(255, 255, 255));
      jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel8.setText("Selecione o Ano");

      javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
      jPanel27.setLayout(jPanel27Layout);
      jPanel27Layout.setHorizontalGroup(
         jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel27Layout.setVerticalGroup(
         jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      gerarAnual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      gerarAnual.setText("Gerar");
      gerarAnual.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            gerarAnualMouseClicked(evt);
         }
         public void mouseEntered(java.awt.event.MouseEvent evt) {
            gerarAnualMouseEntered(evt);
         }
         public void mouseExited(java.awt.event.MouseEvent evt) {
            gerarAnualMouseExited(evt);
         }
      });
      gerarAnual.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            gerarAnualActionPerformed(evt);
         }
      });

      ano_pnAnual.setEndYear(2019);

      javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
      jPanel26.setLayout(jPanel26Layout);
      jPanel26Layout.setHorizontalGroup(
         jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel26Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(ano_pnAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(gerarAnual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(16, 16, 16))
         .addGroup(jPanel26Layout.createSequentialGroup()
            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );
      jPanel26Layout.setVerticalGroup(
         jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel26Layout.createSequentialGroup()
            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(ano_pnAnual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(gerarAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addContainerGap())
      );

      grafico_anual.setBorder(javax.swing.BorderFactory.createEtchedBorder());

      javax.swing.GroupLayout grafico_anualLayout = new javax.swing.GroupLayout(grafico_anual);
      grafico_anual.setLayout(grafico_anualLayout);
      grafico_anualLayout.setHorizontalGroup(
         grafico_anualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 0, Short.MAX_VALUE)
      );
      grafico_anualLayout.setVerticalGroup(
         grafico_anualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 219, Short.MAX_VALUE)
      );

      javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
      jPanel25.setLayout(jPanel25Layout);
      jPanel25Layout.setHorizontalGroup(
         jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel25Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(grafico_anual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(jPanel25Layout.createSequentialGroup()
                  .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(131, 131, 131)))
            .addContainerGap())
      );
      jPanel25Layout.setVerticalGroup(
         jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel25Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(grafico_anual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
      jPanel18.setLayout(jPanel18Layout);
      jPanel18Layout.setHorizontalGroup(
         jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 521, Short.MAX_VALUE)
         .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
               .addGap(0, 0, 0)
               .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
      );
      jPanel18Layout.setVerticalGroup(
         jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 316, Short.MAX_VALUE)
         .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      jTabbedPane1.addTab("Anual", jPanel18);

      jPanel6.setBackground(new java.awt.Color(0, 143, 143));
      jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

      jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(255, 255, 255));
      jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel2.setText("Selecione os equipamentos:");

      javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
      jPanel6.setLayout(jPanel6Layout);
      jPanel6Layout.setHorizontalGroup(
         jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel6Layout.setVerticalGroup(
         jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );

      painel_equipamentos.setBorder(new javax.swing.border.MatteBorder(null));

      jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      jCheckBox1.setText("Equip1");

      jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      jCheckBox2.setText("Equip2");
      jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jCheckBox2ActionPerformed(evt);
         }
      });

      jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
      jCheckBox3.setText("Equip3");

      javax.swing.GroupLayout painel_equipamentosLayout = new javax.swing.GroupLayout(painel_equipamentos);
      painel_equipamentos.setLayout(painel_equipamentosLayout);
      painel_equipamentosLayout.setHorizontalGroup(
         painel_equipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(painel_equipamentosLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jCheckBox1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jCheckBox2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jCheckBox3)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      painel_equipamentosLayout.setVerticalGroup(
         painel_equipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(painel_equipamentosLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(painel_equipamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jCheckBox1)
               .addComponent(jCheckBox2)
               .addComponent(jCheckBox3))
            .addContainerGap(8, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
      jPanel5.setLayout(jPanel5Layout);
      jPanel5Layout.setHorizontalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel5Layout.createSequentialGroup()
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
         .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(painel_equipamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel5Layout.setVerticalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel5Layout.createSequentialGroup()
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(5, 5, 5)
            .addComponent(painel_equipamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
      jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      jPanel4Layout.setVerticalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTabbedPane1)
            .addContainerGap())
      );

      jPanel3.setBackground(new java.awt.Color(0, 143, 143));
      jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
      jPanel3.setPreferredSize(new java.awt.Dimension(77, 290));

      salvarPDF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      salvarPDF.setText("Salvar JPEG");

      jPanel16.setBackground(new java.awt.Color(0, 0, 0));

      jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jLabel13.setForeground(new java.awt.Color(255, 255, 255));
      jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel13.setText("Opções");

      javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
      jPanel16.setLayout(jPanel16Layout);
      jPanel16Layout.setHorizontalGroup(
         jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
      );
      jPanel16Layout.setVerticalGroup(
         jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
      );

      SalvarPNG.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      SalvarPNG.setText("Salvar PNG");

      SalvarXLS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
      SalvarXLS.setText("Gerar XLS");

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(SalvarXLS, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
         .addComponent(salvarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
         .addComponent(SalvarPNG, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
         .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addComponent(salvarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(SalvarPNG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, 0)
            .addComponent(SalvarXLS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)))
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

   private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_jCheckBox2ActionPerformed

   private void gerarAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarAnualActionPerformed
      
      


   }//GEN-LAST:event_gerarAnualActionPerformed

   private void gerarDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarDiarioActionPerformed
      try {
         this.control.gerarDiario();
      } catch (IOException ex) {
         System.out.println(ex);
      }
   }//GEN-LAST:event_gerarDiarioActionPerformed

   private void gerarDiarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerarDiarioMouseEntered
      ConfigBotao.evtEntered(this.gerarDiario);
   }//GEN-LAST:event_gerarDiarioMouseEntered

   private void gerarDiarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerarDiarioMouseExited
      ConfigBotao.evtExited(this.gerarDiario);
   }//GEN-LAST:event_gerarDiarioMouseExited
   
   private void gerarMensalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerarMensalMouseEntered
      ConfigBotao.evtEntered(this.gerarMensal);
      
   }//GEN-LAST:event_gerarMensalMouseEntered

   private void gerarMensalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerarMensalMouseExited
      ConfigBotao.evtExited(this.gerarMensal);
   }//GEN-LAST:event_gerarMensalMouseExited

   private void gerarAnualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerarAnualMouseEntered
      ConfigBotao.evtEntered(this.gerarAnual);
      
   }//GEN-LAST:event_gerarAnualMouseEntered

   private void gerarAnualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerarAnualMouseExited
      ConfigBotao.evtExited(this.gerarAnual);
   }//GEN-LAST:event_gerarAnualMouseExited

   private void gerarDiarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerarDiarioMouseClicked
     ConfigBotao.clicked(this.gerarDiario);
   }//GEN-LAST:event_gerarDiarioMouseClicked

   private void gerarMensalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerarMensalMouseClicked
     ConfigBotao.clicked(this.gerarMensal);
      // TODO add your handling code here:
   }//GEN-LAST:event_gerarMensalMouseClicked

   private void gerarAnualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerarAnualMouseClicked
      // TODO add your handling code here:
     ConfigBotao.clicked(this.gerarAnual);
   }//GEN-LAST:event_gerarAnualMouseClicked


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private seguro.resources.RSButtonMetro SalvarPNG;
   private seguro.resources.RSButtonMetro SalvarXLS;
   private com.toedter.calendar.JYearChooser ano_pnAnual;
   private com.toedter.calendar.JYearChooser ano_pnMes;
   private com.toedter.calendar.JDateChooser dt_final;
   private com.toedter.calendar.JDateChooser dt_inicial;
   private seguro.resources.RSButtonMetro gerarAnual;
   private seguro.resources.RSButtonMetro gerarDiario;
   private seguro.resources.RSButtonMetro gerarMensal;
   private javax.swing.JPanel grafico_anual;
   private javax.swing.JPanel grafico_diario;
   private javax.swing.JPanel grafico_mensal;
   private javax.swing.JCheckBox jCheckBox1;
   private javax.swing.JCheckBox jCheckBox2;
   private javax.swing.JCheckBox jCheckBox3;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel13;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel10;
   private javax.swing.JPanel jPanel12;
   private javax.swing.JPanel jPanel13;
   private javax.swing.JPanel jPanel14;
   private javax.swing.JPanel jPanel15;
   private javax.swing.JPanel jPanel16;
   private javax.swing.JPanel jPanel18;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel25;
   private javax.swing.JPanel jPanel26;
   private javax.swing.JPanel jPanel27;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPanel jPanel4;
   private javax.swing.JPanel jPanel5;
   private javax.swing.JPanel jPanel6;
   private javax.swing.JPanel jPanel8;
   private javax.swing.JPanel jPanel9;
   private javax.swing.JTabbedPane jTabbedPane1;
   private javax.swing.JPanel painel_equipamentos;
   private seguro.resources.RSButtonMetro salvarPDF;
   private com.toedter.calendar.JMonthChooser selecao_mes;
   // End of variables declaration//GEN-END:variables

   public RSButtonMetro getSalvarPNG() {
      return SalvarPNG;
   }

   public void setSalvarPNG(RSButtonMetro SalvarPNG) {
      this.SalvarPNG = SalvarPNG;
   }

   public RSButtonMetro getSalvarXLS() {
      return SalvarXLS;
   }

   public void setSalvarXLS(RSButtonMetro SalvarXLS) {
      this.SalvarXLS = SalvarXLS;
   }

   public JYearChooser getAno_pnAnual() {
      return ano_pnAnual;
   }

   public void setAno_pnAnual(JYearChooser ano_pnAnual) {
      this.ano_pnAnual = ano_pnAnual;
   }

   public JYearChooser getAno_pnMes() {
      return ano_pnMes;
   }

   public void setAno_pnMes(JYearChooser ano_pnMes) {
      this.ano_pnMes = ano_pnMes;
   }

   public JDateChooser getDt_final() {
      return dt_final;
   }

   public void setDt_final(JDateChooser dt_final) {
      this.dt_final = dt_final;
   }

   public JDateChooser getDt_inicial() {
      return dt_inicial;
   }

   public void setDt_inicial(JDateChooser dt_inicial) {
      this.dt_inicial = dt_inicial;
   }

   public RSButtonMetro getGerarAnual() {
      return gerarAnual;
   }

   public void setGerarAnual(RSButtonMetro gerarAnual) {
      this.gerarAnual = gerarAnual;
   }

   public RSButtonMetro getGerarDiario() {
      return gerarDiario;
   }

   public void setGerarDiario(RSButtonMetro gerarDiario) {
      this.gerarDiario = gerarDiario;
   }

   public RSButtonMetro getGerarMensal() {
      return gerarMensal;
   }

   public void setGerarMensal(RSButtonMetro gerarMensal) {
      this.gerarMensal = gerarMensal;
   }

   public JPanel getGrafico_anual() {
      return grafico_anual;
   }

   public void setGrafico_anual(JPanel grafico_anual) {
      this.grafico_anual = grafico_anual;
   }

   public JPanel getGrafico_diario() {
      return grafico_diario;
   }

   public void setGrafico_diario(JPanel grafico_diario) {
      this.grafico_diario = grafico_diario;
   }

   public JPanel getGrafico_mensal() {
      return grafico_mensal;
   }

   public void setGrafico_mensal(JPanel grafico_mensal) {
      this.grafico_mensal = grafico_mensal;
   }

   public JCheckBox getjCheckBox1() {
      return jCheckBox1;
   }

   public void setjCheckBox1(JCheckBox jCheckBox1) {
      this.jCheckBox1 = jCheckBox1;
   }

   public JCheckBox getjCheckBox2() {
      return jCheckBox2;
   }

   public void setjCheckBox2(JCheckBox jCheckBox2) {
      this.jCheckBox2 = jCheckBox2;
   }

   public JCheckBox getjCheckBox3() {
      return jCheckBox3;
   }

   public void setjCheckBox3(JCheckBox jCheckBox3) {
      this.jCheckBox3 = jCheckBox3;
   }

   public JLabel getjLabel1() {
      return jLabel1;
   }

   public void setjLabel1(JLabel jLabel1) {
      this.jLabel1 = jLabel1;
   }

   public JLabel getjLabel13() {
      return jLabel13;
   }

   public void setjLabel13(JLabel jLabel13) {
      this.jLabel13 = jLabel13;
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

   public JLabel getjLabel5() {
      return jLabel5;
   }

   public void setjLabel5(JLabel jLabel5) {
      this.jLabel5 = jLabel5;
   }

   public JLabel getjLabel6() {
      return jLabel6;
   }

   public void setjLabel6(JLabel jLabel6) {
      this.jLabel6 = jLabel6;
   }

   public JLabel getjLabel8() {
      return jLabel8;
   }

   public void setjLabel8(JLabel jLabel8) {
      this.jLabel8 = jLabel8;
   }

   public JPanel getjPanel1() {
      return jPanel1;
   }

   public void setjPanel1(JPanel jPanel1) {
      this.jPanel1 = jPanel1;
   }

   public JPanel getjPanel10() {
      return jPanel10;
   }

   public void setjPanel10(JPanel jPanel10) {
      this.jPanel10 = jPanel10;
   }

   public JPanel getjPanel12() {
      return jPanel12;
   }

   public void setjPanel12(JPanel jPanel12) {
      this.jPanel12 = jPanel12;
   }

   public JPanel getjPanel13() {
      return jPanel13;
   }

   public void setjPanel13(JPanel jPanel13) {
      this.jPanel13 = jPanel13;
   }

   public JPanel getjPanel14() {
      return jPanel14;
   }

   public void setjPanel14(JPanel jPanel14) {
      this.jPanel14 = jPanel14;
   }

   public JPanel getjPanel15() {
      return jPanel15;
   }

   public void setjPanel15(JPanel jPanel15) {
      this.jPanel15 = jPanel15;
   }

   public JPanel getjPanel16() {
      return jPanel16;
   }

   public void setjPanel16(JPanel jPanel16) {
      this.jPanel16 = jPanel16;
   }

   public JPanel getjPanel18() {
      return jPanel18;
   }

   public void setjPanel18(JPanel jPanel18) {
      this.jPanel18 = jPanel18;
   }

   public JPanel getjPanel2() {
      return jPanel2;
   }

   public void setjPanel2(JPanel jPanel2) {
      this.jPanel2 = jPanel2;
   }

   public JPanel getjPanel25() {
      return jPanel25;
   }

   public void setjPanel25(JPanel jPanel25) {
      this.jPanel25 = jPanel25;
   }

   public JPanel getjPanel26() {
      return jPanel26;
   }

   public void setjPanel26(JPanel jPanel26) {
      this.jPanel26 = jPanel26;
   }

   public JPanel getjPanel27() {
      return jPanel27;
   }

   public void setjPanel27(JPanel jPanel27) {
      this.jPanel27 = jPanel27;
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

   public JPanel getjPanel8() {
      return jPanel8;
   }

   public void setjPanel8(JPanel jPanel8) {
      this.jPanel8 = jPanel8;
   }

   public JPanel getjPanel9() {
      return jPanel9;
   }

   public void setjPanel9(JPanel jPanel9) {
      this.jPanel9 = jPanel9;
   }

   public JTabbedPane getjTabbedPane1() {
      return jTabbedPane1;
   }

   public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
      this.jTabbedPane1 = jTabbedPane1;
   }

   public JPanel getPainel_equipamentos() {
      return painel_equipamentos;
   }

   public void setPainel_equipamentos(JPanel painel_equipamentos) {
      this.painel_equipamentos = painel_equipamentos;
   }

   public RSButtonMetro getSalvarPDF() {
      return salvarPDF;
   }

   public void setSalvarPDF(RSButtonMetro salvarPDF) {
      this.salvarPDF = salvarPDF;
   }

   public JMonthChooser getSelecao_mes() {
      return selecao_mes;
   }

   public void setSelecao_mes(JMonthChooser selecao_mes) {
      this.selecao_mes = selecao_mes;
   }















}
