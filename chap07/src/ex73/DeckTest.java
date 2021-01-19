package ex73;

import java.util.Arrays;

public class DeckTest {
	public static void main(String[] args) {
		Deck d = new Deck();
		Card c = d.pick();
		System.out.println(Arrays.toString(d.cardArr));
		System.out.println(c);
		
		d.shuffle();
		System.out.println(Arrays.toString(d.cardArr));
		c = d.pick(0);
		System.out.println(c);
	}
}
class Deck {
	final int CARD_NUM = 52;
	Card cardArr[] = new Card[CARD_NUM];
	
	Deck() {
		int i = 0;
		
		for (int k=Card.KIND_MAX; k > 0; k--) { //4
			for(int n=0; n < Card.NUM_MAX; n++) { //13
				cardArr[i++] = new Card(k, n+1); //13*4
			}
		}
	}
	Card pick(int index) { //카드를 하나 선택
		return cardArr[index];
	} 
	Card pick() { // Deck에서 카드 하나를 선택
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	void shuffle() { // 카드의 순서를 섞는다
		for(int i = 0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
	
}

class Card {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int  SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1 ;
	int kind;
	int number;
	Card() {
		this(SPADE, 1);
	}
			
	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String number = "0123456789XJQK";
		return "kind : " + kinds[this.kind] + ", number :" + number.charAt(this.number);
	}
}
