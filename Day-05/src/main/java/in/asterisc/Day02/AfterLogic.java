package in.asterisc.Day02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AfterLogic {

	@Pointcut("execution(* BusinessLogic.*(..))")  
    public void x(){}//pointcut name  
      
    @After("x()")//applying pointcut on before advice  
    public void myadvice(JoinPoint jp)//it is advice (before advice)  
    {  
        System.out.println("Additional concern After Business Logic");  
        //System.out.println("Method Signature: "  + jp.getSignature());  
    }  
}
