package Test01;

public class Consumo {

	public String autonomia(AutonomiaKm autonomia) {
		double velocidade = autonomia.getVeloAuto();				
		
				
		 if (velocidade <= 60) { //1
			return "Consumo 20,6 km/l"; //2
		}	
		else if (velocidade <= 80) { //3			
			return "Consumo 19,6 km/l"; //4
		}			
		else if (velocidade <= 100) { //5
			return "Consumo 17,6 km/l"; //6
		}		
		else if (velocidade <= 120) { //7
			return "Consumo 16,7 km/l"; //8				
		}						
		else if (velocidade <= 140) { //9
			return "Consumo 15,3 km/l"; //10 
		}		
		else if (velocidade <= 160) {//11
		 return "Consumo 14,9 km/l";//12		 
		}
		else if (velocidade <= 180) { //13
			return "Consumo 13,2 km/l"; //14		
		}		
		else if (velocidade <= 200) { //15		
			return "Consumo 12,5 km/l"; //16			
		} 		
		else if (velocidade <= 220) { //17
			return "Consumo 11,2 km/l"; //18			
		}
			return "Acima de 220Km/h autonomia menor que 10km/l"; //19				
	} 	//20
}
		
	
	


	
		
