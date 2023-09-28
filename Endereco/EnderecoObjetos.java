package Endereco;

public class EnderecoObjetos {

	public static void main(String[] args) {
		EnderecoClasse endereco1 = new EnderecoClasse(1,"Rua dos Bobos",
				0, "Nao precisa" , "ZéGotinha" , "Diamantina" , "222-222-222-2" , "São Paulo");
		
		System.out.println(endereco1.getId());
		System.out.println(endereco1.getRua());
		System.out.println(endereco1.getNumero());
		System.out.println(endereco1.getComplemento());
		System.out.println(endereco1.getBairro());
		System.out.println(endereco1.getCidade());
		System.out.println(endereco1.getCep());
		System.out.println(endereco1.getUf());
	}

}
