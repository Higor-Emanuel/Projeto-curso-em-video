package exercicioaula14;

public class ExercicioAula14 {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("POO Guanabara");
        v[1] = new Video("JAVA Guanabara");
        v[2] = new Video("ALGORITIMOS Guanabara");
        
        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Higor", 20, "M", "HHD");
        g[1] = new Gafanhoto("Pedro", 34, "M", "PD");
        g[2] = new Gafanhoto("Damaris", 23, "F", "DAMI");
        
        Visualizacao vis[] = new Visualizacao[4];
        vis[0] = new Visualizacao(g[0], v[1]);
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[2], v[1]);
        vis[1].avaliar(50);
        System.out.println(vis[1].toString());
        
        vis[1] = new Visualizacao(g[1], v[1]);
        vis[1].avaliar(90);
        System.out.println(vis[1].toString());
    }
}
