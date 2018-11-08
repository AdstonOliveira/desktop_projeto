
package seguro;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import seguro.view.login;

/**
 *
 * @author root
 */
public class Seguro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        login login = new login();
        login.setVisible( true );
    
            SystemTray tray = SystemTray.getSystemTray();
            Image image = new ImageIcon("..\\img\\about.png").getImage(); //Pega a imagem...
            String tooltip = "Teste";
            PopupMenu menu = new PopupMenu("Pop Up");
            TrayIcon icon = new TrayIcon(image, tooltip, menu);
            //tray.add(icon);
            
      SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");
      
      Date now = new Date();
       System.out.println(now.getTime());
       System.out.println(formatador.format(now));
    
    }
    
}
