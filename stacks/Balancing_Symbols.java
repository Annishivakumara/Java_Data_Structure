
import java.util.*;
public  class BalancingSymbol {
	static int  top;
	int size;
	char [] ch;
	public BalancingSymbol(int size) {
		this.size=size;
		ch= new char[size];
		top=-1;
	}
	public void push(char symb) {
		ch[++top]=symb;
	}
	public char pop() {
		return ch[top--];
	}
	public char TopSymbol() {
		return ch[top];
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		char symb;
	     System.out.println("Enter the Symbol Expression");
          String symbol=sc.nextLine();
          int length=symbol.length();
          BalancingSymbol bs= new  BalancingSymbol(length);
          for(int i=0;i<symbol.length();i++){
               symb=symbol.charAt(i);
               
               if(symb=='{'|| symb=='['|| symb=='('){
                    bs.push(symb);
               }
               
               else if(
                    (symb=='}' &&  bs.TopSymbol()=='{')||
                    (symb==']' && bs.TopSymbol()=='[' )||
                    (symb==')' && bs.TopSymbol()=='(')){
                    bs.pop();
               }
               
               else if(symb=='}' || symb==')' || symb==']'){
                    System.out.println("Symbol's Are not Balanced");
                    return;
               }
               }
               
                    if (bs.isEmpty()) {
                    System.out.println("Symbols are Balanced");
                          } else {
                    System.out.println("Symbols are Not Balanced");
                 }   

          }}
