import java.util.ArrayList;

class Rota{
    private String origem;
    private String destino;
    private ArrayList<Veiculo> veiculosDisponiveis;

    public Rota(String origem, String destino){
        this.origem = origem;
        this.destino= destino;
        this.veiculosDisponiveis = new ArrayList <> ();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculosDisponiveis.add(veiculo);
    }

    public String listarVeiculos(){
        String resultado = " ";
        for (Veiculo v: veiculosDisponiveis) {
            resultado += "Modelo: "+v.getModelo() + ", Capacidade: ", + v.getCapacidade() + "\n";
        }
        return resultado;
        }

        public String getOrigem(){
            return origem;
        }

        public String getDestino(){
        return destino;
        }

        public ArrayList<Veiculo> getVeiculosDisponiveis(){
            return veiculosDisponiveis;
        }
}

