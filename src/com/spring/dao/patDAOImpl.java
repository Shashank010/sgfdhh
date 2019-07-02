package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import com.spring.model.Patient;

@Repository
public class patDAOImpl implements patDAO
{
	@PersistenceContext
	EntityManager manager;

	@Override
	public int addPatient(Patient s) 
	{
		manager.persist(s);
		return s.getId();
	}

	@Override
	public List<Patient> getAll() 
	{
		Query query = manager.createQuery("select stu from Patient stu");
		List<Patient> list = query.getResultList();
		return list;
	}

	@Override
	public Patient getById(int id) 
	{
		Patient stu = manager.find(Patient.class, id);
		return stu;
	}

	/*@Override
	public void updateStu(Student stu,Student stus) 
	{
		Student student = manager.find(Student.class, stus.getId());
		student.setName(stu.getName());
		student.setAddress(stu.getAddress());
		student.setPhone(stu.getPhone());
		student.setCourse(stu.getCourse());
	}

	@Override
	public void delStu(int id) throws StudentException 
	{
		Student stu = manager.find(Student.class, id);
		if(stu !=null)
		{
			 manager.remove(stu);
			 
		}
		else
		{
			throw new StudentException("Id not found!");
		}
		
	}
*/
}
