package view;

import javax.swing.JOptionPane;

import beans.Aluno;

public class View {
	public static void main(String[] args) throws Exception {
		int op;
		String menu = "1-Inserir\n0-Sair";
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 0:
				JOptionPane.showMessageDialog(null, "Até logo");
				break;
			case 1: {
				Aluno aluno = new Aluno();
				String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade do aluno?"));
				String fone = JOptionPane.showInputDialog("Qual o telefone do aluno?");
				String email = JOptionPane.showInputDialog("Qual o email do aluno?");
				aluno.setNome(nome);
				aluno.setIdade(idade);
				aluno.setFone(fone);
				aluno.setEmail(email);
				aluno.inserir();
				JOptionPane.showMessageDialog(null, "Aluno inserido com sucesso");
			}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
				break;
			}
		} while (op != 0);
	}
}
