package seguro.view.control;
import java.awt.Color;
import seguro.model.Gerenciador;
import seguro.view.TelaPrincipal;
import seguro.view.secundarios.ViewGerenciador;
/**
 * @author Adston at self
 */
public class ControlGerenciador extends Control{
   
   private Gerenciador dispositivo_gerenciador;
   private ViewGerenciador view;
   
   public ControlGerenciador(){
      this.setView();
   }
   
   public void setView(){
      this.setView( new ViewGerenciador() );
   }

   public void montaDispositivo(){
      if( this.view == null )
         this.view = new ViewGerenciador();
      
      if( this.dispositivo_gerenciador == null ){
         this.dispositivo_gerenciador = new Gerenciador();
         //INCORPORAR MONTAGEM
      }
   }
   
   @Override
   public void ModoTeste(){
      Color cor = new Color(0,153,153);
      this.view.getIP().setText("localhost");
      this.view.getIP().setForeground(cor);
      
      this.view.getMAC().setText("FF-FF-FF-AA-AA-AA");
      this.view.getMAC().setForeground(cor);
      
      this.view.getDescricao().append("Sistema em modo demonstração");
      this.view.getDescricao().setForeground(cor);
      
   }
   

   public void exibir(){
      if( this.view == null )
         this.view = new ViewGerenciador();
      
      TelaPrincipal.desktop.add( this.view );
      this.view.setVisible( true );
   }
   
   
   
   
   
   
   
   
   public ViewGerenciador getView() {
      return view;
   }

   public void setView(ViewGerenciador view) {
      this.view = view;
   }

   public Gerenciador getDispositivo() {
      return this.dispositivo_gerenciador;
   }

   public void setDispositivo(Gerenciador dispositivo) {
      this.dispositivo_gerenciador = dispositivo;
   }

   @Override
   public void ModoProducao() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }
   

   


   
}
