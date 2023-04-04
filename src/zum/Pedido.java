package zum;


public class Pedido {

	static int quantidadePedidos = 0;
	public int numero;
	protected Cliente comprador;
	protected Produto item;
	protected boolean statusPedido;
	
	public Pedido(Cliente comprador, Produto item) {
		quantidadePedidos++;

		this.numero = quantidadePedidos;
		this.comprador = comprador;
		this.item = item;
		this.statusPedido = item.quantidadeUnidades > 0;

		item.quantidadeUnidades--;

	}
	
}
