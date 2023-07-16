//Q.2} Check whether an alphabet is vowel or consonant using if...else statement ?
package Ifelse;

public class Vowel {

	public static void main(String[] args) {
		char ch = 'z' ;
				if (ch =='a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u'||
					ch =='A' || ch == 'E' || ch == 'I' || ch =='O' || ch =='U') 
				{
					System.out.println("It is vowel: "+ch);
					
				} 
				
				else
				{
					System.out.println("It is consonant :"+ch);

				}
	

	}

}
