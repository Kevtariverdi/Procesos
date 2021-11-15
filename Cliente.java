package practicaBarberos;

public class Cliente implements Runnable{

	sillaBarberia sillabarberia;
	
	public Cliente (sillaBarberia br) {
		this.sillabarberia=br;
	}
	
	
	
	@Override
	public void run() {
		System.out.println("Voy a hacerme los rizos.");
		int silla= sillabarberia.getSillaLibre();
		
		while(silla ==-1) {
			System.out.println("No hay sillas libres,me espero");
			silla=sillabarberia.getSillaLibre();
		}
		//Ya estoy en la basura.
	}

}
