package temperatura7;
import java.util.Scanner;
public class tempprom {
	/*Hacer un programa que pida 7 temperaturas al usuario, que representan 
    las temperaturas de los 7 días de la semana y los guarde en un vector.
    Obtener el promedio de temperaturas. Por último mostrar 
    las temperaturas de cada día de la semana así como el promedio de temperaturas.*/
	private float[]temp;
	private Scanner sc;
	private float prom,sum;
	public void inicio() {
		sc= new Scanner(System.in);
		temp= new float[7];
		for(int i=0;i<7;i++) {
		System.out.println("Ingresa la temperatura");
		temp[i]=sc.nextFloat();
		}
	}
	public void promedio() {
		sum=0;
		prom=0;
		for(int i=0;i<7;i++) {
			sum=sum+temp[i];
		}
		prom=sum/7;
		System.out.println("El promedio de temperatura de la semana es de "+ prom);
	}
	public void mostar() {
		for(int i=0;i<7;i++) {
			System.out.println("El dia "+(i+1)+" tiene una temperatura de  "+temp[i]);}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tempprom tmp=new tempprom();
		tmp.inicio();
		tmp.promedio();
		tmp.mostar();	}}
