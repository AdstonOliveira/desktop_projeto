package seguro.view.control;

import java.io.IOException;
import java.util.Scanner;
import seguro.DAO.Conexao;
import seguro.model.Usuario;
import seguro.view.TelaPrincipal;

/**
 * @author Adston at self
 */
public class ControlLogin {
   private Usuario user;
   
   public boolean Login( Conexao conexao, String[] dadosLogin ){
      String SQL = "select * from usuario where login = '" + dadosLogin[0] + "' and senha = '" + dadosLogin[1] + "';";
      this.user = new Usuario( dadosLogin[1], dadosLogin[0] );
      
      if( this.user.Login( conexao, SQL ) ){
         TelaPrincipal.conexao = conexao;
         TelaPrincipal.usuario = this.user;
         return true;
      }else
         return false;
   }


   public void testePing() throws IOException{
      
      Scanner scanner = new Scanner( Runtime.getRuntime().exec("cmd /c ping localhost").getInputStream());
   }
/*
   public static void main(String[] args) throws IOException {
      /* FUNCIONANDO   http://www.guj.com.br/t/pingando-em-java/112337/4       
      String ip = "www.iwts.com.br";
	String resposta="";
		Scanner scanner = new Scanner( Runtime.getRuntime().exec("cmd /c ping " + ip).getInputStream() );
		while(scanner.hasNextLine()){
			resposta += scanner.nextLine() + "\n";
		}	
		System.out.print(resposta);
      
   }*/





   
}
