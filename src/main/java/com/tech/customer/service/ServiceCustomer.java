package com.tech.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.customer.exception.OperationException;
import com.tech.customer.repository.IRepositoryCustomer;
@Service
public class ServiceCustomer implements IServiceCustomer{
	@Autowired
	private IRepositoryCustomer repositoryCustomer;
	@Override
	public Double averageByCustomer() {
		Double avg = null;
		avg = this.repositoryCustomer.average();
		if(avg == null) throw new OperationException("There'not average");
		return avg;
	}

	@Override
	public Double standardDeviation() {
		Double standar = null ;
		standar = this.repositoryCustomer.standardDeviation();
		if(standar == null) throw new OperationException("There'not standard Deviation");
		return standar;
	}

}
