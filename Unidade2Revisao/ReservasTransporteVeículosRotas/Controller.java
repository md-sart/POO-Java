class ReservaController{
    public void reservarVeiculo(Veiculo veiculo, String data, Rota rota){
        boolean sucesso = veiculo.reservar(data, rota);
        if (sucesso){
            System.out.println("Reserva realizada com sucesso!");
        } else{
            System.out.println("Falha ao realizar a reserva.");
        }
    }
}