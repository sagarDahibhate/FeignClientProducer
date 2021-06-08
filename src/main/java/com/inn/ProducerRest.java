package com.inn;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerRest {

	@GetMapping("/getmsg")
	public ResponseEntity<String> getmsg(){
		return ResponseEntity.ok("  hello these msg is from feign client producer ms");
	}
}
