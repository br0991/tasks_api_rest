package br.testes_assured_rest_core;

import io.restassured.http.ContentType;

public interface BaseTest {

	public String BASE_URI = "http://localhost:8001/tasks-backend";
	//public String BASE_PATH = "V2";
	public ContentType CONTENT_TYPE = ContentType.JSON;
	public int PORT = 8080;
}
