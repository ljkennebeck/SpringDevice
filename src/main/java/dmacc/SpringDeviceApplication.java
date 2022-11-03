package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Device;
import dmacc.beans.Owner;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.DeviceRepository;

@SpringBootApplication
public class SpringDeviceApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringDeviceApplication.class, args);
	}
	
//	@Autowired
//	DeviceRepository repo;
//	
//	@Override
//	public void run(String... args) throws Exception{
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		
//		Device d = appContext.getBean("device", Device.class);
//		d.setSerialId(77777);
//		repo.save(d);
//		
//		Device e = new Device("silver", "ipad", 88888);
//		Owner o = new Owner("David", "777-777-7777");
//		e.setOwner(o);
//		repo.save(e);
//		
//		List<Device> allDevices = repo.findAll();
//		for(Device devices : allDevices) {
//			System.out.println(devices.toString());
//		}
//		((AbstractApplicationContext) appContext).close();
//	}

}