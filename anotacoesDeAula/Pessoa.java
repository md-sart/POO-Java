package anotacoesDeAula;

public class Pessoa {
    private String nome;
    private String data;

    public Pessoa (String nome, String data){
        this.nome = nome;
        this.data = name;
    }

    //fazer getters e setters


//herdar informações de uma classe pra outra: 
//exemplo classe (classe mae) -> Pessoa - nome e data
//clases filhas PessoaFisica-> cpf e rg / PessoaJuridica -> CNPJ e nome fantasia
//ambas herdam nome e data da classe mae pessoa
//segue o exemplo abaixo:

//Pessoa fisica

public class PessoaFisica extends Pessoa{
    private String CPF;
    private String RG;
    
    public class PessoaFisica (String CPF, String RG, String nome, String data){
        super(nome, data);
        this.RG = RG;
        this.CPF = CPF;
        //forma 2 (em substituicao ao super -> get e set)
        //fazer o metodo andar
        //fazer getters e setters
        }

        public class PessoaJuridica extends Pessoa{
            private String CNPJ;
            private String NomeFantasia;
            
            public class PessoaJuridica (String CNPJ, String NomeFantasia, String nome, String data){
                super(nome, data);
                this.CNPJ = CNPJ;
                this.NomeFantasia = NomeFantasia;
                //forma 2 (em substituicao ao super -> get e set)
                //fazer o metodo andar
                //fazer getters e setters
                }


    }

}