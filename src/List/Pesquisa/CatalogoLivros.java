package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
private List<Livro> livroList ;

public CatalogoLivros() {
    this.livroList = new ArrayList<>();
}
 public void adicionarLivro(String titulo, String autor, int anoPublicacao){
    livroList.add(new Livro(titulo, autor, anoPublicacao));
 }
 public List<Livro> pesquisarPorAutor(String autor){
    List<Livro> livrosPorAutor = new ArrayList<>();
    if(!livroList.isEmpty()){
        for (Livro livro : livroList) {
            if(livro.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(livro);
            }
        }
    }
    return livrosPorAutor;
}
 public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if(!livroList.isEmpty()){
        for (Livro livro : livroList) {
            if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                livrosPorIntervaloAnos.add(livro);
            }
            
        }
    }
    return livrosPorIntervaloAnos;
 }
  public Livro pesquisarPorTitulo(String titulo){
    // null porque não temos nenhum objeto apartir desse titulo
    Livro livroPorTitulo = null;
    //se a lis de livro não está vazia
    if(!livroList.isEmpty()){
        for (Livro livro : livroList) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTitulo = livro;
                //colocamos o break porque o exercicio so quer o primeiro titulo encontrado
                break;
            }
        }
    }
    return livroPorTitulo;
  }
  public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();
    catalogoLivros.adicionarLivro(" A garota do lago ", " Charlie Donlea ", 2016);
    catalogoLivros.adicionarLivro(" E assim que acaba ", " Colleen Hoover ", 2016);
    catalogoLivros.adicionarLivro(" Biblioteca da meia noite ", " Matt Haig ", 2020);
    catalogoLivros.adicionarLivro(" E assim que começa ", " Colleen Hoover ", 2022);


    System.out.println(catalogoLivros.pesquisarPorAutor(" Matt Haig "));
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2016,2020));
    
}
}
