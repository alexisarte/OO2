package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

public abstract class FileDecorator {
	
	protected FileOO2 file;

	public FileDecorator(FileOO2 file) {
		this.file = file;
	}
	
	public String prettyPrint() {
		return this.file.prettyPrint();
	}
	
}
