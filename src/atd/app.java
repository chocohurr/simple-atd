package atd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class app {

	public static void main(String[] args) throws IOException{
		
		/**Тесты, проверяющие работоспособность классификации ТД, а также воссоздания свойства и домена. */
		Vector<atd> inic = new Vector();
		Vector<Domen> domens = new Vector();
		Vector<Property> propers = new Vector();
		BufferedReader reader =new BufferedReader(new FileReader("C://Users//Kirill//AppData//test.txt"));
		String s;
		int j=0;
	    while((s=reader.readLine())!=null) {
	    	String[] arr = s.split(",");
	    	inic.add(atd.Classification(arr[0])); //arr[1][1]
	    	char[] chArray = arr[1].toCharArray();
	    	switch(chArray[1])
	    	{
	    	case ':':
	    		{
	    			String[] enumer = arr[1].split(",");
	    			Vector Q = new Vector();
	    			for (int i=0; i<enumer.length; i++) {
	    				Q.add(enumer[i]);
	    			}
	    			domens.add(new Domen(j));
	    			//domens.elementAt(j).setRestrictionDomen(new TypeEnum(Q));
	    			break;
	    		}
	    	case '>':
	    		{
	    			String[] ranger = arr[1].split(">");
	    			domens.add(new Domen(j));
	    			double start, stop, step;
	    			
	    			start = Double.parseDouble(ranger[0]);
	    			stop = Double.parseDouble(ranger[1]);
	    			step = Double.parseDouble(ranger[2]);
	    			
	    			domens.elementAt(j).setRestrictionDomen(new TypeRange(start, stop, step));
	    			break;
	    		}
	    	default: break;
	    	}

	    	//propers.addElement(new Property(j, domens.elementAt(j), atd.Classification(arr[0])));
	    	j++;
	    }
	    for (int i=0; i<j; i++) {
	    System.out.println(propers.elementAt(i));}
	}

}
