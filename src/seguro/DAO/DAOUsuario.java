package seguro.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import seguro.model.Usuario;

/**
 * @author Adston at self
 */
public class DAOUsuario extends DAO{
   
   public DAOUsuario( ){
      super.setConexao( conexao );
   }
   
   public boolean update( Usuario alterar ){
       String SQL = "update usuario set nome = '" + alterar.getNome() + "', sobrenome = '" + alterar.getSobrenome() 
               + "', login = '" + alterar.getLogin() + "', dtnasc = '" + alterar.getDt_nasc() + "', email = '" + alterar.getEmail() + 
               "' where id = " + alterar.getId();

    return this.comandos.executar_comando(SQL);
   }
   
   
   
   
   public Usuario montar( Usuario montar, ResultSet dados ) throws SQLException{
      
      if( dados.next() ){
         if( montar.getSenha().equals( dados.getString("senha") ) ){

            montar.setId( dados.getInt("id") ) ;
            
            montar.setNome( dados.getString("nome") );
            montar.setSobrenome( dados.getString("sobrenome") );
            
            montar.setDt_nasc( dados.getDate("dt_nasc") );
            montar.setDt_cadastro( dados.getDate("dt_cadastro") );
            
            montar.setEmail( dados.getString("email") );
            
         }
         return montar;
        }
      
     return null;
    }
      
      
   public boolean Login( Usuario montar, String SQL ) throws SQLException{
      this.montar( montar, super.getComandos().pegarResultadoSQL( SQL ) );
      
    return ( montar.getNome() != null ) ;
   }
   
   
   
   public boolean novoCadastro( String SQL ){
       return super.comandos.executar_comando( SQL );
   }
   
   
   
   
   
   
}