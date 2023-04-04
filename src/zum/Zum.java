package zum;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Zum {
	private static LocalDateTime ultimaCompra = LocalDateTime.now().minusSeconds(10); // Inicializa com um tempo mais antigo


	public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public static ArrayList<Produto> produtos = new ArrayList<Produto>();
	public static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();


	public static void main(String[] args) {
		Pedido novoPedido;

		ZumService initZumService = new ZumService();
		LocalDateTime agora = LocalDateTime.now();


		// Pedido de João - Cliente 1
		novoPedido = initZumService.realizarCompra(clientes.get(0), produtos.get(0));
		pedidos.add(novoPedido);
		// Pedido de Maria - Cliente 2
		novoPedido = initZumService.realizarCompra(clientes.get(1), produtos.get(0));
		pedidos.add(novoPedido);


		for (Pedido pedido : pedidos) {
			System.out.println("\nPedido nº " + pedido.numero + "\n" +
								"Cliente  " + pedido.comprador.nome + "\n" +
								"Produto  "	+ pedido.item.item + "\n" +
								"Status   " + ((pedido.statusPedido) ? "Aprovada" : "Negada") );
		}

	}

}
