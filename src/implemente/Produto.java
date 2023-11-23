package implemente;

public class Produto extends Livro{
private String nome;
	public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
	public Produto(String autor, int paginas, String nome) {
	super(autor, paginas);
	this.nome = nome;
}
	public Produto(String autor, int paginas) {
		super(autor, paginas);
		
	}
}

