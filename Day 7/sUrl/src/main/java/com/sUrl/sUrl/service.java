package com.sUrl.sUrl;

import java.util.*;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class service {
    
    @Autowired
    static
    urlDB db ;
    Random random;

    /**
     * @param url
     * @return
     */
    public url generateURL(url url) {
        String chars=url.getUrl();
        String sURL="";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<8;i++){
            sb.append(chars.charAt(random.nextInt(chars.length()-1)));
        }
        sURL = "short.ly/"+sb.toString();
        
        url nURL =new url();
        nURL.setUrl(sURL);
        return nURL;
    }

    public static void addURL(url url){
        String sURL= url.getUrl().replaceAll("[^a-zA-Z0-9]", "");
        url.setUrl(sURL);
        db.save(url);
    }

    /**
     * @param url
     */
    public void fillURLS(String url) {
        url surl =new url();
        surl.setUrl(url);
        for(int i=0;i<100;i++){
            service.addURL(generateURL(surl));
        }
    }

    /**
     * @return
     */
    public List<url> getURL() {
        return db.getAllurl();
    }
}
