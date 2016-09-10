package br.com.material.bd.jpa;

import br.com.material.bd.interfaces.CategoryDAO;
import br.com.material.object.Category;

/**
 * 
 * Classe DAO responsavel pelo recurso da categoria.
 * 
 * @author bruno_rogerio
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public class CategoryJPADAO extends JPAAbstract<Category, Integer> implements
		CategoryDAO {

	/**
	 * @param e
	 *            entidade categoria.
	 * @return numero de categorias com o nome informado.
	 */
	public int validaCategoria(Category e) {

		String jpql = "SELECT C FROM " + this.getEntityName()
				+ " C WHERE C.name = '" + e.getName() + "'";
		if (e.getId() > 0) {
			jpql += " AND C.id <> " + e.getId();
		}

		return this.list(jpql).size();
	}
}
