package com.blz.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.blz.RegestrationForm;

public class RegFormMobileNoTest {
	

	RegestrationForm form = new RegestrationForm();
	

	@Test
	public void testNumberValid_Success() {
		assertTrue(form.userNumber("91 9370636399"));
	}
	
	
	@Test
	public void testNumberInValid_Fail() {
		assertFalse(form.userNumber("9466348798"));
	
	}
	
	@Test
	public void testNumberInValid_Fail1() {
		assertFalse(form.userNumber("0 96895686"));
	
	}

}
