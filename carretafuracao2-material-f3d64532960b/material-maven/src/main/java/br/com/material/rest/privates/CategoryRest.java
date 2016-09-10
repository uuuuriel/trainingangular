package br.com.material.rest.privates;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.material.object.Category;
import br.com.material.rest.abs.RestAbstract;
import br.com.material.service.CategoryService;

/**
 * 
 * Classe rest responsavel pelo recurso da categoria.
 * 
 * @author bruno_rogerio
 * @version 1.0.0
 * @since 1.0.0
 *
 */
@Api
@Path("/category")
public class CategoryRest extends RestAbstract<Category, Integer, CategoryService> {

	@GET
	@Path("/{id}")
	@ApiOperation(value = "Retorna o objeto completo com as informações da categoria.", response = Category.class)
	@Produces("application/json")
	@Override
	public Response getObject(@PathParam("id") Integer id) {
		// TODO Auto-generated method stub
		return super.getObject(id);
	}

	@GET
	@ApiOperation(value = "Retorna a listagem das categorias.", response = Category.class, responseContainer = "List")
	@Produces("application/json")
	@Override
	public Response list() {
		// TODO Auto-generated method stub
		return super.list();
	}

	@POST
	@ApiOperation(value = "Cadastra a categoria.", response = Category.class)
	@Produces("application/json")
	@Consumes("application/json")
	@Override
	public Response add(String json) {
		// TODO Auto-generated method stub
		return super.add(json);
		//return this.util.getResponsePrivate();
	}

	@PUT
	@ApiOperation(value = "Realiza a edição da categoria.")
	@Produces("application/json")
	@Consumes("application/json")
	@Override
	public Response edit(String json) {
		// TODO Auto-generated method stub
		return super.edit(json);
	}

	@DELETE
	@Path("/{id}")
	@ApiOperation(value = "Realiza a remoção da categoria.")
	@Produces("application/json")
	@Override
	public Response remove(@PathParam("id") Integer id) {
		// TODO Auto-generated method stub
		return super.remove(id);
	}
}
