package Q2;

public class Guerreiro extends Personagem{
    private String arma;
    public Guerreiro() {
        super();
        this. arma = "sem tipo";
    }

    public Guerreiro(String nome, int nivel, String arma) {
        super(nome, nivel);
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }
    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String atacar(){
        return "Guerreiro atacando com " + arma;
    }

    @Override
    public String toString() {
        return "Arqueiro{" +
                super.toString() +
                "Arma='" + arma+ '\'' +
                "Ataque Feito" + '\'' +
                '}';
    }
}
