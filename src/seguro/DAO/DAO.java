package seguro.DAO;

import javax.swing.JOptionPane;
import seguro.view.TelaPrincipal;

/**
 * @author Adston at self
 */
public abstract class DAO {
   
   protected Conexao conexao /*= Seguro.conexao*/;
   protected MySQL comandos;
   protected String tabela;
   
   /**
    * DEFINIR MYSQL APÓS A CONEXAO
    * @param conexao
    */
   public void setConexao( Conexao conexao ){
      this.conexao = conexao;
      this.comandos = new MySQL( conexao );
   }
   
   public MySQL getComandos(){
      return this.comandos;
   }
   
   public boolean delete(String tabela, int id){
      String SQL = "delete from " + tabela + " where id = " + id;
      if( this.comandos.executar_comando(SQL) ){
         JOptionPane.showMessageDialog(TelaPrincipal.desktop, "Excluido com sucesso!!!");
         return true;
      }
      return false;
   }
   
   
   
   
}
