package Homework;

import java.util.ArrayList;
import java.util.Random;

class Sort {
	ArrayList<Number> list = new ArrayList<Number>();
	public Sort() {}
	public Sort(ArrayList<Number> list) {
		this.list = list;
	}
	public static void shuffle(ArrayList<Number> list) {
		if (list.size() == 0 || list == null) {
			return;
	    }
	    Random random = new Random();
	    for (int i=0; i<list.size(); i++) {
	    	int index = random.nextInt(list.size());
	        Number number = list.get(i);
	        list.set(i, list.get(index));
	        list.set(index, number);
	    }
	}
	
}


