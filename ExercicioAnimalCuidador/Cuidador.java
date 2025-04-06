public class Cuidador {
    private int anosExperiencia;
    private String especialidade;
    private String turno;
    private String cpf;
    private Animal animalCuidado;

    public Cuidador(int anosExperiencia, String especialidade, String turno, String cpf) {
        this.anosExperiencia = anosExperiencia;
        this.especialidade = especialidade;
        this.turno = turno;
        this.cpf = cpf;
    }

    public void cuidarDeAnimal(Animal animal) {
        this.animalCuidado = animal;
        System.out.println("Cuidando de " + animal.getNome());
    }

    // fazer getters e setters dos atributos de "Cuidador" :)

    public void setAnosExperiencia(int anosExperiencia){
        this.anosExperiencia=anosExperiencia;
    }

    public void setEspecialidade(String especialidade){
        this.especialidade=especialidade;
    }

    public void setTurno(String turno){
        this.turno=turno;
    }

    public void setCpf(String cpf){
        this.cpf=cpf;
    }

    public void setAnimalCuidado (Animal animalCuidado){
        this.animalCuidado=animalCuidado;
    }

    public int getAnosExperiencia(){
        return anosExperiencia;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public String getTurno(){
        return turno;
    }

    public String getCpf(){
        return cpf;
    }

    public Animal getAnimalCuidado (){
        return animalCuidado;
    }
    
}
