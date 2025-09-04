import java.util.ArrayList;

public class Reserva {
    private String dataEntrada;
    private String dataSaida;
    private Quarto quarto;
    ArrayList<Hospede> hospedes = new ArrayList<Hospede>();
    private Veiculo veiculo;

    public Reserva(String dataEntrada, String dataSaida, Quarto quarto, Veiculo veiculo) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.quarto = quarto;
        this.hospedes = new ArrayList<>();
        this.veiculo = veiculo;
    }

    public void checkin(Hospede[] h) {
        throw new UnsupportedOperationException("Método ainda não implementado.");
    }

    public void checkout() {
        throw new UnsupportedOperationException("Método ainda não implementado.");
    }

    public void cancelar() {
        throw new UnsupportedOperationException("Método ainda não implementado.");
    }
}
