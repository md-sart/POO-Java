package exercicioControleEscolar;

public class Aluno {
    private String nome;
    private int idade;
    private String serie;

    public Aluno (String nome, int idade, String serie){
    this.nome = nome;
    this.idade = idade;
    this.serie = serie;
    }

public void setNome (String nome){
    this.nome=nome;
}

public void setIdade (int idade){
    this.idade=idade;
}

public void setSerie (String serie){
this.serie=serie;
}

public String getNome(){
    return nome;
}

public int getIdade (){
    return idade;
}

public String getSerie (){
    return serie;
}

public void exibirInformacoes(){
    System.out.println("Nome:" + nome + "Idade:" + idade + "Serie:" + serie);
}

}

