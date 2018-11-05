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
public class Conexao {
    private Config config;
    private Connection conn;
    protected MySQL comandos;
    
    public Conexao( String IP, String Porta, String banco ){
       this.config = new Config( IP, Porta, banco );
       this.comandos = new MySQL( this );
    }
   
    public Conexao(){
       this.config = new Config();
       this.comandos = new MySQL( this );
    }
   
    
    // Conectar ao banco
    public Connection abrir() {
        System.out.println("Abrir");
       try {
          Class.forName( this.config.getDRIVER() );
          JOptionPane.showMessageDialog(null, this.config.getDRIVER());
       } catch (ClassNotFoundException ex) {
          JOptionPane.showMessageDialog( null, ex,"1",0 );
       }
       try {
          conn = DriverManager.getConnection( this.config.getURL(), this.config.getUSUARIO(), this.config.getSENHA() );
          JOptionPane.showMessageDialog(null,this.config.getURL());
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog( null,ex,"2",0 );
       }
       
      return conn;
    }
    
    public boolean fechar(){
        System.out.println("Fechar");
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
    
   public MySQL getComandos() {
      return comandos;
   }

   public void setComandos(MySQL comandos) {
      this.comandos = comandos;
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
