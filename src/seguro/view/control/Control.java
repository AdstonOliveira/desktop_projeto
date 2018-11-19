package seguro.view.control;
import javax.swing.JInternalFrame;
import seguro.view.TelaPrincipal;
/**
 * @author Adston at self
 */
public abstract class Control {
   protected JInternalFrame view;
   
   public void abrir(){
      if( this.view != null ){
         TelaPrincipal.desktop.add(this.view);
         this.view.setVisible(true);
      }
   }
   
   public void setView( JInternalFrame view ){
      this.view = view;
   }
   
   public JInternalFrame getView(){
      return this.view;
   }
   
}
