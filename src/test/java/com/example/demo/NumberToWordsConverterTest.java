package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NumberToWordsConverterTest {
	
	@Autowired
	NumberToWordsConverter numberToWordsConverter;

	@Test
	public void convertTest() {
		
		String s = NumberToWordsConverter.convert(5);
		assertEquals("Five",s);
	}

}
