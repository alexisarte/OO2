package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

import java.time.LocalDate;

public class FileDecorator implements FileOO2 {

	protected FileOO2 file;

	public FileDecorator(FileOO2 file) {
		this.file = file;
	}
	
	public String prettyPrint() {
		return this.file.prettyPrint();
	}

	@Override
	public String getName() {
		return this.file.getName();
	}

	@Override
	public String getExtension() {
		return this.file.getExtension();
	}

	@Override
	public double getSize() {
		return this.file.getSize();
	}

	@Override
	public LocalDate getCreationDate() {
		return this.file.getCreationDate();
	}

	@Override
	public LocalDate getModificateDate() {
		return this.file.getModificateDate();
	}

	@Override
	public String getPermits() {
		return this.file.getPermits();
	}

}
