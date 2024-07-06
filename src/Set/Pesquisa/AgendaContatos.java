package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato contato : contatoSet) {
            // Todo contato que começar com o nome que colocamos vai aparecer por causa do STARTSWITH
            if (contato.getNome().startsWith(nome)){
                contatoPorNome.add(contato);
            }
        } return contatoPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
Contato contatoAtualizado = null ;
 for (Contato contato : contatoSet) {
    if( contato.getNome().equalsIgnoreCase(nome)){
       contato.setNumero(novoNumero);
        contatoAtualizado = contato;
        break;
             }
        }
        return contatoAtualizado;
    }
}
