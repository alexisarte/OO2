package ar.edu.unlp.info.oo2.ejercicio14_fileManager;

public class ModificateDateDecorator extends FileDecorator {

	public ModificateDateDecorator(FileOO2 file) {
		super(file);
	}

	@Override
	public String prettyPrint() {
		return super.prettyPrint() + " - " + this.getModificateDate();
	}

}
