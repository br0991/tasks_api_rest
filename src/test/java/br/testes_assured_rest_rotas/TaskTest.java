package br.testes_assured_rest_rotas;

import static br.testes_assured_rest_configs.ConfigBase.getRequestSpec;
import static br.testes_assured_rest_configs.ConfigBase.getResponseSpec;
import static io.restassured.RestAssured.given;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import br.testes_assured_rest_configs.ConfigBase;
import br.testes_assured_rest_entities.Task;

public class TaskTest {
	
	private Task task;
	
	@Rule
	public ErrorCollector collectAnd = new ErrorCollector();
	
	@BeforeClass
	public static void setupTest(){
	
		new ConfigBase();
	}
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
