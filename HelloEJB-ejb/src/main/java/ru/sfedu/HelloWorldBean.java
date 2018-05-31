/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu;
import javax.ejb.Stateless;
/**
 *
 * @author evgeny
 */
@Stateless
public class HelloWorldBean implements IHelloWorld{
    public String sayHello(String name) {
        return String.format("Hello, %s. This is EJB.", name);
    }
}
