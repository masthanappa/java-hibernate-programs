package org.kodnest.hibernat_demo1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
int id;
String name;
int marks;
public Student() {
	super();
}
public Student(int id, String name, int marks) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the marks
 */
public int getMarks() {
	return marks;
}
/**
 * @param marks the marks to set
 */
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}

}
