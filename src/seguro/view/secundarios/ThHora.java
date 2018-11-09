package seguro.view.secundarios;

import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Adston at self
*/
public class ThHora extends Thread{
   
   public ThHora(){
     
   }
   

   @Override
   public void run(){
      boolean roda = true;
      
      while(roda){
         Date compare = new Date();
         if( compare.getTime() > Agendamento.dMin.getTime()-500 
                 && compare.getTime() < Agendamento.dMin.getTime()+500 ){
            try {
               Runtime.getRuntime().exec( "shutdown -s -t 30" );
              
               try {
                  Thread.sleep(4000);
                  Runtime.getRuntime().exec("shutdown -a");
               } catch (InterruptedException ex) {
                  Logger.getLogger(ThHora.class.getName()).log(Level.SEVERE, null, ex);
               }
               
            } catch (IOException ex) {
               Logger.getLogger(ThHora.class.getName()).log(Level.SEVERE, null, ex);
            }
            roda = false;
         }
      }
      
   }




   
}
