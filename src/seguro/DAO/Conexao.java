package seguro.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import seguro.configuracoes.Config;
/**
 *
 * @author root
 */
public final class Conexao {
   
   private Config config;
   private Connection conn;
    
    public Conexao( String IP, String Porta, String banco ){
       this.config = new Config( IP, Porta, banco );
    }
    public Conexao(){
       this.config = new Config();
    }
   
    
    // Conectar ao banco
    public Connection abrir() {
      try {
          Class.forName( this.config.getDRIVER() );
       } catch ( ClassNotFoundException ex ) {
          JOptionPane.showMessageDialog( null, "Não foi possivel estabelecer conexao", this.config.getURL(),0 );
       }
       
      try {
          conn = DriverManager.getConnection( this.getConfig().getURL(), this.getConfig().getUSUARIO(),this.getConfig().getSENHA() );
      return conn;
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog( null, "Servidor não respondeu", this.config.getURL(),0 );
      }
       return null;
    }
    
    public boolean fechar(){
       if( this.conn != null ){
          try {
             this.conn.close();
             return true;
          } catch ( SQLException ex ) {
             return false;
          }
       }
       return false;
    }

    

    
    
    public void setIP(String ip){
        this.config.setIpBanco(ip);
    }
    


   public Connection getConn() {
      return conn;
   }

   public void setConn(Connection conn) {
      this.conn = conn;
   }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }
}
