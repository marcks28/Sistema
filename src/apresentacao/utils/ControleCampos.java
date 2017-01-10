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
    
    public static void validadeCampos(Object[] fields) throws Exception
    {
        for(Object field : fields )
        {
            if(field instanceof JTextField)
            {
                if(((JTextField) field).getText().trim().isEmpty()  || ((JTextField) field).getText().trim().equals(""))
                {
                    throw new Exception("o campo "+((JTextField) field).getName()+" é obrigatório!");
                }
            }
        }
    }
}
