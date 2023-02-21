package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Myfirst {
		@GetMapping("show")
		public String display() {
			return "hello";
		}
}
