import java.time.LocalDate;



public class Voo extends Servico {
    private String codigo;
    private LocalDate data;
    private Classe classe;

    Voo(String codigo, LocalDate data, Classe classe) {
        super("V");
        this.codigo = codigo;
        this.data = data;
        this.classe = classe;
    }

    @Override
    public String toString() {
        return String.format("%s Voo %s em %s", super.toString(), codigo, data.toString(), classe.toString());
    }

}
