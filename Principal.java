package practicaBarberos;

public class Principal {

	public static void main(String[] args) {
	
		int MAX_BARBERO = 3;
		int NUM_SILLAS= 5;
		int MAX_CLIENTES= MAX_BARBERO * 9;
		
		sillaBarberia barberia= new  sillaBarberia(NUM_SILLAS);
		
		Thread[] tbarberos = new Thread[MAX_BARBERO];
		for (int i = 0; i < tbarberos.length; i++) {
			
			Barbero b = new Barbero(barberia, "Barbero" + i);
			
			Thread hiloBarba = new Thread(b);
			tbarberos[i]=hiloBarba;
			hiloBarba.start();
			
			}
		/*
		for (int i = 0; i < MAX_CLIENTES; i++) {
		*/	
			
		}
		
	}

