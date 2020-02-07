public class Principal {

	public static void main(String[] args) {
		ITarjetaMonedero monedero = new Tarjeta("1234567890", "12345678A", 1234, 600);
		ITarjetaDebito tarjeta = new Tarjeta("1234567890", "12345678A", 5678, 50000);
	}
}