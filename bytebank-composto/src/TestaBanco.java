
public class TestaBanco {
	public static void main(String[] args) {
		Cliente jefferson = new Cliente();
		jefferson.nome = "Jefferson Soares";
		jefferson.cpf = "424.679.388-40";
		jefferson.profissao = "programador";
		
		Conta contaDoJefferson = new Conta();
		contaDoJefferson.deposita(100);
		
		//associa o cliente jefferson a conta contaDoJefferson
		contaDoJefferson.titular = jefferson;
		System.out.println(contaDoJefferson.titular.nome);
		
		
	}
}
