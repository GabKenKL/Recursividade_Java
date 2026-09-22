import javax.swing.JOptionPane;

public class Rec2 {
    public static void main(String args[]){
    int res, Numero;
    Numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
    res = Recursiva(Numero);
    System.out.println("Resultado: " + res);
    }
    public static int Recursiva(int num){
        if (num  == 1){
            return num;
        }
        return num + Recursiva(num - 1);
    }
}
