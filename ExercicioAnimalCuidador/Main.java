public class Main {
    
    public static void main(String[] args) {
        
        // criando um cachorro 
        Cachorro cachorro = new Cachorro("Rex", 5, "Labrador", true, 80, true);
        cachorro.emitirSom(); //emitindo som...

        // criando um cuidador
        Cuidador cuidador = new Cuidador(10, "Adestrador", "Manhã", "123.456.789-00");
        cuidador.cuidarDeAnimal(cachorro) ; // cuidador cuida do animal cachorro criado anteriormente

        // criando um papagaio
        Papagaio papagaio = new Papagaio("Loro", 3, "Verde", true, "Amazônia", 50.0);
        papagaio.emitirSom();

        cuidador.cuidarDeAnimal(papagaio); //agora o cuidador não cuida mais do cachorro, cuida do papagaio :)

        System.out.println("Idade do papagaio antes: " + papagaio.getIdade()); // idade atual do papagaio criado
        
        try { //tentando alterar idade do papagaio
            papagaio.setIdade(-1);
        } catch (Exception e) {
            System.out.println("Erro ao alterar idade: " + e.getMessage());
        }

        System.out.println("Idade do papagaio depois: " + papagaio.getIdade()); // mostrando idade após tentativa de alteração
    }

}
