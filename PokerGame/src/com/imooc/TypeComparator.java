package com.imooc;

import java.util.Comparator;

public class TypeComparator implements Comparator<Poker> {

	@Override
	public int compare(Poker o1, Poker o2) {
		if(o1.type.equals("方片")){
			return -1;
		}else if(o1.type.equals("梅花")){
			if(o2.type.equals("方片")){
				return 1;
			}else{
				return -1;
			}
		}else if(o1.type.equals("红桃")){
			if(o2.type.equals("方片")||o2.type.equals("梅花")){
				return 1;
			}else{
				return -1;
			}
		}else{
			return 1;
		}
		
		
	}

}
