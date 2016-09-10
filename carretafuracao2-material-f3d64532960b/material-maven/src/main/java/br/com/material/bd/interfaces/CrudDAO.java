package br.com.material.bd.interfaces;

import java.util.List;

import javax.persistence.EntityManager;

/**
 * 
 * Interface basica para crud do padrao DAO.
 * 
 * @author bruno_rogerio
 * @version 1.0.0
 * @since 1.0.0
 *
 * @param <E>
 *            Entidade
 * @param <ID>
 *            Tipo da chave primaria
 */
public interface CrudDAO<E, ID> {

	/**
	 * 
	 * Metodo que retorna um objeto que e o registro que consta na entidade.
	 * 
	 * @param id
	 *            Id do registro da entidade.
	 * @return E objeto da entidade.
	 */
	public E getObject(ID id);

	/**
	 * 
	 * Metodo que insere determinada instancia de uma entidade no banco de dados
	 * 
	 * @param e
	 *            instancia da entidade
	 */
	public void add(E e);

	/**
	 * 
	 * Metodo para multiplos cadastros no banco em uma unica trasacao.
	 * 
	 * @param e
	 *            entidade
	 * @param em
	 *            transacao do banco.
	 */
	public void add(E e, EntityManager em);

	/**
	 * 
	 * Metodo que realiza a edicao da instancia de uma entidade no banco de
	 * dados.
	 * 
	 * @param e
	 *            instancia da entidade
	 */
	public void edit(E e);

	/**
	 * 
	 * Metodo para multiplas edicoes no banco em uma unica trasacao.
	 * 
	 * @param e
	 *            entidade
	 * @param em
	 *            transacao do banco.
	 */
	public void edit(E e, EntityManager em);

	/**
	 * 
	 * Metodo que remove a instancia da entidade no banco de dados.
	 * 
	 * @param id
	 *            instancia do tipo da chave primaria do banco de dados.
	 */
	public void remove(ID id);

	/**
	 * 
	 * Metodo para fazer a listagem dos registros que se encontram na entidade.
	 * 
	 * @return List<E> retorna um array list de registros da entidade.
	 */
	public List<E> list();
}
