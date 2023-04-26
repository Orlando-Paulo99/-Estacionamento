package Estacionamento;

import java.util.Calendar;
import java.util.Date;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream teclado=System.in;
		Diaria d=new Diaria();
		Inicio in=new Inicio();
		
			

		//o que vai receber do sistema


		while(teclado!=null) {
			System.out.println("Olá,Seja muito bem-vindo!");
			System.out.println("digite seu cpf");
			//classe que recebe o que o usuario digitou
			InputStreamReader recebe= new InputStreamReader(teclado);
			
			//classe em ler o que todos acima
			BufferedReader ler =new BufferedReader(recebe);	
			
			String dados=ler.readLine();
			System.out.println("CPF do usuario:"+dados);
			int second=(1000*5);
			
			in.detalhes();
			System.out.println(d);
			d.cobrar();
			break;

			
		}
		
	
		
		
	}

}
