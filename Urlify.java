import java.util.Scanner;
class Urlify{
    public void UrlifyModifier(String url){
        String newUrl = url.replace(" ", "%20");
        System.out.println(newUrl);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String url = input.nextLine();
        Urlify urlGenerate = new Urlify();
        urlGenerate.UrlifyModifier(url);
    }
}
