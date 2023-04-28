package Estacionamento;

import java.util.Calendar;
import java.util.Date;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Diaria d=new Diaria();
		Entrada in=new Entrada();
		Saida saindo=new Saida();
		
		in.detalhes();
		System.out.println(d);
		//System.out.println(d.cobrar());
		
		in.entrando();
		
		saindo.cobrancas();

			
		
		
	
		
		
	}

}
