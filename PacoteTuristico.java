import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PacoteTuristico implements IPacoteTuristico {
    private String nome;
    private int nNoites;
    private int precoPessoa;
    private List<Servico> servicos;


    PacoteTuristico(String nome, int nNoites, int precoPessoa) {
        this.nome = nome;
        this.nNoites = nNoites;
        this.precoPessoa = precoPessoa;
        this.servicos = new ArrayList<>();
    }
    // PacoteTuristico(String nome, int nNoites, double precoPessoa) {
    //     this.nome = nome;
    //     this.nNoites = nNoites;
    //     this.precoPessoa = precoPessoa;
    // }


    @Override
    public PacoteTuristico adicionaServico(Servico servico) {
        servicos.add(servico);
        return this;
    }
    @Override
    public Collection<String> listaServicos() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public int precoTotal(int numPessoas) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Pacote Turístico %s: %d noites; %d / pessoa / noite", this.nome, this.nNoites, this.precoPessoa);
    }
}
