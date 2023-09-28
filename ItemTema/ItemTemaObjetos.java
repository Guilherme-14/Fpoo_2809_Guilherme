package ItemTema;

public class ItemTemaObjetos {

	public static void main(String[] args) {
		ItemTemaClasse item1 = new ItemTemaClasse(1, "Jp", "Legal");

		System.out.println(item1.getid());
		System.out.println(item1.getNome());
		System.out.println(item1.getDescricao());
	}

}
