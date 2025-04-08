package org.example;




import java.io.IOException;


public class App
{
    public static void main( String[] args ) throws IOException {

        String content=WebHelper.getInstance().getWebSiteContent();
        int index=content.indexOf("<div class=\"media_element\">");
        int index2=content.indexOf("</div>",index);
        String firstMediaContent=content.substring(index,index2);
        System.out.println(firstMediaContent);

    }
}
