package zum;
import java.time.LocalDateTime;
import zum.Zum;


public class ZumService {
	static int quantidadeClientes = 0;
	private static LocalDateTime ultimaCompra = LocalDateTime.now().minusSeconds(10); // Inicializa com um tempo mais antigo


	public ZumService() {
		Cliente joao = new Cliente("João Silva");
		Zum.clientes.add(joao);
		Cliente maria = new Cliente("Maria Souza");
		Zum.clientes.add(maria);

		Produto notebookXYZ = new Produto("Notebook i7", 1);
		Zum.produtos.add(notebookXYZ);
	}




	public Pedido realizarCompra(Cliente comprador, Produto item) {
		Pedido pedidoProcessado = new Pedido(comprador, item);

		return pedidoProcessado;
	}




}
