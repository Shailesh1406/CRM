package com.crm.app.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class CrmExceptionHandler {

	@ExceptionHandler(value = Exception.class)
    public ModelAndView duplicateBookException(Exception e) {
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("errorMessage", e.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
