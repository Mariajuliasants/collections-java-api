package List.Ordencao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
 private List<Pessoa> pessoaList;

public OrdenacaoPessoas() {
    //iniciar com o arraylist vazio
    this.pessoaList =  new ArrayList<>();
}

public void adicionarPessoa(String nome, int idade, double altura){
pessoaList.add(new Pessoa(nome, idade, altura));
}

 public List<Pessoa> ordenarPorIdade(){
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
    // o metodo sort vai entender  que ele tem ordenar a lista de pseeoas atraves do comparable
}

public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
}

