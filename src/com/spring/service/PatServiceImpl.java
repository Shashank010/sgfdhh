package com.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





import com.spring.dao.patDAO;
import com.spring.model.Patient;

@Service
@Transactional


public class PatServiceImpl implements PatService
{
	@Autowired
	patDAO studao;

	@Override
	public int addPatient(Patient s)
	{
		studao.addPatient(s);
		return s.getId();
	}

	@Override
	public List<Patient> getAll()
	{
		return studao.getAll();
	}

	@Override
	public Patient getById(int id) 
	{
		return studao.getById(id);
	}

	/*@Override
	public void updateStu(Student stu,Student stus) 
	{
		
		 studao.updateStu(stu,stus);
	}

	@Override
	public void delStu(int id) throws StudentException 
	{
		studao.delStu(id);
	}
*/
}
