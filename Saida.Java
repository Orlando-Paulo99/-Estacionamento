package Estacionamento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Saida extends Modelo  {
	//com essa classe podemos além das datas as horas,minutos e segundos
		Calendar agora = Calendar.getInstance();
		//instanciando a variavel da entrada
		private Entrada e=new Entrada();
		InputStream tec=System.in;
		
		//Conversão de data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		double cont=0;
		protected long cpf;
		protected double valorInicial=2.50;
		protected double acrescimo=5.00;
		protected int horaInicial = agora.get(Calendar.HOUR) + ((Calendar.PM==1)?12:0);
	    protected int minutInicial = agora.get(Calendar.MINUTE);
	    protected int segundoInicial = agora.get(Calendar.SECOND);
		@SuppressWarnings("static-access")
		protected long entrada=(agora.HOUR)+( agora.MINUTE);
		protected long minuto=Calendar.MINUTE;
		@SuppressWarnings("static-access")
		@Override
		public void cobrancas() throws InterruptedException, IOException {
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
				
				System.out.println("\nObrigado por usar nosso estacionamento!");
				System.out.println("Deseja sair?(s/n)");
				InputStreamReader recebe=new InputStreamReader(tec);
				BufferedReader ler=new BufferedReader(recebe);
				
				String pergunta=ler.readLine();
				if(pergunta.equals("s")){
					
						System.out.println("Digite seu cpf ");
						InputStreamReader cpf=new InputStreamReader(tec);
						BufferedReader lercpf=new BufferedReader(cpf);
					
						String cpf1=lercpf.readLine();
						//criando uma variavel e dando o valor da que eu instaciei  
						String cpfInicial=e.dados;
						
						if(cpf1==cpfInicial) {
							System.out.println("saldo devedor:"+(cont+ valorInicial));
						}else {
							cont+=acrescimo;
						}		
				}
			}
			
		
		}
}
