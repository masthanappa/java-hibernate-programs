package com.kn.hb.bike;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
	@Id
int regNumber;
String modul;
double cast;
public Bike() {
	super();
}
public Bike(int regNumber, String modul, double cast) {
	super();
	this.regNumber = regNumber;
	this.modul = modul;
	this.cast = cast;
}
/**
 * @return the regNumber
 */
public int getRegNumber() {
	return regNumber;
}
/**
 * @param regNumber the regNumber to set
 */
public void setRegNumber(int regNumber) {
	this.regNumber = regNumber;
}
/**
 * @return the modul
 */
public String getModul() {
	return modul;
}
/**
 * @param modul the modul to set
 */
public void setModul(String modul) {
	this.modul = modul;
}
/**
 * @return the cast
 */
public double getCast() {
	return cast;
}
/**
 * @param cast the cast to set
 */
public void setCast(double cast) {
	this.cast = cast;
}
@Override
public String toString() {
	return "Bike [regNumber=" + regNumber + ", modul=" + modul + ", cast=" + cast + "]";
}

}
