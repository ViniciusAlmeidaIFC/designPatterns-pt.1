package factory_funcionarios;

public class Programador extends Pessoa implements Funcionario {

	private String infoFunc;
	
	public String infoFunc() {
		return infoFunc;
	}

	public String getInfoFunc() {
		return infoFunc;
	}

	public void setInfoFunc(String infoFunc) {
		this.infoFunc = infoFunc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Programador [infoFunc=");
		builder.append(infoFunc);
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getEndereco()=");
		builder.append(getEndereco());
		builder.append(", getFone()=");
		builder.append(getFone());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
