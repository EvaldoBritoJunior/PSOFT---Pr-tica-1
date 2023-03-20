package loja;

public class ProdutoService {
	
	private ProdutoRepository pr;
	
	public ProdutoService() {
		pr = new ProdutoRepository();
	}
	
	public void addProduto(String nome, String fabricante, double preco) {
		Produto p = new Produto(nome, fabricante, preco);
		pr.addProduto(p);
	}
	
	public void getProduto(String nome, String fabricante) {
		pr.getProduto((nome + fabricante).hashCode());
	}

}
