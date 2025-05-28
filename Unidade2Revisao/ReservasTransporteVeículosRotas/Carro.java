public class Carro extends Veiculo{
    private String cor;
    private final double velocidade = 200.00;

    public Carro(String cor, String modelo, int capacidade){
        super(modelo, capacidade);
        this.cor= cor;
    }

    public int getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor= cor;
    }

    public double getVelocidade(){
        return velocidade;
    }

    @Override
    public double CalcularTempo(double distancia){
        return distancia/ velocidade;
    }
}