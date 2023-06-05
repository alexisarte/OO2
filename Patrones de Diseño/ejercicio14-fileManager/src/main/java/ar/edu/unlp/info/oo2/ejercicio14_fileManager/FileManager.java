package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

public class FileManager {
	
	private FileOO2 file;
	
	public FileManager(FileOO2 file) {
		this.file = file;
	}
	
	public String prettyPrint() {
		return this.file.prettyPrint();
	}

}
