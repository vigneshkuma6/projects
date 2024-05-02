package numbericprogram;

public class MultipleOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=123;
 int temp=n;
 StringBuilder sb=new StringBuilder();
 while (temp != 0) {
     sb.append(temp % 10);
     temp /= 10;
     if (temp != 0) {
         sb.append("*");
     }
 }
 System.out.println(sb);
 
 }

}
