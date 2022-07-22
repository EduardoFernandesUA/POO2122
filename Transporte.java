public class Transporte extends Servico {
    private int nOcupantes;
    private int quilometrosMaximos;
    private Combustivel combustivel;

    Transporte(int nOcupantes, int quilometrosMaximos, Combustivel combustivel) {
        this.nOcupantes = nOcupantes;
        this.quilometrosMaximos = quilometrosMaximos;
        this.combustivel = combustivel;
    }
}
