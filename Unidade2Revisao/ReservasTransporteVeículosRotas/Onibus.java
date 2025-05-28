// Declaração da classe Onibus que herda (extends) da classe abstrata Veiculo
public class Onibus extends Veiculo {

    // Atributo específico da classe Onibus
    private int ano;

    // Constante (final) que define a velocidade fixa do ônibus
    private final double velocidade = 60.00;

    // Construtor da classe Onibus
    // Recebe os parâmetros ano, modelo e capacidade e passa os dois últimos para a superclasse Veiculo
    public Onibus(int ano, String modelo, int capacidade) {
        super(modelo, capacidade); // chama o construtor da classe pai (Veiculo)
        this.ano = ano; // atribui o valor do parâmetro ao atributo ano
    }

    // Getter (método de acesso) para o atributo ano
    public int getAno() {
        return ano;
    }

    // Setter (método de modificação) para o atributo ano
    public void setAno(int ano) {
        this.ano = ano;
    }

    // Getter para acessar o valor da constante velocidade
    // Como velocidade é final, não é necessário um setter
    public double getVelocidade() {
        return velocidade;
    }
      // Implementação do método abstrato definido na superclasse Veiculo
    // Aqui ele calcula o tempo estimado de viagem com base na velocidade fixa
    @Override
    public double CalcularTempo(double distancia) {
        return distancia / velocidade;
    }
}
