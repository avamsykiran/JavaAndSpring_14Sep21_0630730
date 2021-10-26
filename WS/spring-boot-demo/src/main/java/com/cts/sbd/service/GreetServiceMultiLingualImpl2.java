package com.cts.sbd.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("gsmi2")
public class GreetServiceMultiLingualImpl2 implements GreetService {
	
	@Value("#{${greet.note.multi.map}}")
	private Map<String,String> greetNotes;
	
	@Override
	public String greetUser(String userName) {
		StringBuilder sb = new StringBuilder();
		for(String key : greetNotes.keySet())
			sb.append(String.format("\nIn %s>>%s %s", key,greetNotes.get(key),userName));
		return sb.toString();
	}

}
