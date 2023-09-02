import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    List <Pessoa> pessoasList;

    public OrdenacaoPessoa() {
        this.pessoasList = new ArrayList<>();
    }
    public void adicionarPessoa(int idade, String nome, double Altura){ 
        pessoasList.add(new Pessoa(idade, nome, Altura));
    }
    /**
     * @return
     */
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>();
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

}
