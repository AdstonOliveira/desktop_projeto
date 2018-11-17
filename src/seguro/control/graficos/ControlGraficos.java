package seguro.control.graficos;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import seguro.view.TelaPrincipal;
import seguro.view.graficos.Graficos;

/**
 * @author Adston at self
 */
public class ControlGraficos{
   
   private Graficos view;
   private GeradorGrafico graficos;

   public ControlGraficos() {
      this.graficos = new GeradorGrafico();
   }
   
   public boolean abrir(){
      if( this.view == null ){
         this.view = new Graficos();
         this.view.setControl(this);
      }
      
      TelaPrincipal.desktop.add( view );
      this.view.setVisible(true);
         
      return this.view != null;
   }
   
   public boolean validaDiario(){
      float inicio = this.view.getDtIni_pnDia().getDate().getTime();
      float fim = this.view.getDtFim_pnDia().getDate().getTime();

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
      if( validaDiario() ){
         JPanel chart = GeradorGrafico.teste( 6 );
         chart.setSize( this.view.getGrafico_diario().getSize() );
         chart.setBorder( this.view.getGrafico_diario().getBorder() );
         this.view.getGrafico_diario().setLayout( new BorderLayout() );
         this.view.getGrafico_diario().add( chart, BorderLayout.CENTER );
         
            
      }
      
      
      
      return true;
      
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   public Graficos getGraficos() {
      return view;
   }

   public void setGraficos(Graficos graficos) {
      this.view = graficos;
   }
   
   
   
   
   





   
}
