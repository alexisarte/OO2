package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

public class PermitsDecorator extends FileDecorator {
	
	public PermitsDecorator(FileOO2 file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return this.file.prettyPrint() + this.file.getPermits();
	}

}
