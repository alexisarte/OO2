package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

import java.time.LocalDate;

public class CreationDateDecorator extends FileDecorator {

	public CreationDateDecorator(FileOO2 file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return this.file.prettyPrint() + LocalDate.now()  + " - ";
	}

}
