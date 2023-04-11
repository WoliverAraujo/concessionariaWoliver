import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private List<Carro> carros;

    public Concessionaria() {
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void removerCarro(Carro carro) {
        carros.remove(carro);
    }

    public List<Carro> pesquisarCarrosPorMarca(String marca) {
        List<Carro> resultado = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getMarca().equals(marca)) {
                resultado.add(carro);
            }
        }
        return resultado;
    }

    public void imprimirCarros() {
        System.out.println("Carros na concessionária:");
        for (Carro carro : carros) {
            carro.imprimirInformacoes();
        }
    }
}