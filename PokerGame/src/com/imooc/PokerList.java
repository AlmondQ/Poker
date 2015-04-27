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
    
	
	//�����˿���
	public void producePoker(){
		
		System.out.println("---------�����˿���----------");
		//������Ƭ
		
		for(int i=2;i<11;i++){
		  poker[0] = new IntPoker(i,"��Ƭ");
		  
		  
			  pokerList.add(poker[0]);
		}
	
		poker[1]=new StringPoker("J","��Ƭ");
		poker[2]=new StringPoker("Q","��Ƭ");
		poker[3]=new StringPoker("K","��Ƭ");
		poker[4]=new StringPoker("A","��Ƭ");
		pokerList.add(poker[1]);
		pokerList.add(poker[2]);
		pokerList.add(poker[3]);
		pokerList.add(poker[4]);
		
		//����÷��
		
			for(int i=2;i<11;i++){
			  poker[5] = new IntPoker(i,"÷��");	
			  
				  pokerList.add(poker[5]);
			}
		
			poker[6]=new StringPoker("J","÷��");
			poker[7]=new StringPoker("Q","÷��");
			poker[8]=new StringPoker("K","÷��");
			poker[9]=new StringPoker("A","÷��");
			pokerList.add(poker[6]);
			pokerList.add(poker[7]);
			pokerList.add(poker[8]);
			pokerList.add(poker[9]);
			//��������
			
				for(int i=2;i<11;i++){
				  poker[10] = new IntPoker(i,"����");	
				  
					  pokerList.add(poker[10]);
				}
			
				poker[11]=new StringPoker("J","����");
				poker[12]=new StringPoker("Q","����");
				poker[13]=new StringPoker("K","����");
				poker[14]=new StringPoker("A","����");
				pokerList.add(poker[11]);
				pokerList.add(poker[12]);
				pokerList.add(poker[13]);
				pokerList.add(poker[14]);
				
				//��������
				
					for(int i=2;i<11;i++){
					  poker[15] = new IntPoker(i,"����");	
					  
						  pokerList.add(poker[15]);
					}
				
					poker[16]=new StringPoker("J","����");
					poker[17]=new StringPoker("Q","����");
					poker[18]=new StringPoker("K","����");
					poker[19]=new StringPoker("A","����");
					pokerList.add(poker[16]);
					pokerList.add(poker[17]);
					pokerList.add(poker[18]);
					pokerList.add(poker[19]);
					
				
				System.out.println("---------�����˿��Ƴɹ�----------");
	
				System.out.print("Ϊ"+"[");
				for(Poker poker:pokerList){
					if(poker instanceof IntPoker)
						System.out.print(poker.type+poker.number2+",");
					else 
						System.out.print(poker.type+poker.number+",");
				
					}
				System.out.println("]");
	}
	//ϴ��
	public void messPoker(){
		
		System.out.println("-----��ʼϴ��-----");
		
		
		do{
		int i = random.nextInt(52);
		Poker poker = pokerList.get(i);
		
		if(pokerListAfter.contains(poker)){
			continue;
		}else{
			pokerListAfter.add(poker);
		}
		
	}while(pokerListAfter.size()<52);
		
		System.out.println("-----ϴ�ƽ���-----");
	}
	
	//����ϴ���Ƿ�ɹ�
//	public void test(){
//		for(Poker poker:pokerListAfter){
//			System.out.print(poker.type+poker.number+",");
//		
//			}
//	}

	//�������
	public void enterPlayer(){
		
		do{
		try{
			System.out.println("-----�������-----");
			System.out.println("�������1λ��ҵ�ID��������");
			System.out.println("����ID��");
			int id = input.nextInt();
			System.out.println("��������");
			name1 = input.next();
			break;
		}catch(InputMismatchException e){
			System.out.println("��������");
			input = new Scanner(System.in);
			continue;
		}
		}while(true);
		
		do{
			try{
				
				System.out.println("�������2λ��ҵ�ID��������");
				System.out.println("����ID��");
				int id2 = input.nextInt();
				System.out.println("��������");
				name2 = input.next();
				break;
			}catch(InputMismatchException e){
				System.out.println("��������");
				input = new Scanner(System.in);
				continue;
				
			}
			}while(true);
		
		System.out.println("��ӭ��ң�"+name1);
		System.out.println("��ӭ��ң�"+name2);
	}
	
	//����ҷ���
	
	public void givePoker(){
		
		//����һ����ҷ���һ����
		int i = random.nextInt(52);
		Poker poker11 = pokerListAfter.get(i);
		pokerListPlayer1.add(poker11);
		System.out.println("��ң�"+name1+"����");
		//���ڶ�����ҷ���һ����
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
		System.out.println("��ң�"+name2+"����");
		
		//����һ����ҷ��ڶ�����
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
		System.out.println("��ң�"+name1+"����");
	//���ڶ�����ҷ��ڶ�����
		
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
		
		System.out.println("��ң�"+name2+"����");
		System.out.println("------���ƽ���------");
	}
	
	//���ƽ��
	public void testGivePoker(){
		System.out.print(name1+"����Ϊ:");
		System.out.print("[");
		for(Poker poker:pokerListPlayer1){
			if(poker instanceof StringPoker)
			System.out.print(poker.type+poker.number+"");
			else
				System.out.print(poker.type+poker.number2+"");
		}
		System.out.println("]");
		
		System.out.print(name2+"����Ϊ:");
		System.out.print("[");
		for(Poker poker:pokerListPlayer2){
			if(poker instanceof StringPoker)
			System.out.print(poker.type+poker.number+"");
			else 
				System.out.print(poker.type+poker.number2+"");
		}
		System.out.println("]");
	}
	
	//�Ƚϴ�С
	public void compare(List<Poker> list){
		Poker poker1 =list.get(0);
		Poker poker2 = list.get(1);
		
		//������ִ�Сһ����Ƚϻ�ɫ
		if(poker1.compareTo(poker2)==0){
			Collections.sort(list, new TypeComparator());
		}else{
			//�Ƚ������ֵĴ�С
			Collections.sort(list);
		}
	}
	//�ֱ�Ƚ����1�����2�����ƵĴ�С��Ȼ���ٱȽ���������ƵĴ�С
	public void totalCompare(){
		compare(pokerListPlayer1);
		Poker p1 =pokerListPlayer1.get(1);
		if(p1 instanceof StringPoker)
		System.out.println("��ң�"+name1+"��������Ϊ��"+p1.type+p1.number);
		else
			System.out.println("��ң�"+name1+"��������Ϊ��"+p1.type+p1.number2);
		compare(pokerListPlayer2);
		Poker p2 =pokerListPlayer2.get(1);
		if(p2 instanceof StringPoker)
		System.out.println("��ң�"+name2+"��������Ϊ��"+p2.type+p2.number);
		else
			System.out.println("��ң�"+name2+"��������Ϊ��"+p2.type+p2.number2);
		pokerListPlayers.add(p1);
		pokerListPlayers.add(p2);
		compare(pokerListPlayers);
		if(pokerListPlayers.get(1)==p1){
			System.out.println("-----��ң�"+name1+"��ʤ-----");
		}else{
			System.out.println("-----��ң�"+name2+"��ʤ-----");
		}
		
		
	}
	
	
}
