public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) throws Exception {
        if (idade <= 0) {
            throw new Exception("A idade deve ser maior que 0");
        }
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}
