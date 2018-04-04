package com.example.spring.aspect;

import java.util.logging.Logger;
import java.util.stream.Stream;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {	
	private Logger logger = Logger.getLogger(getClass().getName());

	/*
	 * Before advice
	 */
	//@Before("execution(* com.example.spring..*.*(..))")
	public void callSetters(JoinPoint joinPoint) {
		log("Before call setter",joinPoint);
	}

	/*
	 * After advice
	 */
	//@After("execution(* com.example.spring..*.*(..))")
	public void afterCallSetters(JoinPoint joinPoint) {
		log("After call setter",joinPoint);
	}
	
	
	/*
	 * Filtrando fake news
	 */
	//@Around("execution(void com.example.spring..*.publish(*,*,*))")
	public void detectingFake(ProceedingJoinPoint joinPoint) throws Throwable{
		
		boolean fakeDetected=Math.random() > 0.5;
		if(!fakeDetected) {
			joinPoint.proceed();
			logger.info("Procceding");
		}else {
			logger.warning(String.format("%s Fake Detected", joinPoint.getTarget()));
		}	
	}

	
	
	private void log(String moment, JoinPoint joinPoint) {
		String method = joinPoint.getSignature().getName();
		String args = Stream.of(joinPoint.getArgs()).reduce("", (a, b) -> {
			return a + " | " + b;
		}).toString();

		logger.info(String.format("~~~~ %s: %s ; args: %s on: %s", moment,method, args, joinPoint.getTarget()));
	}
	
	
}
