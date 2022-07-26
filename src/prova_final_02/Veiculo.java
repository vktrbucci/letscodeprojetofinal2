package prova_final_02;

import java.math.BigDecimal;

public abstract class Veiculo {
	
	protected BigDecimal valorDiario;

    public Veiculo(String valorDiario) {
        this.valorDiario = new BigDecimal(valorDiario);
    }

    public BigDecimal getValorDiario() {
        return valorDiario;
    }

}
