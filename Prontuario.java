public class Prontuario {
	private Paciente paciente;
	private int numeroProntuario;
	private String diagnosticoFinal;

	//metodo construtor da classe
	public Prontuario(Paciente paciente, int numeroProntuario) {
		super();
		this.paciente = paciente;
		this.numeroProntuario = numeroProntuario;
	}

	public void exibeProntuario() {
		System.out.println("** Prontuario **");
		System.out.println("Nome: " + this.paciente.getNome());
		System.out.println("CPF: " + this.paciente.getCpf());

	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public int getNumeroProntuario() {
		return numeroProntuario;
	}

	public void setNumeroProntuario(int numeroProntuario) {
		this.numeroProntuario = numeroProntuario;
	}

	public String getDiagnosticoFinal() {
		return diagnosticoFinal;
	}

	public void setDiagnosticoFinal(String diagnosticoFinal) {
		this.diagnosticoFinal = diagnosticoFinal;
	}
	
}

