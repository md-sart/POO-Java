public class Cachorro extends Animal {
    //atributos
    private String raca;
    private boolean farejador;
    private int nivelEnergia;
    private boolean adestrado;

    //construtor
    public Cachorro(String nome, int idade, String raca, boolean farejador, int nivelEnergia, boolean adestrado) throws Exception {
        super(nome, idade);
        this.raca = raca;
        this.farejador = farejador;
        this.nivelEnergia = nivelEnergia;
        this.adestrado = adestrado;
    }

    // fazer getters e setters dos atributos de "Cachorro" :)

    public void setRaca(String raca){
        this.raca= raca;
    }

    public void setFarejador(boolean farejador){
        this.farejador = farejador;
    }

    public void setNivelEnergia(int nivelEnergia){
        this.nivelEnergia= nivelEnergia;
    }

    public void setAdestrado(boolean adestrado){
        this.adestrado= adestrado;
    }

    public String getRaca(){
        return raca;
    }

    public boolean getFarejador (){
        return farejador;
    }

    public int getNivelEnergia (){
        return nivelEnergia;
    }

    public boolean getAdestrado (){
        return adestrado;
    }

    //metodo
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
