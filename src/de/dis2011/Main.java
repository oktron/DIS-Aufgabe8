package de.dis2011;

import de.dis2011.mining.Apriori;

/**
 * @author marius
 *
 */
public class Main
{
	public static void main(String[] args) {
		try {
			Apriori apriori = new Apriori("transactionsLarge.txt");
			
			apriori.go();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
