package seguro.control.graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

/**
 * @author Adston at self
 */
public class GeradorGrafico {

   public static JPanel teste( int range ){
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

   public static void montar(){
      
   }
   public static JPanel modo_teste_pizza( int[] valor, String[] descricao ){
      
      DefaultPieDataset data = new DefaultPieDataset();
      if( valor.length > 0 ){
         for( int i = 0; i < valor.length; i++ ) 
            data.setValue( descricao[i], valor[i] );
         
      JFreeChart chart = ChartFactory.createPieChart3D("Consumo Total ", data, true, true, false);
      chart.setBackgroundPaint(Color.BLACK);
      
      PiePlot plot = (PiePlot) chart.getPlot();  
      
      plot.setBackgroundPaint(Color.BLACK);
      //plot.setShadowPaint(Color.BLACK);
      plot.setLabelLinksVisible(true);
      plot.setLabelLinkPaint(Color.white);
      
      plot.setNoDataMessage("Não existem dados para serem exibidos no gráfico");
      plot.setStartAngle(270);
      plot.setDirection(Rotation.ANTICLOCKWISE);
      plot.setCircular(true);
      plot.setForegroundAlpha( (float) 0.5);
      plot.setInteriorGap(0.15);

      plot.setLabelGenerator( new StandardPieSectionLabelGenerator("{0} ({2})") );
      
      return new ChartPanel(chart);
      }
      return null;
   }
   
   public static JPanel modo_teste_barra( float[] valor, String[] descricao ){
       DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       if(valor.length > 0){
         for(int i = 0; i < valor.length; i++) 
            dataset.addValue( valor[i], descricao[i], "Consumo por Equipamento" );
       
            JFreeChart chart = ChartFactory.createBarChart3D("Consumo por equipamento", "", "KWh/mês", dataset);
            chart.setBackgroundPaint( Color.BLACK );
            ChartPanel c = new ChartPanel(chart);
         return c;
       }
       return null;
   }
   
   
   
   
   
      
    public static void adicionarGrafico( JPanel chart, JPanel fundo ){
      fundo.removeAll();
      fundo.updateUI();
      chart.setSize( fundo.getSize() );
      chart.setBorder( fundo.getBorder() );
      fundo.setLayout( new BorderLayout() );
      fundo.add( chart );
      fundo.updateUI();
   }
      
      
      
   
   
   

/*   public static void main(String[] args) {
      JFrame t = new JFrame();
      t.setDefaultCloseOperation(0);
      JPanel j = GeradorGrafico.teste(10);
      t.add(j);
      j.setVisible(true);
      t.setVisible(true);
   }*/





   
}
