package br.com.kelsonthony.drogaria.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.kelsonthony.drogaria.domain.Fabricante;
import br.com.kelsonthony.drogaria.domain.Produto;

public class ProdutoDAOTest {
	
	@Test
	@Ignore
	public void salvar() {
		
		Long codigoFabricante = 4L;
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigoFabricante);
		
	
		if(fabricante == null) {
			System.out.println("Fabricante Selecionado não existe.");
		}else {
			Produto produto = new Produto();
			produto.setDescricao("ZincoPro com 30 cápsulas");
			produto.setPreco(new BigDecimal("28.90"));
			produto.setQuantidade(new Short("7"));
			produto.setFabricante(fabricante);
			
			ProdutoDAO produtoDAO = new ProdutoDAO();
			produtoDAO.salvar(produto);
			System.out.println("Descrição do Produto: " + produto.getDescricao());
			System.out.println("Preço do Produto: " + produto.getPreco());
			System.out.println("Quantidade do Produto: " + produto.getQuantidade());
			System.out.println("Fabricante do Produto: " + produto.getFabricante().getDescricao());
		}
	
	}
	
	@Test
	@Ignore
	public void listar() {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produto> resultadoProduto = produtoDAO.listar();
		
		for( Produto produto : resultadoProduto ) {
			System.out.println("Código do Produto: " + produto.getCodigo());
			System.out.println("Descrição do Produto: " + produto.getDescricao());
			System.out.println("Preço do Produto: " + produto.getPreco());
			System.out.println("Quantidade do Produto: " + produto.getQuantidade());
			System.out.println("Fabricante do Produto: " + produto.getFabricante().getDescricao());
			System.out.println("##########");
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		Long codigoProduto = 1L;
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		Produto produto = produtoDAO.buscar(codigoProduto);
		
		System.out.println("Código do Produto: " + produto.getCodigo());
		System.out.println("Descrição do Produto: " + produto.getDescricao());
		System.out.println("Preço do Produto: " + produto.getPreco());
		System.out.println("Quantidade do Produto: " + produto.getQuantidade());
		System.out.println("Fabricante do Produto: " + produto.getFabricante().getDescricao());
		System.out.println("##########");
	}
	
	@Test
	public void excluir() {
		Long codigoProduto = 2L;
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		
		Produto produto = produtoDAO.buscar(codigoProduto);
		
		produtoDAO.excluir(produto);
		
		System.out.println("Código do Produto: " + produto.getCodigo());
		System.out.println("Descrição do Produto: " + produto.getDescricao());
		System.out.println("Preço do Produto: " + produto.getPreco());
		System.out.println("Quantidade do Produto: " + produto.getQuantidade());
		System.out.println("Fabricante do Produto: " + produto.getFabricante().getDescricao());
		System.out.println("##########");
	}
}
