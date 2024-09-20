package org.balar.javaDesignPatterns.decoratorPattern.jdkInternalDecorators;

import java.io.*;

public class TestInputStreamComponent {

    public void show() throws IOException {
        /*
        Here System.in is a component which is being decorated by InputStreamReader
        There are more than one Decorators under InputStream class,
        which could take the InputStream as an input and decorate it for different purpose
         */
        System.out.println("Enter a value: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.println("Entered value is: "+ bf.readLine());
    }
}
