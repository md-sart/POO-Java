package ExercicioVeiculos;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

public void setNumerodePortas(int numeroDePortas){
this.numeroDePortas=numeroDePortas;
}

public int getNumeroDePortas(){
    return numeroDePortas;
}

@Override
public void exibirInformacoes(){
    System.out.println("Marca: " + getMarca() +
    ", Modelo: " + getModelo() +
    ", Ano: " + getAno() +
    ", Numero de portas: " + numeroDePortas);
}
}
