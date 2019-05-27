package atd;

import java.util.ArrayList;

public class AccessPoint {
	
	/** In, out. Типы точек доступа.*/
	private boolean type;
	
	/** Уникальный номер в системе */
	private int idAP;
	
	/** Список свойств точки доступа. */
	private ArrayList<Property> PropertyList;

	public AccessPoint(boolean type, int idAP, ArrayList<Property> propertyList) {
		super();
		this.type = type;
		this.idAP = idAP;
		PropertyList = propertyList;
	}

	public AccessPoint(boolean type, ArrayList<Property> propertyList) {
		super();
		this.type = type;
		PropertyList = propertyList;
	}

	public AccessPoint(boolean type) {
		super();
		this.type = type;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public ArrayList<Property> getPropertyList() {
		return PropertyList;
	}

	public void setPropertyList(ArrayList<Property> propertyList) {
		PropertyList = propertyList;
	}
	
	
}
