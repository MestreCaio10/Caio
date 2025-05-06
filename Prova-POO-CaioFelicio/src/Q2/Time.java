package Q2;
import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Personagem> personagens;

    public Time() {
        this.nome = "Sem nome";
        this.personagens = new ArrayList<Personagem>();
    }

    public Time(String nome) {
        this.nome = nome;
        this.personagens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void addPersonagem(Personagem personagem) {
        this.personagens.add(personagem);
    }

    public void exibirPersonagem() {
        for (Personagem obj : this.personagens) {
            System.out.println(obj.atacar());
        }
    }

    public String resumo() {
        System.out.println("Nome do time: " + this.nome);
        System.out.println("Quantidade de Personagens: " + this.personagens.size());
        return "";
    }
}
