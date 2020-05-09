package com.aop.aopconfig;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component

/*
 * Use can use interface (Ordered) to make order of aspect or else you can
 * use @order Annotation if you interface you need to over ride the
 * unimplemented method to make order
 * 
 * @Channaveera
 */
public class EmployeeCRUDTransactionAspect {
//implements Ordered {
//
//	@Override
//	public int getOrder() {
//		System.err.println("in seconde order");
//		return 1;
//	}

	@Before("execution(* com.aop.EmployeeManager.getEmployeeById(..))")
	public void deforeGetEmployeeById(JoinPoint joinPoint) {
		System.out.println("EmployeeCRUDAspect.logBeforeV1() : " + joinPoint.getSignature().getName());

		Object[] arges = joinPoint.getArgs();
		System.out.println("---------------------------------------------------");
		System.out.println(arges[0]);
		/*
		 * Arrays.stream(arges).forEach(values -> {
		 * System.err.println("args are     =   " + values); });
		 */
		System.out.println("---------------------------------------------------");

	}

}
