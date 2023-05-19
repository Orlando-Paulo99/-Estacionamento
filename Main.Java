package principal;

import java.io.IOException;

import Estacionamento.Entrada;
import Estacionamento.Person;
import Estacionamento.Tipo;

public class main {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Entrada e=new Entrada();
		
		
		Person p=new Person("Orlando","(81)92624419","122-333-366-59", "sim");
		
		Person p1=new Person("------","()xxxxxxxxx","xxx-xxx-xxx-xx", "sim");
		System.out.print(p1.getname());
		System.out.print(p1.gettell());
		System.out.print(p1.getcpf());
		

		
		
		e.cobrancas();
		
		
		
	}

}


