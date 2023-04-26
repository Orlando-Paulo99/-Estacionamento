package Estacionamento;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.text.SimpleDateFormat;


public class Diaria {
	Date data=new Date();
	
	//com essa classe podemos além das datas as horas,minutos e segundos
	Calendar agora = Calendar.getInstance();
	
	//Conversão de data
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	protected long cpf;
	protected double valorInicial=2.50;
	protected double acrescimo=5.00;
	protected int horaInicial = agora.get(Calendar.HOUR) + ((Calendar.PM==1)?12:0);
    protected int minutInicial = agora.get(Calendar.MINUTE);
    protected int horarioAtual=agora.get(Calendar.HOUR) + ((Calendar.PM==1)?12:0)+agora.get(Calendar.MINUTE);
    protected int segundoInicial = agora.get(Calendar.SECOND);
	protected long entrada=agora.HOUR;
	protected long minuto=agora.MINUTE;
	long second=(1000*5);
	int contador=0;
	
	public void cobrar() {
		
		System.out.println("olá");
		
	}
	
	
	
	}
