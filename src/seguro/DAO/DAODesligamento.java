package seguro.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
 
   public boolean delete(int id){
       if( id >= 0){
       String SQL = "delete from desligamento where id = " + id;
       return this.comandos.executar_comando(SQL);
       }
       
       return false;
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
   
   public ArrayList<Desligamento> listaDesligamento(){
      //d.id , e.modelo, d.agendado, d.equip_id
      ArrayList<Desligamento> desligamentos = new ArrayList();
      ResultSet rs = this.comandos.pegarResultadoSQL("select * from lista_desligamento;");
      
      try {
         while( rs.next() ){
            Desligamento d = new Desligamento();
            d.setId(rs.getInt("id"));
            d.setEquip(rs.getString("modelo"));
            d.setEquip_id(rs.getInt("equip_id"));
            d.setAgendado(rs.getTimestamp("agendado"));
            
            desligamentos.add(d);
         }
         rs.close();
      } catch (SQLException ex) {
         Logger.getLogger(DAODesligamento.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      if( desligamentos.isEmpty() ){
            Desligamento d = new Desligamento();
            d.setId(-1);
            d.setEquip("Não há desligamentos agendados");
            d.setEquip_id(-1);
            d.setAgendado(null);
            
            desligamentos.add(d);
      }
      
      return desligamentos;
      
   }
   public ArrayList<Desligamento> listaDesligados(){
      //d.id , e.modelo, d.agendado, d.equip_id
      ArrayList<Desligamento> desligamentos = new ArrayList();
      ResultSet rs = this.comandos.pegarResultadoSQL("select * from lista_desligados;");
      
      try {
         while( rs.next() ){
            Desligamento d = new Desligamento();
            d.setId(rs.getInt("id"));
            d.setEquip(rs.getString("modelo"));
            d.setEquip_id(rs.getInt("equip_id"));
            d.setAgendado(rs.getTimestamp("agendado"));
            
            desligamentos.add(d);
         }
         rs.close();
      } catch (SQLException ex) {
         Logger.getLogger(DAODesligamento.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      if( desligamentos.isEmpty() ){
            Desligamento d = new Desligamento();
            d.setId(-1);
            d.setEquip("Nenhum desligamento realizado");
            d.setEquip_id(-1);
            d.setAgendado(null);
            
            desligamentos.add(d);
      }
      
      return desligamentos;
      
   }
   
   
   
   
   
   
   /*public Desligamento monta( String nome ){
      
   }*/
      
   
   
   
   
   
   
   
   
   
   
   
   
}
