package seguro.DAO;
/**
 * @author Adston at self
 */
public abstract class DAO {
   
   protected Conexao conexao;
   protected MySQL comandos;
   
   /**
    * DEFINIR MYSQL APÓS A CONEXAO
    * @param conexao
    */
   public void setConexao( Conexao conexao ){
      this.conexao = conexao;
      this.comandos = new MySQL(conexao);
      
   }
   
   public MySQL getComandos(){
      return this.comandos;
   }
   
   
   
}
