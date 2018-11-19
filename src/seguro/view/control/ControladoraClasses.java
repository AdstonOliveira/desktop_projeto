package seguro.view.control;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
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
   private static int posicao = 1;
   
   
   public static void abrir( String classe ){
      String abrir = classe.toLowerCase();
         switch( abrir ){
            
            case "control_cad_usuario" :
               if( control_cad_usuario == null )//{
                  control_cad_usuario = new ControlCadUsuario();
                     
               if( control_cad_usuario.getUser() != null ){
                  control_cad_usuario.montaCliente();
                  TelaPrincipal.desktop.add( control_cad_usuario.getView() );
                  control_cad_usuario.getView().setVisible( true );
               }else{
                  control_cad_usuario.ModoTeste();
                  
                  if( !checaAberta(control_cad_usuario.getView()) ){
                     TelaPrincipal.desktop.add( control_cad_usuario.getView() );
                     control_cad_usuario.getView().setVisible( true );
                  }
               }
            break;
            
            case "control_cad_gerenciador":
               if( control_gerenciador == null )
                  control_gerenciador = new ControlGerenciador();
               
               if( control_gerenciador.getView() != null ){
                  
                  if( !checaAberta( control_gerenciador.getView() ) ){
                     control_gerenciador.montaDispositivo();
                     TelaPrincipal.desktop.add( control_gerenciador.getView() );
                     control_gerenciador.getView().setVisible(true);
                  }
                  
               }else{
                  control_cad_usuario.ModoTeste();
                  
                  if( !checaAberta( control_gerenciador.getView() ) ){
                     TelaPrincipal.desktop.add( control_gerenciador.getView() );
                     control_gerenciador.getView().setVisible( true );
                  }
               }
            break;
            
            case "control_graficos":
               if( control_graficos == null )
                  control_graficos = new ControlGraficos();
               
               if( control_graficos.getView() != null){
                  control_graficos.iniciar();
                  if( !checaAberta(control_graficos.getView()) ){
                     TelaPrincipal.desktop.add( control_graficos.getView() );
                     control_graficos.getView().setVisible(true);
                  }
               }
               //ADICIONAR CONDICIONAL
            break;   
                  
               
               
               
               
               
               
            default:
               System.out.println("Sem execução");
               break;
                  
         }
   }
   
   
   public static boolean checaAberta(JInternalFrame checar){
      for( JInternalFrame each : TelaPrincipal.desktop.getAllFrames() )
         
         if( each.equals( checar ) ){
            JOptionPane.showMessageDialog(TelaPrincipal.desktop, "A janela já esta aberta");
            checar.moveToFront();
            return true;
         }
      
      return false;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
}
