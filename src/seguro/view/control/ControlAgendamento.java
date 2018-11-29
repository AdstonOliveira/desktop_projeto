package seguro.view.control;

import java.sql.Timestamp;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import seguro.DAO.DAODesligamento;
import seguro.model.Desligamento;
import seguro.view.secundarios.Agendamento;

/**
 * @author Adston at self
*/
public class ControlAgendamento extends Control{
   private Agendamento view;
   private Desligamento model;
   private DAODesligamento dao;
   
   public ControlAgendamento() {
      this.dao = new DAODesligamento();
   }
   /**
    * Modo Produção 
    * Quando a conexão estiver ok, deve-se utilizar este método
    */
   @Override
   public void ModoProducao(){
      this.montaView();
      this.montar_lista();
   }

   public void montar_lista(){
      DefaultComboBoxModel model = new DefaultComboBoxModel<>();
      for( String each : this.dao.listaEquipamentos() )
         model.addElement(each);
      
      this.view.getEquipamentos().setModel( model );
   }

   public void montaView(){
      if( this.view == null )
         this.view = new Agendamento();
      
      this.view.setControl(this);
      this.view.getData_hora().setValue( new java.util.Date() );
   }
   
   /**
    * Executa modo Visualização, 
    * sem nenhuma funcionalidade ativa
    */
   @Override
   public void ModoTeste(){
      this.setView( new Agendamento() );
      this.view.setControl( this );
   }
   /*
   * Salvar no banco, 
   * Funcionalidade ativa se modo teste OFF
   */
   public void agendar(){
      if( !ControladoraClasses.modo_teste ){
         if( this.view.getSpinnerHr().getValue() != null ){
            this.model = new Desligamento();
            
            java.util.Date date = (java.util.Date) this.view.getData_hora().getValue();
            Timestamp data = new Timestamp( date.getTime() );
            
            model.setEquip_id( splitText() );
            model.setAgendado( data );
      
         if( model.agendar(this.dao) ){
            JOptionPane.showMessageDialog( this.view,"Agendado" );
            if( ControladoraClasses.control_agendados.getView().isShowing() ){
               ControladoraClasses.control_agendados.atualizar();
            }
         }else
            JOptionPane.showMessageDialog( this.view,"OXIIIII \ndeu ruim!!!" );
         }
      }else
         JOptionPane.showMessageDialog(this.view, "Agendamento Modo Teste com sucesso");
   }
      
   /*
    * 
   */   
   public int splitText(){
      String conteudo = (String) this.view.getEquipamentos().getSelectedItem();
      String[] content = conteudo.trim().split("-");
      
      return Integer.valueOf( content[0] );
   }   
   
   
/*   public void exibir(){
      TelaPrincipal.desktop.add( this.view );
      this.view.setVisible( true );
   }*/
   
   @Override
   public Agendamento getView() {
      return this.view;
   }

   public void setView(Agendamento view) {
      this.view = view;
   }

   public Desligamento getModel() {
      return model;
   }

   public void setModel(Desligamento model) {
      this.model = model;
   }

   
           
   
   
   
   
   
   
   
   
   

  


   
}
