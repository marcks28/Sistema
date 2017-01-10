/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao.utils;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author edsonmarcks
 */
public class ControleCampos {
    
    public static void limparCampos(Object[] fields)
    {
        for(Object field : fields  )
        {
            if(field instanceof JTextField)
            {
                ((JTextField) field).setText(null);
            }
            else if(field instanceof JPasswordField)
            {
                ((JPasswordField) field).setText(null);
            }
        }
    }
}
