package pqJuegues;
import java.util.ArrayList;
import java.util.Scanner;
public class AdivinaDos 
{
	public static void main(String[]args)
	{
	    Scanner xt=new Scanner(System.in);
	    String nombre;
	    int resultado,seguir=0, puntos=0,vidas=3,opc, i, a=0, b=0, cantJ=0, cont=1;
	    int puntos1=0, puntos2=0, puntos3=0, puntos4=0, puntos5=0, puntos6=0, puntos7=0, puntos8=0, puntos9=0, puntos10=0;
	    int m1=0, m2=0, m3=0, m4=0, m5=0, m6=0, m7=0, m8=0, m9=0, m10=0;
	    String j;
	    
	    String jugadores[][]=new String[100][1];
	    
	    
	    
	    System.out.println("*-------------------------------------------------*");
	    System.out.println("         BIENVENIDO AL JUEGO ADIVINA DOS         *");
	    System.out.println("*------------------------------------------------*");
	    System.out.println("");
	    System.out.println("1:¿QUIERES INICIAR EL JUEGO?");
	    System.out.println("2:SALIR");
	    opc=xt.nextInt();
	     
	     if(opc ==1)
	     {//Controlador de encendido
	    		
	    	 do {//Inicio de do
	            int multiplicador=(int)(Math.random()*10+1);
	            int multiplicando=(int)(Math.random()*10+1);
	            resultado=multiplicando*multiplicador;
	         
	            
	            System.out.println("*--------------------------------------------------*");
	            System.out.println("       <DAME LOS 2 NUMEROS QUE DAN COMO RESULTADO>     *");
	          	System.out.println("         (NO.TABLAXNUMERO):___"+resultado+"___");
	            System.out.println("*--------------------------------------------------*");
	            System.out.println("Dame No-1:");
                int num1=xt.nextInt();
                System.out.println("Dame No-2:");
                int num2=xt.nextInt();
                
                if (num1*num2==resultado)
                {
    	            System.out.println("*--------------------------------------------------*");
                	System.out.println("*                OBTUVISTE 1 PUNTO                 |");
            		System.out.println("*    GANASTE, TE QUEDAN: "+(vidas)+" VIDAS       |");
    	            System.out.println("*--------------------------------------------------*");
                	puntos=puntos+1;
                }
                	else 
                	{
        	            System.out.println("*--------------------------------------------------*");
                		System.out.println("*    PERDISTE, TE QUEDAN: "+(vidas-1)+" VIDAS      |");
        	            System.out.println("*--------------------------------------------------*");
                		vidas=vidas-1;
                	}
	                if (vidas>0)
	                {
	       	        System.out.println("***************----------------------------------------*");
	        	    System.out.println("*              Deseas seguir jugando?                  |");
	       	        System.out.println("*       Ingresa <<1-seguir>> o <<2-terminar>>          |");
	       	        System.out.println("***************----------------------------------------*");
	       	        System.out.println("Escribe:");
	       	        seguir=xt.nextInt();
	       	        }
                
    				if(vidas==0 || seguir>1)
    				{
	                System.out.println("**********~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
    				System.out.println("*                 TERMINO TU TURNO                 |");
    			    System.out.println("                 Ingresa tu nickname               |");
    	        	jugadores[a][b]=xt.next();
    	        	a++;
    	            System.out.println("**********~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
    	            
    	            
    	            
    	            System.out.println("***************~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
		     	    System.out.println("*       Hay algun jugador que quiera jugar?            |");
		    	 	System.out.println("*              <<1=si>>      <<2=no>>                  |");
		    	 	i=xt.nextInt();
		    	 	seguir=1;
	       	        System.out.println("***************~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
	       	        
	          
            	       	        
            	       	        
            	       	        if (i==1 || cont==1)
            	       	        {
            	       	        	puntos1=puntos1+puntos;    	
            	       	        	vidas=3;
            	       	        	puntos=0;
            	       	        	cont++;
            	       	        }
            	       	        else 
            	       	        {
            	       	        	seguir=2;
            	       	        }
            	       	        
	            	       	     if(cont==2)
	         	       	        {
	         	       	        	puntos2=puntos;
	         	       	        	cont++;
	         	       	        }
            	       	        if(cont==3)
            	       	        {
            	       	        	puntos3=puntos;
            	       	        	cont++;
            	       	        }
	            	       	     if(cont==4)
	         	       	        {
	         	       	        	puntos4=puntos;
	         	       	        	cont++;
	         	       	        }
		            	       	  if(cont==5)
		      	       	        {
		      	       	        	puntos5=puntos;
		      	       	            cont++;
		      	       	        }
		            	       	 if(cont==6)
		     	       	        {
		     	       	        	puntos6=puntos;
		     	       	        	cont++;
		     	       	        }
		            	       	 if(cont==7)
		     	       	        {
		     	       	        	puntos7=puntos;
		     	       	        	cont++;
		     	       	        }
		            	       	 if(cont==8)
		     	       	        {
		     	       	        	puntos8=puntos;
		     	       	        	cont++;
		     	       	        }
		            	       	 if(cont==9)
		     	       	        {
		     	       	        	puntos9=puntos;
		     	       	        	cont++;
		     	       	        }
		            	       	 if(cont==10)
		     	       	        {
		     	       	        	puntos10=puntos;
		     	       	        	cont++;
			     	       	        }
		            	       	 
     	       	        
            	       	     if (i==1)
         	       	        {    	
         	       	        	vidas=3;
         	       	        	puntos=0;
         	       	        }
                		}
                	
                
                
	    	    }//Fin de do
	    	 	while (seguir==1);
	    	 
	    	    if(puntos1 > puntos2 && puntos1 > puntos3 && puntos1 > puntos4 && puntos1 > puntos5 && puntos1 > puntos6 && puntos1 > puntos7 && puntos1 > puntos8 && puntos1 > puntos9 && puntos1 > puntos10)
	    	    { m1=m1+puntos1;	}
	    	    if(puntos1 < puntos2 && puntos1 > puntos3 && puntos1 > puntos4 && puntos1 > puntos5 && puntos1 > puntos6 && puntos1 > puntos7 && puntos1 > puntos8 && puntos1 > puntos9 && puntos1 > puntos10)
	    	    { m2=puntos1;	}
	    	    if(puntos1 < puntos2 && puntos1 < puntos3 && puntos1 > puntos4 && puntos1 > puntos5 && puntos1 > puntos6 && puntos1 > puntos7 && puntos1 > puntos8 && puntos1 > puntos9 && puntos1 > puntos10)
	    	    { m3=puntos1;	}
	    	    if(puntos1 < puntos2 && puntos1 < puntos3 && puntos1 < puntos4 && puntos1 > puntos5 && puntos1 > puntos6 && puntos1 > puntos7 && puntos1 > puntos8 && puntos1 > puntos9 && puntos1 > puntos10)
	    	    { m4=puntos1;	}
	    	    if(puntos1 < puntos2 && puntos1 < puntos3 && puntos1 < puntos4 && puntos1 < puntos5 && puntos1 > puntos6 && puntos1 > puntos7 && puntos1 > puntos8 && puntos1 > puntos9 && puntos1 > puntos10)
	    	    { m5=puntos1;	}
	    	    if(puntos1 < puntos2 && puntos1 < puntos3 && puntos1 < puntos4 && puntos1 < puntos5 && puntos1 < puntos6 && puntos1 > puntos7 && puntos1 > puntos8 && puntos1 > puntos9 && puntos1 > puntos10)
	    	    { m6=puntos1;	}
	    	    if(puntos1 < puntos2 && puntos1 < puntos3 && puntos1 < puntos4 && puntos1 < puntos5 && puntos1 < puntos6 && puntos1 < puntos7 && puntos1 > puntos8 && puntos1 > puntos9 && puntos1 > puntos10)
	    	    { m7=puntos1;	}
	    	    if(puntos1 < puntos2 && puntos1 < puntos3 && puntos1 < puntos4 && puntos1 < puntos5 && puntos1 < puntos6 && puntos1 < puntos7 && puntos1 < puntos8 && puntos1 > puntos9 && puntos1 > puntos10)
	    	    { m8=puntos1;	}
	    	    if(puntos1 < puntos2 && puntos1 < puntos3 && puntos1 < puntos4 && puntos1 < puntos5 && puntos1 < puntos6 && puntos1 < puntos7 && puntos1 < puntos8 && puntos1 < puntos9 && puntos1 > puntos10)
	    	    { m9=puntos1;	}
	    	    if(puntos1 < puntos2 && puntos1 < puntos3 && puntos1 < puntos4 && puntos1 < puntos5 && puntos1 < puntos6 && puntos1 < puntos7 && puntos1 < puntos8 && puntos1 < puntos9 && puntos1 < puntos10)
	    	    { m10=puntos1;	}
	    	    
	    	    
	    	    if(puntos2 > puntos1 && puntos2 > puntos3 && puntos2 > puntos4 && puntos2 > puntos5 && puntos2 > puntos6 && puntos2 > puntos7 && puntos2 > puntos8 && puntos2 > puntos9 && puntos2 > puntos10)
	    	    { m1=puntos2;	}
	    	    if(puntos2 < puntos1 && puntos2 > puntos3 && puntos2 > puntos4 && puntos2 > puntos5 && puntos2 > puntos6 && puntos2 > puntos7 && puntos2 > puntos8 && puntos2 > puntos9 && puntos2 > puntos10)
	    	    { m2=puntos2;	}
	    	    if(puntos2 < puntos1 && puntos2 < puntos3 && puntos2 > puntos4 && puntos2 > puntos5 && puntos2 > puntos6 && puntos2 > puntos7 && puntos2 > puntos8 && puntos2 > puntos9 && puntos2 > puntos10)
	    	    { m3=puntos2;	}
	    	    if(puntos2 < puntos1 && puntos2 < puntos3 && puntos2 < puntos4 && puntos2 > puntos5 && puntos2 > puntos6 && puntos2 > puntos7 && puntos2 > puntos8 && puntos2 > puntos9 && puntos2 > puntos10)
	    	    { m4=puntos2;	}
	    	    if(puntos2 < puntos1 && puntos2 < puntos3 && puntos2 < puntos4 && puntos2 < puntos5 && puntos2 > puntos6 && puntos2 > puntos7 && puntos2 > puntos8 && puntos2 > puntos9 && puntos2 > puntos10)
	    	    { m5=puntos2;	}
	    	    if(puntos2 < puntos1 && puntos2 < puntos3 && puntos2 < puntos4 && puntos2 < puntos5 && puntos2 < puntos6 && puntos2 > puntos7 && puntos2 > puntos8 && puntos2 > puntos9 && puntos2 > puntos10)
	    	    { m6=puntos2;	}
	    	    if(puntos2 < puntos1 && puntos2 < puntos3 && puntos2 < puntos4 && puntos2 < puntos5 && puntos2 < puntos6 && puntos2 < puntos7 && puntos2 > puntos8 && puntos2 > puntos9 && puntos2 > puntos10)
	    	    { m7=puntos2;	}
	    	    if(puntos2 < puntos1 && puntos2 < puntos3 && puntos2 < puntos4 && puntos2 < puntos5 && puntos2 < puntos6 && puntos2 < puntos7 && puntos2 < puntos8 && puntos2 > puntos9 && puntos2 > puntos10)
	    	    { m8=puntos2;	}
	    	    if(puntos2 < puntos1 && puntos2 < puntos3 && puntos2 < puntos4 && puntos2 < puntos5 && puntos2 < puntos6 && puntos2 < puntos7 && puntos2 < puntos8 && puntos2 < puntos9 && puntos2 > puntos10)
	    	    { m9=puntos2;	}
	    	    if(puntos2 < puntos1 && puntos2 < puntos3 && puntos2 < puntos4 && puntos2 < puntos5 && puntos2 < puntos6 && puntos2 < puntos7 && puntos2 < puntos8 && puntos2 < puntos9 && puntos2 < puntos10)
	    	    { m10=puntos2;	}
	    	    
	    	    
	    	    if(puntos3 > puntos1 && puntos3 > puntos2 && puntos3 > puntos4 && puntos3 > puntos5 && puntos3 > puntos6 && puntos3 > puntos7 && puntos3 > puntos8 && puntos3 > puntos9 && puntos3 > puntos10)
	    	    { m1=puntos3;	}
	    	    if(puntos3 < puntos1 && puntos3 > puntos2 && puntos3 > puntos4 && puntos3 > puntos5 && puntos3 > puntos6 && puntos3 > puntos7 && puntos3 > puntos8 && puntos3 > puntos9 && puntos3 > puntos10)
	    	    { m2=puntos3;	}
	    	    if(puntos3 < puntos1 && puntos3 < puntos2 && puntos3 > puntos4 && puntos3 > puntos5 && puntos3 > puntos6 && puntos3 > puntos7 && puntos3 > puntos8 && puntos3 > puntos9 && puntos3 > puntos10)
	    	    { m3=puntos3;	}
	    	    if(puntos3 < puntos1 && puntos3 < puntos2 && puntos3 < puntos4 && puntos3 > puntos5 && puntos3 > puntos6 && puntos3 > puntos7 && puntos3 > puntos8 && puntos3 > puntos9 && puntos3 > puntos10)
	    	    { m4=puntos3;	}
	    	    if(puntos3 < puntos1 && puntos3 < puntos2 && puntos3 < puntos4 && puntos3 < puntos5 && puntos3 > puntos6 && puntos3 > puntos7 && puntos3 > puntos8 && puntos3 > puntos9 && puntos3 > puntos10)
	    	    { m5=puntos3;	}
	    	    if(puntos3 < puntos1 && puntos3 < puntos2 && puntos3 < puntos4 && puntos3 < puntos5 && puntos3 < puntos6 && puntos3 > puntos7 && puntos3 > puntos8 && puntos3 > puntos9 && puntos3 > puntos10)
	    	    { m6=puntos3;	}
	    	    if(puntos3 < puntos1 && puntos3 < puntos2 && puntos3 < puntos4 && puntos3 < puntos5 && puntos3 < puntos6 && puntos3 < puntos7 && puntos3 > puntos8 && puntos3 > puntos9 && puntos3 > puntos10)
	    	    { m7=puntos3;	}
	    	    if(puntos3 < puntos1 && puntos3 < puntos2 && puntos3 < puntos4 && puntos3 < puntos5 && puntos3 < puntos6 && puntos3 < puntos7 && puntos3 < puntos8 && puntos3 > puntos9 && puntos3 > puntos10)
	    	    { m8=puntos3;	}
	    	    if(puntos3 < puntos1 && puntos3 < puntos2 && puntos3 < puntos4 && puntos3 < puntos5 && puntos3 < puntos6 && puntos3 < puntos7 && puntos3 < puntos8 && puntos3 < puntos9 && puntos3 > puntos10)
	    	    { m9=puntos3;	}
	    	    if(puntos3 < puntos1 && puntos3 < puntos2 && puntos3 < puntos4 && puntos3 < puntos5 && puntos3 < puntos6 && puntos3 < puntos7 && puntos3 < puntos8 && puntos3 < puntos9 && puntos3 < puntos10)
	    	    { m10=puntos3;	}
	    	    
	    	    
	    	    
	    	    
	    	    if(puntos4 > puntos4 && puntos4 > puntos3 && puntos4 > puntos4 && puntos4 > puntos5 && puntos4 > puntos6 && puntos4 > puntos7 && puntos4 > puntos8 && puntos4 > puntos9 && puntos4 > puntos10)
	    	    { m1=puntos4;	}
	    	    if(puntos4 < puntos1 && puntos4 > puntos3 && puntos4 > puntos4 && puntos4 > puntos5 && puntos4 > puntos6 && puntos4 > puntos7 && puntos4 > puntos8 && puntos4 > puntos9 && puntos4 > puntos10)
	    	    { m2=puntos4;	}
	    	    if(puntos4 < puntos1 && puntos4 < puntos3 && puntos4 > puntos4 && puntos4 > puntos5 && puntos4 > puntos6 && puntos4 > puntos7 && puntos4 > puntos8 && puntos4 > puntos9 && puntos4 > puntos10)
	    	    { m3=puntos4;	}
	    	    if(puntos4 < puntos1 && puntos4 < puntos3 && puntos4 < puntos4 && puntos4 > puntos5 && puntos4 > puntos6 && puntos4 > puntos7 && puntos4 > puntos8 && puntos4 > puntos9 && puntos4 > puntos10)
	    	    { m4=puntos4;	}
	    	    if(puntos4 < puntos1 && puntos4 < puntos3 && puntos4 < puntos4 && puntos4 < puntos5 && puntos4 > puntos6 && puntos4 > puntos7 && puntos4 > puntos8 && puntos4 > puntos9 && puntos4 > puntos10)
	    	    { m5=puntos4;	}
	    	    if(puntos4 < puntos1 && puntos4 < puntos3 && puntos4 < puntos4 && puntos4 < puntos5 && puntos4 < puntos6 && puntos4 > puntos7 && puntos4 > puntos8 && puntos4 > puntos9 && puntos4 > puntos10)
	    	    { m6=puntos4;	}
	    	    if(puntos4 < puntos1 && puntos4 < puntos3 && puntos4 < puntos4 && puntos4 < puntos5 && puntos4 < puntos6 && puntos4 < puntos7 && puntos4 > puntos8 && puntos4 > puntos9 && puntos4 > puntos10)
	    	    { m7=puntos4;	}
	    	    if(puntos4 < puntos1 && puntos4 < puntos3 && puntos4 < puntos4 && puntos4 < puntos5 && puntos4 < puntos6 && puntos4 < puntos7 && puntos4 < puntos8 && puntos4 > puntos9 && puntos4 > puntos10)
	    	    { m8=puntos4;	}
	    	    if(puntos4 < puntos1 && puntos4 < puntos3 && puntos4 < puntos4 && puntos4 < puntos5 && puntos4 < puntos6 && puntos4 < puntos7 && puntos4 < puntos8 && puntos4 < puntos9 && puntos4 > puntos10)
	    	    { m9=puntos4;	}
	    	    if(puntos4 < puntos1 && puntos4 < puntos3 && puntos4 < puntos4 && puntos4 < puntos5 && puntos4 < puntos6 && puntos4 < puntos7 && puntos4 < puntos8 && puntos4 < puntos9 && puntos4 < puntos10)
	    	    { m10=puntos4;	}
	    	    
	    	    
	    	    
	    	    if(puntos5 > puntos1 && puntos5 > puntos3 && puntos5 > puntos4 && puntos5 > puntos5 && puntos5 > puntos6 && puntos5 > puntos7 && puntos5 > puntos8 && puntos5 > puntos9 && puntos5 > puntos10)
	    	    { m1=puntos5;	}
	    	    if(puntos5 < puntos1 && puntos5 > puntos3 && puntos5 > puntos4 && puntos5 > puntos5 && puntos5 > puntos6 && puntos5 > puntos7 && puntos5 > puntos8 && puntos5 > puntos9 && puntos5 > puntos10)
	    	    { m2=puntos5;	}
	    	    if(puntos5 < puntos1 && puntos5 < puntos3 && puntos5 > puntos4 && puntos5 > puntos5 && puntos5 > puntos6 && puntos5 > puntos7 && puntos5 > puntos8 && puntos5 > puntos9 && puntos5 > puntos10)
	    	    { m3=puntos5;	}
	    	    if(puntos5 < puntos1 && puntos5 < puntos3 && puntos5 < puntos4 && puntos5 > puntos5 && puntos5 > puntos6 && puntos5 > puntos7 && puntos5 > puntos8 && puntos5 > puntos9 && puntos5 > puntos10)
	    	    { m4=puntos5;	}
	    	    if(puntos5 < puntos1 && puntos5 < puntos3 && puntos5 < puntos4 && puntos5 < puntos5 && puntos5 > puntos6 && puntos5 > puntos7 && puntos5 > puntos8 && puntos5 > puntos9 && puntos5 > puntos10)
	    	    { m5=puntos5;	}
	    	    if(puntos5 < puntos1 && puntos5 < puntos3 && puntos5 < puntos4 && puntos5 < puntos5 && puntos5 < puntos6 && puntos5 > puntos7 && puntos5 > puntos8 && puntos5 > puntos9 && puntos5 > puntos10)
	    	    { m6=puntos5;	}
	    	    if(puntos5 < puntos1 && puntos5 < puntos3 && puntos5 < puntos4 && puntos5 < puntos5 && puntos5 < puntos6 && puntos5 < puntos7 && puntos5 > puntos8 && puntos5 > puntos9 && puntos5 > puntos10)
	    	    { m7=puntos5;	}
	    	    if(puntos5 < puntos1 && puntos5 < puntos3 && puntos5 < puntos4 && puntos5 < puntos5 && puntos5 < puntos6 && puntos5 < puntos7 && puntos5 < puntos8 && puntos5 > puntos9 && puntos5 > puntos10)
	    	    { m8=puntos5;	}
	    	    if(puntos5 < puntos1 && puntos5 < puntos3 && puntos5 < puntos4 && puntos5 < puntos5 && puntos5 < puntos6 && puntos5 < puntos7 && puntos5 < puntos8 && puntos5 < puntos9 && puntos5 > puntos10)
	    	    { m9=puntos5;	}
	    	    if(puntos5 < puntos1 && puntos5 < puntos3 && puntos5 < puntos4 && puntos5 < puntos5 && puntos5 < puntos6 && puntos5 < puntos7 && puntos5 < puntos8 && puntos5 < puntos9 && puntos5 < puntos10)
	    	    { m10=puntos5;	}
	    	 
	    	    
	    	    
	    	    if(puntos6 > puntos1 && puntos6 > puntos2 && puntos6 > puntos3 && puntos6 > puntos4 && puntos6 > puntos5 && puntos6 > puntos7 && puntos6 > puntos8 && puntos6 > puntos9 && puntos6 > puntos10)
	    	    { m1=puntos6;	}
	    	    if(puntos6 < puntos1 && puntos6 > puntos2 && puntos6 > puntos3 && puntos6 > puntos4 && puntos6 > puntos5 && puntos6 > puntos7 && puntos6 > puntos8 && puntos6 > puntos9 && puntos6 > puntos10)
	    	    { m2=puntos6;	}
	    	    if(puntos6 < puntos1 && puntos6 < puntos2 && puntos6 > puntos3 && puntos6 > puntos4 && puntos6 > puntos5 && puntos6 > puntos7 && puntos6 > puntos8 && puntos6 > puntos9 && puntos6 > puntos10)
	    	    { m3=puntos6;	}
	    	    if(puntos6 < puntos1 && puntos6 < puntos2 && puntos6 < puntos3 && puntos6 > puntos4 && puntos6 > puntos5 && puntos6 > puntos7 && puntos6 > puntos8 && puntos6 > puntos9 && puntos6 > puntos10)
	    	    { m4=puntos6;	}
	    	    if(puntos6 < puntos1 && puntos6 < puntos2 && puntos6 < puntos3 && puntos6 < puntos4 && puntos6 > puntos5 && puntos6 > puntos7 && puntos6 > puntos8 && puntos6 > puntos9 && puntos6 > puntos10)
	    	    { m5=puntos6;   }
	    	    if(puntos6 < puntos1 && puntos6 < puntos2 && puntos6 < puntos3 && puntos6 < puntos4 && puntos6 < puntos5 && puntos6 > puntos7 && puntos6 > puntos8 && puntos6 > puntos9 && puntos6 > puntos10)
	    	    { m6=puntos6;	}
	    	    if(puntos6 < puntos1 && puntos6 < puntos2 && puntos6 < puntos3 && puntos6 < puntos4 && puntos6 < puntos5 && puntos6 < puntos7 && puntos6 > puntos8 && puntos6 > puntos9 && puntos6 > puntos10)
	    	    { m7=puntos6;	}
	    	    if(puntos6 < puntos1 && puntos6 < puntos2 && puntos6 < puntos3 && puntos6 < puntos4 && puntos6 < puntos5 && puntos6 < puntos7 && puntos6 < puntos8 && puntos6 > puntos9 && puntos6 > puntos10)
	    	    { m8=puntos6;	}
	    	    if(puntos6 < puntos1 && puntos6 < puntos2 && puntos6 < puntos3 && puntos6 < puntos4 && puntos6 < puntos5 && puntos6 < puntos7 && puntos6 < puntos8 && puntos6 < puntos9 && puntos6 > puntos10)
	    	    { m9=puntos6;	}
	    	    if(puntos6 < puntos1 && puntos6 < puntos2 && puntos6 < puntos3 && puntos6 < puntos4 && puntos6 < puntos5 && puntos6 < puntos7 && puntos6 < puntos8 && puntos6 < puntos9 && puntos6 < puntos10)
	    	    { m10=puntos6;	}
	    	    
	    	    
	    	    
	    	    
	    	    if(puntos7 > puntos1 && puntos7 > puntos3 && puntos7 > puntos4 && puntos7 > puntos5 && puntos2 > puntos6 && puntos7 > puntos7 && puntos7 > puntos8 && puntos7 > puntos9 && puntos7 > puntos10)
	    	    { m1=puntos7;	}
	    	    if(puntos7 < puntos1 && puntos7 > puntos3 && puntos7 > puntos4 && puntos7 > puntos5 && puntos2 > puntos6 && puntos7 > puntos7 && puntos7 > puntos8 && puntos7 > puntos9 && puntos7 > puntos10)
	    	    { m2=puntos7;	}
	    	    if(puntos7 < puntos1 && puntos7 < puntos3 && puntos7 > puntos4 && puntos7 > puntos5 && puntos2 > puntos6 && puntos7 > puntos7 && puntos7 > puntos8 && puntos7 > puntos9 && puntos7 > puntos10)
	    	    { m3=puntos7;	}
	    	    if(puntos7 < puntos1 && puntos7 < puntos3 && puntos7 < puntos4 && puntos7 > puntos5 && puntos2 > puntos6 && puntos7 > puntos7 && puntos7 > puntos8 && puntos7 > puntos9 && puntos7 > puntos10)
	    	    { m4=puntos7;	}
	    	    if(puntos7 < puntos1 && puntos7 < puntos3 && puntos7 < puntos4 && puntos7 < puntos5 && puntos2 > puntos6 && puntos7 > puntos7 && puntos7 > puntos8 && puntos7 > puntos9 && puntos7 > puntos10)
	    	    { m5=puntos7;	}
	    	    if(puntos7 < puntos1 && puntos7 < puntos3 && puntos7 < puntos4 && puntos7 < puntos5 && puntos2 < puntos6 && puntos7 > puntos7 && puntos7 > puntos8 && puntos7 > puntos9 && puntos7 > puntos10)
	    	    { m6=puntos7;	}
	    	    if(puntos7 < puntos1 && puntos7 < puntos3 && puntos7 < puntos4 && puntos7 < puntos5 && puntos2 < puntos6 && puntos7 < puntos7 && puntos7 > puntos8 && puntos7 > puntos9 && puntos7 > puntos10)
	    	    { m7=puntos7;	}
	    	    if(puntos7 < puntos1 && puntos7 < puntos3 && puntos7 < puntos4 && puntos7 < puntos5 && puntos2 < puntos6 && puntos7 < puntos7 && puntos7 < puntos8 && puntos7 > puntos9 && puntos7 > puntos10)
	    	    { m8=puntos7;	}
	    	    if(puntos7 < puntos1 && puntos7 < puntos3 && puntos7 < puntos4 && puntos7 < puntos5 && puntos2 < puntos6 && puntos7 < puntos7 && puntos7 < puntos8 && puntos7 < puntos9 && puntos7 > puntos10)
	    	    { m9=puntos7;	}
	    	    if(puntos7 < puntos1 && puntos7 < puntos3 && puntos7 < puntos4 && puntos7 < puntos5 && puntos2 < puntos6 && puntos7 < puntos7 && puntos7 < puntos8 && puntos7 < puntos9 && puntos7 < puntos10)
	    	    { m10=puntos7;	}
	    	    
	    	    
	    	
	    	    if(puntos8 > puntos1 && puntos8 > puntos3 && puntos8 > puntos4 && puntos8 > puntos5 && puntos8 > puntos6 && puntos8 > puntos7 && puntos8 > puntos2 && puntos8 > puntos9 && puntos8 > puntos10)
	    	    { m1=puntos8;   }
	    	    if(puntos8 < puntos1 && puntos8 < puntos3 && puntos8 > puntos4 && puntos8 > puntos5 && puntos8 > puntos6 && puntos8 > puntos7 && puntos8 > puntos2 && puntos8 > puntos9 && puntos8 > puntos10)
	    	    { m3=puntos8;	}
	    	    if(puntos8 < puntos1 && puntos8 < puntos3 && puntos8 < puntos4 && puntos8 > puntos5 && puntos8 > puntos6 && puntos8 > puntos7 && puntos8 > puntos2 && puntos8 > puntos9 && puntos8 > puntos10)
	    	    { m4=puntos8;	}
	    	    if(puntos8 < puntos1 && puntos8 < puntos3 && puntos8 < puntos4 && puntos8 < puntos5 && puntos8 > puntos6 && puntos8 > puntos7 && puntos8 > puntos2 && puntos8 > puntos9 && puntos8 > puntos10)
	    	    { m5=puntos8;	}
	    	    if(puntos8 < puntos1 && puntos8 < puntos3 && puntos8 < puntos4 && puntos8 < puntos5 && puntos8 < puntos6 && puntos8 > puntos7 && puntos8 > puntos2 && puntos8 > puntos9 && puntos8 > puntos10)
	    	    { m6=puntos8;	}
	    	    if(puntos8 < puntos1 && puntos8 < puntos3 && puntos8 < puntos4 && puntos8 < puntos5 && puntos8 < puntos6 && puntos8 < puntos7 && puntos8 > puntos2 && puntos8 > puntos9 && puntos8 > puntos10)
	    	    { m7=puntos8;	}
	    	    if(puntos8 < puntos1 && puntos8 < puntos3 && puntos8 < puntos4 && puntos8 < puntos5 && puntos8 < puntos6 && puntos8 < puntos7 && puntos8 < puntos2 && puntos8 > puntos9 && puntos8 > puntos10)
	    	    { m8=puntos8;	}
	    	    if(puntos8 < puntos1 && puntos8 < puntos3 && puntos8 < puntos4 && puntos8 < puntos5 && puntos8 < puntos6 && puntos8 < puntos7 && puntos8 < puntos2 && puntos8 < puntos9 && puntos8 > puntos10)
	    	    { m9=puntos8;	}
	    	    if(puntos8 < puntos1 && puntos8 < puntos3 && puntos8 < puntos4 && puntos8 < puntos5 && puntos8 < puntos6 && puntos8 < puntos7 && puntos8 < puntos2 && puntos8 < puntos9 && puntos8 < puntos10)
	    	    { m10=puntos8;	}
	    	    
	    	    
	    	    
	    	    if(puntos9 > puntos1 && puntos9 > puntos3 && puntos9 > puntos4 && puntos9 > puntos5 && puntos9 > puntos6 && puntos9 > puntos7 && puntos9 > puntos8 && puntos9 > puntos2 && puntos9 > puntos10)
	    	    { m1=puntos9;	}
	    	    if(puntos9 < puntos1 && puntos9 > puntos3 && puntos9 > puntos4 && puntos9 > puntos5 && puntos9 > puntos6 && puntos9 > puntos7 && puntos9 > puntos8 && puntos9 > puntos2 && puntos9 > puntos10)
	    	    { m2=puntos9;	}
	    	    if(puntos9 < puntos1 && puntos9 < puntos3 && puntos9 > puntos4 && puntos9 > puntos5 && puntos9 > puntos6 && puntos9 > puntos7 && puntos9 > puntos8 && puntos9 > puntos2 && puntos9 > puntos10)
	    	    { m3=puntos9;	}
	    	    if(puntos9 < puntos1 && puntos9 < puntos3 && puntos9 < puntos4 && puntos9 > puntos5 && puntos9 > puntos6 && puntos9 > puntos7 && puntos9 > puntos8 && puntos9 > puntos2 && puntos9 > puntos10)
	    	    { m4=puntos9;	}
	    	    if(puntos9 < puntos1 && puntos9 < puntos3 && puntos9 < puntos4 && puntos9 < puntos5 && puntos9 > puntos6 && puntos9 > puntos7 && puntos9 > puntos8 && puntos9 > puntos2 && puntos9 > puntos10)
	    	    { m5=puntos9;	}
	    	    if(puntos9 < puntos1 && puntos9 < puntos3 && puntos9 < puntos4 && puntos9 < puntos5 && puntos9 < puntos6 && puntos9 > puntos7 && puntos9 > puntos8 && puntos9 > puntos2 && puntos9 > puntos10)
	    	    { m6=puntos9;	}
	    	    if(puntos9 < puntos1 && puntos9 < puntos3 && puntos9 < puntos4 && puntos9 < puntos5 && puntos9 < puntos6 && puntos9 < puntos7 && puntos9 > puntos8 && puntos9 > puntos2 && puntos9 > puntos10)
	    	    { m7=puntos9;	}
	    	    if(puntos9 < puntos1 && puntos9 < puntos3 && puntos9 < puntos4 && puntos9 < puntos5 && puntos9 < puntos6 && puntos9 < puntos7 && puntos9 < puntos8 && puntos9 > puntos2 && puntos9 > puntos10)
	    	    { m8=puntos9;	}
	    	    if(puntos9 < puntos1 && puntos9 < puntos3 && puntos9 < puntos4 && puntos9 < puntos5 && puntos9 < puntos6 && puntos9 < puntos7 && puntos9 < puntos8 && puntos9 < puntos2 && puntos9 > puntos10)
	    	    { m9=puntos9;	}
	    	    if(puntos9 < puntos1 && puntos9 < puntos3 && puntos9 < puntos4 && puntos9 < puntos5 && puntos9 < puntos6 && puntos9 < puntos7 && puntos9 < puntos8 && puntos9 < puntos2 && puntos9 < puntos10)
	    	    { m10=puntos9;	}
	    	    
	    	    
	    	    if(puntos10 > puntos2 && puntos10 > puntos3 && puntos10 > puntos4 && puntos10 > puntos5 && puntos10 > puntos6 && puntos10 > puntos7 && puntos10 > puntos8 && puntos10 > puntos9 && puntos10 > puntos10)
	    	    { m1=puntos10;	}
	    	    if(puntos10 < puntos2 && puntos10 > puntos3 && puntos10 > puntos4 && puntos10 > puntos5 && puntos10 > puntos6 && puntos10 > puntos7 && puntos10 > puntos8 && puntos10 > puntos9 && puntos10 > puntos10)
	    	    { m2=puntos10;	}
	    	    if(puntos10 < puntos2 && puntos10 < puntos3 && puntos10 > puntos4 && puntos10 > puntos5 && puntos10 > puntos6 && puntos10 > puntos7 && puntos10 > puntos8 && puntos10 > puntos9 && puntos10 > puntos10)
	    	    { m3=puntos10;	}
	    	    if(puntos10 < puntos2 && puntos10 < puntos3 && puntos10 < puntos4 && puntos10 > puntos5 && puntos10 > puntos6 && puntos10 > puntos7 && puntos10 > puntos8 && puntos10 > puntos9 && puntos10 > puntos10)
	    	    { m4=puntos10;	}
	    	    if(puntos10 < puntos2 && puntos10 < puntos3 && puntos10 < puntos4 && puntos10 < puntos5 && puntos10 > puntos6 && puntos10 > puntos7 && puntos10 > puntos8 && puntos10 > puntos9 && puntos10 > puntos10)
	    	    { m5=puntos10;	}
	    	    if(puntos10 < puntos2 && puntos10 < puntos3 && puntos10 < puntos4 && puntos10 < puntos5 && puntos10 < puntos6 && puntos10 > puntos7 && puntos10 > puntos8 && puntos10 > puntos9 && puntos10 > puntos10)
	    	    { m6=puntos10;	}
	    	    if(puntos10 < puntos2 && puntos10 < puntos3 && puntos10 < puntos4 && puntos10 < puntos5 && puntos10 < puntos6 && puntos10 < puntos7 && puntos10 > puntos8 && puntos10 > puntos9 && puntos10 > puntos10)
	    	    { m7=puntos10;	}
	    	    if(puntos10 < puntos2 && puntos10 < puntos3 && puntos10 < puntos4 && puntos10 < puntos5 && puntos10 < puntos6 && puntos10 < puntos7 && puntos10 < puntos8 && puntos10 > puntos9 && puntos10 > puntos10)
	    	    { m8=puntos10;	}
	    	    if(puntos10 < puntos2 && puntos10 < puntos3 && puntos10 < puntos4 && puntos10 < puntos5 && puntos10 < puntos6 && puntos10 < puntos7 && puntos10 < puntos8 && puntos10 < puntos9 && puntos10 > puntos10)
	    	    { m9=puntos10;	}
	    	    if(puntos10 < puntos2 && puntos10 < puntos3 && puntos10 < puntos4 && puntos10 < puntos5 && puntos10 < puntos6 && puntos10 < puntos7 && puntos10 < puntos8 && puntos10 < puntos9 && puntos10 < puntos10)
	    	    { m10=puntos10;	}
	    	  
	    	    
	    	    
    	        System.out.println("***************~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
       	        System.out.println("*           " +m1 +"............................" +(jugadores[0][0]) +"             |");
       	        System.out.println("*           " +m2 +"............................" +(jugadores[1][0]) +"             |");
       	        System.out.println("*           " +m3 +"............................" +(jugadores[2][0]) +"             |");
       	        System.out.println("*           " +m4 +"............................" +(jugadores[3][0]) +"             |");
       	        System.out.println("*           " +m5 +"............................" +(jugadores[4][0]) +"             |");
       	        System.out.println("***************~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
       	        
       	     


	     }//Controlador de encendido
	     else 
	     {//Controlador de encendido
	            System.out.println("*--------------------------------------------------*");
	            System.out.println("           <<FIN DEL PROGRAMA>>              ");
	            System.out.println("*--------------------------------------------------*");
	     }//Controlador de encendido
	}
}