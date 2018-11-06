package seguro.configuracoes;

import java.awt.Color;
import javax.swing.JButton;

/**
 * @author Adston at self
 */
public class ConfigBotao {

   private static Color btOK = new Color(0,139,139); 
   private static Color btCancela = new Color(204,51,0);
   
   private static Color entered = new Color(0,51,51);

   
   public static void btOK( JButton botao ){
      botao.setBorder( new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED) );
      botao.setBackground( btOK );
      botao.setForeground( Color.white );
   }
   public static void btCancela( JButton botao ){
      botao.setBorder( new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED) );
      botao.setBackground( btCancela );
      botao.setForeground( Color.white );
   }

   
   private static Color original;
   
   
   public static void evtEntered( JButton botao ){
      original = botao.getBackground();
      
      botao.setBackground( entered );
      botao.setForeground( Color.white );
   }
   
   public static void evtExited( JButton botao ){
      botao.setBackground(original);
   }
   
   public static void clicked( JButton botao ){
      botao.setBackground(Color.BLACK);
   }

   
}
