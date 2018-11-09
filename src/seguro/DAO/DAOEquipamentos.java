package seguro.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 * @author Adston at self
 */
public class DAOEquipamentos extends DAO{
   public DAOEquipamentos(){
      super.setConexao(super.conexao);
   }
   
   public DAOEquipamentos( Conexao conexao ){
      super.setConexao(conexao);
   }
   
   public ArrayList<String> listaCadastrados( String SQL ) throws SQLException{
      ArrayList<String> equips = null;
      ResultSet rs = this.getComandos().pegarResultadoSQL( SQL );

         if( rs.next() )
            equips.add( rs.getString("modelo") );
         
         return equips;
   }

   public static void main(String[] args) {
      Conexao conn = new Conexao("192.168.0.237","3306","gerenciador");
      System.out.println(conn.getConfig().getDRIVER());
      System.out.println(conn.getConfig().getURL());
      
      DAOEquipamentos d = new DAOEquipamentos(conn);
      System.out.println(d.conexao.getConfig().getDRIVER());
      System.out.println(d.conexao.getConfig().getURL());
   }
   
   
}
