package exercicioContaCorrente;

public class contaCorrente {
    private String numeroDaConta;
    private double saldo;
    private String nomeDoTitular;

    public contaCorrente(String numeroDaConta, double saldo, String nomeDoTitular){
    this.numeroDaConta=numeroDaConta;
    this.saldo=saldo;
    this.nomeDoTitular= nomeDoTitular;
    }

    public void setNumeroDaConta (String numeroDaConta){
        this.numeroDaConta=numeroDaConta;
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    public void getNomeDoTitular(String nomeDoTitular){
        this.nomeDoTitular=nomeDoTitular;
    }

    public String getNumeroDaConta(){
        return numeroDaConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getNomeDoTitular(){
        return nomeDoTitular;
    }

    public void depositarValor(double valor) throws Exception{
        if (valor < 0){
            throw  new Exception ("O valor deve ser maior que 0");
        }
        saldo = saldo + valor;
        } 

        public void sacarValor(double valor) throws Exception{
            if (valor < 0){
                throw  new Exception ("O valor deve ser maior que 0");
            }
            if (saldo < 0){
                throw  new Exception ("Voce nao tem saldo suficiente!");
            }
            saldo = saldo - valor;
            } 
    
            public void exibirSaldo() {
                System.out.println("Saldo da conta " + numeroDaConta + " (Titular: " + nomeDoTitular + "): R$" + saldo);
            }
        
    

    }

