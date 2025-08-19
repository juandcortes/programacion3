public class main 
{
public static void main(String []args)
{
//creacion de objetos
Estudiante objEst1= new Estudiante(1,1140164146,"Juan","Ingenieria");
Estudiante objEst2= new Estudiante(2,1140164146,"Juan","Ingenieria");
Estudiante objEst3= new Estudiante(3,1140164146,"Juan","Ingenieria");
 System.out.println(objEst1);
//creacion del arreglo de objetos(estudiantes)
Estudiante[]e=new Estudiante[4];

e[0]= objEst1;
e[1]= objEst2;
e[2]= objEst3;
e[3]= new Estudiante;
}
}