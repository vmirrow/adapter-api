package com.dell.dsg.adapter.k1000;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dell.dsg.domain.ComputerSystem;
import com.dell.dsg.domain.ComputerSystemBase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:springmvc-servlet.xml" })
public class K1000ServiceTest {
	static final Logger logger = Logger.getLogger(K1000ServiceTest.class);

	@Autowired
	private K1000Service service;

	@Test
	public void testGetComputerSystems() {
		List<ComputerSystemBase> computers = service.getComputerSystems();
		for (ComputerSystemBase comp : computers) {
			logger.info(comp);
		}
	}

	@Test
	public void testGetComputerSystem() {
		ComputerSystem computer = service.getComputerById("200");
		logger.info(computer);
	}

}
