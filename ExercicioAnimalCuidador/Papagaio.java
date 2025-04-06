public class Papagaio extends Animal {
    private String corPenas;
    private boolean podeFalar;
    private String origem;
    private double alturaVooMaxima;

    public Papagaio(String nome, int idade, String corPenas, boolean podeFalar, String origem, double alturaVooMaxima) throws Exception {
        super(nome, idade);
        this.corPenas = corPenas;
        this.podeFalar = podeFalar;
        this.origem = origem;
        this.alturaVooMaxima = alturaVooMaxima;
    }

    // fazer getters e setters dos atributos de "Papagaio" :)

    public void setcorPenas (String corPenas){
        this.corPenas = corPenas;
    }
    public void setpodeFalar (boolean podeFalar){
        this.podeFalar = podeFalar;
    }
    public void setOrigem (String origem){
        this.origem = origem;
    }
    
    public void setAlturaVooMaxima (double alturaVooMaxima){
        this.alturaVooMaxima = alturaVooMaxima;
    }

    public String getcorPenas (){
        return corPenas;
    }

    public boolean podeFalar (){
        return podeFalar;
    }

    public String getorigem (){
        return origem;
    }

    public double getalturaVooMaxima (){
        return alturaVooMaxima;
    }
    
    
    @Override
    public void emitirSom() {
        System.out.println("Alôooo! Loro quer biscoito!");
    }
}
