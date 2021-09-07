package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.enums.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {
	
	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
			BigDecimal percentual = desempenho.percentualReajuste();
			BigDecimal rejuste = funcionario.getSalario().multiply(percentual);
			funcionario.reajustarSalario(rejuste);
	}
}
