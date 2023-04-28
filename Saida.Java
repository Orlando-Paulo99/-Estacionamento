package Estacionamento;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Saida extends Modelo {
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
		
		public void saindo() {
			InputStream tec=System.in;
			while(tec!=null) {
				System.out.println("Digite seu cpf ");
				InputStreamReader recebe=new InputStreamReader(tec);
				BufferedReader ler=new BufferedReader(recebe);
			}
		}
		@Override
		public void cobrancas() {
			int second=(1000*5);
			double calculando=getpegandoHora();
			System.out.println(calculando);
			
		}
		private double getpegandoHora() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	

}

