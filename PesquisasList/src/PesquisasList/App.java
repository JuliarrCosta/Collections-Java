package PesquisasList;

public class App {
    public static void main(String[] args) throws Exception {
      CatalagoLivros tech = new CatalagoLivros();
      tech.adicionarLivro("Como desenvolver em Java", "Sebastian", 2020);
      tech.adicionarLivro("Como desenvolver em C", "Sebastian", 2020);
      tech.adicionarLivro("Como desenvolver em Python", "Sebastian", 2020);
      
      tech.mostrarAcervo();

    }
}
