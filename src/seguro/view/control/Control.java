package seguro.view.control;
import javax.swing.JInternalFrame;
import seguro.view.TelaPrincipal;
/**
 * @author Adston at self
 */
public abstract class Control {
   protected JInternalFrame view;
   
   public void setView( JInternalFrame view ){
      this.view = view;
   }
   
   public JInternalFrame getView(){
      return this.view;
   }
   
   public void ModoTeste(){
      if( this.getView() != null )
         this.getView().setTitle("Modo Teste");
         
   }
   
}
