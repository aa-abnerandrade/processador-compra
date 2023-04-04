package zum;


public class Produto {
	public static int codigoProdutos = 0;

	protected int codigo;
	protected String item;
	public int quantidadeUnidades;
	public static boolean estaDisponivel;


	public Produto(String inputItem, int inputQuantidade) {
		codigoProdutos++;

		this.codigo = codigoProdutos;
		this.item = inputItem;
		quantidadeUnidades = inputQuantidade;
		estaDisponivel = quantidadeUnidades > 0;
	}
	
	

	
}
