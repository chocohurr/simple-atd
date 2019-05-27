package atd;

import java.util.ArrayList;

public class ATDBoolean extends atd {
	
	/** Значение свойства, выраженного в boolean типе */
	boolean var;
	
	/** Ограничение свойства */
	private ArrayList<Restriction> rstr;
	
	/** Конструктор */
	public ATDBoolean(boolean var) {
		super();
		this.var = var;
	}
	
}