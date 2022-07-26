package prova_final_02;

import java.math.BigDecimal;

public abstract class Cliente {
	
	private BigDecimal percentualDesconto;
	
	public Cliente(String percentualDesconto) {
		this.percentualDesconto = new BigDecimal(percentualDesconto);
	}

	public abstract BigDecimal getDesconto(int dias);
	
}
