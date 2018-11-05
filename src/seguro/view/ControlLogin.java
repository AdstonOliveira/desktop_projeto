package seguro.view;

import seguro.DAO.Conexao;
import seguro.model.Usuario;

/**
 * @author Adston at self
 */
public class ControlLogin {

   Usuario user = new Usuario();

   public boolean Login( Conexao conexao, String[] dadosLogin ){
      String SQL = "select * from usuario where login = " + dadosLogin[0] + " and senha = " + dadosLogin[1] + " ;";
      return this.user.Login(SQL);
      
   }









   
}
