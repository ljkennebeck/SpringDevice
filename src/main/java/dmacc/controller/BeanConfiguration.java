package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Brand;
import dmacc.beans.Device;
import dmacc.beans.Owner;

/**  
* Logan Kennebeck - ljkennebeck1  
* CIS171 22149
* Oct 14, 2022  
*/
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Device device() {
		Device bean = new Device();
		return bean;
	}
	
	@Bean
	public Owner owner() {
		Owner bean = new Owner();
		return bean;
	}
	
	@Bean
	public Brand brand() {
		Brand bean = new Brand();
		return bean;
	}

}