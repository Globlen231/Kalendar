/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;
import java.util.Scanner;
import java.util.Arrays;

       

/**
 *
 * @author Slavik
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Восточный календарь");
        Scanner scanner=new Scanner(System.in);
        System.out.print("введите год: ");
        int chislo=scanner.nextInt();
        int chislo3=chislo%12;
        int chislo2 = chislo%10;
        int[] nums;
        String[] jivotnie ={"обезьяна","курица","собака","свинья","крыса",
        "корова","тигр","заяц","дракон","змея","лошадь","овца "};
       
            if (chislo2==1 ||chislo2==0 ){
            System.out.print(jivotnie[chislo3] + " белый ");
            }else if (chislo2==2 ||chislo2==3){
                System.out.print(jivotnie[chislo3] + " синий ");
                }else if (chislo2==4 ||chislo2==5){
                    System.out.print(jivotnie[chislo3] + " зеленая ");
                    }else if (chislo2==6 ||chislo2==7){
                        System.out.print(jivotnie[chislo3] + " красный ");
                        }else if (chislo2==8 ||chislo2==9){
                            System.out.print(jivotnie[chislo3] + " желтый ");
               
               
        }            
        }
        }
   // }
   
//}