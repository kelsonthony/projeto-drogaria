package br.com.kelsonthony.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.kelsonthony.drogaria.domain.Pessoa;

/**
 * @author kanthony
 *
 */
public class PessoaDAOTest {
	
	
	@SuppressWarnings("unused")
	@Test
	@Ignore
	public void salvar() {
		String nome = "Mchilanny Bussinguer";
		
		String cpf = "02304849130";
		
		String rg = "2483874";
		
		String rua = "Rua 20 Sul";
		
		Short numero = 12;
		
		String bairro = "Águas Claras";
		
		String cep = "71925360";
		
		String complemento = "Águas Claras Sul";
		
		String telefone = "61996945878";
		
		String celular = "61996945878";
		
		String email = "k.thony@gmail.com";
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome(nome);
		pessoa.setCpf(cpf);
		pessoa.setRg(rg);
		pessoa.setRua(rua);
		pessoa.setNumero(numero);
		pessoa.setBairro(bairro);
		pessoa.setCep(cep);
		pessoa.setComplemento(complemento);
		pessoa.setTelefone(telefone);
		pessoa.setCelular(celular);
		pessoa.setEmail(email);
		
		if( pessoa == null ) {
			System.out.println("Nenhuma pessoa informada :(");
		}else {
			
			PessoaDAO pessoaDAO = new PessoaDAO();
			pessoaDAO.salvar(pessoa);
			
			System.out.println("#################");
			System.out.println("Código da pessoa: " + pessoa.getCodigo());
			System.out.println("Nome da pessoa: " + pessoa.getNome());
			System.out.println("CPF da  pessoa: " + pessoa.getCpf());
			System.out.println("RG da pessoa: " + pessoa.getRg());
			System.out.println("Rua: : " + pessoa.getRua());
			System.out.println("Número: : " + pessoa.getNumero());
			System.out.println("Bairro: " + pessoa.getBairro());
			System.out.println("CEP: " + pessoa.getCep());
			System.out.println("Complemento: " + pessoa.getComplemento());
			System.out.println("Telefone: " + pessoa.getTelefone());
			System.out.println("Email: " + pessoa.getEmail());
		}
		
	}
	
	@Test
	@Ignore
	public void listar() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> resultado = pessoaDAO.listar();
		
		for( Pessoa pessoa : resultado ) {
			System.out.println("#################");
			System.out.println("Código da pessoa: " + pessoa.getCodigo());
			System.out.println("Nome da pessoa: " + pessoa.getNome());
			System.out.println("CPF da  pessoa: " + pessoa.getCpf());
			System.out.println("RG da pessoa: " + pessoa.getRg());
			System.out.println("Rua: : " + pessoa.getRua());
			System.out.println("Número: : " + pessoa.getNumero());
			System.out.println("Bairro: " + pessoa.getBairro());
			System.out.println("CEP: " + pessoa.getCep());
			System.out.println("Complemento: " + pessoa.getComplemento());
			System.out.println("Telefone: " + pessoa.getTelefone());
			System.out.println("Email: " + pessoa.getEmail());
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		Long codigoPessoa = 3L;
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
		
		System.out.println("#################");
		System.out.println("Código da pessoa: " + pessoa.getCodigo());
		System.out.println("Nome da pessoa: " + pessoa.getNome());
		System.out.println("CPF da  pessoa: " + pessoa.getCpf());
		System.out.println("RG da pessoa: " + pessoa.getRg());
		System.out.println("Rua: : " + pessoa.getRua());
		System.out.println("Número: : " + pessoa.getNumero());
		System.out.println("Bairro: " + pessoa.getBairro());
		System.out.println("CEP: " + pessoa.getCep());
		System.out.println("Complemento: " + pessoa.getComplemento());
		System.out.println("Telefone: " + pessoa.getTelefone());
		System.out.println("Email: " + pessoa.getEmail());
		
	}
	
	@Test
	@Ignore
	public void excluir() {
		Long codigoPessoa = 2L;
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
		
		pessoaDAO.excluir(pessoa);
		
		System.out.println("#################");
		System.out.println("Pessoa a Ser Excluída!");
		System.out.println("Código da pessoa: " + pessoa.getCodigo());
		System.out.println("Nome da pessoa: " + pessoa.getNome());
		System.out.println("CPF da  pessoa: " + pessoa.getCpf());
		System.out.println("RG da pessoa: " + pessoa.getRg());
		System.out.println("Rua: : " + pessoa.getRua());
		System.out.println("Número: : " + pessoa.getNumero());
		System.out.println("Bairro: " + pessoa.getBairro());
		System.out.println("CEP: " + pessoa.getCep());
		System.out.println("Complemento: " + pessoa.getComplemento());
		System.out.println("Telefone: " + pessoa.getTelefone());
		System.out.println("Email: " + pessoa.getEmail());

	}
	
	@Test
	@Ignore
	public void editar() {
		Long codigoPessoa = 3L;
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
		
		pessoa.setNome("Mchilanny Bussinger de Menezes");
		pessoa.setCpf("88965520363");
		pessoa.setRg("24899858");
		pessoa.setCelular("61996980791");
		pessoa.setEmail("mchilanny.to@gmail.com");
		
		pessoaDAO.editar(pessoa);
		
		System.out.println("#################");
		System.out.println("Pessoa a Ser Editada!");
		System.out.println("Código da pessoa: " + pessoa.getCodigo());
		System.out.println("Nome da pessoa: " + pessoa.getNome());
		System.out.println("CPF da  pessoa: " + pessoa.getCpf());
		System.out.println("RG da pessoa: " + pessoa.getRg());
		System.out.println("Rua: : " + pessoa.getRua());
		System.out.println("Número: : " + pessoa.getNumero());
		System.out.println("Bairro: " + pessoa.getBairro());
		System.out.println("CEP: " + pessoa.getCep());
		System.out.println("Complemento: " + pessoa.getComplemento());
		System.out.println("Telefone: " + pessoa.getTelefone());
		System.out.println("Email: " + pessoa.getEmail());
	}


}
