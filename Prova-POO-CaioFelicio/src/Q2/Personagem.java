package Q2;

public abstract class Personagem {
    protected String nome;
    protected int nivel;

    public Personagem() {
        this.nome = "Sem nome";
        this.nivel = 0;
    }

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public abstract String atacar();

    @Override
    public String toString() {
        return "Personagem{" +
                "Nome ='" + nome + '\'' +
                ", nível =" + nivel + '\'' +
                "Ataque Feito" +
                '}';
    }
}
