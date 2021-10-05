
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());
		
		Cliente jefferson = new Cliente();
		//conta.titular = jefferson;
		jefferson.setNome("jefferson soares");
		
		conta.setTitular(jefferson);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(jefferson);
		System.out.println(conta.getTitular());
	}
}
