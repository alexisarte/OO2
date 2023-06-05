package ar.edu.unlp.info.oo2.ejercicio11_dispositivoMovilYConexiones;

public class WifiConn implements Connection {
	
    private String pict;

    public WifiConn() {
        this.pict = "Wi-fi";
    }

    @Override
    public String sendData(String data, long crc) {
    	return data;
    }

    @Override
    public String pict() {
        return this.pict;
    }
    
}
