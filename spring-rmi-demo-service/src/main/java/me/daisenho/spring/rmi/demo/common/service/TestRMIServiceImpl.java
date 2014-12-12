package me.daisenho.spring.rmi.demo.common.service;

import me.daisenho.spring.rmi.demo.common.pojo.MyParam;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestRMIServiceImpl implements TestRMIService {
	
	private static Logger logger = 
			LoggerFactory.getLogger(TestRMIServiceImpl.class);

	@Override
	public MyParam sendMyParam(MyParam param) {
		logger.info("TestRMIServiceImpl receive request:{}",
				ToStringBuilder.reflectionToString(param,ToStringStyle.SHORT_PREFIX_STYLE));
		return param;
	}

}
