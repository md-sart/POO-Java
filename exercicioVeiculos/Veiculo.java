package exercicioVeiculos;

public class Veiculo {
    //Veiculo com os atributos marca, modelo e ano, e um método informacoes()
    private String marca;
    private String modelo;
    private int ano;


public Veiculo (String marca, String modelo, int ano){
    this.marca=marca;
    this.modelo=modelo;
    this.ano=ano;
    }

public void setMarca (String marca){
    this.marca=marca;
}

public void setModelo(String modelo){
    this.modelo=modelo;
}

public void setAno (int ano){
    this.ano=ano;
}

public String getMarca(){
    return marca;
} 

public String getModelo(){
    return modelo;
}

public int getAno(){
    return ano;
}

public void exibirInformacoes(){
    System.out.println("Marca do carro: " + marca + "Modelo do carro: " + modelo + "Ano: " + ano);
}

}
