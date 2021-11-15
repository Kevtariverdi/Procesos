package practicaBarberos;



public class sillaBarberia {
		
		boolean [] sillaslibres;
		boolean [] clienteAtendido;
	
		int clientesatendidos=0;
			
		public sillaBarberia() {
		}
		
		public sillaBarberia(int numsillas) {
			
			sillaslibres= new boolean[numsillas];
			clienteAtendido = new boolean[numsillas];
			
			for (int i = 0; i <numsillas; i++) {
				sillaslibres[i] = true;
				clienteAtendido[i]= false;
				
			}
			
		}
		public synchronized int getSillaLibre() {
			for (int i = 0; i <sillaslibres.length; i++) {
			
				if(sillaslibres[i]) {
					
					sillaslibres[i] = false;
					System.out.println("Cliente sentado en la silla " + i);
					
					return i;
				}
			}
			
			return -1;
		}
	
		public synchronized int cortarPelo() {
			
			for (int i = 0; i < sillaslibres.length; i++) {
				if(clienteAtendido[i] == false) {
					clienteAtendido[i] = true;
					System.out.println("Cortando el pelo a " + i);
					return i;
				}
				
			}
			return -1;
		}
		
		public synchronized void mePiro(int silla) {
			
			sillaslibres[silla]=true;
			clienteAtendido[silla]=false;
			System.out.println("Me voy ya.");
			clientesatendidos++;
		}
		
}
















