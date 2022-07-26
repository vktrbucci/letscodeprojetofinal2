package prova_final_02;

import java.math.BigDecimal;

public abstract class Cliente {
	
	final private BigDecimal percentualDesconto;
	final private int minimoDias;

	public Cliente(final String percentualDesconto, final int minimoDias) {
		this.percentualDesconto = new BigDecimal(percentualDesconto);
		this.minimoDias = minimoDias;
	}

	public BigDecimal getPercentualDesconto() {
		return percentualDesconto;
	}

	public int getMinimoDias() {
		return minimoDias;
	}

	public BigDecimal getDesconto(int dias) {
		if (dias > this.getMinimoDias()) {
			return this.getPercentualDesconto();			
		}
		return new BigDecimal("0.00");
	}
	
}
