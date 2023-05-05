package in.asterisc.Day02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BeforeLogic {

	@Pointcut("execution(* BusinessLogic.m*(..))")  
    public void x(){}//pointcut name  
      
    @Before("x()")//applying pointcut on before advice  
    public void myadvice(JoinPoint jp)//it is advice (before advice)  
    {  
        System.out.println("Additional concern Before Business Logic");  
        //System.out.println("Method Signature: "  + jp.getSignature());  
    }  
}
