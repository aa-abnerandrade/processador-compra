package zum;
import java.time.LocalDateTime;
import zum.Zum;

/**
 * Classe responsável por realizar compras e gerenciar os pedidos de clientes no sistema Zum.
 */
public class ZumService {
	private static LocalDateTime ultimaCompra = LocalDateTime.now().minusSeconds(10); // Inicializa com um tempo mais antigo

	/**
	 * Construtor da classe ZumService que inicializa a lista de clientes e produtos do sistema Zum.
	 */
	public ZumService() {
		Cliente joao = new Cliente("João Silva");
		Zum.clientes.add(joao);
		Cliente maria = new Cliente("Maria Souza");
		Zum.clientes.add(maria);

		Produto notebookXYZ = new Produto("Notebook i7", 1);
		Zum.produtos.add(notebookXYZ);
	}

	/**
	 * Realiza a compra de um produto por um cliente, gerando um pedido processado.
	 *
	 * @param comprador O cliente que está realizando a compra.
	 * @param item O produto que está sendo comprado.
	 * @return O pedido processado.
	 */
	public Pedido realizarCompra(Cliente comprador, Produto item) {
		Pedido pedidoProcessado = new Pedido(comprador, item);
		return pedidoProcessado;
	}

}
