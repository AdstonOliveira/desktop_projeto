package seguro.view.control;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
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
      this.view = new ViewAgendados();
   }
   
   
   

   public void exibir(){
      if( this.view == null)
         this.view = new ViewAgendados();
      
      TelaPrincipal.desktop.add(this.view);
      this.view.setVisible(true);
   }
   
   
   
   
   
   
   
   
   
   
   
   @Override
   public ViewAgendados getView() {
      return view;
   }

   public void setView(ViewAgendados view) {
      this.view = view;
   }

   List<Desligamento> list = new ArrayList<>();
   
   @Override
   public void ModoProducao() {
      if( this.view == null)
         this.view = new ViewAgendados();
      
      this.view.setControl(this);
      
      this.list = dao.listaDesligamento();
       
       this.view.getTabela_agendados().setModel(new TableFuturos(list));
       
   }
   
   public void remove(int posicao){
      list.remove(posicao);
      
      this.view.getTabela_agendados().repaint();
   }

   
   
   
   



   
}
