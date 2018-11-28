package seguro.configuracoes;
/**
 * @author root
 */
public class Config {
    /** CONFIGS PADRAO */
    public Config(){
        this.IpBanco = "localhost";
        this.porta = "3306";
        this.nome_banco = "gerenciador";
        
       this.defineURL();
    }
    /** Alterar Configs
     * @param IPBanco
     * @param porta
     * @param nome_banco */
    public Config( String IPBanco, String porta, String nome_banco ){
        this.IpBanco = IPBanco;
        this.porta = porta;
        this.nome_banco = nome_banco;
        
        this.URL = "jdbc:mysql://"+IPBanco+":"+porta+"/"+nome_banco;;
    }
    
    private String URL;
    private String IpBanco;
    private String porta;
    private String nome_banco;
    
    private String USUARIO = "root";
    private String SENHA = "";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    

    public void defineURL(){
       this.URL = "jdbc:mysql://"+this.IpBanco+":"+this.porta+"/"+this.nome_banco;
    }
    
    public String getIpBanco() {
       return IpBanco;
    }

    public void setIpBanco( String IpBanco ) {
        this.IpBanco = IpBanco;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
    
    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getNome_banco() {
        return nome_banco;
    }

    public void setNome_banco(String nome_banco) {
        this.nome_banco = nome_banco;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getSENHA() {
        return SENHA;
    }

    public void setSENHA(String SENHA) {
        this.SENHA = SENHA;
    }

    public String getDRIVER() {
        return DRIVER;
    }
    
    
    
    
}
