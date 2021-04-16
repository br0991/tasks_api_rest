package br.testes_assured_rest_entities;

public class Task {

	private Integer id;
	private String task;
	private String dueDate;

	public Task(String task, String dueDate){
		
		this.task = task;
		this.dueDate = dueDate;
	}
	public Task(){}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
}
