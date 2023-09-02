public class App {
    public static void main(String[] args) throws Exception {
        CarrinhoDeCompras feira1 = new CarrinhoDeCompras();
        feira1.adicionarItem(19.9, "frango", 3);
        feira1.adicionarItem(5.29, "Feijao", 1);
        feira1.adicionarItem(3.69, "Leite", 5);

        feira1.mostrarCompras();
        feira1.removerItem("frango");
        feira1.mostrarCompras();
        
        System.out.println(feira1.calcularPreco());
    }
}
