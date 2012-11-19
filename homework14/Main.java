package org.elsys.links;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException {
		Scanner scanner = new Scanner( System.in );
		String url = new String();
		System.out.print( "Vuvedete adresa: " );
        url = scanner.nextLine();
        
		Page page = new Page();
		
		page.setUrl(url);
		//page.getContent();
		page.getLinks();
		System.out.print( "Izberete link ot spisaka, kogoto da posledvate: " );
		url = scanner.nextLine();
		Page page1 = new Page();
		page1.setUrl(url);
		scanner.close();
	}

}
