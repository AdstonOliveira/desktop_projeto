package seguro.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import seguro.model.Usuario;

/**
 * @author Adston at self
 */
public class DAOUsuario extends Conexao{
   
   
   public Usuario montar( Usuario montar, ResultSet dados ) throws SQLException{

      if( dados != null ){
             while( dados.next() ){
                 montar.setId( dados.getInt("id") ) ;
                 montar.setNome( dados.getString("nome") );
                 montar.setDt_nasc(dados.getDate("dt_nasc") );
                 montar.setDt_cadastro( dados.getDate("dt_cadastro") );
                 montar.setEmail( dados.getString("email") );
                 montar.setLogin( dados.getString("login") );
                 montar.setSenha( dados.getString("senha") );
             }
             return montar;
        }
     return null;
    }
      
      
   public boolean Login( Usuario montar, String SQL ) throws SQLException{
      this.montar( montar, this.comandos.pegarResultadoSQL(SQL) );
      
    return ( (montar.getNome() != null ) && (!montar.getNome().equalsIgnoreCase("") ) );
   }
   
   
   
   
   
   
   
   
}
