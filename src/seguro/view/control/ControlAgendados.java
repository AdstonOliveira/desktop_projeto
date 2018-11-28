package seguro.view.control;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import seguro.model.Desligamento;
import seguro.view.TelaPrincipal;
import seguro.view.secundarios.ViewAgendados;
import seguro.view.tabela.TableFuturos;

/**
 * @author Adston at self
 */
public class ControlAgendados extends Control{

   private ViewAgendados view;
   
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
      
      for(int i = 0; i < 5; i++){
       Desligamento d = new Desligamento();
          
          d.setId(i);
          d.setEquip("abc"+i);
          d.setEquip_id(i+2);
       
       list.add(d);
       }
       
       this.view.getTabela_agendados().setModel(new TableFuturos(list));
       
   }
   
   public void remove(int posicao){
      list.remove(posicao);
      
      this.view.getTabela_agendados().repaint();
   }

   
   
   
   



   
}
