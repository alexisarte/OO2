package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileManagerTest {

	FileOO2 file;
	FileDecorator fileName, fileExtension; 
	
	@BeforeEach
	void setUp() throws Exception {
		file = new BaseFile();
		fileName = new NameDecorator(file);
		fileExtension = new ExtensionDecorator(fileName);
	}

	@Test
	void testPrettyPrint() {
		assertEquals(".txt - ", this.fileExtension.prettyPrint());
		assertEquals("Nombre - .txt", this.fileExtension.prettyPrint());
	}
		
}
