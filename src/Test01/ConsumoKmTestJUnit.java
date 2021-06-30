package Test01;

import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

public class ConsumoKmTestJUnit extends TestCase {
		Autonomia autonomia;
		Consumo consumo;			

		@Before
		public void setUp() throws Exception {
			autonomia = new Autonomia();
			consumo = new Consumo();			
		}

		@Test
		public void testeVelocidadeSessentaJ() {
			autonomia.setVeloAuto(60);
			assertEquals("Consumo 20,6 km/l", consumo.autonomia(autonomia));		
		}
		
		@Test
		public void testeVelocidadeOitentaJ() {
			autonomia.setVeloAuto(80);
			assertEquals("Consumo 19,6 km/l", consumo.autonomia(autonomia));		
		}
		
		@Test
		public void testeVelocidadeCemJ() {
			autonomia.setVeloAuto(100);
			assertEquals("Consumo 17,6 km/l", consumo.autonomia(autonomia));		
		}
		
		@Test
		public void testeVelocidadeCentoEVinteJ() {
			autonomia.setVeloAuto(120);
			assertEquals("Consumo 16,7 km/l", consumo.autonomia(autonomia));		
		}
		
		@Test
		public void testeVelocidadeCentoEQuarentaJ() {
			autonomia.setVeloAuto(140);
			assertEquals("Consumo 15,3 km/l", consumo.autonomia(autonomia));		
		}
		
		@Test
		public void testeVelocidadeCentoESessentaJ() {
			autonomia.setVeloAuto(160);
			assertEquals("Consumo 14,9 km/l", consumo.autonomia(autonomia));		
		}
		
		@Test
		public void testeVelocidadeCentoEOitentaJ() {
			autonomia.setVeloAuto(180);
			assertEquals("Consumo 13,2 km/l", consumo.autonomia(autonomia));		
		}
		
		@Test
		public void testeVelocidadeDuzentosJ() {
			autonomia.setVeloAuto(200);
			assertEquals("Consumo 12,5 km/l", consumo.autonomia(autonomia));		
		}
		
		@Test
		public void testeVelocidadeDuzentosEVinteJ() {
			autonomia.setVeloAuto(220);
			assertEquals("Consumo 11,2 km/l", consumo.autonomia(autonomia));		
		}
		
		@Test
		public void testeVelocidadeAcimaDuzentosEVinteJ() {
			autonomia.setVeloAuto(221);
			assertEquals("Acima de 220Km/h autonomia menor que 10km/l", consumo.autonomia(autonomia));		
		}
	}
