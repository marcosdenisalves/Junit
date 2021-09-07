package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaLancarUmaExceptionSeFalhar() {
		BonusService service = new BonusService();
		assertThrows(IllegalArgumentException.class, () -> 
		service.calcularBonus(new Funcionario("Dênis", LocalDate.now(), new BigDecimal("25000"))));

//		try {
//			service.calcularBonus(new Funcionario("Dênis", LocalDate.now(), new BigDecimal("25000")));
//			fail("Não lançou a exception");
//		} catch (Exception e) {
//			assertEquals("Funcionário com o salario maior do que R$1000 não pode receber o bonus!", e.getMessage());
//		}
	}
}
