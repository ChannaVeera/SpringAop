package com.aop.aopconfig;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeCRUDAspect {

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
	/*
	 * Before
	 */

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

	@Before("execution(* com.aop.EmployeeManager.deleteEmployee(..))")
	public void beforeDeleteEmployee(JoinPoint joinPoint) {
		Object[] arges = joinPoint.getArgs();
		System.out.println("---------------------------------------------------");
		System.out.println(arges[0]);
		System.out.println("EmployeeCRUDAspect.logBeforeV2() : " + joinPoint.getSignature().getName());
		System.out.println("---------------------------------------------------");
	}

	@Before("execution(* com.aop.EmployeeManager.updateEmployee(..))")
	public void beforeUpdateEmployee(JoinPoint joinPoint) {
		Object[] arges = joinPoint.getArgs();
		System.out.println("---------------------------------------------------");
		System.out.println(arges[0]);
		System.out.println("EmployeeCRUDAspect.logBeforeV3() : " + joinPoint.getSignature().getName());
		System.out.println("---------------------------------------------------");
	}

	@Before("execution(* com.aop.EmployeeManager.createEmployee(..))")
	public void beforeCreateEmployee(JoinPoint joinPoint) {
		Object[] arges = joinPoint.getArgs();
		System.out.println("---------------------------------------------------");
		System.out.println(arges[0]);
		System.out.println("EmployeeCRUDAspect.logBeforeV2() : " + joinPoint.getSignature().getName());
		System.out.println("---------------------------------------------------");
	}

	/*
	 * After execution Below
	 * 
	 */

	@After("execution(* com.aop.EmployeeManager.getEmployeeById(..))")
	public void afterGetEmployeeById(JoinPoint joinPoint) {
		Object[] arges = joinPoint.getArgs();
		System.out.println("---------------------------------------------------");
		System.out.println(arges[0]);
		System.out.println("com.aop.EmployeeCRUDAspect.logAfterV1() : " + joinPoint.getSignature().getName());
		System.out.println("---------------------------------------------------");
	}

	@After("execution(* com.aop.EmployeeManager.deleteEmployee(..))")
	public void afterDeleteEmployee(JoinPoint joinPoint) {
		Object[] arges = joinPoint.getArgs();
		System.out.println("---------------------------------------------------");
		System.out.println(arges[0]);
		System.out.println("EmployeeCRUDAspect.logAfterV2() : " + joinPoint.getSignature().getName());
		System.out.println("---------------------------------------------------");
	}

	@After("execution(* com.aop.EmployeeManager.updateEmployee(..))")
	public void afterupdateEmployee(JoinPoint joinPoint) {
		Object[] arges = joinPoint.getArgs();
		System.out.println("---------------------------------------------------");
		System.out.println(arges[0]);
		System.out.println("EmployeeCRUDAspect.logBeforeV3() : " + joinPoint.getSignature().getName());
		System.out.println("---------------------------------------------------");
	}

	@After("execution(* com.aop.EmployeeManager.createEmployee(..))")
	public void afterCreateEmployee(JoinPoint joinPoint) {
		Object[] arges = joinPoint.getArgs();
		System.out.println("---------------------------------------------------");
		System.out.println(arges[0]);
		System.out.println("EmployeeCRUDAspect.logBeforeV3() : " + joinPoint.getSignature().getName());
		System.out.println("---------------------------------------------------");
	}

}