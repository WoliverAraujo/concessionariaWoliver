
public abstract class Movimento {
    protected Carro carro;
    protected double valor;

    public abstract double calcularTotal();

    public Carro getCarro() {
        return carro;
    }

    public double getValor() {
        return valor;
    }

	public String getData() {
		// TODO Auto-generated method stub
		return null;
	}
}
