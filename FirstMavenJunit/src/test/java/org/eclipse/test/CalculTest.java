package org.eclipse.test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.eclipse.main.Calcul;
import org.eclipse.main.CalculService;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

@DisplayName("Test de la classe Calcul")
@RunWith(JUnitPlatform.class)
class CalculTest {
	Calcul calcul;
	@Mock
	CalculService calculService;
	
	@Rule
	MockitoRule Rule = MockitoJUnit.rule();
	//CalculService calculService = mock(CalculService.class);
//	CalculService calculService = new CalculService()
//	{
//	@Override
//	public int carre(int x) {
//	// TODO Auto-generated method stub
//	return x*x;
//	}
//	};

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach");
		MockitoAnnotations.initMocks(this);
		calcul = new Calcul(calculService);
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
		calcul=null;

	}

	@RepeatedTest(3)
	@DisplayName("Trois tests de la methode somme")
	//@Disabled
	void testSomme(RepetitionInfo repetitionInfo) {
		
		System.out.println("TestSomme");
		
		if(calcul.somme(3, 3)!=6)
			fail("faux pour 2 entiers positifs");
		if(calcul.somme(-2, -5)!=-7)
			fail("faux pour 2 entiers n�gatifs");
		if(calcul.somme(-2, 4)!=2)
			fail("faux pour 2 entiers de signe diff�rent");
		if(calcul.somme(0, 2)!=2)
			fail("faux pour x nul");
		if(calcul.somme(2, 0)!=2)
			fail("faux pour y nul");
		if(calcul.somme(0, 0)!=0)
			fail("faux pour x et y nuls");
		
		assertNotEquals(7, calcul.somme(repetitionInfo.getCurrentRepetition(), 3));
		
	}
	
	

	@Test
	void testDivision() {
		System.out.println("Test Division");

		
		assertFalse("2 entiers positifs",calcul.division(6, 3)==0);
		Assert.assertEquals( 2, calcul.division(-6, -3),-6-3);
		//assertEquals("2 entiers n�gatifs", 2, calcul.division(-6, -3));
		assertNotNull("2 entiers de signe different",calcul.division(-6,3) );
		assertTrue("entier x nul",calcul.division(0,3) == 0);
		Throwable e = null;
		
		try
		{
			calcul.division(6, 0);
		}
		catch(Throwable ex)
		{
			e=ex;
		}
		assertTrue(e instanceof ArithmeticException);
		e=null;
		try 
		{
			calcul.division(0,0);
		}
		catch (Throwable ex) 
		{
			e = ex;
		}
		assertTrue(e instanceof ArithmeticException);
	}
	@Test
	void testSommeCarre()
	{
		when(calculService.carre(2)).thenReturn(4);
		when(calculService.carre(3)).thenReturn(9);
		assertTrue("calcul exact",calcul.sommeCarre(2, 3)==13);
		verify(calculService).carre(2);
	}

}
