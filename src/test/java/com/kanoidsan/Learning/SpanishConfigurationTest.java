package com.kanoidsan.Learning;

import com.kanoidsan.Learning.try05.scaningPlace.services.HelloWorldService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/helloWorldConfig.xml",
									"classpath*:spring/spanishHelloWorldConfig.xml"})
public class SpanishConfigurationTest {

	@Autowired
	HelloWorldService service;

	@Test
	public void testHelloWorld(){
		String greeting = service.getGreeting();

		//static imported from junit
        assertEquals("Hola mundo!", greeting);
	}

}
