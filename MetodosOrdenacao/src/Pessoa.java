
public class Pessoa implements Comparable<Pessoa>{
    
    private int idade;
    private String nome;
    private double altura;

    public Pessoa(int idade, String nome, double altura) {
        this.idade = idade;
        this.nome = nome;
        this.altura = altura;
    }
    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nome + idade + altura;
    }
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.idade);
    }
}
