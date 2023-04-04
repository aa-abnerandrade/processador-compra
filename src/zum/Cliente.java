package zum;

import java.util.ArrayList;


public class Cliente {
	protected static int quantidadeDeClientes = 0;

	protected int id;
	protected String nome;
	protected ArrayList<Pedido> pedidos = new ArrayList<>();
	
	
	public Cliente (String inputNome) {
		quantidadeDeClientes++;
		this.id = quantidadeDeClientes;
		this.nome = inputNome;

	}
	
}
