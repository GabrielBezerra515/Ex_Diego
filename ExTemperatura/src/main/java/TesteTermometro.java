
import com.mycompany.extemperatura.Termometro;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno
 */
public class TesteTermometro {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Termometro term = new Termometro();

        System.out.println(term.getTemperaturaAtual() + "\n"
                + term.getTemperaturaMaxResgistrada() + "\n"
                + term.getTemperaturaMinRegistrada());

        System.out.print("Insira um valor para aumentar: ");
        Integer aumentar = in.nextInt();

        System.out.println();

        System.out.println(term.aumentaTemperatura(aumentar));

        
        System.out.print("Insira outro valor para aumentar: ");
        Integer aumentar2 = in.nextInt();

        System.out.println();

        System.out.println(term.aumentaTemperatura(aumentar2));

        
        System.out.print("Insira um valor para diminuir: ");
        Integer diminuir = in.nextInt();
       
        System.out.println(term.diminuiTemperatura(diminuir));
       
        System.out.println();
        
        System.out.print("Insira outro valor para diminuir: ");
        Integer diminuir2 = in.nextInt();
        
        System.out.println(term.diminuiTemperatura(diminuir2));
        
        System.out.println();
        
        System.out.print("Convertendo o valor da temperatura: " + term.converterParaFahreinheit());
        
    }
}
