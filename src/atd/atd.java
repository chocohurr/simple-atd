package atd;

public abstract class atd {
	
	
	/** Определение типа данных, возможно стоит добавить сюда переопредление restriction */
	@SuppressWarnings("finally")
	static atd Classification(String arg)
	{
		atd type = null;
		try {
			double var = Double.parseDouble(arg);
			if (var==(int)var) type = new ATDInteger((int)var);
			else type = new ATDDouble(var);
		}
		catch (NumberFormatException nfe) {
			if ((arg=="true") || (arg=="false")) type = new ATDBoolean(Boolean.parseBoolean(arg));
			else type = new ATDString(arg);
		}
		finally {
			return type;
		}
	}
}
