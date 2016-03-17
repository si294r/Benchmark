/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benchmark;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chairuddinsyah
 */
public class HelloRunnable implements Runnable {

    private int _ID = 0;
    
    public HelloRunnable SetID(int ID) {
        _ID = ID;
        return this;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 1; i++) {
                
//                URL url = new URL("http://localhost/test/test_thread2.php?id=" + _ID);
//                URL url = new URL("http://test-app-124310.appspot.com/"); // test php appengine
//                URL url = new URL("http://testjava-1244.appspot.com/"); // test java appengine
//                URL url = new URL("http://test-app-124310.appspot.com/testevent.php"); // test php memcache
                URL url = new URL("http://104.154.32.120/instance2_test.php");
//                URL url = new URL("https://alegrium.com/billionaire/testEvent.php");

                InputStreamReader in = new InputStreamReader(url.openStream());
                StringWriter out = new StringWriter();
                while (in.ready()) {
                    out.append((char) in.read());
                }
                String content = out.toString();
                System.out.println(_ID + " TEST : " + content);
//                Thread.sleep(500);
            }
        } catch (Exception ex) {
            System.out.println(_ID + " TEST : " + ex.getMessage());
//        } catch (MalformedURLException ex) {
//            System.out.println(_ID + " TEST : " + ex.getMessage());
//        } catch (IOException ex) {
//            System.out.println(_ID + " TEST : " + ex.getMessage());
//        } catch (InterruptedException ex) {
//            System.out.println(_ID + " TEST : " + ex.getMessage());
        }

    }

}
