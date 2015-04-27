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
		System.out.println("------开始游戏------");
		pl.totalCompare();
		System.out.println("玩家各自手牌为：");
		pl.testGivePoker();
		}

}
