package seguro.view.control;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import seguro.control.graficos.ControlGraficos;
import seguro.control.graficos.ControlTotais;
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
   static ControlTotais control_totais;
   static ControlAgendados control_agendados;
   static ControlAgendamento control_agendamento;
   
   public static boolean modo_teste = false;
   
   
   public static void abrir( String classe ){
      String abrir = classe.toLowerCase();
         
      switch( abrir ){
         case "control_cad_usuario" :
            if( control_cad_usuario == null )
               control_cad_usuario = new ControlCadUsuario();
                     
            if( !modo_teste ){
               control_cad_usuario.montaCliente();
                  
               if( !checaAberta( control_cad_usuario.getView()) )
                  control_cad_usuario.exibir();
               
            }else{
               control_cad_usuario.ModoTeste();
               if( !checaAberta(control_cad_usuario.getView()) )
                  control_cad_usuario.exibir();
            }
         break;
            
            case "control_cad_gerenciador":
               if( control_gerenciador == null )
                  control_gerenciador = new ControlGerenciador();
               
               if( !modo_teste ){
                  control_gerenciador.montaDispositivo();
                  if( !checaAberta(control_gerenciador.getView()) )
                     control_gerenciador.exibir();
                  
               }else{
                  control_gerenciador.ModoTeste();
                  if( !checaAberta( control_gerenciador.getView() ) )
                     control_gerenciador.exibir();
               }
            break;
            
            case "control_graficos":
               if( control_graficos == null )
                  control_graficos = new ControlGraficos();
               
               if( modo_teste ){
                  
                  if( control_graficos.getView() != null){
                     if( !checaAberta( control_graficos.getView() ) ){
                        TelaPrincipal.desktop.add( control_graficos.getView() );
                        control_graficos.getView().setVisible(true);
                     }
                  }
               }else{
                  control_graficos.modoTeste();
                  if( !checaAberta( control_graficos.getView()) )
                     control_graficos.getView().setVisible(true);
               }
               //ADICIONAR CONDICIONAL
            break;
            case "control_totais" :
               if(control_totais == null)
                  control_totais = new ControlTotais();
               
               if( modo_teste )
                  control_totais.ModoTeste();
                     
                  if( control_totais.getView() != null )
                     if( !checaAberta( control_totais.getView() ) )
                        control_totais.exibir();
            break;      
            case "control_agendados" :
               if(control_agendados == null)
                  control_agendados = new ControlAgendados();
               
               if( modo_teste )
                  control_agendados.ModoTeste();
               else{
                  control_agendados.ModoProducao();
                  abrir(control_agendados);
               }
               /*if( control_agendados.getView() != null )
                  if( !checaAberta( control_agendados.getView()) )
                     control_agendados.exibir();*/
            break;
            case "control_cad_dispositivos" :
               if(control_cad_dispositivos == null)
                  control_cad_dispositivos = new ControlCadDispos();
               
               if( modo_teste )
                  control_cad_dispositivos.ModoTeste();
               
               if( control_cad_dispositivos.getView() != null)
                  if( !checaAberta( control_cad_dispositivos.getView() ) )
                  control_cad_dispositivos.exibir();
            break;      
            case "control_agendamento" :
               if(control_agendamento == null)
                  control_agendamento = new ControlAgendamento();

               if( modo_teste ){   
                  control_agendamento.ModoTeste();
                  abrir(control_agendamento);
               }else{
                  control_agendamento.ModoProducao();
                  abrir(control_agendamento);
               }
            break;
            default:
               System.out.println("Sem execução");
               break;
                  
         }
   }
   
   public static boolean checaAberta( JInternalFrame checar ){
      for( JInternalFrame each : TelaPrincipal.desktop.getAllFrames() )
         
         if( each.equals( checar ) ){
            JOptionPane.showMessageDialog( TelaPrincipal.desktop, "A janela já esta aberta" );
            checar.moveToFront();
            return true;
         }
      
      return false;
   }
   
   
   
   public static boolean abrir( Control control ){// implementar
      if( control.getView() != null )
         if( !checaAberta( control.getView() ) ){
            control.exibir( control.getView() );
            return true;
         }
      
      return false;
   }
   
   
   
   
   
   
   
   
   
   
   
}
