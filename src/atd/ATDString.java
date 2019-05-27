package atd;

import java.util.ArrayList;

public class ATDString extends atd {
	
	/** Значение свойства, выраженного в String типе */
	String var;
	
	/** Ограничение свойства */
	private ArrayList<Restriction> rstr;
	
	/** Конструктор */
	public ATDString(String var) {
		super();
		this.var = var;
	}
}