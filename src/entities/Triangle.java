package entities;

public class Triangle {
	
	//Declarando os atributos da classe Triangle
	
	public double a;
	public double b;
	public double c;
	
	//Criando um método para a classe Triangle
	
	public double area() {
		double p = (a+b+c) / 2.0;
		double result = Math.sqrt(p * (p-a) * (p-b) * (p-c));
		return result;
		
	}
	

}
