package test;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	List<Integer> fours = new ArrayList<Integer>();
	List<Integer> twos = new ArrayList<Integer>();
	public Sample()
	{	
		init();
	}
	private void init(){
		for (int i=1;i<31;i++){
			float p4 = i/4;
			if(Math.floor(p4) == p4){
				fours.add(i);
			} else {
				float p2 = i/2;
				if(Math.floor(p2) == p2){
					fours.add(i);
				}
			}
		}		
	}
	
	public List<Integer> get4s(){
		return fours;
	}
	public List<Integer> get2s(){
		return twos;
	}

}
