package exercicioaula14;

public class Visualizacao {
    // Atributos
    private Gafanhoto espectador;
    private Video filme;
    
    // Metodos especiais
    public Visualizacao(Gafanhoto espec, Video fil) {
        this.espectador = espec;
        this.filme = fil;
        this.espectador.setTotAssistinfo(this.espectador.getTotAssistinfo() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espec) {
        this.espectador = espec;
    }

    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video fil) {
        this.filme = fil;
    }   
    
    // Metodos
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
  
    @Override
    public String toString() {
        return """
               DADOS:
               """ + espectador + "\n" + filme;
    }
    
    
}
