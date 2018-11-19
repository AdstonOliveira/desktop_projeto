package seguro.view.control;
import seguro.model.Usuario;
import seguro.view.TelaPrincipal;
import seguro.view.secundarios.CadastroCliente;
/**
 * @author Adston at self
*/
public class ControlCadUsuario {
   private Usuario user;
   private CadastroCliente view;
   
   
   public void setUsuario( Usuario user ){
      this.user = user;
      
   }
   public void ModoTeste(){
      if( this.view == null ) 
         this.view = new CadastroCliente();

      this.view.setTitle("Modo Teste");
   }
   
   
   
   public void montaCliente(){
      if( this.view == null ) 
         this.view = new CadastroCliente();
      
      this.view.getTextNome().setText( this.user.getNome() );
      this.view.getTextNick().setText( this.user.getLogin() );
      this.view.getTextEmail().setText( this.user.getEmail() );
      
      this.view.getDtNasc().setDate( this.user.getDt_nasc() );
   }

   public void abreCliente(){
      if( this.view != null ){
         TelaPrincipal.desktop.add( this.view );
        this.view.setVisible(true);

      }else{
         this.view = new CadastroCliente();
         TelaPrincipal.desktop.add( this.view );
         this.view.setVisible(true);
      }
   }

   public Usuario getUser() {
      return user;
   }

   public void setUser(Usuario user) {
      this.user = user;
   }

   public CadastroCliente getView() {
      return view;
   }

   public void setView(CadastroCliente view) {
      this.view = view;
   }



   
}
