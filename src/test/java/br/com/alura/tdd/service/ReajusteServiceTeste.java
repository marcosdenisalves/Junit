package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.enums.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTeste {

	private static final String VALOR_A_DESEJAR = "1030.00";
	private static final String VALOR_BOM = "1150.00";
	private static final String VALOR_OTIMO = "1200.00";

	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Patrica", LocalDate.now(), new BigDecimal("1000"));

		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

		assertEquals(new BigDecimal(VALOR_A_DESEJAR), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Tiriríca", LocalDate.now(), new BigDecimal("1000"));

		service.concederReajuste(funcionario, Desempenho.BOM);

		assertEquals(new BigDecimal(VALOR_BOM), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForOtimo() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Emílio", LocalDate.now(), new BigDecimal("1000"));

		service.concederReajuste(funcionario, Desempenho.OTIMO);

		assertEquals(new BigDecimal(VALOR_OTIMO), funcionario.getSalario());
	}
}
