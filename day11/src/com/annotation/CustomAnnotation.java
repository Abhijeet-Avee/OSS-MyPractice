package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//If you want to process an annotation using java reflection then it
//should be visible to JVM that is we should go for
// max Runtime retention policy

//1. Create the annotation
@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
	public boolean isDone() default false;
	public String message() default "fresher training";
}

class MyClass{
//2. Apply the annotation
	@MyAnnotation(isDone = true, message = "training is going..." )
	public void foofMethod() {
		System.out.println("foofMethod...");
	}
}

public class CustomAnnotation {
	public static void main(String[] args) throws ClassNotFoundException {
		//3. Process the annotation using reflection;
		Class<?> class1 = Class.forName("com.annotation.MyClass");
		Method []method = class1.getDeclaredMethods();
		
		for(Method m : method) {
			if(m.isAnnotationPresent(MyAnnotation.class)) {
				MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);
				
				System.out.println(annotation.isDone());
				System.out.println(annotation.message());
			}
		}
	}
}
