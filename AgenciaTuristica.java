import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AgenciaTuristica {
    private String nome;
    private String endereco;
    private Set<PacoteTuristico> pacotesTuristicos;
    private List<Reserva> reservas;

    AgenciaTuristica(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.pacotesTuristicos = new HashSet<>();
        this.reservas = new ArrayList<>();
    }

    public PacoteTuristico pacoteTuristico(String nome, int nNoites, int precoPessoa) {
        PacoteTuristico pacoteTuristico = new PacoteTuristico(nome, nNoites, precoPessoa);
        pacotesTuristicos.add(pacoteTuristico);
        return pacoteTuristico;
    }

    public void reserva(PacoteTuristico pacoteTuristico, int numPessoas) {
        reservas.add(new Reserva(pacoteTuristico, numPessoas));
    }

    public String listaPacotes() {
        String ret = "Pacotes turísticos disponíveis:\n";
        for(PacoteTuristico pacote : pacotesTuristicos) {
            ret += pacote.toString() + "\n";
            for(String servico : pacote.listaServicos()) {
                ret += servico + "\n";
            }
        }
        return ret;
    }

    public String listaReservas() {
        String ret = "Reservas efetuadas:\n";
        for(Reserva reserva : reservas) {
            ret += reserva + "\n";
        }
        return ret;
    }

    public PacoteTuristico getPacoteTuristico(String string) {
        for(PacoteTuristico pacote : pacotesTuristicos) {
            if(pacote.getNome().equals(string))
                return pacote;
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", this.nome, this.endereco);
    }

}
