package seguro.model;
/**
 * @author Adston at self
 */
public class Equipamento {

   private int id;
   private String modelo;
   private int tipo; // 
   private int gerenciador;
   private float potencia;
   private String status;
   private String descricao;

   public Equipamento(){}
   public Equipamento(boolean vazio){
      this.montaVazio();
   }
   
   
   public boolean montaVazio(){
      String vazio = "Sem dados cadastrados";
      this.id = -1;
      this.modelo = vazio;
      this.tipo = -1;
      this.gerenciador = -1;
      this.potencia = -1;
      this.status = vazio;
      this.descricao = vazio;
      return true;
   }
   
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getModelo() {
      return modelo;
   }

   public void setModelo(String modelo) {
      this.modelo = modelo;
   }

   public int getTipo() {
      return tipo;
   }

   public void setTipo(int tipo) {
      this.tipo = tipo;
   }

   public int getGerenciador() {
      return gerenciador;
   }

   public void setGerenciador(int gerenciador) {
      this.gerenciador = gerenciador;
   }

   public float getPotencia() {
      return potencia;
   }

   public void setPotencia(float potencia) {
      this.potencia = potencia;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }
   
   
   
   
   




   
}
