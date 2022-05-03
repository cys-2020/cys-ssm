package exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StaticExceptionHandler {
	//这些方法用于"通知所有控制器"，在@EH方法中具体处理异常
	@ExceptionHandler(AExceptionFromAllController.class)
	public String handleStaticException() {
		return "这是一个全局的异常";
	}
}
