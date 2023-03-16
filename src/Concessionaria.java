import java.util.ArrayList;

public class Concessionaria  extends Carro {
    public Concessionaria(String placa, String modelo, int ano, String fabricante, double preco) {
		super(placa, modelo, ano, fabricante, preco);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Carro> carros = new ArrayList<>();

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }
    
    public void removerCarro(String placa) {
        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getPlaca().equals(placa)) {
                carros.remove(i);
                System.out.println("Carro removido com sucesso!");
                return;
            }
        }
        System.out.println("Carro não encontrado!");
    }
    
    public void buscarCarro(String placa) {
        for (Carro carro : carros) {
            if (carro.getPlaca().equals(placa)) {
                System.out.println(carro.toString());
                return;
            }
        }
        System.out.println("Carro não encontrado!");
    }
    
    public void listarCarros() {
        System.out.println("Carros na concessionária:");
        for (Carro carro : carros) {
            System.out.println(carro.toString());
        }
    }
}