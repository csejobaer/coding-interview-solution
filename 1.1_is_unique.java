//Implement an algorithm to determin if a string has all unique charecter. What if you cannot use additional data structure.
import java.util.Scanner;
class UniqueChecker{
    int fag = 0;
    public UniqueChecker(){
        Scanner  input = new Scanner(System.in);
        String arr = input.nextLine();
        for(int i = 0; i < arr.length(); i++){
            for(int j = i+1; j < arr.length(); j++){
                if(arr.charAt(i) == arr.charAt(j) ){
                    fag = 1;
                    break;
                }
            }
        }
        if(fag == 1){
            System.out.println("No unique Sting here");
        }else{
            System.out.println("Yes Unique string here");
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    UniqueChecker obj = new UniqueChecker();
	}
}
