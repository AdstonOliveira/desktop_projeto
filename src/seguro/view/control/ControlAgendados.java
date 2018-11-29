package seguro.view.control;

import java.util.ArrayList;
import java.util.List;
import seguro.DAO.DAODesligamento;
import seguro.model.Desligamento;
import seguro.view.TelaPrincipal;
import seguro.view.secundarios.ViewAgendados;
import seguro.view.tabela.TableFuturos;

/**
 * @author Adston at self
 */
public class ControlAgendados extends Control{

   private ViewAgendados view;
   private DAODesligamento dao = new DAODesligamento();
   
   @Override
   public void ModoTeste(){
      if(this.view == null)
         this.view = new ViewAgendados();
   }
   
   public void exibir(){
      if( this.view == null)
         this.view = new ViewAgendados();
      
      TelaPrincipal.desktop.add(this.view);
      this.view.setVisible(true);
   }
   
   
  

   List<Desligamento> list = new ArrayList<>();
   List<Desligamento> desligados = new ArrayList<>();
   
   @Override
   public void ModoProducao() {
      if( this.view == null)
         this.view = new ViewAgendados();
      
      this.view.setControl(this);
      this.list = this.dao.listaDesligamento();
      this.desligados = this.dao.listaDesligados();
      
      this.view.getTabela_agendados().setModel( new TableFuturos(list) );
      this.view.getLista_desligados().setModel( new TableFuturos(desligados) );
   }
   
   public void atualizar(){
      this.list = this.dao.listaDesligamento();
      this.desligados = this.dao.listaDesligados();
      this.view.getTabela_agendados().setModel( new TableFuturos(list) );
      this.view.getLista_desligados().setModel( new TableFuturos(desligados) );
   }
   
   
   
   
   
   
   
   
   
   public boolean removeDB(int posicao){
       return this.dao.delete(posicao);
   }
   public void removeLista(int posicao){
       this.list.remove(posicao);
       this.view.getTabela_agendados().updateUI();
   }
   
    @Override
   public ViewAgendados getView() {
      return view;
   }

   public void setView(ViewAgendados view) {
      this.view = view;
   }
   
   
   



   
}
