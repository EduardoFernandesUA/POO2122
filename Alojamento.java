public class Alojamento extends Servico {
    private String nome;
    private int nQuartos;
    private int ocupacaoMaxima;
    private Regime regime;

    Alojamento(String nome, int nQuartos, int ocupacaoMaxima, Regime regime) {
        super("A");
        this.nome = nome;
        this.nQuartos = nQuartos;
        this.ocupacaoMaxima = ocupacaoMaxima;
        this.regime = regime;
    }

    @Override
    public String toString() {
        return String.format("%s Alojamento %s com %d, ocupação máxima %d pessoas, em regime de %s", super.toString(), nome, nQuartos, ocupacaoMaxima, regime.toString());
    }
}
