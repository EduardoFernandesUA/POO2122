import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AgenciaTuristica {
    private String nome;
    private String endereco;
    private Set<PacoteTuristico> pacoteTuristicos;
    private List<Reserva> reservas;

    AgenciaTuristica(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public PacoteTuristico pacoteTuristico(String nome, int nNoites, int precoPessoa) {
        return new PacoteTuristico(nome, nNoites, precoPessoa);
    }

    
}
