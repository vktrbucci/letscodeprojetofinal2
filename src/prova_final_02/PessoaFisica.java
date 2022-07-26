package prova_final_02;

import java.math.BigDecimal;

public class PessoaFisica extends Cliente {

	public PessoaFisica() {
		super("0.05");
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal getDesconto(int dias) {
		if (dias > 5) {
			return new BigDecimal("0.05");			
		}
		return new BigDecimal("0.00");
	}
	

}
