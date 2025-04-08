package org.example;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class WebHelper {
    private String webSiteContent="";
    static WebHelper instance;
    private WebHelper()
    {

    }
    private void load() throws IOException {
        URL url = new URL("http://www.ace.ucv.ro/media/");
        URLConnection con = url.openConnection();
        InputStream in = con.getInputStream();
        String encoding = con.getContentEncoding();
        encoding = encoding == null ? "UTF-8" : encoding;
        webSiteContent = IOUtils.toString(in, encoding);

    }
    public static WebHelper getInstance()
    {
        if(instance==null)
        {
            instance=new WebHelper();
        }
        return instance;
    }
    public String getWebSiteContent() throws IOException {
        if(webSiteContent.isEmpty())
        {
            load();
        }
        return webSiteContent;
    }

}
