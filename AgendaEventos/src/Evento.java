public class Evento {
    private String nome;
    private String atracao;


    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }
  
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtracao() {
        return this.atracao;
    }

    public void setAtracao(String atracao) {
        this.atracao = atracao;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}
