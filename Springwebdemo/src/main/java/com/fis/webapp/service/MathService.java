package com.fis.webapp.service;

import org.springframework.stereotype.Component;

@Component
public class MathService {
	
	public int doAddition(int a, int b)
	{
		return a+b;
	}
}
