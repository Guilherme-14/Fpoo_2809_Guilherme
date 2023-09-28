package Tema;

public class TemaObjetos {

	public static void main(String[] args) {
		
		TemaClasse tema1 = new TemaClasse();
		tema1.setid(1);
		tema1.setNome("Guilherme");
		tema1.setValorAluguel(1500);
		tema1.setCorToalha("Amarelo");
		
		System.out.println(tema1.getid());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCorToalha());
	}

}
