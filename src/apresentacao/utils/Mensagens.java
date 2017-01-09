/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao.utils;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author edsonmarcks
 */
public class Mensagens {

    public static void sucess(Component component) {
        JOptionPane.showMessageDialog(component, "Operação realizada com sucesso!", "Sucesso!",
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(Mensagens.class.getResource("/apresentacao/icons/Success_40973-48.png")));
    }

    public static void sucess(Component component, String message) {
        JOptionPane.showMessageDialog(component, message, "Sucesso!",
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(Mensagens.class.getResource("/apresentacao/icons/Success_40973-48.png")));
    }

    public static void sucess(Component component, String message, String cause) {
        JOptionPane.showMessageDialog(component, message + "\nCausa: " + cause, "Sucesso!",
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(Mensagens.class.getResource("/apresentacao/icons/Success_40973-48.png")));
    }

    public static void error(Component component) {
        JOptionPane.showMessageDialog(component, "Erro na execução ", "Falha", JOptionPane.ERROR_MESSAGE,
                new ImageIcon(Mensagens.class.getResource("/apresentacao/icons/error-48.png")));
    }

    public static void error(Component component, String message) {
        JOptionPane.showMessageDialog(component, message, "Falha", JOptionPane.ERROR_MESSAGE,
                new ImageIcon(Mensagens.class.getResource("/apresentacao/icons/error-48.png")));
    }

    public static void error(Component component, String message, String cause) {
        JOptionPane.showMessageDialog(component, message + "\ncausa:  " + cause, "Falha", JOptionPane.ERROR_MESSAGE,
                new ImageIcon(Mensagens.class.getResource("/apresentacao/icons/error-48.png")));
    }
    
    public static int  questionYesNo(Component component)
    {
        return JOptionPane.showConfirmDialog(component, "Confirmar operação?", "Atênção!", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                new ImageIcon(Mensagens.class.getResource("/apresentacao/icons/Question-48.png")));
    }
    
    public static int  questionYesNo(Component component, String message)
    {
        return JOptionPane.showConfirmDialog(component, message, "Atênção!", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                new ImageIcon(Mensagens.class.getResource("/apresentacao/icons/Question-48.png")));
    }
}
