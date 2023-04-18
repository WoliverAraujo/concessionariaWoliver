
public class Concessionaria {
    public static void main(String[] args) {
        
        CarroNovo carroNovo = new CarroNovo("Toyota", "Corolla", 2022, 120000.0);
        CarroUsado carroUsado = new CarroUsado("Ford", "EcoSport", 2018, 50000.0, 10000);

        
        carroNovo.vender();
        carroUsado.vender();
    }
}