package br.testes_assured_rest_rotas;

import static br.testes_assured_rest_configs.ConfigBase.getRequestSpec;
import static br.testes_assured_rest_configs.ConfigBase.getResponseSpec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import br.testes_assured_rest_configs.ConfigBase;


public class HomeTest {
	
	@Rule
	public ErrorCollector collectAnd = new ErrorCollector();

	@BeforeClass
	public static void setupTest(){
	
		new ConfigBase();
	}
	@Test
	public void deveRetornarMensagemTelaHome(){
		
		String text = 
		given()
			.spec(getRequestSpec())
		.when()
			.get("/")
		.then()
			.statusCode(200)
			.spec(getResponseSpec())
			.extract().body().asString();
			collectAnd.checkThat(text, is("Hello World!"));
	}
}
