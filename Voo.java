import java.time.LocalDate;



public class Voo extends Servico {
    private String codigo;
    private LocalDate data;
    private Classe classe;

    Voo(String codigo, LocalDate data, Classe classe) {
        this.codigo = codigo;
        this.data = data;
        this.classe = classe;
    }

}
