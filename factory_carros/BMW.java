package factory_carros;

public class BMW extends Carros implements Carro {

	private String infoCarro;
	@Override
	public String infoCarro() {
		return infoCarro;
	}
	public String getInfoCarro() {
		return infoCarro;
	}
	public void setInfoCarro(String infoCarro) {
		this.infoCarro = infoCarro;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BMW [infoCarro=");
		builder.append(infoCarro);
		builder.append(", getMarca()=");
		builder.append(getMarca());
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getAno()=");
		builder.append(getAno());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
