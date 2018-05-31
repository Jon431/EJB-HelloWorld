/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu;
import javax.ejb.Local;
/**
 *
 * @author evgeny
 */
@Local
public interface IHelloWorld {
    public String sayHello(String name);
    
}
