package com.iu.b5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iu.b5.test.Child1;
import com.iu.b5.test.Child2;
import com.iu.b5.test.Parent;
import com.iu.b5.test.Test1;

@SpringBootTest
class Test1Test {
	
	@Autowired
	private Test1 test1;
	
//	@Autowired
//	private Child1 ch1;
//	
//	@Autowired
//	private Child2 ch2;
	
	@Autowired
	private Parent child1;
	
	@Test
	void test() {
		System.out.println(child1 != null);

		assertNotNull(test1);
	}

}
