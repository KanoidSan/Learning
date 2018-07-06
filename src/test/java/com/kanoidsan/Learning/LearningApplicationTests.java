package com.kanoidsan.Learning;

import com.kanoidsan.Learning.try05.mainApp.BeanFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//here needs to be added main app class as a test origin *(or something like that)
@SpringBootTest(classes = BeanFactory.class)
public class LearningApplicationTests {

	@Test
	public void contextLoads() {
	}

}
