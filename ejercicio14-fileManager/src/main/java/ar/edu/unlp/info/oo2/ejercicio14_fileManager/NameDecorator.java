package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

public class NameDecorator extends FileDecorator {

	public NameDecorator(FileOO2 file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return this.file.prettyPrint() + "Name - ";
	}

}
