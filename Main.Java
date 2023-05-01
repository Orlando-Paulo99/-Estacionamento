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
		InputStream tec=System.in;
		
		in.detalhes();
		//System.out.println(d);
		
		
		in.entrando();
		
		saindo.detalhesaida();
		saindo.cobrancas();

		
			
		/*System.out.println( "ok" );    
        Thread.sleep(10 * 1000 ); // aguarda 5segundos
        System.out.println( "ok" );
        Thread.sleep(10 * 1000 ); // aguarda 10segundos
        System.out.println( "ok" );  */
		
	
		
		
	}

}

