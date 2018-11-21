
package seguro;

import java.awt.AWTException;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import seguro.DAO.Conexao;
import seguro.view.ConfigBanco;
import seguro.view.TelaPrincipal;
import seguro.view.control.ControladoraClasses;
import seguro.view.login;

/**
 *
 * @author root
 */
public class Seguro {
   public static final Conexao conexao = new Conexao();
   public static final login login = new login(); 
   /**
     * @param args the command line arguments
     */
   
    public static void main( String[] args ) throws AWTException {
       Seguro.test( login );
       login.setVisible( true );
    }
    
    
    
    
    public static void testeConexaoInicial(){
       Seguro.test(login);
    }
    private void segundoPlano() throws AWTException{
       java.awt.SystemTray tray = java.awt.SystemTray.getSystemTray();
            
            java.awt.Image image = new javax.swing.ImageIcon("..//img//about.png").getImage(); //Pega a imagem...
            String tooltip = "Teste Icones";
            java.awt.PopupMenu menu = new java.awt.PopupMenu( "Pop Up" );
            
            java.awt.TrayIcon icon = new java.awt.TrayIcon( image, tooltip, menu );
            tray.add(icon);
            
      SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
      
       Date now = new Date();
       System.out.println( now.getTime() );
       System.out.println( formatador.format(now) );
    }
    
    public static void test( login view ){
       class Th extends Thread{
          public login view;
          
            public Th( login view ){
               this.view = view;
                this.start();
            }
            
               @Override
               public void run(){
                  if( Seguro.conexao.abrir() != null ){
                     view.getStatus().setText("Servidor disponível");
                     view.getStatus().setForeground( Color.GREEN );
                     view.getBtConecta().setEnabled(true);
                     view.getModo_teste().setEnabled(false);
                  }else{
                     view.getStatus().setText("Servidor indisponível");
                     view.getStatus().setForeground( Color.RED );
                     view.getBtConecta().setEnabled(false);
                     
                     int i = JOptionPane.showConfirmDialog(view, "Deseja inicializar o modo demonstração?",
                             "Modo demonstração?", 0);
                     
                             if( i == 0 ){
                                ControladoraClasses.modo_teste = true;
                                view.getBtConecta().setEnabled(true);
                                new TelaPrincipal().setVisible(true);
                                this.view.dispose();
                             }else{
                                int j = JOptionPane.showConfirmDialog(view,"Abrir Configurações?","Configurar?",0);
                                   if( j == 0 ) {
                                      ConfigBanco config = new ConfigBanco();
                                      config.defineConexao( Seguro.conexao );
                                      config.setVisible( true );
                                   }
                             }
                  }
               }
       }
       Th teste = new Th( view );
    }
}
