package br.testes_assured_rest_suits;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.testes_assured_rest_core.BaseTest;
import br.testes_assured_rest_rotas.HomeTest;
import br.testes_assured_rest_rotas.TaskTest;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

@RunWith(Suite.class)
@SuiteClasses({

	HomeTest.class,
	TaskTest.class
})

public class SuitTest implements BaseTest {

	private static RequestSpecification requestSpec;
	private static ResponseSpecification responseSpec;

	@BeforeClass
	public static void setup() {

		RequestSpecBuilder request = new RequestSpecBuilder();
		request.setBaseUri(BASE_URI);
		request.setContentType(CONTENT_TYPE);
		request.log(LogDetail.ALL);
		requestSpec = request.build();
		
		ResponseSpecBuilder response = new ResponseSpecBuilder();
		responseSpec = response.build();

	}

	public static RequestSpecification getRequestSpec() {
		return requestSpec;
	}

	public static void setRequestSpec(RequestSpecification requestSpec) {
		SuitTest.requestSpec = requestSpec;
	}

	public static ResponseSpecification getResponseSpec() {
		return responseSpec;
	}

	public static void setResponseSpec(ResponseSpecification responseSpec) {
		SuitTest.responseSpec = responseSpec;
	}
}
