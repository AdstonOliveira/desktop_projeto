package seguro.view.control;
import seguro.view.TelaPrincipal;
/**
 * @author Adston at self
 */
public class ControlTelaInicial {
   private ControlCadUsuario cad_cliente;
   
   public void cad_cliente(){
      if( cad_cliente == null ){
         this.cad_cliente = new ControlCadUsuario();
      
         this.cad_cliente.setUsuario( TelaPrincipal.usuario );
         this.cad_cliente.montaCliente();
         this.cad_cliente.abreCliente();
      
      }else
         this.cad_cliente.abreCliente();
      
   }
   
   


   
}
