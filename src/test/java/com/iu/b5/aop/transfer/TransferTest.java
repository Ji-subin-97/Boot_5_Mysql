package com.iu.b5.aop.transfer;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TransferTest {
	
	@Autowired
	private Transfer transfer;
	
	@Test
	void test() {
		transfer.takeBus();
		transfer.takeSubway();
	}

}
