package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

public class ExtensionDecorator extends FileDecorator {

	public ExtensionDecorator(FileOO2 file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return this.file.prettyPrint() + ".txt - ";
	}

}