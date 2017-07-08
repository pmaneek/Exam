package com.exam.task.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.exam.task.bean.Task;


public class TaskService {

	static HashMap<Integer, Task> taskMap = getTaskIdMap();

	public TaskService() {
		super();

		if (taskMap == null) {
			taskMap = new HashMap<Integer, Task>();
			Task task1 = new Task(1, "Task 1", "Task Detail 1", true);
			Task task2 = new Task(2, "Task 2", "Task Detail 2", false);
			Task task3 = new Task(3, "Task 3", "Task Detail 3", false);
			Task task4 = new Task(4, "Task 4", "Task Detail 4", true);

			taskMap.put(1, task1);
			taskMap.put(2, task2);
			taskMap.put(3, task3);
			taskMap.put(4, task4);
		}
	}

	public List<Task> getAllTasks() {
		List<Task> tasks = new ArrayList<Task>(taskMap.values());
		return tasks;
	}

	public Task getTask(int id) {
		Task task = taskMap.get(id);
		return task;
	}

	public Task addTask(Task task) {
		task.setId(taskMap.size() + 1);
		taskMap.put(task.getId(), task);
		return task;
	}

	public Task updateTask(Task task) {
		if (task.getId() <= 0)
			return null;
		taskMap.put(task.getId(), task);
		return task;

	}

	public void deleteTask(int id) {
		taskMap.remove(id);
	}

	public static HashMap<Integer, Task> getTaskIdMap() {
		return taskMap;
	}

}
