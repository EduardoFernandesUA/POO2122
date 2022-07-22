public class Transporte extends Servico {
    private int nOcupantes;
    private int quilometrosMaximos;
    private Combustivel combustivel;

    Transporte(int nOcupantes, int quilometrosMaximos, Combustivel combustivel) {
        super("T");
        this.nOcupantes = nOcupantes;
        this.quilometrosMaximos = quilometrosMaximos;
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return String.format("%s Transporte para %d ocupantes, %s, Kms máximos: %d", super.toString(), nOcupantes, combustivel.toString(), quilometrosMaximos);
    }
}
