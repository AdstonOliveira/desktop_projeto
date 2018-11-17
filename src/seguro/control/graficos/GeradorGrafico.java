package seguro.control.graficos;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author Adston at self
 */
public class GeradorGrafico {

   public static JPanel teste(int range){
      DefaultCategoryDataset ds = new DefaultCategoryDataset();
      String letra = "a";
      
      for( int i = 0; i < range*2; i++ ){
         if( i <= range )
            ds.addValue( (i*2.354), letra, "dia " + i );
         else{   
            letra = "b";
            ds.addValue( (i*1.354), letra, "dia " + i );
         }
      }   
      
            JFreeChart grafico = ChartFactory.createLineChart("Meu Gráfico", "Dia", 
               "Valor", ds, PlotOrientation.VERTICAL, true, true, false);
            
   return new ChartPanel(grafico);
   }







   
}
