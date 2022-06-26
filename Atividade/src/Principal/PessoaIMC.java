package Principal;

abstract class PessoaIMC extends Pessoa{

	public PessoaIMC(String nome, String dataNascimento, double peso, double altura) {
		super(nome, dataNascimento);
		this.peso = peso;
		this.altura = altura;
	}
			
	private double peso;
	private double altura;
	
	
	
	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public String ToString() {
		return "Nome: " + getNome() + "\n" + "Nascimento: " + getDataNascimento() + "\n" + "Peso: " + getPeso() + "\n" + "Altura: " + getAltura() + ".";
	}
	
	public double CalculaIMC(double peso, double altura) {
		double IMC = peso / (altura * altura);
		return IMC;
	}
	
	public abstract void ResultIMC();
	
	
}

