import java.util.ArrayList;

public class Hotel {
    private String nome;
    ArrayList<Quarto> quartos = new ArrayList<Quarto>();

    public Hotel(String nome) {
        this.nome = nome;
        this.quartos = new ArrayList<>();
    }
}
