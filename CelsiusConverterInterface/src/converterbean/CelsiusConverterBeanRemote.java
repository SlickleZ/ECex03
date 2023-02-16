/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterbean;

import javax.ejb.Remote;

/**
 *
 * @author SlickleZ
 */
@Remote
public interface CelsiusConverterBeanRemote {

    float fToC(float fahrenheit);
    
}
