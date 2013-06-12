package com.redhat.jboss.summit.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import junit.framework.TestCase;

public class ResumeTest  extends TestCase{
	EntityManagerFactory emf;
	
	@Override
	public void setUp() throws Exception{
		emf  = Persistence.createEntityManagerFactory("summit-jpa-pu");
	}
	
	@Override
	public void tearDown(){
		emf.close();
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
}
