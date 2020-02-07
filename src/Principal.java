public class Principal {

	public static void main(String[] args) {
		//FIN DE LA TAREA NUMERO 7
		ITarjetaMonedero monedero = new Tarjeta("1234567890", "12345678A", 1234, 600);
		ITarjetaDebito tarjeta = new Tarjeta("1234567890", "12345678A", 5678, 50000);
		//FINAL DE LA TAREA 8
		System.out.println("Pagando con una tarjeta:");
		tarjeta.comprar(150, "12345678A");
		//FIN DE LA TAREA 9
		System.out.println("Total de la factura de El Corte Ingles 150€:");
		System.out.println("");
		System.out.println("El saldo actual del monedero es: " + monedero.getSaldo());
		System.out.println("Pagando con el monedero:");	
	}
}