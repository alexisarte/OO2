package ar.edu.unlp.info.oo2.ejercicio11_dispositivoMovilYConexiones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DispositivoTest {

	Dispositivo dispositivo;
	Connection connection;
	CRC_Calculator crcCalculator16;
	
	@BeforeEach
	void setUp() throws Exception {
		this.connection = new WifiConn();
		this.crcCalculator16 = new CRC16_Calculator();
		this.dispositivo =  new Dispositivo(this.connection, this.crcCalculator16);
	}

	@Test
	void testSend() {
		assertEquals("Data", this.dispositivo.send("Data"));
	}

	@Test
	void testConectarCon() {
		this.dispositivo.conectarCon(new Adapter4G());
		assertEquals("4G", this.dispositivo.getConnection().pict());
	}

	@Test
	void testConfigurarCRC() {
		CRC_Calculator crcCalculator32 = new CRC32_Calculator();
		this.dispositivo.configurarCRC(crcCalculator32);
		assertEquals(crcCalculator32, this.dispositivo.getCrcCalculator());
	}

}
