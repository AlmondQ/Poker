package com.imooc;

public class Poker implements Comparable<Poker>{

	 String type;
	 String number;
	 int number2;
	
	
	
	public Poker(){
		
	}

	


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + number2;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}






	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poker other = (Poker) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (number2 != other.number2)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}






	@Override
	public int compareTo(Poker o) {
		if(this instanceof IntPoker&&o instanceof IntPoker){
			return ((Integer)this.number2).compareTo((Integer)o.number2);
		
		}else if(this instanceof IntPoker && o instanceof StringPoker){
			if(o.number.equals("A")){
				return 1;
			}else{
				return -1;
			}
		}else if(this instanceof StringPoker && o instanceof IntPoker){
			if(this.number.equals("A")){
				return -1;
			}else{
				return 1;
			}
		}else{
			if(this.number.equals("A")){
				if(o.number.equals("A")){
					return 0;
				}else{
					return -1;
				}
			}else if(this.number.equals("J")){
				if(o.number.equals("A")){
					return 1;
				}else if(o.number.equals("J")){
					return 0;
				}else{
					return -1;
				}
			}else if(this.number.equals("Q")){
				if(o.number.equals("Q")){
					return 0;
				}else if(o.number.equals("K")){
					return -1;
				}else{
					return 1;
				}
				
			}else{
				if(o.number.equals("K")){
					return 0;
				}else{
					return 1;
				}
			}
		}
		
		
		
	}

	
	
}
