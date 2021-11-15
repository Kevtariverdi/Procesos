package practicaBarberos;

public class Barbero implements Runnable{
	
	private String nombre;
	private sillaBarberia barberia;
	
	
	public Barbero (sillaBarberia br, String n) {
		this.nombre=n;
		this.barberia=br;
	}
	public void echandounpiti() {
		try {
			System.out.println("Me voy a echar un piti. ");
			Thread.currentThread().sleep(10000);
			
		}catch(Exception e) {
				System.out.println("Hay un error");
			}
		System.out.println("Volviendo al curro. ");
		}
	
	
	

	@Override
	public void run() {
		while(true) {
			int silla=barberia.cortarPelo();
			
			while(silla==-1) {
				//espera
				echandounpiti();
				silla=barberia.cortarPelo();
			}
			//sigue comprobando
			echandounpiti();
			barberia.mePiro(silla);
		}
		

	}

}
