package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class TaskAcending implements Comparable<TaskAcending>{
	private int id;
	private String taskName;
	private LocalDate deadline;
    private int priority;
    
  
	public TaskAcending(String taskName, LocalDate deadline, int priority) {
		this.taskName = taskName;
		this.deadline = deadline;
		this.priority = priority;
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
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public LocalDate getDeadline() {
		return deadline;
	}
	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((deadline == null) ? 0 : deadline.hashCode());
//		result = prime * result + ((taskName == null) ? 0 : taskName.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Task other = (Task) obj;
//		if (deadline == null) {
//			if (other.deadline != null)
//				return false;
//		} else if (!deadline.equals(other.deadline))
//			return false;
//		if (taskName == null) {
//			if (other.taskName != null)
//				return false;
//		} else if (!taskName.equals(other.taskName))
//			return false;
//		return true;
//	}
	@Override
	public int hashCode() {
		return Objects.hash(deadline, taskName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaskAcending other = (TaskAcending) obj;
		return Objects.equals(deadline, other.deadline) && Objects.equals(taskName, other.taskName);
	}
	
	@Override
	public String toString() {
		return "Task [taskName=" + taskName + ", deadline=" + deadline + ", priority=" + priority + "]";
	}
	
	@Override
	public int compareTo(TaskAcending other) {
		// compareTo code here
		return 0;
	}
    
}