package TryCatch;

import junit.framework.TestCase;

public class TesteSoma extends TestCase {
	Soma teste1 = new Soma();
	public void testSomar() {
		
	int soma = teste1.somar(10,10);
	assertEquals(20, soma);
	assertEquals(200, soma);
	
	}
	
}
	

