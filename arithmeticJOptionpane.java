import javax.swing.JOptionPane;

public class arithmeticJOptionpane {
    public static void main(String[] args) {
        try {
            String num1Str=JOptionPane.showInputDialog("Enter the first number:");
            double num1=Double.parseDouble(num1Str);
            String num2Str=JOptionPane.showInputDialog("Enter the second number:");
            double num2=Double.parseDouble(num2Str);
            double addition=num1+num2;
            double subtraction=num1-num2;
            double multiplication=num1*num2;
            double division=num2!=0?num1 / num2 : Double.NaN;
            String message="Results:\nAddition: " + addition + "\nSubtraction: " + subtraction + "\nMultiplication: " + multiplication + "\nDivision: " + (num2 != 0 ? division : "Cannot divide by zero");
            JOptionPane.showMessageDialog(null, message);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter numeric values.");
        }
    }
}