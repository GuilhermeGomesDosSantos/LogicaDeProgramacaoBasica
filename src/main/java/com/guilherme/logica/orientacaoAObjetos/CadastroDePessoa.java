package com.guilherme.logica.orientacaoAObjetos;

import java.text.ParseException;
import java.util.ArrayList;

public class CadastroDePessoa {
	
	ArrayList<Pessoa> pessoaList = new ArrayList<>();
	
	Maternidade maternidade = new Maternidade();
	
	public static void main(String[] args) throws ParseException {
		new CadastroDePessoa().rodar();
	}

	private void rodar() throws ParseException {
		Pessoa zumba = maternidade.nascer("Zumba Games", "Masculino");
		Pessoa zefrina = maternidade.nascer("Zefrina Silva", "Feminino");
		Pessoa joao = maternidade.nascer("Joao Silva", "Masculino");
		Pessoa robo = maternidade.nascer("Robo Android", "Robo");
		
		pessoaList.add(zumba);
		pessoaList.add(zefrina);
		pessoaList.add(joao);
		pessoaList.add(robo);
		
		ArrayList<Pessoa> homemList = new ArrayList<>();
		ArrayList<Pessoa> mulherList = new ArrayList<>();
		ArrayList<Pessoa> outrosGenero = new ArrayList<>();
		
		for (Pessoa pessoa : pessoaList) {
			if (pessoa.getSexo().equals("Masculino")) {
				homemList.add(pessoa);
				
			} else if (pessoa.getSexo().equals("Feminino")) {
				mulherList.add(pessoa);
				
			} else {
				outrosGenero.add(pessoa);
			}
			
		}
		
		System.out.println("");
	}
}
