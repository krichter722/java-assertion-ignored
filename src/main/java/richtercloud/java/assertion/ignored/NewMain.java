/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package richtercloud.java.assertion.ignored;

/**
 *
 * @author richter
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
        ClassLoader.getSystemClassLoader().setPackageAssertionStatus("richtercloud.java.assertion.ignored", true);
        System.out.println(String.format("desired assertion status: %b",
                NewMain.class.desiredAssertionStatus()));
        assert false;
        System.out.println("assertion has been ignored");
    }
    
}
