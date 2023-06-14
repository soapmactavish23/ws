package com.hkprogrammer.ws.cache;

import java.util.Timer;
import java.util.TimerTask;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TimeLoop {

	@Autowired 
	private SpringGenerator stringGenerator;

	@PostConstruct
	void init() {
		new Timer().scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				String simple = stringGenerator.buildSimpleString();
				String cached = stringGenerator.buildCachedString();
				
				//System.out.println("Simple: " + simple + ", cached: " + cached);
			}
		}, 2000L, 2000L);
	}
	
}
