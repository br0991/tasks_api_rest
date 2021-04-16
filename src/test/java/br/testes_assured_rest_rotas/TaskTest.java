package br.testes_assured_rest_rotas;

import static br.testes_assured_rest_suits.SuitTest.getRequestSpec;
import static br.testes_assured_rest_suits.SuitTest.getResponseSpec;
import static io.restassured.RestAssured.given;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import br.testes_assured_rest_entities.Task;

public class TaskTest {
	
	private Task task;
	
	@Rule
	public ErrorCollector collectAnd = new ErrorCollector();

	@Test
	public void deveCadastrarTaskComSucesso(){
		
		task = new Task("Testes via API REST","2030-12-30");
		given()
			.spec(getRequestSpec())
			.body(task)
		.when()
			.post("/todo")
		.then()
			.statusCode(201)
			.spec(getResponseSpec());
	}		
}
