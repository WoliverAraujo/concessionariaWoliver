
public class CarroNovo extends Carro {
    
	
	private String garantia;
    
    public CarroNovo(String marca, String modelo, int ano, String garantia) {
        super(marca, modelo, ano);
        this.garantia = garantia;
    }
    
    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    
    public void imprimirInformacoes() {
        System.out.println("Carro Novo:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Garantia: " + getGarantia());
    
    
    }
}
