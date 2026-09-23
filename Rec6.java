import javax.swing.JOptionPane;
public class Aprendendo2 {
    
    public static int FatRec(int num){
        if (num == 1 || num == 0){
        return 1;
    }
        return num * FatRec(num - 1);
    }
            
    public static void main(String Args[]){
        int numero;
        int res;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para efetuar o fatorial: "));
        res = FatRec(numero);
        System.out.println("Resultado: " + res);
    }
}
 
