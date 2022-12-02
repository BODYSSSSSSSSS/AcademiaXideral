package Inyeccion;

public class Ticket {
    
	private static int contadorFolio;
        int folio;
	Pelicula peli;
        
	
        public Ticket() {
            this.folio = ++ Ticket.contadorFolio;
	}
	
	void mostrarTicket(){
		System.out.println("Folio: "+ folio);
		peli.mostrar();
	}

}
