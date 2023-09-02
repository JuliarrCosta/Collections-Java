import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

public class ConjuntoConvidados {
    Set<Convidado> convidadosSet;

    public ConjuntoConvidados(Set<Convidado> convidadosSet) {
        this.convidadosSet = new HashSet<>();
    }
    
    public void adicionarConvidado(String nome, int id ){
        convidadosSet.add(new Convidado(nome, id));
    }

    public void removerConvidado(int id){
        Set<Convidado> removeConvidado = new HashSet<>();
        if(!convidadosSet.isEmpty()){
            for(Convidado c : convidadosSet){
                if(c.getCodConvite() == id){
                    removeConvidado.add(c);
                    break;
                }
            }
        }
        convidadosSet.removeAll(removeConvidado);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    

}
