
public class CarroUsado extends Carro {
    private int quilometragem;

    public CarroUsado(String marca, String modelo, int ano, int quilometragem) {
        super(marca, modelo, ano);
        this.quilometragem = quilometragem;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Carro Usado:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Quilometragem: " + getQuilometragem());
    }
}