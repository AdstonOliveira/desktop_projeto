package seguro;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * @author Adston at self
*/
public class ConfigurarServidor {
   private String config_bd = ".\\config_db.txt";
   private BufferedReader br;
   private BufferedWriter bw;
   
   
   public boolean config_inicial(){

      File file = new File(config_bd);
      String padrao = "localhost;3306;gerenciador;root; ";
      
         if( !file.exists() ){
            try {
               file.createNewFile();
               this.bw = new BufferedWriter( new FileWriter(file,true) );
               this.bw.append(padrao);
               this.bw.close();
               
            } catch (IOException ex) {
               JOptionPane.showMessageDialog( null, ex );
               return false;
            }
         }
         
      String[] linha;
      try {
         this.br = new BufferedReader( new FileReader(file) );
            try {
               linha = br.readLine().split(";");
               br.close();
            } catch (IOException ex) {
               linha = padrao.split(";");
            }
      
            Seguro.conexao.getConfig().setIpBanco( linha[0] );
            Seguro.conexao.getConfig().setPorta(linha[1]);
            Seguro.conexao.getConfig().setNome_banco(linha[2]);
            Seguro.conexao.getConfig().setUSUARIO(linha[3]);
            Seguro.conexao.getConfig().setSENHA( linha[4] );
            Seguro.conexao.getConfig().defineURL();
         
      } catch (FileNotFoundException ex) {
         JOptionPane.showMessageDialog(null,ex,"Configure o banco manualmente",0);
         return false;
      }
         return true;
   }


   public boolean novaConfig( String valores ){
      File file = new File(config_bd);
         try {
            file.createNewFile();
               
            this.bw = new BufferedWriter( new FileWriter(file) );
            this.bw.append(valores);
            this.bw.close();
            return true;
         } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
         }
   }









   
}
