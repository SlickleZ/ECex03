/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterbean;

import javax.ejb.Stateless;

/**
 *
 * @author SlickleZ
 */
@Stateless
public class CelsiusConverterBean implements CelsiusConverterBeanRemote {
    
    @Override
    public float fToC(float fahrenheit) {
        return (5.0f *(fahrenheit - 32.0f)) / 9.0f;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
