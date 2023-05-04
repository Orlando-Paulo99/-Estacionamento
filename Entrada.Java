package Estacionamento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Entrada extends Modelo{

	//com essa classe podemos além das datas as horas,minutos e segundos
	Calendar agora = Calendar.getInstance();
	
	//Conversão de data
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	protected double valorInicial=2.50;
	protected double acrescimo=5.00;
	protected int horaInicial = agora.get(Calendar.HOUR) + ((Calendar.PM==1)?12:0);
    protected int minutInicial = agora.get(Calendar.MINUTE);
    protected int segundoInicial = agora.get(Calendar.SECOND);
	protected long entrada=(agora.HOUR)+( agora.MINUTE);
	protected long minuto=agora.MINUTE;
	
	double cont=0;
	
	public static String dados;
	
	
	
	InputStream  tec=System.in;
	
	String inicio="Data:"+sdf.format(data)+" Horário: "+ agora.get(Calendar.HOUR)+":"+agora.get(Calendar.MINUTE)+":"+agora.get(Calendar.SECOND);
	
	String hours=agora.get(Calendar.HOUR)+":"+agora.get(Calendar.MINUTE)+":"+agora.get(Calendar.SECOND);
	
	
	
	@Override
	public void detalhes() {
		//Data formatada
		System.out.println("\nData: "+inicio);
		System.out.println("Olá,Seja muito bem-vindo!");
		System.out.println("Segue abaixo os detalhes do nosso estacionamento:");
		System.out.println("Valor até 40 minutos: "+valorInicial);
		System.out.println("Após 40 minutos inicial a cada 20 minutos irá ser cobrado um taxa de : "+acrescimo +"\n");
		
	}
	
	@SuppressWarnings({ "unused", "static-access" })
	public void entrando() throws IOException, InterruptedException {

	
			System.out.println("digite seu cpf");
			//classe que recebe o que o usuario digitou
			InputStreamReader recebe= new InputStreamReader(tec);
			
			//classe em ler o que todos acima
			BufferedReader ler =new BufferedReader(recebe);	
			
			dados=ler.readLine();
			
			@SuppressWarnings("unused")
			String horaDaEntrada=inicio ;
			System.out.println("CPF: "+dados+" "+horaDaEntrada);
			while(true) {
				Timer cronometro = new Timer();
				TimerTask tarefa = new TimerTask() {
				    @Override
				    public void run() {
				        
				    }
				};
				int milissegundos = 1000;
				cronometro.schedule(tarefa, milissegundos);
				Thread.sleep(5* 1000 ); // aguarda 5segundos
				cont+=acrescimo;
				System.out.println("saldo devedor:"+(cont+ valorInicial));
			}
			
		}
		

}
