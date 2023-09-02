import java.util.Objects;

public class Convidado {
    private String nome;
    private int codConvite;

    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodConvite() {
        return this.codConvite;
    }

    public void setCodConvite(int codConvite) {
        this.codConvite = codConvite;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    } 

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Convidado)) {
            return false;
        }
        Convidado convidado = (Convidado) o;
        return codConvite == convidado.codConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodConvite());
    }


    
}
