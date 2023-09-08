
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;
    public CadastroProduto() {
       this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(String nome, long cod, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }
    public Set<Produto> mostrarProdutoPorNome(String nome){
        Set<Produto> pordutoPorNome = new TreeSet<>(produtoSet);
        return pordutoPorNome;
    }

}
