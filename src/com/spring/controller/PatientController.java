package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.exception.PatientException;

import com.spring.model.Patient;

import com.spring.service.PatService;


@Controller
public class PatientController
{
	Patient stu2 ;
	Patient stu = new Patient();
	@Autowired
	PatService service;
	
	@RequestMapping("/home")
	public String showHome()
	{
		return "home";
	}
	
	/*@RequestMapping("/login")
	public String showLogin(Model model)
	{
		model.addAttribute("login", new Login());
		return "login";
	}
	
	@RequestMapping(value="/loginMatch",method=RequestMethod.POST)
	public String processLogin(Model model,@RequestParam("txtName")String name,@RequestParam("txtPwd")String password) throws StudentException
	{
		String view="";
		if(name.equals("admin") && password.equals("admin"))
		{
			view="StuAdd";
			//model.addAttribute("username","Login Success:"+ name);
		}
		else
		{
			view="error";
			model.addAttribute("message", "Login Failed");
		}
		return view;
	}*/
	@RequestMapping(value="/addPatient",method=RequestMethod.GET)
	public String showStudent(Model model,HttpServletRequest request)
	{
		String view = "StuAdd";
		
		List<String> list = new ArrayList<>();
		list.add("B.Tech");
		list.add("BBA");
		list.add("B.Sc");
		list.add("Diploma");
		
		ServletContext context = request.getServletContext();
		context.setAttribute("course", list);
		
		model.addAttribute("student", new Patient());

		return view;
		
	}
	@RequestMapping(value="/addition",method=RequestMethod.POST)
	public String processRegister(Model model,@Valid @ModelAttribute("student")Patient student,BindingResult result)
	{
		String view = "";

		if (result.hasErrors()) {
			view = "StuAdd";
		} else {
			
			service.addPatient(student);
			model.addAttribute("stu", student);
			view = "AddSuccess";
		}
		return view;		
	}
	
	@RequestMapping(value="/find")
	public String showViewbyID(Model model)
	{
		String view="viewById";
		model.addAttribute("student", new Patient());
		return view;
	}
	@RequestMapping(value="/findId",method=RequestMethod.POST)
	public String processSearch(Model model,@ModelAttribute("student")Patient student) throws PatientException
	{
		String view="";
		Patient stu = null;
	  stu = service.getById(student.getId());
	  if(stu !=null)
	  {
		  model.addAttribute("s", stu);
		  model.addAttribute("student", new Patient());
		  view="viewSuccess";
		  
	  }else
	  {
		  throw new PatientException("Id does not exist in the table");
		  
	  }
	   return view;
	  
	}
		@RequestMapping(value="/display")
	public String processShow(Model model) throws PatientException
	{
		String view="";
		List<Patient> list = service.getAll();
	  if(list !=null)
	  {
		  model.addAttribute("listStu", list);
		  view="show";
		  
	  }else
	  {
		  throw new PatientException("display is not correct");
		  
	  }
	   return view;
	  
	}
		/*@RequestMapping(value="/update")
		public String showUpdate(Model model, HttpServletRequest request)
		{
			
			model.addAttribute("student", new Student());
			String view="viewUpdate";
			model.addAttribute("msg", "Welcome to Updation Page");
			return view;
			
			
		}
		/*@RequestMapping(value="/update?{id}",method=RequestMethod.POST)
		public String showUpdate(Model model,@ModelAttribute("student")Student student, HttpServletRequest request)
		{
			String view = "updateStu";
			Student stu = service.getById(student.getId());
			List<String> list = new ArrayList<>();
			list.add("B.Tech");
			list.add("BBA");
			list.add("B.Sc");
			list.add("Diploma");
			
		model.addAttribute("id", stu.getId());
		model.addAttribute("name", stu.getName());
		model.addAttribute("phone", stu.getPhone());
		model.addAttribute("address", stu.getAddress());
		model.addAttribute("course", stu.getCourse());

			ServletContext context = request.getServletContext();
			context.setAttribute("course", list);
			
			//model.addAttribute("student", new Student());

			 return view;
			
		}*/
		/*@RequestMapping(value="/updateId",method=RequestMethod.POST)
		public String processUpdate(Model model,@Valid @ModelAttribute("student")Student student,BindingResult result,HttpServletRequest request) throws StudentException
		{
			String view = "";
			stu2 = service.getById(student.getId());
			
			System.out.println(student.getId());
			if(stu2!=null)
			{
				model.addAttribute("student", stu2);
				List<String> list = new ArrayList<>();
				list.add("B.Tech");
				list.add("BBA");
				list.add("B.Sc");
				list.add("Diploma");
				ServletContext context = request.getServletContext();
				context.setAttribute("course", list);
				view="updateStu";
				return view;	
			}else
			{
				throw new StudentException("Sorry ID not found");
			}

		}
		@RequestMapping(value="/updation",method=RequestMethod.POST)
		public String processUpdation(Model model,@Valid @ModelAttribute("student")Student student,BindingResult result,HttpServletRequest request) throws StudentException
		{
			service.updateStu(student,stu2);
			String view="UpdateSuccess";
			model.addAttribute("mymessage", "Your data has benn succesfully updated");
			model.addAttribute("student", student);
			return view;
		}
		*/
		
		
	/*	@RequestMapping(value="/delete")
		public String showDeletebyID(Model model)
		{
			String view="deleteById";
			model.addAttribute("student", new Patient());
			return view;
		}
		@RequestMapping(value="/deleteId",method=RequestMethod.POST)
		public String processDeletion(Model model,@Valid @ModelAttribute("student")Patient student,BindingResult result,HttpServletRequest request) throws PatientException
		{
			String view="";
			Patient stu=service.getById(student.getId());
          if(stu!=null)
          {
        	  service.delStu(stu.getId());
        	   view="DeleteSuccess";
          }
			
			model.addAttribute("mymessage", "Your data has been succesfully deleted");
			model.addAttribute("student", student);
			return view;
		}
		
	*/

}
