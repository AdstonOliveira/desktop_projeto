package seguro.control.graficos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import seguro.configuracoes.PreencheAleatorio;
import seguro.view.control.ControladoraClasses;
import seguro.view.graficos.GraficosMultiplos;

/**
 * @author Adston at self
 */
public class ControlGraficos{
   
   //private Graficos view;
   private GeradorGrafico graficos;
   private GraficosMultiplos view;
   private boolean modoTeste = true;
   
   public ControlGraficos() {
      this.graficos = new GeradorGrafico();
      this.iniciar();
   }
   
   public boolean iniciar(){
      if( this.view == null ){
         this.view = new GraficosMultiplos();
         
         this.view.setControl(this);
      }
      
      return this.view != null;
   }
   
   public void modoTeste(){
      this.modoTeste = true;
   }
   
   
   
   
   
   
   public boolean validaRange(){
      float inicio = this.view.getDt_inicial().getDate().getTime();
      float fim = this.view.getDt_final().getDate().getTime();

      if( inicio == fim )
         return true;

      if( inicio < fim ){
         if(  numDias(inicio, fim) > 15 ){
            JOptionPane.showMessageDialog( this.view, "Período muito longo", "Faixa de dias longa", 0 );
            return false;

         }else
            return true;
            
      }else
         JOptionPane.showMessageDialog( this.view, "O período final não pode ser menor que o inicial", "Erro na faixa",0);
            
      return false;
   }
   
   public int numDias( float inicio, float fim ){
      SimpleDateFormat formatador = new SimpleDateFormat("dd");
      int result = Integer.valueOf( formatador.format(fim-inicio) );
      return result;
   }
   
   public boolean gerarDiario() throws IOException{
      JPanel chart;
      
      if( this.cor_data() && validaRange() ){
         if( !ControladoraClasses.modo_teste ){ // Implementar funcional
            chart = GeradorGrafico.teste( 6 ); // criar sql com conexao ao banco
            this.adicionarGrafico( chart, this.view.getGrafico_diario() );
         }else{
            int range = this.numDias( this.view.getDt_inicial().getDate().getTime(), this.view.getDt_final().getDate().getTime() );
            chart = PreencheAleatorio.lerArquivo( PreencheAleatorio.randDia, "Modo Teste", "Diário", range);
            this.adicionarGrafico( chart, this.view.getGrafico_diario() );
         }
      }
      
      return true;
      
   }
   
   
   
   
   
   
   
   
   public void adicionarGrafico( JPanel chart, JPanel fundo ){
      fundo.removeAll();
      fundo.updateUI();
      chart.setSize( this.view.getGrafico_diario().getSize() );
      chart.setBorder( this.view.getGrafico_diario().getBorder() );
      fundo.setLayout( new BorderLayout() );
      fundo.add( chart, BorderLayout.CENTER );
      fundo.updateUI();
   }
   
   
   
   
   /*
   public void abrirMultiplos(){
      
      if( this.viewMultiplos == null ){
         this.viewMultiplos = new GraficosMultiplos();
         TelaPrincipal.desktop.add( this.viewMultiplos );
         this.viewMultiplos.setVisible(true);
      }else{
         TelaPrincipal.desktop.add( this.viewMultiplos );
         this.viewMultiplos.setVisible(true);
      }
   }
   
   */
   public boolean cor_data(){
      
      if( this.view.getDt_inicial().getDate() == null ){
         this.view.getDt_inicial().setBackground( Color.RED );
         return false;
      }else
         this.view.getDt_inicial().setBackground(Color.BLACK);
         
      if( this.view.getDt_final().getDate() == null ){
         this.view.getDt_final().setBackground(Color.RED);
         return false;
      }else
         this.view.getDt_final().setBackground(Color.BLACK);
         
      return true;
   }
   
   
   
   
   
   
   
   /*
   public Graficos getGraficos() {
      return view;
   }

   public void setGraficos(Graficos graficos) {
      this.view = graficos;
   }
   */

   public GeradorGrafico getGraficos() {
      return graficos;
   }

   public void setGraficos(GeradorGrafico graficos) {
      this.graficos = graficos;
   }

   public GraficosMultiplos getView() {
      return view;
   }

   public void setView(GraficosMultiplos view) {
      this.view = view;
   }
   
   
   
   





   
}
