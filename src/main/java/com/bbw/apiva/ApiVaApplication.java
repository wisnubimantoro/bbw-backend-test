package com.bbw.apiva;

import org.jpos.q2.Q2;
import org.jpos.q2.iso.QMUX;
import org.jpos.util.NameRegistrar;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiVaApplication{

	public static void main(String[] args) {
		Q2 q2 = new Q2();
		q2.start();
		SpringApplication.run(ApiVaApplication.class, args);
	}

	@Bean
	public QMUX exposeQmux() throws Exception{
		return (QMUX) NameRegistrar.get("mux.bbwva");
	}
}
