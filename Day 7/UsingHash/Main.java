package UsingHash;
import java.util.HashSet;
import java.util.Random;

//Day 6 challenge is about custom annotation so i don't have attacted that folder

//Its day 7 assignment
class service{
    Random random = new Random();
    HashSet <String> urls = new HashSet<>();
    public String generateURL(String url) {
        String chars=url;
        String sURL="";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<8;i++){
            sb.append(chars.charAt(random.nextInt(chars.length()-1)));
        }
        sURL = sb.toString();
        
        return sURL;
    }

    public String removeSpecialCharacters(String url) {
        url= url.replaceAll("[^a-zA-Z0-9]", "");  
        //System.out.println(url);
        urls.add(url);
        return url;
    }

    public void fillURLS(String url) {
        for(int i=0;i<10000;i++){
            urls.add(generateURL(url));
        }
    }
}
public class Main{

    
    public static void main(String args[]) {
        String url = "https://www.youtube.com/live/2Gik4bFYJbM?feature=share";
        String sURL = "";
        
        service service = new service();
        
        url = service.removeSpecialCharacters(url);

        service.fillURLS(url);

        
        do{
            //System.out.println("generated");
            sURL = "short.ly"+service.generateURL(url);
            
        }while(service.urls.contains(sURL));
        
        System.out.println("short.ly/"+service.generateURL(url));
    }
}
