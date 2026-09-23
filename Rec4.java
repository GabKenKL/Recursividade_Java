import javax.swing.JOptionPane;

public class Rec4 {
    public static void main (String args[]){
        Double n;
        Double res;
        Double n2 = 1.0;
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
        res = Recursiva(n, n2);
        System.out.println("Resultado: " + res);
    }
    public static Double Recursiva(Double num,Double num2){
        if (num == 1){
            return num;
        }
        return num/num2 + Recursiva(num - 1, num2 + 1);
    }
}
