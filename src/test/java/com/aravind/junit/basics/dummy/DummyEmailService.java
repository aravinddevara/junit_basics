package com.aravind.junit.basics.dummy;

import com.aravind.junit.basics.test_doubles.dummy.IEmailService;

public class DummyEmailService implements IEmailService{

	@Override
	public void sendMail() {
		throw new AssertionError("Method is not implemented");
	}

}
