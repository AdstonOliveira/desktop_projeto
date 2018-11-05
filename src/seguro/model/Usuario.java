package seguro.model;

import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import seguro.DAO.Conexao;
import seguro.DAO.DAOUsuario;

/**
 * @author Adston at self
 */
public class Usuario {
   
   private int id;
   private String nome;
   private Date dt_nasc;
   private Date dt_cadastro;
   private String email;
   private String senha;
   private String login;

   public String getLogin() {
      return login;
   }

   public void setLogin(String login) {
      this.login = login;
   }
   
   
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getNome() {
      return nome;
   }

   public void setNome( String nome ) {
      this.nome = nome;
   }

   public Date getDt_nasc() {
      return dt_nasc;
   }

   public void setDt_nasc(Date dt_nasc) {
      this.dt_nasc = dt_nasc;
   }

   public Date getDt_cadastro() {
      return dt_cadastro;
   }

   public void setDt_cadastro(Date dt_cadastro) {
      this.dt_cadastro = dt_cadastro;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getSenha() {
      return senha;
   }

   public void setSenha(String senha) {
      this.senha = senha;
   }
   
   
   public boolean Login( String SQL, DAOUsuario dao ){
      try {
         dao.Login( this, SQL );
         return true;
      } catch (SQLException ex) {
         JOptionPane.showMessageDialog( null, ex, login, 0 );
         return false;
      }
   }
   
   







   
}
