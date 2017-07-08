package com.exam.task.bean;

public class Task {

	int id;
	String taskName;
	String taskDetail;
	boolean isPending;

	public Task() {
		super();
	}

	public Task(int id, String taskName, String taskDetail, boolean isPending) {
		super();
		this.id = id;
		this.taskName = taskName;
		this.taskDetail = taskDetail;
		this.isPending = isPending;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDetail() {
		return taskDetail;
	}

	public void setTaskDetail(String taskDetail) {
		this.taskDetail = taskDetail;
	}

	public boolean isPending() {
		return isPending;
	}

	public void setPending(boolean isPending) {
		this.isPending = isPending;
	}

}