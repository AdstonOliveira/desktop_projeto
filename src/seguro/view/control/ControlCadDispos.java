package seguro.view.control;

import java.util.List;
import seguro.DAO.DAOEquipamentos;
import seguro.model.Equipamento;
import seguro.view.TelaPrincipal;
import seguro.view.secundarios.CadastroEquipamento;
import seguro.view.tabela.TableEquipamentos;
/**
 * @author Adston at self
*/
public class ControlCadDispos extends Control{
   
   private CadastroEquipamento view;
   private DAOEquipamentos dao = new DAOEquipamentos();
   private List<Equipamento> cadastrados;
   private TableEquipamentos model;
   
   
   
   
   public ControlCadDispos(){
      if( this.view == null )
         this.view = new CadastroEquipamento(); 

      this.view.setControl( this );
   }
   
   @Override
   public void ModoTeste(){
      if( view == null )
         this.view = new CadastroEquipamento(); 
      
      this.view.setControl(this);
      
   }
   
   public void exibir(){
      if( this.view == null)
         this.view = new CadastroEquipamento();
      
      TelaPrincipal.desktop.add(this.view);
      this.view.setVisible(true);
   }

 
   @Override
   public void ModoProducao() {
      if(this.view == null)
         this.view = new CadastroEquipamento();
      
      this.view.setControl(this);
      //Monta lista cadastrados
      this.cadastrados = this.dao.listaCadastrados();
      model = new TableEquipamentos( this.cadastrados );
      this.view.getLista_equip_cadastrado().setModel(model);
      //Monta lista tipos
      for( String each : this.dao.lista_tipo() )
         this.view.getListaTipo().addItem(each);
      //Monta lista Gerenciador
      for(String each : this.dao.lista_gerenciador())
         this.view.getjComboBox1().addItem(each);
      
   }
   
   public void atualizar(){
      this.cadastrados = this.dao.listaCadastrados();
      this.model = new TableEquipamentos(this.cadastrados);
      
      this.view.getLista_equip_cadastrado().setModel(model);
   }
   
   public boolean removeDB(int id){
      return this.dao.delete("equipamento",id);
   }
   
    public void removeLista(int posicao){
       this.cadastrados.remove(posicao);
       this.view.getLista_equip_cadastrado().updateUI();
   }
   
   
     public CadastroEquipamento getView() {
      return view;
   }

   public void setView(CadastroEquipamento view) {
      this.view = view;
   }

}
