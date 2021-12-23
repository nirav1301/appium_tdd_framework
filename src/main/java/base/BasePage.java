package base;

import org.json.JSONObject;

import javax.swing.text.AbstractDocument;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BasePage {
    protected static Properties props;
     static InputStream inputStream;

     public static void main(String[] args){
    props = new Properties();
    String propFileName = "config.properties";
    inputStream = BasePage.class.getClassLoader().getResourceAsStream(propFileName);
         try {
             props.load(inputStream);
             System.out.println(props.getProperty("appiumURL"));

         } catch (IOException e) {
             e.printStackTrace();
         }

    }
}
