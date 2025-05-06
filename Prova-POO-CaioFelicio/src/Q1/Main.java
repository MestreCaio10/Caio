package Q1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("451.703.028-86", "Caio", 20, 100);
        Paciente p2 = new Paciente("000", "Gerlane", 20,200);

        p1.exibirPaciente();
        p2.exibirPaciente();

        p1.ganharPeso(20);
        p2.perderPeso(20);

        p1.exibirPaciente();
        p2.exibirPaciente();
    }
}