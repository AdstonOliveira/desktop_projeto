package seguro.control.graficos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import seguro.view.TelaPrincipal;
import seguro.view.graficos.GraficosMultiplos;

/**
 * @author Adston at self
 */
public class ControlGraficos{
   
   //private Graficos view;
   private GeradorGrafico graficos;
   private GraficosMultiplos view;

   public ControlGraficos() {
      this.graficos = new GeradorGrafico();
   }
   
   public boolean abrir(){
      if( this.view == null ){
         this.view = new GraficosMultiplos();
         this.view.setControl(this);
      }
      
      TelaPrincipal.desktop.add( view );
      this.view.setVisible(true);
         
      return this.view != null;
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
   
   public boolean gerarDiario(){
      if( validaRange() ){
         JPanel chart = GeradorGrafico.teste(6 ); // criar sql com conexao ao banco
         chart.setSize( this.view.getGrafico_diario().getSize() );
         chart.setBorder( this.view.getGrafico_diario().getBorder() );
         this.view.getGrafico_diario().setLayout( new BorderLayout() );
         this.view.getGrafico_diario().add( chart, BorderLayout.CENTER );
         this.view.getGrafico_diario().updateUI();
            
      }
      
      return true;
      
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
   
   
   public void cor_data(){
      
      if( this.view.dtIni_pnDia.getDate() == null )
         this.dtIni_pnDia.setBackground(Color.RED);
      else
         this.dtIni_pnDia.setBackground(Color.BLACK);
         
      if( this.dtFim_pnDia.getDate() == null )
         this.dtFim_pnDia.setBackground(Color.RED);
      else
         this.dtFim_pnDia.setBackground(Color.BLACK);
         
   }
   
   */
   
   
   
   
   
   /*
   public Graficos getGraficos() {
      return view;
   }

   public void setGraficos(Graficos graficos) {
      this.view = graficos;
   }
   */
   
   
   
   





   
}
