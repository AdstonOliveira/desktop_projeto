package seguro.view.control;

import seguro.control.graficos.ControlGraficos;
import seguro.view.TelaPrincipal;

/**
 * @author Adston at self
*/
public abstract class ControladoraClasses {
  
   static ControlAgendamento control_agendamentos;
   static ControlCadDispos control_cad_dispositivos;
   static ControlCadUsuario control_cad_usuario;
   static ControlGerenciador control_gerenciador;
   
   static ControlGraficos control_graficos;
   
   
   
   public static void abrir( String classe ){
      String abrir = classe.toLowerCase();
         switch( abrir ){
            
            case "control_cad_usuario" :
               if( control_cad_usuario == null )
                  control_cad_usuario = new ControlCadUsuario();
                     
               if( control_cad_usuario.getUser() != null ){
                  control_cad_usuario.montaCliente();
                  TelaPrincipal.desktop.add( control_cad_usuario.getView() );
                  control_cad_usuario.getView().setVisible(true);
               }else{
                  //Modo Teste
                  control_cad_usuario.ModoTeste();
                  TelaPrincipal.desktop.add( control_cad_usuario.getView() );
                  control_cad_usuario.getView().setVisible( true );
               }
            break;
            case "control_cad_gerenciador":
               if( control_gerenciador == null )
                  control_gerenciador = new ControlGerenciador();
               
               if( control_gerenciador.getView() != null ){
                  
               }
               
               
               
               
               
               
            default:
               System.out.println("Sem execução");
               break;
                  
         }
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
