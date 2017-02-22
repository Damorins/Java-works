/*
Esp
Hacer un programa que lea un numero y diga si el numero es capicúa.
Eng
Make a program that reads a number and says if the is a reversible number .
*/
package array2;
import java.util.Scanner;
public class Array2 {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
Scanner st= new Scanner(System.in);
int num=0;
int i;
int cont=0;
String aux1="";
System.out.println("Introduzca el numero de casos a evaluar");
num= sc.nextInt();
String casos[] =new String[num];
for (i=0; i<num;i++){
cont++;
System.out.println("Introduzca el caso "+cont);
casos[i]= st.next();
aux1=casos[i];
String aux2="";
for (int x=casos[i].length()-1;x>=0;x--){
        aux2=aux2+casos[i].charAt(x);
       }
if (aux1.equals(aux2)){
System.out.println("El numero "+casos[i]+" si es capicua");
}
else{
System.out.println("El numero "+casos[i]+" no es capicua");
}
    }
}
}
