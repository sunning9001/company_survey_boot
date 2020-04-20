package com.wiot.survey.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UtilConfig {

	@Bean
	public MapUtil MapUtilInstance() {
		
		return new MapUtil();
	}
}
