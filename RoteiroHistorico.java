public class RoteiroHistorico extends Servico {
    private String nome;
    private int numeroLocais;

    RoteiroHistorico(String nome, int numeroLocais) {
        super("R");
        this.nome = nome;
        this.numeroLocais = numeroLocais;
    }
}
