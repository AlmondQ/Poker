package com.imooc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PokerList {

	String name1;
	String name2;
	Random random = new Random();
	Poker[] poker = new Poker[20];
	Scanner input = new Scanner(System.in);
    
	
	List<Poker> pokerList = new ArrayList<Poker>();
	
	List<Poker> pokerListAfter = new ArrayList<Poker>();
	
	List<Poker> pokerListPlayer1 = new ArrayList<Poker>();
	List<Poker> pokerListPlayer2 = new ArrayList<Poker>();
	List<Poker> pokerListPlayers = new ArrayList<Poker>();
    
	
	//创建扑克牌
	public void producePoker(){
		
		System.out.println("---------创建扑克牌----------");
		//创建方片
		
		for(int i=2;i<11;i++){
		  poker[0] = new IntPoker(i,"方片");
		  
		  
			  pokerList.add(poker[0]);
		}
	
		poker[1]=new StringPoker("J","方片");
		poker[2]=new StringPoker("Q","方片");
		poker[3]=new StringPoker("K","方片");
		poker[4]=new StringPoker("A","方片");
		pokerList.add(poker[1]);
		pokerList.add(poker[2]);
		pokerList.add(poker[3]);
		pokerList.add(poker[4]);
		
		//创建梅花
		
			for(int i=2;i<11;i++){
			  poker[5] = new IntPoker(i,"梅花");	
			  
				  pokerList.add(poker[5]);
			}
		
			poker[6]=new StringPoker("J","梅花");
			poker[7]=new StringPoker("Q","梅花");
			poker[8]=new StringPoker("K","梅花");
			poker[9]=new StringPoker("A","梅花");
			pokerList.add(poker[6]);
			pokerList.add(poker[7]);
			pokerList.add(poker[8]);
			pokerList.add(poker[9]);
			//创建红桃
			
				for(int i=2;i<11;i++){
				  poker[10] = new IntPoker(i,"红桃");	
				  
					  pokerList.add(poker[10]);
				}
			
				poker[11]=new StringPoker("J","红桃");
				poker[12]=new StringPoker("Q","红桃");
				poker[13]=new StringPoker("K","红桃");
				poker[14]=new StringPoker("A","红桃");
				pokerList.add(poker[11]);
				pokerList.add(poker[12]);
				pokerList.add(poker[13]);
				pokerList.add(poker[14]);
				
				//创建黑桃
				
					for(int i=2;i<11;i++){
					  poker[15] = new IntPoker(i,"黑桃");	
					  
						  pokerList.add(poker[15]);
					}
				
					poker[16]=new StringPoker("J","黑桃");
					poker[17]=new StringPoker("Q","黑桃");
					poker[18]=new StringPoker("K","黑桃");
					poker[19]=new StringPoker("A","黑桃");
					pokerList.add(poker[16]);
					pokerList.add(poker[17]);
					pokerList.add(poker[18]);
					pokerList.add(poker[19]);
					
				
				System.out.println("---------创建扑克牌成功----------");
	
				System.out.print("为"+"[");
				for(Poker poker:pokerList){
					if(poker instanceof IntPoker)
						System.out.print(poker.type+poker.number2+",");
					else 
						System.out.print(poker.type+poker.number+",");
				
					}
				System.out.println("]");
	}
	//洗牌
	public void messPoker(){
		
		System.out.println("-----开始洗牌-----");
		
		
		do{
		int i = random.nextInt(52);
		Poker poker = pokerList.get(i);
		
		if(pokerListAfter.contains(poker)){
			continue;
		}else{
			pokerListAfter.add(poker);
		}
		
	}while(pokerListAfter.size()<52);
		
		System.out.println("-----洗牌结束-----");
	}
	
	//测试洗牌是否成功
//	public void test(){
//		for(Poker poker:pokerListAfter){
//			System.out.print(poker.type+poker.number+",");
//		
//			}
//	}

	//创建玩家
	public void enterPlayer(){
		
		do{
		try{
			System.out.println("-----创建玩家-----");
			System.out.println("请输入第1位玩家的ID和姓名：");
			System.out.println("输入ID：");
			int id = input.nextInt();
			System.out.println("输入姓名");
			name1 = input.next();
			break;
		}catch(InputMismatchException e){
			System.out.println("输入有误");
			input = new Scanner(System.in);
			continue;
		}
		}while(true);
		
		do{
			try{
				
				System.out.println("请输入第2位玩家的ID和姓名：");
				System.out.println("输入ID：");
				int id2 = input.nextInt();
				System.out.println("输入姓名");
				name2 = input.next();
				break;
			}catch(InputMismatchException e){
				System.out.println("输入有误");
				input = new Scanner(System.in);
				continue;
				
			}
			}while(true);
		
		System.out.println("欢迎玩家："+name1);
		System.out.println("欢迎玩家："+name2);
	}
	
	//给玩家发牌
	
	public void givePoker(){
		
		//给第一个玩家发第一张牌
		int i = random.nextInt(52);
		Poker poker11 = pokerListAfter.get(i);
		pokerListPlayer1.add(poker11);
		System.out.println("玩家："+name1+"拿牌");
		//给第二个玩家发第一张牌
		do{
		int j = random.nextInt(52);
		Poker poker21=pokerListAfter.get(j);
		if (pokerListPlayer1.contains(poker21)){
			continue;
		}else{
			pokerListPlayer2.add(poker21);
			break;
		}
		
		}while(true);
		System.out.println("玩家："+name2+"拿牌");
		
		//给第一个玩家发第二张牌
		do{
			int j = random.nextInt(52);
			Poker poker12=pokerListAfter.get(j);
			if (pokerListPlayer1.contains(poker12)||pokerListPlayer2.contains(poker12)){
				continue;
			}else{
				pokerListPlayer1.add(poker12);
				break;
			}
			
			}while(true);
		System.out.println("玩家："+name1+"拿牌");
	//给第二个玩家发第二张牌
		
		do{
			int j = random.nextInt(52);
			Poker poker22=pokerListAfter.get(j);
			if (pokerListPlayer1.contains(poker22)||pokerListPlayer2.contains(poker22)){
				continue;
			}else{
				pokerListPlayer2.add(poker22);
				break;
			}
			
			}while(true);
		
		System.out.println("玩家："+name2+"拿牌");
		System.out.println("------发牌结束------");
	}
	
	//发牌结果
	public void testGivePoker(){
		System.out.print(name1+"的牌为:");
		System.out.print("[");
		for(Poker poker:pokerListPlayer1){
			if(poker instanceof StringPoker)
			System.out.print(poker.type+poker.number+"");
			else
				System.out.print(poker.type+poker.number2+"");
		}
		System.out.println("]");
		
		System.out.print(name2+"的牌为:");
		System.out.print("[");
		for(Poker poker:pokerListPlayer2){
			if(poker instanceof StringPoker)
			System.out.print(poker.type+poker.number+"");
			else 
				System.out.print(poker.type+poker.number2+"");
		}
		System.out.println("]");
	}
	
	//比较大小
	public void compare(List<Poker> list){
		Poker poker1 =list.get(0);
		Poker poker2 = list.get(1);
		
		//如果数字大小一样则比较花色
		if(poker1.compareTo(poker2)==0){
			Collections.sort(list, new TypeComparator());
		}else{
			//比较牌数字的大小
			Collections.sort(list);
		}
	}
	//分别比较玩家1，玩家2手中牌的大小，然后再比较两个玩家牌的大小
	public void totalCompare(){
		compare(pokerListPlayer1);
		Poker p1 =pokerListPlayer1.get(1);
		if(p1 instanceof StringPoker)
		System.out.println("玩家："+name1+"最大的手牌为："+p1.type+p1.number);
		else
			System.out.println("玩家："+name1+"最大的手牌为："+p1.type+p1.number2);
		compare(pokerListPlayer2);
		Poker p2 =pokerListPlayer2.get(1);
		if(p2 instanceof StringPoker)
		System.out.println("玩家："+name2+"最大的手牌为："+p2.type+p2.number);
		else
			System.out.println("玩家："+name2+"最大的手牌为："+p2.type+p2.number2);
		pokerListPlayers.add(p1);
		pokerListPlayers.add(p2);
		compare(pokerListPlayers);
		if(pokerListPlayers.get(1)==p1){
			System.out.println("-----玩家："+name1+"获胜-----");
		}else{
			System.out.println("-----玩家："+name2+"获胜-----");
		}
		
		
	}
	
	
}
