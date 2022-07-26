package prova_final_02;

import java.math.BigDecimal;

public class PessoaJuridica extends Cliente {

	public PessoaJuridica() {
		super("0.10");
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal getDesconto(int dias) {
		if (dias > 3) {
			return new BigDecimal("0.10");			
		}
		return new BigDecimal("0.00");	}

}
