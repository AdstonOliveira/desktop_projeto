
package seguro;

import java.awt.AWTException;
import java.awt.Color;
import seguro.DAO.Conexao;
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
      // login login = new login();
       test( login );
       login.setVisible( true );
       
    /*
            SystemTray tray = SystemTray.getSystemTray();
            
            Image image = new ImageIcon("..//img//about.png").getImage(); //Pega a imagem...
            String tooltip = "Teste Icones";
            PopupMenu menu = new PopupMenu( "Pop Up" );
            
            TrayIcon icon = new TrayIcon( image, tooltip, menu );
            tray.add(icon);
            
      SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
      
      Date now = new Date();
       System.out.println( now.getTime() );
       System.out.println( formatador.format(now) );
    */
    }
    public static void testeConexaoInicial(){
       Seguro.test(login);
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
                  }else{
                     view.getStatus().setText("Servidor indisponível");
                     view.getStatus().setForeground( Color.RED );
                     view.getBtConecta().setEnabled(false);
                  }
                     
               }
       }
       Th teste = new Th( view );
    }
}
