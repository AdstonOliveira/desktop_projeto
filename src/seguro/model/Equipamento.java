package seguro.model;
/**
 * @author Adston at self
 */
public class Equipamento {

   private int id;
   private String modelo;
   private Tipo tipo; // 
   private Gerenciador gerenciador;
   private float potencia;
   private String status;
   private String descricao;


   
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

   public Tipo getTipo() {
      return tipo;
   }

   public void setTipo(Tipo tipo) {
      this.tipo = tipo;
   }

   public Gerenciador getGerenciador() {
      return gerenciador;
   }

   public void setGerenciador(Gerenciador gerenciador) {
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
