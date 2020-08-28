package factory_carros;

public class Main {

	public static void main(String[] args) {
		FabricaCarro fabrica = new FabricaFiat();
		Fiat fiat = new Fiat();
		fiat.setNome("Uno");
		fiat.setAno(2012);
		fiat.setMarca("Fiat");
		fiat.setInfoCarro("Carro em bom estado de conservação!");
		
		Carro carro = fabrica.criarCarro();
		carro = fiat;
		
		System.out.println(carro);
		
		VW vw = new VW();
		vw.setNome("Saveiro");
		vw.setAno(2019);
		vw.setMarca("VW");
		vw.setInfoCarro("Carro Novo");
		
		carro = fabrica.criarCarro();
		carro = vw;
		
		System.out.println(carro);
		
		
		

	}

}
