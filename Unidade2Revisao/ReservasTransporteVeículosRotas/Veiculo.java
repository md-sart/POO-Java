public class Veiculo implements Reservavel{
    private String modelo;
    private int capacidade;

    public Veiculo(String modelo, int capacidade){
        this.modelo= modelo;
        this.capacidade= capacidade;
    }

    public abstract double CalcularTempo (double distancia);
    
    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getCapacidade(){
        return capacidade;
    }

    public void setCapacidade(int Capacidade){
        this.capacidade= capacidade;
        }
    }

public abstract double CalcularTempo(double distancia){
    @Override
    public boolean reservar(String data, Rota rota){
        System.out.println("Veículo " + modelo + " reservado para a data " + data + " na rota " + rota.getOrigem() + " -> " + rota.getDestino());
        return true;
    }
}
