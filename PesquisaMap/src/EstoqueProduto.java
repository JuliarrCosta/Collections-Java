import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adicionarProdutor(long cod, String nome, double preco, int quantidade){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }
    public void exibirProduto(){
        System.out.println(estoqueProdutosMap);
    }
    public double calcularValorTotal(){
        double valorTotal = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotal = valorTotal + p.getQuantidade()*p.getPreco();
            }
        }
        return valorTotal;
    }
    public Produto selecionarValorMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE; 
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if(p.getPreco() > maiorValor){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
        public Produto selecionarMenorValor(){
        Produto produtoMenorValor = null;
        double menorValor = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                if(p.getPreco() < menorValor){
                    produtoMenorValor = p;
                }
            }
        }
        return produtoMenorValor;
    }
    
}
