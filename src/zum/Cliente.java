package zum;

public class Cliente {
	protected static int quantidadeDeClientes = 0;
	protected int id;
	protected String nome;

	public Cliente (String inputNome) {
		quantidadeDeClientes++;
		this.id = quantidadeDeClientes;
		this.nome = inputNome;
	}
	
}
