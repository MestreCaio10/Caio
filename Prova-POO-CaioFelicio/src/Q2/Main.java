package Q2;

public class Main {
    public static void main(String[] args) {
        Guerreiro g1 = new Guerreiro("Arthur", 100, "exchalibur");
        Arqueiro a1 = new Arqueiro("Elfo", 100, 10);
        Mago m1 = new Mago("Merlim", 100, "Todos elementos");

        Time t1 = new Time("Rei Arthur");

        t1.addPersonagem(g1);
        t1.addPersonagem(a1);
        t1.addPersonagem(m1);

        t1.exibirPersonagem();

        t1.resumo();
    }
}
