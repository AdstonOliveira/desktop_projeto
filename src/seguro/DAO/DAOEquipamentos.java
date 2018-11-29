package seguro.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import seguro.model.Equipamento;
/**
 * @author Adston at self
 */
public class DAOEquipamentos extends DAO{
   
   public DAOEquipamentos(){
      super.setConexao( super.conexao );
      this.tabela = "equipamento";
   }
   
   public DAOEquipamentos( Conexao conexao ){
      super.setConexao(conexao);
      this.tabela = "equipamento";
   }
   
   public ArrayList<String> listaCadastrados( String SQL ) throws SQLException{
      ArrayList<String> equips = null;
      ResultSet rs = this.getComandos().pegarResultadoSQL( SQL );

         while( rs.next() )
            equips.add( rs.getString("modelo") );
         
         return equips;
   }

 /*  public static void main(String[] args) {
      Conexao conn = new Conexao("192.168.0.237","3306","gerenciador");
      System.out.println(conn.getConfig().getDRIVER());
      System.out.println(conn.getConfig().getURL());
      
      DAOEquipamentos d = new DAOEquipamentos(conn);
      System.out.println(d.conexao.getConfig().getDRIVER());
      System.out.println(d.conexao.getConfig().getURL());
   }
   */
   public ArrayList<Equipamento> listaCadastrados(){
      String SQL = "select * from equipamento;";
      ResultSet rs = this.getComandos().pegarResultadoSQL(SQL);
      ArrayList<Equipamento> list = new ArrayList<>();
      try {
         while( rs.next() ){
            Equipamento e = new Equipamento();
            
               e.setId(rs.getInt("id"));
               e.setModelo(rs.getString("modelo"));
               e.setTipo(rs.getInt("tipo"));
               e.setGerenciador(rs.getInt("gerenciador_id"));
               e.setPotencia(rs.getFloat("watts_potencia"));
               e.setDescricao(rs.getString("descricao"));
               e.setStatus(rs.getString("status"));
            
           list.add(e);
         }
         rs.close();
      } catch (SQLException ex) {
         Logger.getLogger(DAOEquipamentos.class.getName()).log(Level.SEVERE, null, ex);
      }
      if( list.isEmpty() )
         list.add( new Equipamento(true) );
      
      return list;
   }

   public ArrayList<String> lista_tipo(){
      ArrayList<String> tipos = new ArrayList();
      ResultSet rs = this.comandos.pegarResultadoSQL("select id,nome from categoria_equipamento;");
      
      try {
         while( rs.next() )
            tipos.add(rs.getInt("id") + "-" + rs.getString("nome"));

         rs.close();
         } catch (SQLException ex) {
         Logger.getLogger(DAOEquipamentos.class.getName()).log(Level.SEVERE, null, ex);
      }
      if(tipos.isEmpty())
         tipos.add("Sem tipos cadastrados");
      
      return tipos;
   }
   public ArrayList<String> lista_gerenciador(){
      ArrayList<String> gerenciador = new ArrayList();
      ResultSet rs = this.comandos.pegarResultadoSQL("select id, descricao from gerenciador;");
      
      try {
         while( rs.next() )
            gerenciador.add(rs.getInt("id") + "-" + rs.getString("descricao"));

         rs.close();
         } catch (SQLException ex) {
         Logger.getLogger(DAOEquipamentos.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      if( gerenciador.isEmpty() )
         gerenciador.add("Sem gerenciadores cadastrados");
      
      return gerenciador;
   }






   
}
