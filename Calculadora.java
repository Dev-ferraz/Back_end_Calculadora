package Calculadora;

public class Calculadora {
	
	
	public int add(int a , int b ) {
		int r = a +  b;
		return r;
		
		}
	
	public int sub(int a , int b ) {
		
		int s = a -  b;
		return s;
	}
	
	public int mult(int a , int b ) {
		
		int m = a * b ;
		return m;
	}
	
    public int dividir(int a , int b ) {
		
		int d = a / b ;
		return d;
     }

    public int raiz(int numero ) {
	    int raiz=0, impar =1;
	    while(numero >= impar ) {
		numero -= impar;
		impar +=2;
		++raiz;
	}
	   return raiz;
	
      }
}
