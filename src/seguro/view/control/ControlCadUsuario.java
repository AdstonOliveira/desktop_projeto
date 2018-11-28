package seguro.view.control;
import seguro.model.Usuario;
import seguro.view.TelaPrincipal;
import seguro.view.secundarios.CadastroCliente;
/**
 * @author Adston at self
*/
public class ControlCadUsuario extends Control{
   private CadastroCliente view;
   
   public void setUsuario( Usuario user ){
  //    this.user = user;
   }
   
   
   @Override
   public void ModoTeste(){
      if( this.view == null ) 
         this.setView( new CadastroCliente() );
      
      this.view.setTitle( "Modo Teste" );
      
      this.view.getTextNome().setText( "Teste" );
      this.view.getTextNick().setText( "Teste" );
      this.view.getTextEmail().setText( "Teste" );
   }
   
   @Override
   public void ModoProducao(){
      if( this.view == null)
         this.setView( new CadastroCliente() );
      
      this.view.setTitle( "Cadastro de usuario: " + TelaPrincipal.usuario.getLogin() );
      this.montaCliente();
   }
   
   
   public void montaCliente(){
      if( this.view == null ) 
         this.view = new CadastroCliente();
      
      this.view.getTextNome().setText( TelaPrincipal.usuario.getNome() );
      this.view.gettextSobrenome().setText( TelaPrincipal.usuario.getSobrenome() );
      
      this.view.getTextNick().setText( TelaPrincipal.usuario.getLogin() );
      this.view.getTextEmail().setText( TelaPrincipal.usuario.getEmail() );
      
      this.view.getDtNasc().setDate( TelaPrincipal.usuario.getDt_nasc() );
   }

   public void exibir(){
      if( this.view == null )
         this.view = new CadastroCliente();
         
      TelaPrincipal.desktop.add( this.view );
      this.view.setVisible(true);
      
   }

   
   
   
   
   
   
   
   
   
   
   
  /* public Usuario getUser() {
      return user;
   }

   public void setUser(Usuario user) {
      this.user = user;
   }*/

   public CadastroCliente getView() {
      return view;
   }

   public void setView( CadastroCliente view ) {
      this.view = view;
   }

  



   
}
