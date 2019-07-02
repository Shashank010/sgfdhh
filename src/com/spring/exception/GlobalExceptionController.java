package com.spring.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionController
{
	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception e)
	{
		ModelAndView view = new ModelAndView("error");
		view.addObject("err",e.getMessage());
		return view;
	}

}
