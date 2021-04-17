package br.testes_assured_rest_configs;
import br.testes_assured_rest_core.BaseTest;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class ConfigBase implements BaseTest {

	public ConfigBase(){
		
		setup();
	}
	private static RequestSpecification requestSpec;
	private static ResponseSpecification responseSpec;

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
		ConfigBase.requestSpec = requestSpec;
	}

	public static ResponseSpecification getResponseSpec() {
		return responseSpec;
	}

	public static void setResponseSpec(ResponseSpecification responseSpec) {
		ConfigBase.responseSpec = responseSpec;
	}
}
