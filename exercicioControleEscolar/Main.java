public class Main {
    public static void main (String[] args) {
        Aluno aluno1 = new Aluno("Pedro", 12, "3º ano");
        Aluno aluno2 = new Aluno("Maria", 13, "4º ano");
        Aluno aluno3 = new Aluno("Ste", 11, "2º ano");   

        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
        aluno3.exibirInformacoes();
    }
}