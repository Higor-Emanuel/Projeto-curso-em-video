package exercicioaula14;

public abstract class Pessoa {
    // Atributos
    protected String nome;
    protected int idade;
    protected String sexo;     
    protected float experiencia;
    
    // Metodos especiais
    public Pessoa (String n, int id, String sx) {
        this.nome = n;
        this.idade = id;
        this.sexo = sx;
        this.experiencia = 0;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sx) {
        this.sexo = sx;
    }

    public float getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(float exp) {
        this.experiencia = exp;
    }
    
    // Metodos
    public void ganharExp() {
        
    }

    @Override
    public String toString() {
        return """
               -------Pessoa------- 
                Nome: """ + nome + ",\n Idade: " + idade + ",\n Sexo: " + sexo + ",\n Experiencia: " + experiencia;
    }
    
    
}
