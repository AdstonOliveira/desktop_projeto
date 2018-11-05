package seguro.configuracoes;
/**
 *
 * @author root
 */
public class Config {
    /** CONFIGS PADRAO */
    public Config(){
       this.URL = "jdbc:mysql://"+IpBanco+":"+porta+"/"+nome_banco;
    }


    /** Alterar Configs
     * @param IPBanco
     * @param porta
     * @param nome_banco */
    public Config( String IPBanco, String porta, String nome_banco ){
        this.IpBanco = IPBanco;
        this.porta = porta;
        this.nome_banco = nome_banco;
        this.URL = "jdbc:mysql://"+IPBanco+":"+porta+"/"+nome_banco;
    }
    
    private String URL;
    private String IpBanco = "localhost";
    private String porta = "3306";
    private String nome_banco = "gerenciador";
    
    private String USUARIO = "adm";
    private String SENHA = "kpm0605";
    
    private final String DRIVER = "com.mysql.jdbc.Driver";
    
    public void defineURL(){
       this.URL = "jdbc:mysql://"+IpBanco+":"+porta+"/"+nome_banco;
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
