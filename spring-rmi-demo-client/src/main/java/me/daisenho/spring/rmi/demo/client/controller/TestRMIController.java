package me.daisenho.spring.rmi.demo.client.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import me.daisenho.spring.rmi.demo.common.pojo.MyParam;
import me.daisenho.spring.rmi.demo.common.service.TestRMIService;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestRMIController {
	
	private static Logger logger = 
			LoggerFactory.getLogger(TestRMIController.class);
	
	@Autowired
	private TestRMIService testRMIService;
	
	@RequestMapping(value = "/invoke", method = RequestMethod.GET)
	@ResponseBody
	public String sendMessage(){
		MyParam param = new MyParam();
		param.setIntParam(1);
		param.setShortParam((short)0);
		param.setLongParam(2L);
		param.setFloatParam(0.1F);
		param.setDoubleParam(0.2);
		param.setCharParam('a');
		param.setByteParam((byte)1);
		param.setBooleanParam(true);
		
		param.setStringParam("RMI");
		
		String[] array = {"A","B","C","D"};
		Map<String,String> map = new HashMap<String,String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		
		param.setArray(array);
		param.setList(Arrays.asList(array));
		param.setMap(map);
		
		param.setBigDecimalParam(new BigDecimal(3.14));
		
		logger.info("client --> service : {}",
				ToStringBuilder.reflectionToString(param, ToStringStyle.SHORT_PREFIX_STYLE));
		
		MyParam result = testRMIService.sendMyParam(param);
		
		logger.info("service --> client : {}",
				ToStringBuilder.reflectionToString(result, ToStringStyle.SHORT_PREFIX_STYLE));
		
		return "OK";
	}

}
