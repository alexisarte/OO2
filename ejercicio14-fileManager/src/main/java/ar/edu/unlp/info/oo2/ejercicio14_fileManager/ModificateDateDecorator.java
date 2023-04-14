package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

import java.time.LocalDate;

public class ModificateDateDecorator extends FileDecorator {

	public ModificateDateDecorator(FileOO2 file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return this.file.prettyPrint() + LocalDate.now().plusDays(10) + " - " ;
	}

}
