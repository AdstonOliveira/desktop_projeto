package seguro.view.tabela;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import seguro.model.Equipamento;

/**
 *
 * @author Adston at self
 */
public class TableEquipamentos extends AbstractTableModel{
    private List<Equipamento> equipamentos;
   private String[] colunas = new String[]{"id","modelo","tipo","gerenciador","watts_potencia","descricao"};
   
   public TableEquipamentos(List<Equipamento> lista){
      this.equipamentos = lista;
   }
   public TableEquipamentos(){
      this.equipamentos = new ArrayList();
   }
   
   @Override
   public int getRowCount() {
      return this.equipamentos.size();
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
    
    public void setValueAt(Equipamento aValue, int rowIndex) {  
        Equipamento equipamento = this.equipamentos.get(rowIndex);
         
        equipamento.setId( aValue.getId() );
        equipamento.setModelo(aValue.getModelo());
        equipamento.setTipo(aValue.getTipo());
        equipamento.setGerenciador(aValue.getGerenciador());
        equipamento.setPotencia(aValue.getPotencia());
        equipamento.setDescricao( aValue.getDescricao() );
        
        fireTableCellUpdated(rowIndex, 0);  
        fireTableCellUpdated(rowIndex, 1);  
        fireTableCellUpdated(rowIndex, 2);  
        fireTableCellUpdated(rowIndex, 3);  
        fireTableCellUpdated(rowIndex, 4);  
        fireTableCellUpdated(rowIndex, 5);  
   
    }
    
   /**
    *
    * @param rowIndex
    * @param columnIndex
    * @return
    */
   @Override
    public Object getValueAt( int rowIndex, int columnIndex ) {

       Equipamento equipSelecionado = equipamentos.get( rowIndex );
        Object valueObject = null;
        
        switch(columnIndex){
            case 0: valueObject = equipSelecionado.getId(); break;
            case 1 : valueObject = equipSelecionado.getModelo(); break;
            case 2: valueObject = equipSelecionado.getTipo(); break;
            case 3 : valueObject = equipSelecionado.getGerenciador(); break;
            case 4 : valueObject = equipSelecionado.getPotencia(); break;
            case 5 : valueObject = equipSelecionado.getDescricao(); break;

            default: System.err.println("Índice inválido para propriedade do bean Usuario.class");
        }
         
        return valueObject;
    }
    
    @Override  
    public boolean isCellEditable(int rowIndex, int columnIndex) {  
        return false;  
    }  
   
   
    public Equipamento getEquipamento(int indiceLinha) {  
        return equipamentos.get(indiceLinha);  
    }  
    
    public void addEquipamento(Equipamento u) {      
        equipamentos.add(u);  
   
        int ultimoIndice = getRowCount() - 1;  
        fireTableRowsInserted(ultimoIndice, ultimoIndice);  
    }  
   
     
    public void removeEquipamento(int indiceLinha) {  
        equipamentos.remove(indiceLinha);  
   
        fireTableRowsDeleted(indiceLinha, indiceLinha);  
    }  
     
     
    public void addListaDeEquipamentos(List<Equipamento> novosEquipamentos) {  
         
        int tamanhoAntigo = getRowCount();      
        equipamentos.addAll(novosEquipamentos);    
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);  
    }  
     
    public void limpar() {  
        equipamentos.clear();    
        fireTableDataChanged();  
    }  
   
    public boolean isEmpty() {  
        return equipamentos.isEmpty();  
    }  
}
