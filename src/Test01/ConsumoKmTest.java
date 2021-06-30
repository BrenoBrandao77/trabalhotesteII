package Test01;

import static org.easymock.EasyMock.*;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

public class ConsumoKmTest extends TestCase {	
	Consumo consumo;	 

	@Before
	public void setUp() {
		consumo = new Consumo();	
	}

	@Test
	public void testeVelocidadeSessenta() {
		AutonomiaKm autonomiaMock = createMock(AutonomiaKm.class);
		expect(autonomiaMock.getVeloAuto()).andReturn(60);
		replay(autonomiaMock);		
		assertEquals("Consumo 20,6 km/l", consumo.autonomia(autonomiaMock));			
	}
	
	@Test
	public void testeVelocidadeOitenta() {
		AutonomiaKm autonomiaMock = createMock(AutonomiaKm.class);
		expect(autonomiaMock.getVeloAuto()).andReturn(80);
		replay(autonomiaMock);		
		assertEquals("Consumo 19,6 km/l", consumo.autonomia(autonomiaMock));			
	}
	
	
	@Test
	public void testeVelocidadeCem() {
		AutonomiaKm autonomiaMock = createMock(AutonomiaKm.class);
		expect(autonomiaMock.getVeloAuto()).andReturn(100);
		replay(autonomiaMock);		
		assertEquals("Consumo 17,6 km/l", consumo.autonomia(autonomiaMock));		
	}
	
	@Test
	public void testeVelocidadeCentoEVinte() {
		AutonomiaKm autonomiaMock = createMock(AutonomiaKm.class);
		expect(autonomiaMock.getVeloAuto()).andReturn(120);
		replay(autonomiaMock);		
		assertEquals("Consumo 16,7 km/l", consumo.autonomia(autonomiaMock));		
	}
	
	@Test
	public void testeVelocidadeCentoESessenta() {
		AutonomiaKm autonomiaMock = createMock(AutonomiaKm.class);
		expect(autonomiaMock.getVeloAuto()).andReturn(140);
		replay(autonomiaMock);		
		assertEquals("Consumo 15,3 km/l", consumo.autonomia(autonomiaMock));		
	}
	
	@Test
	public void testeVelocidadeCentoECinquenta() {
		AutonomiaKm autonomiaMock = createMock(AutonomiaKm.class);
		expect(autonomiaMock.getVeloAuto()).andReturn(160);
		replay(autonomiaMock);		
		assertEquals("Consumo 14,9 km/l", consumo.autonomia(autonomiaMock));		
	}
	
	@Test
	public void testeVelocidadeCentoEOitenta() {
		AutonomiaKm autonomiaMock = createMock(AutonomiaKm.class);
		expect(autonomiaMock.getVeloAuto()).andReturn(180);
		replay(autonomiaMock);		
		assertEquals("Consumo 13,2 km/l", consumo.autonomia(autonomiaMock));			
	}
	
	@Test
	public void testeVelocidadeDuzentos() {
		AutonomiaKm autonomiaMock = createMock(AutonomiaKm.class);
		expect(autonomiaMock.getVeloAuto()).andReturn(200);
		replay(autonomiaMock);		
		assertEquals("Consumo 12,5 km/l", consumo.autonomia(autonomiaMock));			
	}
	
	@Test
	public void testeVelocidadeDuzentosEVinte() {
		AutonomiaKm autonomiaMock = createMock(AutonomiaKm.class);
		expect(autonomiaMock.getVeloAuto()).andReturn(220);
		replay(autonomiaMock);		
		assertEquals("Consumo 11,2 km/l", consumo.autonomia(autonomiaMock));		
	}
	
	
	@Test
	public void testeVelocidadeAcimaDuzentosEVinte() {
		AutonomiaKm autonomiaMock = createMock(AutonomiaKm.class);
		expect(autonomiaMock.getVeloAuto()).andReturn(221);
		replay(autonomiaMock);		
		assertEquals("Acima de 220Km/h autonomia menor que 10km/l", consumo.autonomia(autonomiaMock));			
	}
}
	
