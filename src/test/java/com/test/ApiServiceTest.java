package com.test;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.inject.ApiService;
import com.demo.inject.EmailService;
import com.demo.inject.SMSService;

@ExtendWith(MockitoExtension.class)
public class ApiServiceTest {
	@Mock
	EmailService es;
	@Mock
	SMSService ss;
	@InjectMocks
	ApiService as;
	
	@Test
	public void testApi(){
		when(as.sendEmail("Email")).thenReturn(true);
		when(as.sendSMS(anyString())).thenReturn(true);
		
		assertTrue(as.sendEmail("Email"));
		assertTrue(as.sendSMS("Welcome"));
	}
}
