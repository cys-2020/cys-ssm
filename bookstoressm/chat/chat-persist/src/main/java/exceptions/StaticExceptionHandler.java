package exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StaticExceptionHandler {
	//��Щ��������"֪ͨ���п�����"����@EH�����о��崦���쳣
	@ExceptionHandler(AExceptionFromAllController.class)
	public String handleStaticException() {
		return "����һ��ȫ�ֵ��쳣";
	}
}
