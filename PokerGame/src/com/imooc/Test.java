package com.imooc;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PokerList pl = new PokerList();
		pl.producePoker();
		pl.messPoker();
		
		pl.enterPlayer();
		pl.givePoker();
		System.out.println("------��ʼ��Ϸ------");
		pl.totalCompare();
		System.out.println("��Ҹ�������Ϊ��");
		pl.testGivePoker();
		}

}
