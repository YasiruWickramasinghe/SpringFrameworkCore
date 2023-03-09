package com.pearl.SpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //which create class object undependancy
public class Samsung {
	
	@Autowired //search for object inside the class
	@Qualifier("mediaTek") //match the currect name of interface need to process
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Octa Core,4 gb Ram, 12MP camera");
		cpu.process();
	}

}
