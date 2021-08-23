package br.com.alcemirsantos.aula22;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BolicheTest {
	private Boliche b;
	
	@Before public void setup() {
		// dado
		b = new Boliche();
	}
	
	
	@Test
	public void testPlacarFinalZeradoAoIniciar() {
		
		// quando
		int placarFinal  = b.getPlacarFinal();
		// então
		assertEquals(0, placarFinal);
	}
	
	
	@Test
	public void testPlacarFinalAposUmArremesso() {
		// dado
		// quando
		b.add(2);
		int placarFinal  = b.getPlacarFinal();
		// então
		assertEquals(2, placarFinal);
	}
	

	@Test
	public void testPlacarFinalAposUmaRodadaSemSpare() {
		// dado
		// quando
		b.add(2);
		b.add(2);
		int placarFinal  = b.getPlacarFinal();
		// então
		assertEquals(4, placarFinal);
	}

	
	@Test
	public void testGetRodadaAtualSemSpare() {
		// dado
		// quando
		b.add(7);
		b.add(2);
		b.add(5);
		int numRodada  = b.getRodadaAtual();
		// então
		assertEquals(2, numRodada);
	}
	
	@Test
	public void testGetRodadaAtualComSpare() {
		// dado
		// quando
		b.add(8);
		b.add(2);
		b.add(5);
		int numRodada  = b.getRodadaAtual();
		// então
		assertEquals(2, numRodada);
	}
	
	@Test
	public void testPlacarDeUmaDadaRodadaComSpare() {
		// dado
		// quando
		b.add(8);
		b.add(2);
		b.add(5);
		int placarDaRodada1  = b.getPlacarDaRodada(1);
		// então
		assertEquals(15, placarDaRodada1);
	}
	
	@Test
	public void testPlacarFinalAposUmaRodadaComSpare() {
		// dado
		// quando
		b.add(8);
		b.add(2);// pontuacao da rodada 1 = spare + 5 =15
		
		b.add(5);
		b.add(2);// pontuacao primeira + pontuacao da segunda = 22
		int placarFinal  = b.getPlacarFinal();
		// então
		assertEquals(22, placarFinal);
	}


}
