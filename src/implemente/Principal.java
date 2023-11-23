package implemente;

public class Principal {

	public static void main(String[] args) {
		Livro livro = new Livro ("Cooler", 200 );
		System.out.println("Livro");
		System.out.println("Autor/a: " + livro.getAutor());
		System.out.println("paginas: " + livro.getPaginas());
		
		Produto produto = new Produto ("Cooler", 200,"A mente de um adolescente confuso");
		System.out.println("Produto");
		System.out.println("nome: " + produto.getNome());
		
	}

}
