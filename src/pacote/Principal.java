package pacote;

public class Principal {

	public static void main(String[] args) {
		Pedido pedido = new Pedido (9, "sckethbook", 1);
		System.out.println("Pedido");
		System.out.println("id: " + pedido.getId());
		System.out.println("produto: " + pedido.getProduto());
		System.out.println ("quantidade: " + pedido.getQuantidade());

	}

}
