package com.exam.task.controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.exam.task.bean.Task;
import com.exam.task.service.TaskService;

@Path("/tasks")
public class TaskController {

	TaskService taskService = new TaskService();

	@GET
	@Path("getTasks")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Task> getTasks() {

		List<Task> listOfTasks = taskService.getAllTasks();
		return listOfTasks;
	}

	@GET
	@Path("getTask/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Task getTaskById(@PathParam("id") int id) {
		return taskService.getTask(id);
	}

	@POST
	@Path("addTask")
	@Produces(MediaType.APPLICATION_JSON)
	public Task addTask(Task task) {
		return taskService.addTask(task);
	}

	@PUT
	@Path("updateTask")
	@Produces(MediaType.APPLICATION_JSON)
	public Task updateTask(Task task) {
		return taskService.updateTask(task);

	}
	
	@PUT
	@Path("updateTaskStatus/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Task updateTaskStatus(@PathParam("id") int id, boolean isPending) {
		Task task = taskService.getTask(id);
		task.setPending(isPending);
		return taskService.updateTask(task);

	}

	@DELETE
	@Path("deleteTask/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteTask(@PathParam("id") int id) {
		taskService.deleteTask(id);

	}

}
