package atd;


public class Property {
	
	/** Уникальный номер свойства. */
	private int idProperty; 
	
	/** Поддерживаемый домен свойства */
	private Domen name;
	
	/** Тип свойства, в котором хранится значения */
	private atd temp;

	public Property(int idProperty, Domen name, atd temp) {
		super();
		this.idProperty = idProperty;
		this.name = name;
		this.temp = temp;
	}
	
	
}
