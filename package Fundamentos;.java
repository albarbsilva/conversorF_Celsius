package Fundamentos;

public class temperatura {
	
	public static void main(String[] args) {
		
		//(°F /armazenar f em um var/ - 32/armazenar o 32 em uma constante/) 
		//x 5/9(/armazenar o 5/9 em uma constante/) = °C /armazenar c em uma var/
		
		final double FATOR = 5.0 / 9.0;
		final int AJUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é" + celsius + "°C");
		
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado é" + celsius + "°C");
	}
}