import java.util.*;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class EX {

	public static void main(String[] args) {
		String conta;
		conta = showInputDialog("Informe a conta que será realisada: ");
		conta = conta.replaceAll(" ", "");
		conta = conta.toUpperCase();
		resolver(conta);
	}
	public static void resolver(String conta) {
		Stack<String> pilha = new Stack<String>();
		char ch;
		double x, y, aux;
		String res = "";
		for (int i = 0; i < conta.length(); i++) {
			ch = conta.charAt(i);
			if (ch != ' ') {
				switch (ch) {
				case '+':
					x = (Double.parseDouble(pilha.pop()));
					y = (Double.parseDouble(pilha.pop()));
					y = y + x;
					pilha.push(res + y);
					break;
				case '-':
					x = (Double.parseDouble(pilha.pop()));
					y = (Double.parseDouble(pilha.pop()));
					y = y - x;
					pilha.push(res + y);
					break;
				case '*':
					x = (Double.parseDouble(pilha.pop()));
					y = (Double.parseDouble(pilha.pop()));
					y = y * x;
					pilha.push(res + y);
					break;
				case '/':
					x = (Double.parseDouble(pilha.pop()));
					y = (Double.parseDouble(pilha.pop()));
					y = y / x;
					pilha.push(res + y);
					break;
				case '%':
					x = (Double.parseDouble(pilha.pop()));
					y = (Double.parseDouble(pilha.pop()));
					y = y % x;
					pilha.push(res + y);
					break;
				case '^':
					x = (Double.parseDouble(pilha.pop()));
					y = (Double.parseDouble(pilha.pop()));
					y = Math.pow(y, x);
					pilha.push(res + y);
					break;
				case '(':
					break;
				case ')':
					break;
				default:
					aux = parseDouble(showInputDialog("Qual o valor de " + ch));
					pilha.push(res + aux);
				}
			}
		}
		showMessageDialog(null,"O resultado da expressão é: " + pilha.pop() + " ");
	}
}
