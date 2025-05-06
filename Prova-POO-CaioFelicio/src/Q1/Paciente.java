package Q1;

public class Paciente {
    private String cpf;
    private String nome;
    private int idade;
    private float peso;

    public Paciente() {
        this.cpf = "000.000.000-00" ;
        this.nome = "Sem  nome" ;
        this.idade = 0;
        this.peso = 0;
    }

    public Paciente(String cpf, String nome, int idade, float peso) {
        this.setCpf(cpf);
        this.setNome(nome);
        this.setIdade(idade);
        this.setPeso(peso);
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        if (peso < 0 ) {
            System.out.println("Peso deve ser positivo!");
        }
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade < 0 ) {
            System.out.println("Idade deve ser positiva!");
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome.length() > 50) {
            System.out.println("Nome deve ser menor que 50 caracteres!");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        if (cpf.length() != 14) {
            System.out.println("Erro: O CPF deve ter exatamente 14 caracteres.");
        }

        if (cpf.charAt(3) != '.' || cpf.charAt(7) != '.' || cpf.charAt(11) != '-') {
            System.out.println("Erro: O CPF deve estar no formato 000.000.000-00.");
        }

        this.cpf = cpf;
    }

    public void ganharPeso(float quilos) {
        this.peso += quilos;
    }

    public void perderPeso(float quilos) {
        if (peso > quilos) {
            this.peso -= quilos;
        }else {
            System.out.println("Com essa perda Q1.Paciente ficará com peso negativo ");
        }
    }

    public void exibirPaciente(){
        System.out.println("Cpf do Q1.Paciente: " + cpf);
        System.out.println("Nome do Q1.Paciente: " + nome);
        System.out.println("Idade do Q1.Paciente: " + idade);
        System.out.println("Peso do Q1.Paciente: " + peso);
    }

}