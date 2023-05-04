package in.asterisc.Day02;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdvisor implements ThrowsAdvice {
	public void afterThrowing(Exception ex) {
		System.out.println("additional concern if exception occurs");
	}
}
