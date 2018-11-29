package seguro.view;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Adston at self
 */
public abstract class ValidadorCampos {
   
   
   public static boolean JTextVazio(JTextField[] avaliar){
      for( JTextField each : avaliar )
         
         if( each.getText().isEmpty() ){
            each.grabFocus();
            return true;
         }else
            each.setBackground(Color.WHITE);
      
      return false;
   }
   
   
   
   
   
   
   
   
}
