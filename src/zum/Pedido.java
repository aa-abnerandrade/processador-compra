package zum;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Pedido {
	LocalTime horaAtual = LocalTime.now();
	DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm:ss");

	static int quantidadePedidos = 0;
	public int numero;
	protected Cliente comprador;
	protected Produto item;
	protected boolean statusPedido;

	/**
	 * Cria um novo objeto Pedido.
	 *
	 * @param comprador O cliente que fez o pedido.
	 * @param item O produto pedido.
	 */
	public Pedido(Cliente comprador, Produto item) {
		quantidadePedidos++;

		this.numero = quantidadePedidos;
		this.comprador = comprador;
		this.item = item;
		this.statusPedido = item.quantidadeUnidades > 0;

		item.quantidadeUnidades--;

		LocalTime horaAtual = LocalTime.now();
		System.out.println("Horário do Pedido: " + horaAtual.format(formatadorHora));
	}

}
