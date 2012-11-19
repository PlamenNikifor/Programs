package org.elsys.links;

//import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
//import java.util.*;

public class Page {
	List<String> links=new ArrayList<String>();
	private String url = new String();
	
	public void setUrl(String urla){
        url = urla;
	}
	
	public String getUrl(){
		
		return url;
	}
	
	
	
	public String getContent() throws URISyntaxException, IOException{
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		URL url = new URI(this.getUrl()).toURL();
		InputStream openStream = url.openStream();
		byte[] buffer = new byte[1024];
		int size = 0;
		while((size = openStream.read(buffer)) != -1){
			output.write(buffer, 0, size);
		
		}
	//	System.out.println(output.toString());
		return output.toString();
	}
	public void getLinks() throws URISyntaxException, IOException{
		String content = new String();
		String link = "<a href";
		content = getContent();
		String str[] = content.split("=");
		for (int i = 0; i < str.length; i++) {
            if(str[i] == link){
            	links.add(str[i++]);
            }
		}
		Iterator it=links.iterator();

        while(it.hasNext())
        {
          String value=(String)it.next();

          System.out.println("Link: "+value);
        }
	}
}
