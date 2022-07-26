package prova_final_02;

import java.math.BigDecimal;

public class Aluguel {
	
	private Veiculo veiculo;
    private Cliente cliente;
    private int dias;
    private BigDecimal valorAluguel;
    private BigDecimal valorDesconto;
    private BigDecimal valorAluguelComDesconto;

    public Aluguel(final Veiculo veiculo, final Cliente cliente, final int dias) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dias = dias;        
        this.valorAluguel = this.calcularValorAluguel();
        this.valorDesconto = this.calcularDesconto();
        this.valorAluguelComDesconto = this.calcularValorAluguelComDesconto();
    }

    private BigDecimal calcularValorAluguel() {
        return this.veiculo.getValorDiario().multiply(new BigDecimal(this.dias));
    }
    
    public BigDecimal getValorAluguel() {
		return valorAluguel;
	}
    
    public BigDecimal getValorDesconto() {
		return valorDesconto;
	}
    
    private BigDecimal calcularDesconto() {
    	return cliente.getDesconto(dias).multiply(valorAluguel);
    }
    
    public BigDecimal calcularValorAluguelComDesconto() {
    	return this.valorAluguel.subtract(valorDesconto);
    }
    
    @Override
    public String toString() {
    	return String.format(
                  "Veículo:                  %s\n"
    			+ "Valor da diária:          R$ %7.2f\n"
    			+ "Quantidade de dias:          %4d\n"
    			+ "Valor do aluguel:         R$ %7.2f\n"
    			+ "Desconto aplicado:        R$ %7.2f\n"
    			+ "Valor final com desconto: R$ %7.2f",
    			this.veiculo, this.veiculo.getValorDiario(), this.dias,
    			this.getValorAluguel().doubleValue(), this.getValorDesconto().doubleValue(),
    			this.valorAluguelComDesconto.doubleValue());
    }
    

}
