package seguro.view.control;
/**
 * @author Adston at self
*/
public enum Abrir {

      MEUS_DADOS("control_cad_usuario"),
      DISPOSITIVO("control_cad_dispositivos"),
      GERENCIADOR("control_cad_gerenciador"),
      GERAR_GRAFICOS("control_graficos"),
      AGENDAR("control_agendamento"),
      AGENDADOS("control_agendados"),
      HISTORICO_AGENDAMENTOS("control_historico"),
      TOTAIS("control_totais");
      
      private String descricao;
      
      
      Abrir( String descricao ){
         this.descricao = descricao;
      }
      
      public String getDescricao(){
         return this.descricao;
      }
   
   
   





   
}
