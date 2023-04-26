package Estacionamento;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Inicio extends Modelo{

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
	
	@Override
	public void detalhes() {
		//Data formatada
		System.out.println("\nData: "+sdf.format(data)+" Horário: "+ agora.get(Calendar.HOUR)+" "+agora.get(Calendar.MINUTE));
		System.out.println("Perfeito| Segue abaixo os detalhes do nosso estacionamento:");
		System.out.println("Valor até 40 minutos: "+valorInicial);
		System.out.println("Após 40 minutos inicial a cada 20 minutos irá ser cobrado um taxa de : "+acrescimo);
		
		
	}
	
	
	

}
