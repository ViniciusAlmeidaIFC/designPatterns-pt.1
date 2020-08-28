package factory_carros;

public class Carros {

	private String marca;
	private String nome;
	private int ano;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carros [marca=");
		builder.append(marca);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", ano=");
		builder.append(ano);
		builder.append("]");
		return builder.toString();
	}
	
	
}
