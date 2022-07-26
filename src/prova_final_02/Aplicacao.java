package prova_final_02;

public class Aplicacao {

	public static void main(String[] args) {
		
		System.out.println( "App para locacao de veículo!\n\n" );

        final Aluguel aluguel = new Aluguel(new Pequeno(), new PessoaFisica(), 7);

        System.out.println(aluguel);
        
	}

}
