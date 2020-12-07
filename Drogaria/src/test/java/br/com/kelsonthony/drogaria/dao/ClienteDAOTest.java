package br.com.kelsonthony.drogaria.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.kelsonthony.drogaria.domain.Cliente;
import br.com.kelsonthony.drogaria.domain.Pessoa;

public class ClienteDAOTest {
	
	@Test
	@Ignore
	public void salvar() throws ParseException {
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(3L);
		
		Cliente cliente = new Cliente();
		//cliente.setDataCadastro(new Date());
		cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("31/08/2020"));
		cliente.setLiberado(false);
		cliente.setPessoa(pessoa);
		
		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);
		
		if ( pessoa == null ) {
			System.out.println("Nenhum cliente encontrado!");
		}else {
			System.out.println("O cliente: " + cliente + " foi salvo com sucesso!");
		}
		
	}
	
	@Test
	@Ignore
	public void listar() {
		ClienteDAO clienteDAO = new ClienteDAO();
		List<Cliente> resultadoCliente = clienteDAO.listar();
		
		for( Cliente cliente : resultadoCliente ) {
			System.out.println("##### Lista de Clientes #####");
			System.out.println("Data de Cadastro: " + cliente.getDataCadastro());
			System.out.println("Está Liberado: " + cliente.getLiberado());
			System.out.println("##### Dados do Cliente #####");
			System.out.println("Còdigo do cliente: " + cliente.getCodigo());
			System.out.println("Còdigo da Pessoa: " + cliente.getPessoa().getCodigo());
			System.out.println("Nome do cliente: " + cliente.getPessoa().getNome());
			System.out.println("CPF do cliente: " + cliente.getPessoa().getCpf());
			System.out.println("RG do cliente: " + cliente.getPessoa().getRg());
			System.out.println("Email do cliente: " + cliente.getPessoa().getEmail());
			System.out.println("Celular do cliente: " + cliente.getPessoa().getCelular());
			System.out.println("Telefone do cliente: " + cliente.getPessoa().getTelefone());
			System.out.println("Rua do cliente: " + cliente.getPessoa().getRua());
			System.out.println("Número do Rua: " + cliente.getPessoa().getNumero());
			System.out.println("CEP do cliente: " + cliente.getPessoa().getCep());
			System.out.println("Bairro do cliente: " + cliente.getPessoa().getBairro());
			System.out.println("Complemento do Endereço do cliente: " + cliente.getPessoa().getComplemento());
			
			
			
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		Long codigoCliente = 1L;
		
		ClienteDAO clienteDAO = new ClienteDAO();
		
		Cliente cliente = clienteDAO.buscar(codigoCliente);
		
		System.out.println("##### Buscar Clientes #####");
		System.out.println("Data de Cadastro: " + cliente.getDataCadastro());
		System.out.println("Está Liberado: " + cliente.getLiberado());
		System.out.println("##### Dados do Cliente #####");
		System.out.println("Còdigo do cliente: " + cliente.getCodigo());
		System.out.println("Còdigo da Pessoa: " + cliente.getPessoa().getCodigo());
		System.out.println("Nome do cliente: " + cliente.getPessoa().getNome());
		System.out.println("CPF do cliente: " + cliente.getPessoa().getCpf());
		System.out.println("RG do cliente: " + cliente.getPessoa().getRg());
		System.out.println("Email do cliente: " + cliente.getPessoa().getEmail());
		System.out.println("Celular do cliente: " + cliente.getPessoa().getCelular());
		System.out.println("Telefone do cliente: " + cliente.getPessoa().getTelefone());
		System.out.println("Rua do cliente: " + cliente.getPessoa().getRua());
		System.out.println("Número do Rua: " + cliente.getPessoa().getNumero());
		System.out.println("CEP do cliente: " + cliente.getPessoa().getCep());
		System.out.println("Bairro do cliente: " + cliente.getPessoa().getBairro());
		System.out.println("Complemento do Endereço do cliente: " + cliente.getPessoa().getComplemento());
		
	}
	
	@Test
	@Ignore
	public void excluir() {
		Long codigoCliente = 3L;
		
		ClienteDAO clienteDAO = new ClienteDAO();
		
		Cliente cliente = clienteDAO.buscar(codigoCliente);
		
		clienteDAO.excluir(cliente);
		
		System.out.println("##### Excluir Cliente #####");
		System.out.println("Data de Cadastro: " + cliente.getDataCadastro());
		System.out.println("Está Liberado: " + cliente.getLiberado());
		System.out.println("##### Dados do Cliente #####");
		System.out.println("Còdigo do cliente: " + cliente.getCodigo());
		System.out.println("Còdigo da Pessoa: " + cliente.getPessoa().getCodigo());
		System.out.println("Nome do cliente: " + cliente.getPessoa().getNome());
		System.out.println("CPF do cliente: " + cliente.getPessoa().getCpf());
		System.out.println("RG do cliente: " + cliente.getPessoa().getRg());
		System.out.println("Email do cliente: " + cliente.getPessoa().getEmail());
		System.out.println("Celular do cliente: " + cliente.getPessoa().getCelular());
		System.out.println("Telefone do cliente: " + cliente.getPessoa().getTelefone());
		System.out.println("Rua do cliente: " + cliente.getPessoa().getRua());
		System.out.println("Número do Rua: " + cliente.getPessoa().getNumero());
		System.out.println("CEP do cliente: " + cliente.getPessoa().getCep());
		System.out.println("Bairro do cliente: " + cliente.getPessoa().getBairro());
		System.out.println("Complemento do Endereço do cliente: " + cliente.getPessoa().getComplemento());
	}
	
	@Test
	public void editar() throws ParseException {
		Long codigoCliente = 2L;
		
		ClienteDAO clienteDAO = new ClienteDAO();
		
		Cliente cliente = clienteDAO.buscar(codigoCliente);
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(3L);
		
		System.out.println("Editando...");
		cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("03/09/2020"));
		cliente.setLiberado(true);
				
		cliente.setPessoa(pessoa);
		
		pessoa.setNome("Mchilanny B. Menezes");
		
		pessoaDAO.editar(pessoa);
		
		System.out.println("##### Cliente Editado #####");
		System.out.println("Data de Cadastro: " + cliente.getDataCadastro());
		System.out.println("Está Liberado: " + cliente.getLiberado());
		System.out.println("##### Dados do Cliente #####");
		System.out.println("Còdigo do cliente: " + cliente.getCodigo());
		System.out.println("Còdigo da Pessoa: " + cliente.getPessoa().getCodigo());
		System.out.println("Nome do cliente: " + cliente.getPessoa().getNome());
		System.out.println("CPF do cliente: " + cliente.getPessoa().getCpf());
		System.out.println("RG do cliente: " + cliente.getPessoa().getRg());
		System.out.println("Email do cliente: " + cliente.getPessoa().getEmail());
		System.out.println("Celular do cliente: " + cliente.getPessoa().getCelular());
		System.out.println("Telefone do cliente: " + cliente.getPessoa().getTelefone());
		System.out.println("Rua do cliente: " + cliente.getPessoa().getRua());
		System.out.println("Número do Rua: " + cliente.getPessoa().getNumero());
		System.out.println("CEP do cliente: " + cliente.getPessoa().getCep());
		System.out.println("Bairro do cliente: " + cliente.getPessoa().getBairro());
		System.out.println("Complemento do Endereço do cliente: " + cliente.getPessoa().getComplemento());
	}
	
}
