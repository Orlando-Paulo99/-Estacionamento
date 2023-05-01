package Estacionamento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Entrada extends Modelo{

	//com essa classe podemos além das datas as horas,minutos e segundos
	Calendar agora = Calendar.getInstance();
	
	//Conversão de data
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	protected long cpf;
	protected double valorInicial=2.50;
	protected double acrescimo=5.00;
	protected int horaInicial = agora.get(Calendar.HOUR) + ((Calendar.PM==1)?12:0);
    protected int minutInicial = agora.get(Calendar.MINUTE);
    protected int segundoInicial = agora.get(Calendar.SECOND);
	protected long entrada=(agora.HOUR)+( agora.MINUTE);
	protected long minuto=agora.MINUTE;
	
	public static String dados;
	
	public static long cInicial=System.currentTimeMillis();
	
	InputStream  tec=System.in;
	
	@Override
	public void detalhes() {
		//Data formatada
		System.out.println("\nData: "+sdf.format(data)+" Horário: "+ agora.get(Calendar.HOUR)+":"+agora.get(Calendar.MINUTE)+":"+agora.get(Calendar.SECOND));
		System.out.println("Olá,Seja muito bem-vindo!");
		System.out.println("Segue abaixo os detalhes do nosso estacionamento:");
		System.out.println("Valor até 40 minutos: "+valorInicial);
		System.out.println("Após 40 minutos inicial a cada 20 minutos irá ser cobrado um taxa de : "+acrescimo);
		
	}
	
	@SuppressWarnings({ "unused", "static-access" })
	public void entrando() throws IOException {

		while(tec!=null) {
			System.out.println("digite seu cpf");
			//classe que recebe o que o usuario digitou
			InputStreamReader recebe= new InputStreamReader(tec);
			
			//classe em ler o que todos acima
			BufferedReader ler =new BufferedReader(recebe);	
			
			this.dados=ler.readLine();
			System.out.println("CPF do usuario "+dados);
			@SuppressWarnings("unused")
			String horaDaEntrada= agora.get(Calendar.HOUR)+":"+agora.get(Calendar.MINUTE)+":"+agora.get(Calendar.SECOND);
			System.out.println("Hora da Entrada  "+horaDaEntrada);
			System.out.println(cInicial);
		
			
			
			break;
			
		}
		
	}
	
	
	
	

}
