package com.blz.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.blz.RegestrationForm;

public class RegFormPasswordTest {
	
	RegestrationForm form = new RegestrationForm();
	
	
	@Test
	 public void testPassMin8LetterValid_Success() {
		assertTrue(form.userName("Dikshaka"));
	}
	
	
	@Test
	public void testPassMin8LetterInValid_Fail() {
		assertFalse(form.userName("diksha"));
		}
	
	
	@Test
	 public void testPassSpecialCharValid_Success() {
		assertTrue(form.userName("Dikshakale@34"));
	}
	
	
	@Test
	 public void testPassSpecialCharInValid_Fail() {
		assertFalse(form.userName("Dikshakale34"));
	}
	
	
	@Test
	 public void testPassOneNumericValueValid_Success() {
		assertTrue(form.userName("Dikshakale13"));
	}
	
	
	@Test
	 public void testPassOneNumericValueInValid_Fail() {
		assertFalse(form.userName("Dikshakale"));
	}
	
	
	@Test
	 public void testPassOneUpperCaseValid_Success() {
		assertTrue(form.userName("Dikshakale@12"));
	}
	
	
	@Test
	 public void testPassOneUpperCaseInValid_Fail() {
		assertFalse(form.userName("dikshakale@12"));
	}
}


