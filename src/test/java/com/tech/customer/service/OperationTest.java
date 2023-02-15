package com.tech.customer.service;

import java.util.Date;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import com.tech.customer.repository.IRepositoryCustomer;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class OperationTest {
	@Autowired
	private IRepositoryCustomer repositoryCustomer;
	
	@Test
	public void averageTest() {
		Double avg = null;
		avg = this.repositoryCustomer.average();
		Double test = 33.1250;
		Assertions.assertThat(avg).isEqualTo(test);
		
	}
}
