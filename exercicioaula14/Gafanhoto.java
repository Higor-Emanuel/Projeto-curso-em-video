package exercicioaula14;

public class Gafanhoto extends Pessoa{
    // Atributos
    private String login;
    private int totAssistinfo;
    
    // Metodos especiais
    public Gafanhoto(String n, int id, String sx, String log) {
        super(n, id, sx);
        this.login = log;
        this.totAssistinfo = 0;
    }
    
    public String getLogin() {
        return login;
    }
    public void setLogin(String log) {
        this.login = log;
    }

    public int getTotAssistinfo() {
        return totAssistinfo;
    }
    public void setTotAssistinfo(int totAss) {
        this.totAssistinfo = totAss;
    }
     
    // Metodos
    @Override
    public String toString() {
        return """
               ============GAFANHOTO============
               """ + super.toString() + ",\n login: " + login + ",\n totAssistinfo: " + totAssistinfo;
    }
}
