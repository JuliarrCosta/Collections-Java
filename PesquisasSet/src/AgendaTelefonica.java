import java.util.HashSet;
import java.util.Set;

public class AgendaTelefonica {
    Set<Contato> agendaTelefonica; //Criando um Set de contatos 

    public AgendaTelefonica(){
        this.agendaTelefonica = new HashSet<>(); //Instanciando um HashSet[Armazenamento de forma não sequencial com Hash]
    }

    public void adicionarContato(String nome, String numero){
        agendaTelefonica.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(agendaTelefonica);
    }
    public Set<Contato> pesquisarContatos(String nome){ //Pesquisar Contatos através do nome
        Set<Contato> pesquisaContato = new HashSet<>();
        if(!agendaTelefonica.isEmpty()){
            for(Contato c : agendaTelefonica){
                if(c.getNome().startsWith(nome)){ //O método startswith pega tudo que tenha dentro do específicado
                    pesquisaContato.add(c);
                }
            }
        }
        return pesquisaContato;
    }

    public Set<Contato> alterarContato(String nome, String numero){ //Altera o número de contato 
        Set<Contato> alteraContato = new HashSet<>();
        if(!agendaTelefonica.isEmpty()){
            for(Contato c : agendaTelefonica){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(numero);
                    alteraContato.add(c);
                }
            }
        }
        return alteraContato;
    }

}
