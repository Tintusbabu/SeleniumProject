package com.Ibs.JavaLearning;

import java.util.Scanner;
import java.util.HashMap;
public class SampleCode {

	public void evenOrOdd()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 =sc.nextInt();
		if(num1%2==0)
		{
			System.out.println("Entered number is an Even");
		}
		else
		{
			System.out.println("Entered number is an Odd");
		}
	}

	public void swapNumber()
	{
		int num1=3,num2=2;
		System.out.println("Before swap:"+num1 +":"+num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 =num1-num2;
		System.out.println("After swap:"+num1 +":"+num2);
	}

	public void prrimeCheck()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1 =sc.nextInt();
		int i ;
		if(num1>2)

		{
			for (i=2;i<num1;i++)
			{
				if(num1%i==0)
				{
					System.out.println("Not a Prime number");
					break;
				}
			}
			if(num1==i)
			{
				System.out.println("Is a Prime number");

			}
		}

		else
		{
			System.out.println("Smallest prime number is 2");
		}
	}
	public void factorialNum()
	{
		int x = 4;
		int fact=1;
		for(int i=1;i<=x;i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial is "+fact);
	}

	public void reverseNum()
	{
		int num= 321;
		int rev=0,digit;

		while(num>0)
		{
			digit =num%10;
			rev =rev*10+digit;
			num= num/10;
		}
		System.out.println("Reverse of a number=="+rev);
	}
	public void fibSeries()
	{
		int fibnociNumber =6;
		int fib =1;
		int start=0;
		System.out.println("Fib");
		if(fib>0)
		{
			System.out.println(start);
			System.out.println(fib);
			for(int i=2;i<fibnociNumber;i++)
			{
				int next = fib+start;
				System.out.println(next);
				start=fib;
				fib=next;
			}
		}

	}

	public void palindrome()
	{
		int num = 123;
		int temp=num;
		int r=0,rev=0;
		while(num>0)
		{
			r=num%10;
			rev = rev*10+r;
			num=num/10;
		}
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("palimdrome");
		}
		else
		{
			System.out.println("Not a palimdrome");
		}
	}


	public void amstrongNumber()
	{
		int x = 134,numDigit=0;
		int sum=0;
		String str= Integer.toString(x);
		int len=str.length();
		System.out.println("Str "+len);
		int temp= x;
		System.out.println(temp);
		while(x!=0)
		{
			temp = temp%10;
			x=x/10;
			temp=x;
			numDigit=numDigit+1;
		}
		System.out.println("num digit "+numDigit);
		while(temp!=0)
		{
			temp = temp%10;
			sum=(int) (sum+(Math.pow(numDigit, temp)));
			temp=x/10;
		}
		if(x==sum)
			System.out.println("Amstrong Num "+sum);
		else
			System.out.println("Not an Amstrong Num ");
	}



	public void numberOfStringOccurance() {
		String str = "Anoop Tintu Kichu ammu tintu anoop";
		String[] str1 = str.toLowerCase().split(" ");
		System.out.println(str1.length);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		String foundString = "";
		int count = 0;
		for (int i = 0; i < str1.length; i++) {
			foundString = str1[i];
			count = 1; // Reset count for each new word
			for (int j = i + 1; j < str1.length; j++) {
				String foundString1 = str1[j];
				if (foundString.equals(foundString1)) {
					count++;

				}
			}
			System.out.println(foundString + ": " + count);
			if(!map.containsKey(foundString))

				map.put(foundString, count);

		}
		System.out.println(map);
	}

	public void numberOfWordsInString()
	{
		String str = "Anoop Tintu Kichu ammu tintu anoop";
		String[] slitString = str.split(" ");
		System.out.println("Number Of words :"+slitString.length);
	}
	public void numberOfOccuranceOfChar()
	{
		Scanner sc = new Scanner(System.in);
		String str ="AHGHGHGJHJSDSAAA";
		String strFound ="A";
		int count = str.length() - (str.replace(strFound,"").length());
		System.out.println(count);
	}
	public void reverseString()
	{
		String str ="appu";
		String rev="";
		for(int j=str.length()-1;j>=0;j--)
		{
			rev=rev+(str.charAt(j));
		}
		System.out.println("Reverse of a string :"+rev);
	}
	public static void main(String[] args) {
		SampleCode obj = new SampleCode();
		//obj.evenOrOdd();
		//obj.swapNumber();
		//obj.prrimeCheck();
		//obj.factorialNum();
		//obj.reverseNum();
		//obj.fibSeries();
		//obj.palindrome();
		//obj.amstrongNumber();
		//obj.numberOfStringOccurance();
		//obj.numberOfWordsInString();
		//obj.numberOfOccuranceOfChar();
		obj.reverseString();
	}


}
