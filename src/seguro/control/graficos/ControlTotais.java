package seguro.control.graficos;
import seguro.view.TelaPrincipal;
import seguro.view.graficos.Totais;
/**
 * @author Adston at self
*/
public class ControlTotais {
   private Totais view;
   
   
   public void ModoTeste(){
      if( this.view == null )
         this.view = new Totais();
      
      this.view.modo_teste();
   }
   
   public void exibir(){
      if( this.view == null )
         this.view = new Totais();
         
      TelaPrincipal.desktop.add( this.view );
      this.view.setVisible(true);
   }

   public Totais getView() {
      return view;
   }

   public void setView(Totais view) {
      this.view = view;
   }
   
   

   public void iniciar(){
      
   }
   
   


   
}
