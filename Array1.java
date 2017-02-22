/*Hacer un programa que almacene en un vector de 5 elementos las ventas anuales de cada una 
de las 5 tiendas de una cadena de supermercados (asignárselos al vector al declararlo). A continuación 
calcular cuál fue la tienda que menos vendió, cuál fue la que más vendió y el importe total de ventas 
de las 5 tiendas. */
package array1;
import java.util.Scanner;
public class Array1 {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
Scanner st= new Scanner(System.in);
int ganancias[] =new int[6];
String tiendas[] =new String[6];
int i, x;
int gmax, gmin;
String tmax, tmin;
for (i=1; i<6; i++){
System.out.println("Introduzca el nombre de la tienda "+i);
tiendas[i]= sc.nextLine();
System.out.println("Introduzca las ganancias de la tienda "+i);
ganancias[i]= st.nextInt();
}
gmin=ganancias[1];
gmax=ganancias[1];
tmin=tiendas[1];
tmax=tiendas[1];
for (x=1; x<6; x++){
    if (ganancias[x]>gmin){
    gmax=ganancias[x];
    tmax=tiendas[x];
}
else {
gmin=ganancias[x];
tmin=tiendas[x];
}
}
for (int t=1; t<6; t++){
System.out.println("La tienda "+tiendas[t]+" ha ganado "+ganancias[t]+" €");
}
System.out.println("La tienda "+tmax+" es la que mas ha ganado con "+gmax+" €");
System.out.println("La tienda "+tmin+" es la que menos ha ganado con "+gmin+" €");
}   
}
