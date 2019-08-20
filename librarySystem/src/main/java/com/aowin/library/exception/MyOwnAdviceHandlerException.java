package com.aowin.library.exception;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.aowin.library.web.JsonResult;
@ControllerAdvice
@Component
public class MyOwnAdviceHandlerException {
	  @ResponseBody
	  @ExceptionHandler(ServiceException.class)
	  public JsonResult handleMyOwnException(ServiceException ex) {
		  System.out.println("1");
		  return new JsonResult(ex);
	  }

}
