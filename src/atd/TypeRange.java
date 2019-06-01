package atd;

public class TypeRange extends Restriction{
	
	/** Начало, конец, шаг */
	double start;
	double stop;
	double step;
	public TypeRange(double start, double stop, double step) {
		super();
		this.start = start;
		this.stop = stop;
		this.step = step;
	}

}
