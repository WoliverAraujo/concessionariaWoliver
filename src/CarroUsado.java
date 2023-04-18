
public class CarroUsado extends Carro {
    private int quilometragem;
	private double valor;
	private int ano;

    public CarroUsado(String marca, String modelo, int ano, double valor, int quilometragem) {
        super(marca, modelo, ano, valor);
        this.valor = valor;
        this.quilometragem = quilometragem;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
    
    public int getAno() {
        return ano;
    }

    public void vender() {
				
	}
    
    public void informacoes() {
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Valor: R$" + this.valor);
        System.out.println("Quilometragem rodada: " + this.quilometragem + " km");
        System.out.println("---");
    }

	
}