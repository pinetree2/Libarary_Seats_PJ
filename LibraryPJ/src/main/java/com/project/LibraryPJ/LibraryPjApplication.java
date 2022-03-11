package com.project.LibraryPJ;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class LibraryPjApplication {

	public static void getSeats(){
		//jsoup 객체 선언과 url 삽입
		//final : 수정할 수 없는 변수
		final String libUrl = "http://203.229.203.240/8080/Domian5_jythh.asp";

		try{
			Connection con = Jsoup.connect(libUrl); //연결
			Document doc = con.get(); //가져온다~
			String SeatsNum = getSeatsNum(doc);
			String SeatsName = getSeatsName(doc);
			getSeatsNum(doc);
		}catch (IOException e){
			e.printStackTrace();
		}


	}

	private static String getSeatsName(org.jsoup.nodes.Document doc) {
		return null;
	}

	public static String getSeatsNum(org.jsoup.nodes.Document doc){

		Elements elements1 = doc.select("tr.td");
		for(Element tbody : elements1){
			System.out.println(tbody);
		}
		return null;
	}



	public static void main(String[] args) {
		SpringApplication.run(LibraryPjApplication.class, args);
	}

}
