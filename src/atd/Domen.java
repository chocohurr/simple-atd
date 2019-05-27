package atd;

import java.util.ArrayList;

public class Domen {
	/** Номер домена в системе */
	private int idDomen;
	
	/** Исправить тип на интерфейс ограничений. Ограничение домена */
	private Restriction restrictionDomen;

	public Restriction getRestrictionDomen() {
		return restrictionDomen;
	}

	public void setRestrictionDomen(Restriction restrictionDomen) {
		this.restrictionDomen = restrictionDomen;
	}

	public Domen(int idDomen, Restriction restrictionDomen) {
		super();
		this.idDomen = idDomen;
		this.restrictionDomen = restrictionDomen;
	}

	public Domen(Restriction restrictionDomen) {
		super();
		this.restrictionDomen = restrictionDomen;
	}

	public Domen() {
		super();
	}
	
	
}
