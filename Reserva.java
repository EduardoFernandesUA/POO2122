public class Reserva {
    private PacoteTuristico pacotetTuristico;
    private int numeroPessoas;


    Reserva(PacoteTuristico pacoteTuristico, int numeroPessoas) {
        this.pacotetTuristico = pacoteTuristico;
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public String toString() {
        return String.format("Reserva: %s para %d pessoas. Valor total: %d", pacotetTuristico.toString(), numeroPessoas, pacotetTuristico.precoTotal(numeroPessoas));
    }
}
