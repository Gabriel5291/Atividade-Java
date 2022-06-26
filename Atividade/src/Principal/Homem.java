package Principal;

class Homem extends PessoaIMC{
	
	public Homem(String setNome, String setDataNascimento, double setPeso, double setAltura) {
		super(setNome, setDataNascimento, setPeso, setAltura);
	}

	public void ResultIMC() {
		double h = 0;
		if (h < 20.7) {
			System.out.println("Abaixo do peso ideal");
		}
		else if (h > 26.4) {
			System.out.println("A do peso ideal");
		}
		else {
			System.out.println("Peso ideal");
		}
		
	}
	
	
}
