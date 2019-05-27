package atd;

import java.util.ArrayList;

public class ATDDouble extends atd {
	
	/** Значение свойства, выраженного в double типе */
	double var;
	
	/** Ограничение свойства */
	private ArrayList<Restriction> rstr;
	
	/** Конструктор */
	public ATDDouble(double var) {
		super();
		this.var = var;
	}
	
}