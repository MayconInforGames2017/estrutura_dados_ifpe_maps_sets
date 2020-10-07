package exercicios;

public class Produto {

	private long codigo;
	private String nome;
	private double preco;

	public Produto(long codigo, String nome, double preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public boolean equals(Object prod) {
		Produto outroProduto = null;
		if (prod instanceof Produto) {
			outroProduto = (Produto) prod;
			boolean comp = codigo == outroProduto.codigo;
			comp = comp && nome.equalsIgnoreCase(outroProduto.nome);
			comp = comp && preco == outroProduto.preco;
			return comp;	
			
		}
		return false;
	}

	@Override
	public int hashCode() {
		return pegarNumeroUnidade(this.codigo); 
	}
	
	private int pegarNumeroUnidade(long cod) {
		return (int)(cod % 10);
	}
	
}
