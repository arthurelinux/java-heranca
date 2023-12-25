package bytebanck_herdado;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario nico = new Funcionario();
		nico.setCpf("111.111.111-11");
		nico.setNome("Nico");
		nico.setSalario(2600);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
