package Estacionamento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Saida extends Modelo  {
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
		
		InputStream tec=System.in;
		
		//instanciando a variavel da entrada
		private Entrada e=new Entrada();
		
		public void detalhesaida() throws IOException {
			
			while(tec!=null) {

				System.out.println("Obrigado por usar nosso estacionamento!");
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
					
					if(cpf1 ==cpfInicial) {
						System.out.println("cpf ok");
					}else if(cpf1 != cpfInicial){
						System.out.println("invalido");
					}
				}
					
				break;
			}
		}
	




		Entrada enter=new Entrada();
		@Override
		public void cobrancas() {
			
				
			
		}
		
		
	

}

