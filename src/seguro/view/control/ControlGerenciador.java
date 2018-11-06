package seguro.view.control;
import seguro.view.secundarios.Gerenciador;
/**
 * @author Adston at self
 */
public class ControlGerenciador extends Control{
   private Gerenciador view;

   public ControlGerenciador(){
      this.setView();
   }
   

   public void setView(){
      this.setView( new Gerenciador() );
   }
   

   
   

   
}
