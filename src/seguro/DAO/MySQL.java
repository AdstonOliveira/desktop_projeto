package seguro.DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 * @author Adston at self
 */
public class MySQL {
   
   private Conexao conexao;
   
   public MySQL( Conexao conexao ){
      this.conexao = conexao;
   }
  
   public boolean executar_comando( String comando ){
      Connection conn = this.conexao.abrir();
      Statement stmt;
      
      if( conn != null ){
            try {
              //conn.setAutoCommit( true );
               stmt = conn.prepareStatement( comando );
               stmt.execute( comando );
               this.conexao.fechar();
            return true;
            
            } catch (SQLException ex) {
               this.msgErro( ex );
               this.conexao.fechar();
            return false;
            }
      }
      return false;
   }

public ResultSet pegarResultadoSQL( String SQL ) {
       Connection conn = this.conexao.abrir();
       ResultSet rs = null;
       Statement stmt;
       
            try {
               stmt = conn.createStatement();
               rs = stmt.executeQuery( SQL );
               //this.conexao.fechar();
               
            } catch (SQLException ex) {
              this.msgErro( ex );
            }
       
       return rs;
    }   
   
  public void msgErro(SQLException ex){
     JOptionPane.showMessageDialog( null, ex, "A Operação não pode ser realizada", 0 );
  }
   
}
