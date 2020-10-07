package Launch;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import exercicios.Aluno;

public class LaunchBancoAluno {
	
	public static void main(String[] args) {
		
		Set<Aluno> hashSetAluno = new HashSet<Aluno>();
		Set<Aluno> treeSetAluno = new TreeSet<Aluno>();
		
		Aluno aluno1 = new Aluno("Maycon");
		Aluno aluno2 = new Aluno("Santana");
		
		hashSetAluno.add(aluno1);
		hashSetAluno.add(aluno2);
		
		hashSetAluno.remove(aluno1);
		treeSetAluno.remove(aluno2);
		
		for (Aluno aluno : hashSetAluno) {
			System.out.println("Nome: " + aluno.getNome());
		}
		
		for (Aluno aluno : treeSetAluno) {
			System.out.println("Nome: " + aluno.getNome());
		}
		
	}

}
