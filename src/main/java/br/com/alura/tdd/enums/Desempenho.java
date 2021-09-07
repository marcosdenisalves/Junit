package br.com.alura.tdd.enums;

import java.math.BigDecimal;

public enum Desempenho {
	A_DESEJAR {
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.03");
		}
	},
	BOM {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.15");
		}
	},
	OTIMO {
		@Override
		public BigDecimal percentualReajuste() {
			return new BigDecimal("0.2");
		}
	};
	
	public abstract BigDecimal percentualReajuste();
}
