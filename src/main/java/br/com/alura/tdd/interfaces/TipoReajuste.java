package br.com.alura.tdd.interfaces;

import br.com.alura.tdd.modelo.Funcionario;

public abstract class TipoReajuste {
	
	protected Funcionario funcionario;
	
	public TipoReajuste(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	protected void concederReajuste(TipoReajuste reajuste) {
		reajuste.concederReajuste(reajuste);
	}
}
