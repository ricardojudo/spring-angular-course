package com.example.spring.aspect;

import java.util.logging.Logger;
import java.util.stream.Stream;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


public class LoggingAspectXML {	
	private Logger logger = Logger.getLogger(getClass().getName());

	/*
	 * Before advice
	 */
	public void beforeCall(JoinPoint joinPoint) {
		log("Before call method",joinPoint);
	}

	/*
	 * After advice
	 */
	public void afterCall(JoinPoint joinPoint) {
		log("After call method",joinPoint);
	}
	
	
	/*
	 * Filtrando fake news
	 */
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
