package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileManagerTest {

	FileOO2 file, fileName, fileExtension, fileSize, fileCreationDate, fileModificateDate;

	@BeforeEach
	void setUp() throws Exception {
		file = new BaseFile("Archivo", ".txt", 5);
		fileName = new NameDecorator(file);
		fileExtension = new ExtensionDecorator(fileName);
		fileSize = new SizeDecorator(fileExtension);
		fileCreationDate = new CreationDateDecorator(fileSize);
		fileModificateDate = new ModificateDateDecorator(fileCreationDate);
	}

	@Test
	void testPrettyPrint() {
		assertEquals("Archivo", this.fileName.prettyPrint());
		assertEquals("Archivo.txt", this.fileExtension.prettyPrint());
		assertEquals("Archivo.txt - 5.0mb", this.fileSize.prettyPrint());
		assertEquals("Archivo.txt - 5.0mb - " + LocalDate.now() + " - " + LocalDate.now(),
				this.fileModificateDate.prettyPrint());
	}

}
