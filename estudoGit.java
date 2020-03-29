import javax.swing.*;
public class EntregaGit {
public static void main (String [] args){
System.out.println ("Entregando tarefas com o Git na linha de comando...");
String nome = JOptionPane.showInputDialog("Qual seu nome?");
JOptionPane.showMessageDialog(null, "Oi, " + nome);
}
}