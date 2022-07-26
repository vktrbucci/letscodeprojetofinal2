package prova_final_02;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( "App para locação de veículo!\n\n" );

        final Aluguel aluguel = new Aluguel(new Pequeno(), new PessoaFisica(), 7);

        System.out.println(aluguel);
        
	}

}
