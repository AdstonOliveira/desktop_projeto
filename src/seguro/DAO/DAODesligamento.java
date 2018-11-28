package seguro.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import seguro.model.Desligamento;

/**
 *
 * @author Adston at self
 */
public class DAODesligamento extends DAO{

   public DAODesligamento() {
      super.setConexao(super.conexao);
   }
   public DAODesligamento( Conexao conexao ) {
      super.setConexao(conexao);
   }
   
   
   
   
   public boolean agendar( Desligamento agendar ){
      String SQL = "insert into desligamento( equip_id, agendado ) values ("+
         agendar.getEquip_id() + ",'" + agendar.getAgendado() + "');";
      
      return this.comandos.executar_comando(SQL);
   }
 
   public ArrayList<String> listaEquipamentos(){
      ArrayList<String> equipamentos = new ArrayList();
      ResultSet rs = this.comandos.pegarResultadoSQL( "select * from lista_equipamentos" );
      
      try {
         while( rs.next() )
            equipamentos.add( rs.getInt("id") + "-" + rs.getString("modelo") );
         
      } catch (SQLException ex) {
         Logger.getLogger(DAODesligamento.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      if( equipamentos.isEmpty() )
         equipamentos.add("Sem itens");
                 
      return equipamentos;
   }
   
   
   
   
   
   
   /*public Desligamento monta( String nome ){
      
   }*/
      
   
   
   
   
   
   
   
   
   
   
   
   
}
