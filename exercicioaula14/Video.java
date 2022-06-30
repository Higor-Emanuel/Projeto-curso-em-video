package exercicioaula14;

public final class Video implements AcoesVideo {
    // Atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    // Metodos especiais
    public Video(String tit) {
        this.setTitulo(tit);
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String tit) {
        this.titulo = tit;
    }

    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int aval) {
        int nova;
        nova = (int) ((this.avaliacao + aval)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }
    public void setViews(int vie) {
        this.views = vie;
    }

    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curt) {
        this.curtidas = curt;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean repr) {
        this.reproduzindo = repr;
    }
    
    // Metodos 
    @Override
    public void play() {
        this.setReproduzindo(true);
        System.out.println("Video rodando...");
    }

    @Override
    public void pouse() {
        this.setReproduzindo(false);
        System.out.println("Video pausado!");
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }   

    @Override
    public String toString() {
        return """
               ==============VIDEO==============
                Titulo: """ + titulo + ",\n Avaliacao: " + avaliacao + ",\n Views: " + views + ",\n Curtidas: " + curtidas + ",\n Reproduzindo: " + reproduzindo;
    }   

    boolean setAvaliacao(String ruim) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
