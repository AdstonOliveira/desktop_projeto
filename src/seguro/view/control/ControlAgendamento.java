package seguro.view.control;

import seguro.view.secundarios.Agendamento;

/**
 * @author Adston at self
*/
public class ControlAgendamento {
   private Agendamento view;
   public ControlAgendamento( Agendamento view ){
      this.view = view;
   }

   public void formataHora(){
      this.view.getSpinnerHr().setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(), null, java.util.Calendar.HOUR_OF_DAY));
      this.view.getSpinnerHr().setEditor(new javax.swing.JSpinner.DateEditor(this.view.getSpinnerHr(), "HH:mm"));
   }


   
}
