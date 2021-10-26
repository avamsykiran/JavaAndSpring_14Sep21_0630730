package com.cts.sbd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("gsmi")
public class GreetServiceMultiLingualImpl implements GreetService {

	//@Value("${greet.note.multi}")
	//private String[] greetNotes;
	
	@Value("#{${greet.note.multi.list}}")
	private List<String> greetNotes;
	
	@Override
	public String greetUser(String userName) {
		StringBuilder sb = new StringBuilder();
		for(String greetNote : greetNotes)
			sb.append(String.format("\n%s %s", greetNote,userName));
		return sb.toString();
	}

}
