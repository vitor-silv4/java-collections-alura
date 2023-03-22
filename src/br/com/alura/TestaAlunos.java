package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		// Efeito sacola, não aceita objetos repetidos, mais rapido em velocidade e performance

		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		
		boolean albetoEstaMatriculado = alunos.contains("Alberto");
		alunos.remove("Sergio Lopes");
		System.out.println(albetoEstaMatriculado);

		System.out.println(alunos.size());

		System.out.println(alunos);

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		//List<String> alunosEmLista = new ArrayList<>(alunos);

	}

}
