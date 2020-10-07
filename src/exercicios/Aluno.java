package exercicios;

public class Aluno {

	private String nome;

	public Aluno(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno a = (Aluno) obj;
		return this.nome.equals(a.getNome());
	}

	@Override
	public int hashCode() {
		return this.nome.charAt(0);
	}
}
