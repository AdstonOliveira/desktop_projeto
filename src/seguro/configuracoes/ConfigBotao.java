package seguro.configuracoes;

import java.awt.Color;
import javax.swing.JButton;

/**
 * @author Adston at self
 */
public class ConfigBotao {

   private static Color btOK = new Color( 0,204,51 ); 
   private static Color btCancela = new Color( 204,51,0 );
   static Color original;
   
   private static Color entered = new Color( 0,51,51 );

   
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

   
   
   
   
   public static void evtEntered( JButton botao ){
      original = botao.getBackground();
      
      botao.setBackground( entered );
      botao.setForeground( Color.white );
   }
   
   public static void evtExited( JButton botao ){
      String[] positivo = new String[]{"Salvar","Configurar","Conectar","OK","Gravar","Agendar","gerar","adicionar"};
      String[] negativo = new String[]{"cancelar","excluir","excluir agendamento"};
      
      for(String color : negativo)
         if( botao.getText().equalsIgnoreCase(color) )
            botao.setBackground( ConfigBotao.btCancela );
      
      for(String color : positivo)
         if( botao.getText().equalsIgnoreCase(color))
            botao.setBackground( ConfigBotao.btOK );
   }
   
   
   
   public static void clicked( JButton botao ){
      botao.setBackground( Color.BLACK );
   }

   
}
