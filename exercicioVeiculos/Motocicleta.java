package exercicioVeiculos;

public class Motocicleta extends Veiculo {
    private String tipoDeGuidao;

    public Motocicleta(String marca, String modelo, int ano, String tipoDeGuidao) {
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    public void setTipoDeGuidao(String tipoDeGuidao) {
        this.tipoDeGuidao = tipoDeGuidao;
    }

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Marca: " + getMarca() +
                           ", Modelo: " + getModelo() +
                           ", Ano: " + getAno() +
                           ", Tipo de Guidão: " + tipoDeGuidao);
    }
}
