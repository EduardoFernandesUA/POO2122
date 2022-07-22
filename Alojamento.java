public class Alojamento extends Servico {
    private String nome;
    private int nQuartos;
    private int ocupacaoMaxima;
    private Regime regime;

    Alojamento(String nome, int nQuartos, int ocupacaoMaxima, Regime regime) {
        this.nome = nome;
        this.nQuartos = nQuartos;
        this.ocupacaoMaxima = ocupacaoMaxima;
        this.regime = regime;
    }
}
