package com.blz.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.blz.RegestrationForm;

	public class RegFormLastNameTest {
	
		RegestrationForm form = new RegestrationForm();
	
	
		@Test
		public void testLastNameValid_Success() {
			assertTrue(form.userName("Kale"));
		}
	
		@Test
		public void testLastNameInValid_Fail() {
			assertFalse(form.userName("kale00"));
		}

	}
