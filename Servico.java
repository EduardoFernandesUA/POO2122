public class Servico {
    private static int IDincrement = 100;
    private String ID;

    Servico(String type) {
        this.ID = type + IDincrement++;
    }


    @Override
    public String toString() {
        return String.format("[%s]", this.ID);
    }
}
