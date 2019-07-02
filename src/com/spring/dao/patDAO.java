package com.spring.dao;

import java.util.List;

import com.spring.exception.PatientException;

import com.spring.model.Patient;


public interface patDAO 
{
	public int addPatient(Patient s);
	public List<Patient> getAll();
	public Patient getById(int id);
	//public void updateStu(Student stu,Student stus);
	//public void delStu(int id)throws PatientException;

}
