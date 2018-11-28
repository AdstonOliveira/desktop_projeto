package seguro.model;
import java.sql.Timestamp;
import seguro.DAO.DAODesligamento;

/**
 * @author Adston at self
*/
public class Desligamento {

   private int id;
   private int equip_id;
   private String equip;
   private Timestamp agendado;
   private boolean desligado;

   public Desligamento(){}
   public Desligamento( String montar ){
   
   
   }
   
   public void montaEquipamento( String id_desc ){
      String[] split = id_desc.trim().split("-");
      
      
      
   }

   public String getEquip() {
      return equip;
   }

   public void setEquip(String equip) {
      this.equip = equip;
   }



   
   
   public boolean agendar( DAODesligamento dao ){
      
   return dao.agendar(this);
      
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public int getEquip_id() {
      return equip_id;
   }

   public void setEquip_id(int equip_id) {
      this.equip_id = equip_id;
   }

  public Timestamp getAgendado() {
   return agendado;
   }

   public void setAgendado(Timestamp agendado) {
      this.agendado = agendado;
   }

   public boolean isDesligado() {
      return desligado;
   }

   public void setDesligado(boolean desligado) {
      this.desligado = desligado;
   }
   
   
   
   
   
   




   
}
