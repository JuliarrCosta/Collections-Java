import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> feiraDoMes;

    public CarrinhoDeCompras() {
        this.feiraDoMes = new ArrayList<>();
    }

    public void adicionarItem(double preco, String nome, int quantidade ){
        feiraDoMes.add(new Item(preco, nome, quantidade));
    }

    public void removerItem(String nome){
        List<Item> removeItem = new ArrayList<>();
        if(!feiraDoMes.isEmpty()){
            for(Item i : feiraDoMes){
                if(i.getNome().equals(nome)){
                    removeItem.add(i);
                }
            }
        }
      feiraDoMes.removeAll(removeItem);
    }

    public double calcularPreco(){
        double totalCompras = 0;
        for(Item i : feiraDoMes){
           totalCompras = totalCompras + i.getPreco();
        }

        return totalCompras;
    }
    public void mostrarCompras(){
        System.out.println(feiraDoMes);
    }
}
