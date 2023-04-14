package ar.edu.unlp.info.oo2.ejercicio11_dispositivoMovilYConexiones;

public class Dispositivo {
	
	private Connection connection;
    private CRC_Calculator crcCalculator;
    private Ringer ringer;
    private Display display;

    public Dispositivo(Connection connection, CRC_Calculator crcCalculator) {
        this.connection = connection;
        this.crcCalculator = crcCalculator;
        this.ringer = new Ringer();
        this.display = new Display();
    }

    public String send(String data) {
    	long crc = this.crcCalculator.crcFor(data);
        return this.connection.sendData(data, crc);
    }
    
    public void conectarCon(Connection newConnection) {
    	this.connection = newConnection;
    	this.connection.pict();
    	this.ringer.ring();
    }
    
    public void configurarCRC(CRC_Calculator newCrc) {
    	this.crcCalculator = newCrc;
    }

	public Connection getConnection() {
		return this.connection;
	}

	public CRC_Calculator getCrcCalculator() {
		return this.crcCalculator;
	}
    
    
	
}
