package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

import java.time.LocalDate;

public class BaseFile implements FileOO2 {

	private String name;
	private String extension;
	private double size;
	private LocalDate creationDate;
	private LocalDate modificateDate;
	private String permits;

	public BaseFile(String name, String extension, double size) {
		this.name = name;
		this.extension = extension;
		this.size = size;
		this.creationDate = LocalDate.now();
		this.modificateDate = this.creationDate;
	}

	@Override
	public String prettyPrint() {
		return "";
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getExtension() {
		return this.extension;
	}

	@Override
	public double getSize() {
		return this.size;
	}

	@Override
	public LocalDate getCreationDate() {
		return this.creationDate;
	}

	@Override
	public LocalDate getModificateDate() {
		return this.modificateDate;
	}

	@Override
	public String getPermits() {
		return this.permits;
	}

}
