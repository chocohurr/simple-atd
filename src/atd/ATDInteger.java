package atd;

import java.util.ArrayList;

public class ATDInteger extends atd {
	
	/** Значение свойства, выраженного в int типе */
	int var;
	
	/** Ограничение свойства */
	private ArrayList<Restriction> rstr;
	
	/** Конструктор */
	public ATDInteger() {
		super();
	}
	public ATDInteger(int var) {
		super();
		this.var = var;
	}
}