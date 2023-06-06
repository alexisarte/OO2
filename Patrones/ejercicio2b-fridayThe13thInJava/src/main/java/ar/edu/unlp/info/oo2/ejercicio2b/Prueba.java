package ar.edu.unlp.info.oo2.ejercicio2b;

public class Prueba {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		VoorheesExporter exporter = new VoorheesExporter();
		
		biblioteca.setExporter(exporter);
		
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		System.out.println(biblioteca.exportarSocios());
	}

}
