package me.jaegyu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestSampleController {

	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	public Object sample() {
		Map<String, Object> result = new HashMap<>();
		result.put("name", "alice");
		result.put("age", 32);

		return result;
	}
}
