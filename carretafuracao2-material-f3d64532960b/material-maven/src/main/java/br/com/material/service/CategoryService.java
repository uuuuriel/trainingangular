package br.com.material.service;

import br.com.material.bd.interfaces.CategoryDAO;
import br.com.material.exception.CategoryExceptionVal;
import br.com.material.object.Category;

/**
 * 
 * Classe service responsavel pelo recurso da categoria.
 * 
 * @author bruno_rogerio
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public class CategoryService extends
		ServiceAbstract<Category, Integer, CategoryDAO> {

	/**
	 * Sobrescrita do metodo do service abstract cadastrar. Pois para o recurso
	 * categoria e necessario validar se o possui no banco uma categoria de
	 * mesmo nome.
	 */
	@Override
	public void add(Category categoria) throws Exception {

		int numeroCategorias = this.dao.validaCategoria(categoria);

		if (numeroCategorias > 0) {
			throw new CategoryExceptionVal();
		}

		super.add(categoria);
	}

	/**
	 * Sobrescrita do metodo do service abstract editar. Pois para o recurso
	 * categoria e necessario validar se o possui no banco uma categoria de
	 * mesmo nome.
	 */
	@Override
	public void edit(Category categoria) throws Exception {

		int numeroCategorias = this.dao.validaCategoria(categoria);

		if (numeroCategorias > 0) {
			throw new CategoryExceptionVal();
		}

		super.edit(categoria);
	}
}
