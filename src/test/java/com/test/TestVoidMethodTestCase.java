package com.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.demo.*;

public class TestVoidMethodTestCase {
 TestVoidMethod testvoidmethod=new TestVoidMethod();
 
 @BeforeEach
 public void init() {
	 testvoidmethod.add("a");
	 testvoidmethod.add("b");
 }
 
 @Test
 public void testVoidMethod() {
	 assertEquals(2,testvoidmethod.size());
 }
}
