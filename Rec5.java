import javax.swing.JOptionPane;

public class ExercicioRecursividade {
    public static int recFat(int num){
        if (num == 1){
            return num;
        }
        return num * recFat(num - 1);
    }
            
    public static int RecSomaFat(int numero){
        if (numero == 1){
            return numero;
        }
        return recFat(numero) + RecSomaFat(numero - 1);
    }
    public static void main(String args[]){
        int n, res;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        res = RecSomaFat(n);
        System.out.println("Resultado: " + res);
    }
}
