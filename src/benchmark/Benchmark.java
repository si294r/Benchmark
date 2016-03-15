/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benchmark;

/**
 *
 * @author chairuddinsyah
 */
public class Benchmark {

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i<= 10000; i++) {
            (new Thread(new HelloRunnable().SetID(i))).start();
        }
    }
    
}
