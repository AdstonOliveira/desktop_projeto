/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguro.view.tabela;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import seguro.model.Desligamento;

/**
 *
 * @author Adston at self
 */
public class TableFuturos extends AbstractTableModel{
   private List<Desligamento> agendados;
   private String[] colunas = new String[]{"id","equipamento","hora_agendada","equip_id"};
   
   public TableFuturos(List<Desligamento> lista){
      this.agendados = lista;
   }
   public TableFuturos(){
      this.agendados = new ArrayList();
   }
   
   @Override
   public int getRowCount() {
      return this.agendados.size();
   }

   @Override
   public int getColumnCount() {
      return this.colunas.length;
   }

   @Override
    public String getColumnName( int columnIndex ){
      return colunas[columnIndex];
    }    
    
    @Override  
    public Class<?> getColumnClass( int columnIndex ) {  
        return String.class;  
    }
    
    public void setValueAt(Desligamento aValue, int rowIndex) {  
        Desligamento futuros = this.agendados.get(rowIndex);
         
        futuros.setAgendado( aValue.getAgendado() );
        futuros.setId( aValue.getId() );
        futuros.setEquip_id( aValue.getEquip_id() );
        futuros.setEquip( aValue.getEquip() );
        
        fireTableCellUpdated(rowIndex, 0);  
        fireTableCellUpdated(rowIndex, 1);  
        fireTableCellUpdated(rowIndex, 2);  
        fireTableCellUpdated(rowIndex, 3);  
   
    }
    
   /**
    *
    * @param rowIndex
    * @param columnIndex
    * @return
    */
   @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Desligamento usuarioSelecionado = agendados.get(rowIndex);
        Object valueObject = null;
        
        switch(columnIndex){
            case 0: valueObject = usuarioSelecionado.getId(); break;
            case 2: valueObject = usuarioSelecionado.getAgendado(); break;
            case 1 : valueObject = usuarioSelecionado.getEquip(); break;
            case 3 : valueObject = usuarioSelecionado.getEquip_id(); break;

            default: System.err.println("Índice inválido para propriedade do bean Usuario.class");
        }
         
        return valueObject;
    }
    
    @Override  
    public boolean isCellEditable(int rowIndex, int columnIndex) {  
        return false;  
    }  
   
   
    public Desligamento getDesligamento(int indiceLinha) {  
        return agendados.get(indiceLinha);  
    }  
    
    public void addDesligamento(Desligamento u) {      
        agendados.add(u);  
   
        int ultimoIndice = getRowCount() - 1;  
        fireTableRowsInserted(ultimoIndice, ultimoIndice);  
    }  
   
     
    public void removeUsuario(int indiceLinha) {  
        agendados.remove(indiceLinha);  
   
        fireTableRowsDeleted(indiceLinha, indiceLinha);  
    }  
     
     
    public void addListaDeUsuarios(List<Desligamento> novosDesligamentos) {  
         
        int tamanhoAntigo = getRowCount();      
        agendados.addAll(novosDesligamentos);    
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);  
    }  
     
    public void limpar() {  
        agendados.clear();    
        fireTableDataChanged();  
    }  
   
    public boolean isEmpty() {  
        return agendados.isEmpty();  
    }  
     
/*** TESTE ****/////
    /*
    public static void main(String[] args) {
       JTable teste;
       teste = new JTable();
       TableFuturos model;
      
       List<Desligamento> list = new ArrayList<Desligamento>();
       for(int i = 0; i < 5; i++){
       Desligamento d = new Desligamento();
          
          d.setId(i);
          d.setEquip("abc");
          d.setEquip_id(i+2);
       
       list.add(d);
       }
       model = new TableFuturos(list);
       
       teste.setModel(model);
       
       JFrame t = new JFrame("teste");
       t.setSize(400,400);
       t.getContentPane().add(new JScrollPane(teste));
       
       t.setVisible(true);
       
       
       
      
   }*/
    
    
    
    
    
    
    
    
}
