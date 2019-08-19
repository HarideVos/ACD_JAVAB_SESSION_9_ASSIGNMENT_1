package ninepointone;

import java.util.HashMap;

public class Emp {

	public static void main(String[] args) {
		Integer[] empKey= {1,2,3,4,5,6,7,8,9,10};
		String [] empName= {"Adrian","Emily","Layla","William",
				"Evelyn","Lorelei","Danielle","Steven","Ove","Ulrich"};
		HashMap<Integer,String> emp=new HashMap<Integer ,String>();
		for(int i=0;i<empKey.length;i++) {
			emp.put(empKey[i],empName[i]);
		}
		for (String string : empName) {
			System.out.println(string);
		}
	}

}