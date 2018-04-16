package com.naukri.reflection;

 class Abc {

    static int i;
    static public void show()
    {
    	i=5;
    	System.out.println("Value:"+i);
    }
}

public class Reflection_API
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Abc a=new Abc();
		
		//a.show();
		Abc.show();
		
	}

}
