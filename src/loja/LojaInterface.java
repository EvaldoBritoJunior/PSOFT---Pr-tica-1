package loja;

public class LojaInterface {
	
	ProdutoService ps;
	
	public LojaInterface() {
		ps = new ProdutoService();
	}
	
	public void addProduto(String nome, String fabricante, double preco) {
		ps.addProduto(nome, fabricante, preco);
	}
	
	public void getProduto(String nome, String fabricante) {
		ps.getProduto(nome, fabricante);
	} 

}
