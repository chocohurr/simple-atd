package atd;

import java.util.Vector;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class TypeEnum extends Restriction{

	/**Список перечислений */
	Vector MyEnum = new Vector();

	public TypeEnum() {
		super();
	}

	public TypeEnum(Vector myEnum) {
		super();
		MyEnum = myEnum;
	}
	
	
}
