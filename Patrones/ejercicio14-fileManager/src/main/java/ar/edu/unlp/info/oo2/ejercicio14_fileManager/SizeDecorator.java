package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

public class SizeDecorator extends FileDecorator {

	public SizeDecorator(FileOO2 file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + " - " + this.getSize() + "mb";
	}

}
