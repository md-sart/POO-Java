public class Main {
    public static void String [] args){
        Rota rota = new rota ("Recife", "Olinda");
        Veiculo onibus = new Onibus ("Onibus Escolar", 40, 2002);
        Veiculo carro = new Carro ("Sedan", 4, "Prata");
        Veiculo moto = new Moto ("Mottu", 1, verde);

        rota.adicionarVeiculo(onibus);
        rota.adicionarVeiculo(carro);
        rota.adicionarVeiculo(moto);

        System.out.println("Veículos disponíveis na rota:");
        System.out.println(rota.listarVeiculos());

        Reserva controller = new Reserva();
        controller.reservarVeiculo(carro, "2025-06-01", rota);
        controller.reservarVeiculo(onibus, "2025-06-02", rota);
    }
}