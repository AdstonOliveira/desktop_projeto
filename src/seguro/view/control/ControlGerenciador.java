package seguro.view.control;
import seguro.model.Dispositivo;
import seguro.view.TelaPrincipal;
import seguro.view.secundarios.Gerenciador;
/**
 * @author Adston at self
 */
public class ControlGerenciador{
   
   private Gerenciador view;
   private Dispositivo dispositivo_gerenciador;
   
   public ControlGerenciador(){
      this.setView();
   }
   
   public void setView(){
      this.setView( new Gerenciador() );
   }

   public void montaDispositivo(){
      if( this.view == null )
         this.view = new Gerenciador();
      
      if( this.dispositivo_gerenciador == null ){
         this.dispositivo_gerenciador = new Dispositivo();
         //INCORPORAR MONTAGEM
      }
   }

   public void exibir(){
      if( this.view == null )
         this.view = new Gerenciador();
         
         TelaPrincipal.desktop.add( this.view );
         this.view.setVisible( true );
      
   }
   
   
   
   
   
   
   
   
   public Gerenciador getView() {
      return view;
   }

   public void setView(Gerenciador view) {
      this.view = view;
   }

   public Dispositivo getDispositivo() {
      return this.dispositivo_gerenciador;
   }

   public void setDispositivo(Dispositivo dispositivo) {
      this.dispositivo_gerenciador = dispositivo;
   }
   

   


   
}
