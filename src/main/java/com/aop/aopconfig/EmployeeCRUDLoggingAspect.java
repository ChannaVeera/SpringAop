package com.aop.aopconfig;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(0)
@Component
/*
 * Use can use interface (Ordered) to make order of aspect or else you can
 * use @order Annotation if you interface you need to over ride the
 * unimplemented method to make order
 * 
 * @Channaveera
 */
public class EmployeeCRUDLoggingAspect {
	// implements Ordered {
//	@Override
//	public int getOrder() {
//		System.out.println("in the order method ");
//		return 0;
//	}

	@Around("execution(* com.aop.EmployeeManager.*(..))")
	public void logAroundGetEmployee(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("****LoggingAspect.logAroundGetEmployee() : " + joinPoint.getSignature().getName()
				+ ": Before Method Execution");
		try {
			joinPoint.proceed();
		} finally {
			System.out.println("check befor or not ");
		}
		System.out.println("****LoggingAspect.logAroundGetEmployee() : " + joinPoint.getSignature().getName()
				+ ": After Method Execution");
	}
}
