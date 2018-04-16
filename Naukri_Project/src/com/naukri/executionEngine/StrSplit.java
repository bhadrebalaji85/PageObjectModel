package com.naukri.executionEngine;

public class StrSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
	    String[] arrSplit = strMain.split(", ");
	    for (int i=0; i < arrSplit.length; i++)
	    {
	      System.out.println(arrSplit[i]);
	    }
	}

}
