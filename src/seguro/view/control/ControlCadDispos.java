package seguro.view.control;

import seguro.view.TelaPrincipal;
import seguro.view.secundarios.CadastroEquipamento;

/**
 * @author Adston at self
*/
public class ControlCadDispos {
   private CadastroEquipamento view;
   
   public void ModoTeste(){
   
      if( view == null )
         this.view = new CadastroEquipamento(); 
      
   }
   
   public void exibir(){
      if( this.view == null)
         this.view = new CadastroEquipamento();
      
      TelaPrincipal.desktop.add(this.view);
      this.view.setVisible(true);
   
   }

   public CadastroEquipamento getView() {
      return view;
   }

   public void setView(CadastroEquipamento view) {
      this.view = view;
   }
   
   
   
   
   
}
