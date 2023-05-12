package Estacionamento;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.Duration;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Diaria d=new Diaria();
		Entrada in=new Entrada();
		Saida saindo=new Saida();
		InputStream tec=System.in;
		
		
		in.detalhes();
		//System.out.println(d);
		
		
		in.entrando();
		
		System.out.println("deseja sair?[1]-sair");
		InputStreamReader sair=new InputStreamReader(tec);
		BufferedReader pega= new BufferedReader(sair);
		
		String saida=pega.readLine();
		
		if(saida.equals("1")) {
			in.cobrancas();
		}
		
		
		
	
		
		
	}

}

