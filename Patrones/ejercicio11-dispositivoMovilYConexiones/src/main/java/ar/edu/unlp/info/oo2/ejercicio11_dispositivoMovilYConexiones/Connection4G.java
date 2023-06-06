package ar.edu.unlp.info.oo2.ejercicio11_dispositivoMovilYConexiones;

public class Connection4G {
	
	private String symb;

    public Connection4G() {
        this.symb = "4G";
    }

    public String transmit(String data, long crc) {
    	return data;
    }
    
    public String symb() {
    	return this.symb;
    }

}
