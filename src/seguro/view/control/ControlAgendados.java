package seguro.view.control;

import seguro.view.TelaPrincipal;
import seguro.view.secundarios.ViewAgendados;

/**
 * @author Adston at self
 */
public class ControlAgendados {

   private ViewAgendados view;
   
   public void ModoTeste(){
      this.view = new ViewAgendados();
   
   
   }

   public void exibir(){
      if( this.view == null)
         this.view = new ViewAgendados();
      
      TelaPrincipal.desktop.add(this.view);
      this.view.setVisible(true);
   
   }
   
   
   
   
   
   
   
   
   
   public ViewAgendados getView() {
      return view;
   }

   public void setView(ViewAgendados view) {
      this.view = view;
   }

   
   
   
   



   
}
