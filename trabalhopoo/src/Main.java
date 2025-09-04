public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("Hotel Trânsilvania");
        Quarto quartoPadrao = new Quarto(101, 1);
        Hospede hospede = new Hospede("Jonathan", "Rua Tangamandápio, 123", "12345678910");
        Veiculo veiculo = new Veiculo("ABC1234", "Mazda RX-7");

        //adicionando o quarto ao hotel
        hotel.quartos.add(quartoPadrao);

        //criando uma reserva vinculando quarto, hospede e veiculo
        Reserva reserva = new Reserva("04/09/2025", "10/09/2025", quartoPadrao, veiculo);

        //adiciona o hospede na reserva
        reserva.hospedes.add(hospede);

        //criando funcionario
        Cargo cargoGerente = new Cargo("Gerente");
        Funcionario gerente = new Funcionario("Drácula", 7500.0, cargoGerente);

        System.out.println("Programa compilado e executado com sucesso!");
    }
}