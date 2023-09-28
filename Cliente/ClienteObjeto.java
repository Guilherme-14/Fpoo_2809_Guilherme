package Cliente;

public class ClienteObjeto {

	public static void main(String[] args) {
		ClienteClasse cliente1 = new ClienteClasse(1 , "David" , "(15)999021979" , "462-642-246-64" , "444-555-666-2");

		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
	}

}
