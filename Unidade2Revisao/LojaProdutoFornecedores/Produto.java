public abstract class Produto implements Fornecimento{
    String nome;
    double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double CalcularDesconto(double desconto);

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome= nome;
    }

    public double getPreco(){
        return preco;
    }

    public void getPreco(){
        this.preco= preco;
    }
}