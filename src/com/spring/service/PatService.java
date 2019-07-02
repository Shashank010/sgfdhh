package com.spring.service;


import java.util.List;

import com.spring.exception.PatientException;
import com.spring.model.Patient;



public interface PatService
{
	public int addPatient(Patient s);
	public List<Patient> getAll();
  public Patient getById(int id);
//	public void updateStu(Patient stu,Patient stus);
	//public void delStu(int id)throws PatientException;

}
