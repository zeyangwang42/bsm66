package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.StaticUtils;
@ExtendWith(MockitoExtension.class)
public class StaticUtilTest {
	StaticUtils staticUtils;
	@BeforeEach
	void init() {
		staticUtils=new StaticUtils();
	}
	
	@Test
	public void testPrivateMethod() {
		assertEquals(staticUtils.getTest("1234"),"1234 Building");
	}
	
	@Test
	public void testPrivateMethod1() throws NoSuchMethodException,SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Method method=StaticUtils.class.getDeclaredMethod("privateTest", String.class);
		method.setAccessible(true);
		StaticUtils staticUtils=new StaticUtils();
		String result = (String) method.invoke(staticUtils, "hello");
		assertEquals(result,"hello Building");
	}
	@Test
	public void staticTest() {
		try(MockedStatic mockStatic = Mockito.mockStatic(StaticUtils.class)){
			
			mockStatic.when(StaticUtils::range).thenReturn("Welcome");
			assertEquals(StaticUtils.range(),"Welcome");
		}
	}
}
