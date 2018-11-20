package seguro.configuracoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * @author Adston at self
 */
public class PreencheAleatorio {
   public static String randMes = ".\\randMes.txt";
   public static String randDia = ".\\randDia.txt";
   
   public static boolean checaExiste(String arquivo){
      File file = new File( arquivo );
      
      return file.exists();
   }
   
      static String[] meses = new String[]{"janeiro","fevereiro","marco","abril","maio","junho","julho",
         "agosto","setembro","outubro","novembro","dezembro"};
   
   public static void consumo_mes_aleatorio(){
   if( !checaExiste(randMes) ){
      
      try {
         BufferedWriter br = new BufferedWriter( new FileWriter( randMes, true ) );
         int j = 0;
         String ano = "2018";
         
         for( int i = 0; i < 20; i++ ){
            
               if( j >= 12 ){
                  j = 0;
                  ano = "2019";
               }
            
            br.append( i + ";" + PreencheAleatorio.rand(200) + ";" + meses[j]+ "\\" +ano + ";" + 1 );
            j++;
            br.newLine();
         }
         br.close();
      } catch (IOException ex) {
         Logger.getLogger(PreencheAleatorio.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
   }

   public static void consumo_dia_aleatorio(){
      if(!checaExiste(randDia)){
      
            try {
               BufferedWriter br = new BufferedWriter( new FileWriter( randDia, true ) );
               
                  for( int i = 0; i < 31; i++ ){
                     br.append(i + ";" + rand(30) + ";" + (i+1) +"\\"+meses[1] + ";" + 2);
                     br.newLine();
                  }
               br.close();
            } catch (IOException ex) {
               Logger.getLogger(PreencheAleatorio.class.getName()).log(Level.SEVERE, null, ex);
            }
      }
   }
   
   public static JPanel lerArquivo( String arquivo, String titulo, String desc, int range ) throws IOException{
      JFreeChart auto = null;
      DefaultCategoryDataset ds = null;
      BufferedReader br = null;
      String[] quebra = new String[4];
      try {
         br = new BufferedReader( new FileReader(arquivo) );
         ds = new DefaultCategoryDataset();
         String linha = br.readLine();
         
         boolean roda = true;
         int i = 0;
            while( roda ){
               if( linha != null && i < range){
                  quebra = linha.split(";");
                  ds.addValue( Double.valueOf( quebra[1] ), quebra[3], quebra[2] ) ;
                  linha = br.readLine();
                  i++;
               }else
                  roda = false;
            }
      } catch (FileNotFoundException ex) {
         Logger.getLogger(PreencheAleatorio.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
         Logger.getLogger(PreencheAleatorio.class.getName()).log(Level.SEVERE, null, ex);
      }
      br.close();
      
      
      auto = ChartFactory.createLineChart(titulo, desc, 
               "Consumo (em watts/segundo)", ds, PlotOrientation.VERTICAL, true, true, false);
      
      return new ChartPanel(auto);      
   }
   
   public static float rand( int valor_maximo ){
      Random random = new Random();
      
      return Math.round( random.nextInt( valor_maximo ) );
      
   }
   






   
}
