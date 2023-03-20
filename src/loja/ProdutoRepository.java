package loja;

import java.util.HashMap;
import java.util.Map;

public class ProdutoRepository {
		
	private Map<Integer, Produto> produtoList;

	public ProdutoRepository() {
		produtoList = new HashMap<Integer, Produto>();
	}
	
	public void addProduto(Produto p) {
		produtoList.put(p.hashCode(), p);
	}
	
	public Produto getProduto(int id) {
		return produtoList.get(id);
	}
}
