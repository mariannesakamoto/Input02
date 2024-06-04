import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Não precisa por nada aqui, só uma mensagem",
                "WhatsApp",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Isso é uma pergunta?",
                "Caixa de dialogo",
                2,
                null,
                null,
                "Fale algo aqui.");
        
        
        String[] acceptableValues = {"Escolha 1", "Escolha 2", "Escolha 3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Isso é uma pergunta?",
                "Caixa de dialogo",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
