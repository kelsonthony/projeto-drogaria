package br.com.kelsonthony.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.kelsonthony.drogaria.domain.Fabricante;

public class FabricanteDAOTest {

	@SuppressWarnings("unused")
	@Test
	@Ignore
	public void salvar() {
		Fabricante fabricante = new Fabricante();
		fabricante.setDescricao("Laboratório ACHE 2");

		FabricanteDAO fabricanteDAO = new FabricanteDAO();

		if (fabricante == null) {
			System.out.println("Nenhum Registro encontrado");
		} else {
			fabricanteDAO.salvar(fabricante);
			System.out.println("Fabricante Inserido");
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
		}

	}

	@Test
	@Ignore
	public void listar() {
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		List<Fabricante> resultado = fabricanteDAO.listar();

		System.out.println("Total de Fabricantes Registrados é: " + resultado.size());

		for (Fabricante fabricante : resultado) {
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 3L;
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigo);

		if (fabricante == null) {
			System.out.println("Nenhum Registro encontrado");
		}

		System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());

	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 1L;
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigo);

		if (fabricante == null) {

			System.out.println("Nenhum Registro encontrado");
		} else {
			fabricanteDAO.excluir(fabricante);
			System.out.println("Fabricante Removido");
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
		}

	}
	
	@Test
	public void editar() {
		Long codigo = 7L;
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigo);
		
		if ( fabricante == null ) {
			System.out.println("Fabricante não encontrado :(");
		}else {
			System.out.println("Fabricante Antes de Editar XD");
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
			fabricante.setDescricao("Laboratório GSK");
			fabricanteDAO.editar(fabricante);
			System.out.println("Fabricante Editado :)");
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
		}
	}
}
