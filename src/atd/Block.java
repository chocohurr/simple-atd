package atd;

import java.util.ArrayList;

public class Block {
	
	/** Уникальный номер в системе */
	private int idBlock;
	
	/** Список точек доступа. */
	private ArrayList<AccessPoint> AP;

	public Block(int idBlock, ArrayList<AccessPoint> aP) {
		super();
		this.idBlock = idBlock;
		AP = aP;
	}

	public Block(ArrayList<AccessPoint> aP) {
		super();
		AP = aP;
	}
	
	
}
