import javax.swing.JOptionPane;

public class CriaUsuario {

	public static void main(String[] args) {
		int rm = 82552;
		String nome = "Eduardo";
		String username = nome + "_" + rm;
		
		JOptionPane.showMessageDialog(null, 
				"RM: " + rm + " \n" +
		        "Nome: " + nome + "\n" +
			    "Usuário: " + username );

	}

}
