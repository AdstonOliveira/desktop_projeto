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
      //return this.view;
   public abstract JInternalFrame getView();
   public abstract void ModoTeste();
   public abstract void ModoProducao();
   
   public void exibir( JInternalFrame view ){
      TelaPrincipal.desktop.add( view);
      view.setVisible( true );
   }
   
}
