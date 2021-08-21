package com.blz.test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.blz.RegestrationForm;

	public class RegFormFirstNameTest {
	
		RegestrationForm form = new RegestrationForm();
		
	
		@Test
		public void testNameValid_Success() {
			assertTrue(form.userName("Diksha"));
		}
		
	
		@Test
		public void testNameInValid_Fail() {
			assertFalse(form.userName("dikshha"));
		}
	}
