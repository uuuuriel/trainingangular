package br.com.material.bd.interfaces;

import br.com.material.object.Category;

/**
 * 
 * Interface DAO responsavel pelo recurso da categoria.
 * 
 * @author bruno_rogerio
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public interface CategoryDAO extends CrudDAO<Category,Integer>{
	
	public int validaCategoria(Category e);
}
