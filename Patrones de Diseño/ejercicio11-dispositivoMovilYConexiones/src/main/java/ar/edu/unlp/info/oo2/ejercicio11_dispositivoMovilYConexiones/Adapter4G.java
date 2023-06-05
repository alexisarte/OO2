package ar.edu.unlp.info.oo2.ejercicio11_dispositivoMovilYConexiones;

public class Adapter4G implements Connection {
	
	Connection4G connection;
	
	public Adapter4G() {
		this.connection = new Connection4G();
	}

	@Override
    public String sendData(String data, long crc) {
		return this.connection.transmit(data, crc);
	}

	@Override
	public String pict() {
		return this.connection.symb();
	}
	
}
