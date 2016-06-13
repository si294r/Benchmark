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
//                URL url = new URL("http://104.154.32.120/instance2_test.php");
//                URL url = new URL("https://alegrium.com/billionaire/testEvent.php");
//                URL url = new URL("http://130.211.164.23/Billionaire/event/get/android/1.1");
//                URL url = new URL("http://130.211.164.23/BillionaireAPI/get_event.php?device=android&version=1.1");
//                URL url = new URL("http://130.211.164.23/BillionaireAPI/get_event.php?android/1.1");
//                URL url = new URL("http://130.211.164.23/BillionaireAPI/update_data.php?fb_" + _ID + "/heru/121/351/2/1.3/android");
                URL url = new URL("https://billionaire-1181.firebaseapp.com/share/share_achievement_01.png");

                InputStreamReader in = new InputStreamReader(url.openStream());
                StringWriter out = new StringWriter();
                while (in.ready()) {
                    out.append((char) in.read());
                }
                String content = out.toString();
//                System.out.println(_ID + " TEST SUKSES : " + content);
                System.out.println(_ID + " TEST SUKSES : share_achievement_01.png");
//                Thread.sleep(500);
            }
        } catch (Exception ex) {
            System.out.println(_ID + " TEST GAGAL : " + ex.getMessage());
//        } catch (MalformedURLException ex) {
//            System.out.println(_ID + " TEST : " + ex.getMessage());
//        } catch (IOException ex) {
//            System.out.println(_ID + " TEST : " + ex.getMessage());
//        } catch (InterruptedException ex) {
//            System.out.println(_ID + " TEST : " + ex.getMessage());
        }

    }

}
