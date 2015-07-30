package com.miempresa.midepartamento.ejemploimportarjar;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.ipartek.formacion.holaclase.util.Utilidades;


public class UsarJar {

	public static void main(String[] args) throws IOException {
		System.out.println("txuta");
		
		System.out.println(Utilidades.round(4.999999f, 2));
		System.out.println(Utilidades.cantar("Pepe"));
		
		Document docc = Jsoup.connect("https://www.google.com").get();
		
	}

}
