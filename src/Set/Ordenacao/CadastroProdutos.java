package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }  
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));

    }
    public Set<Produto> exibirProdutosPorNome(){
        //treeset para organizar por nome o hashset não organiza 
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }
   public Set<Produto> exibirProdutosPorPreco(){
    Set<Produto> produtoPorPreco = new TreeSet<>(produtoSet);
    produtoPorPreco.addAll(produtoSet);
     return produtoPorPreco;
   }
}
