package ar.edu.unlp.info.oo2.ejercicio11_dispositivoMovilYConexiones;

interface Connection {
	
	String sendData(String data, long crc);
	
	String pict();

}
