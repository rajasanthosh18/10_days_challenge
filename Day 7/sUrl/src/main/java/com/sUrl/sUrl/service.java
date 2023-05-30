package com.sUrl.sUrl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class service {
    
    
    
    Random random=new Random();
    HashSet<String> urls = new HashSet<>();
    

    public String generateURL(String url) {
        String chars=removeSpecialCharacter(url);
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<8;i++){
            sb.append(chars.charAt(random.nextInt(chars.length()-1)));
        }
        addURL("short.ly/"+sb.toString());
        return  "short.ly/"+sb.toString();
        
    }

    public String removeSpecialCharacter(String url){
        return url.replaceAll("[^a-zA-Z0-9]", "");
        
        
    }

    
    public void fillURLS(String url) {
        
        for(int i=0;i<100;i++){
            addURL(generateURL(url));
        }
    }

    
    private  void addURL(String generateURL) {
        urls.add(generateURL);
    }

    public String showURL() {
        for(String h:urls){
            System.out.println(h);
        }
        return null;
    }
}
