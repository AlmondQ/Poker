package com.imooc;

import java.util.Comparator;

public class TypeComparator implements Comparator<Poker> {

	@Override
	public int compare(Poker o1, Poker o2) {
		if(o1.type.equals("��Ƭ")){
			return -1;
		}else if(o1.type.equals("÷��")){
			if(o2.type.equals("��Ƭ")){
				return 1;
			}else{
				return -1;
			}
		}else if(o1.type.equals("����")){
			if(o2.type.equals("��Ƭ")||o2.type.equals("÷��")){
				return 1;
			}else{
				return -1;
			}
		}else{
			return 1;
		}
		
		
	}

}
