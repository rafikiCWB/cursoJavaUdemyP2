package org.threads;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) throws Exception {


        // store all 1,000 threads
        var threads = new ArrayList<Thread>();

        // dedupe thread names
        var names = new ConcurrentSkipListSet<String>();

        // thanks to Oracle Java Developer Advocate José Paumard
        for (var i = 0; i < 1000; i++) {
            var first = 0 == i;
            var unstartedJavaLangThread = Thread.ofVirtual().unstarted(() -> {
                runOnThread(first, names);
                runOnThread(first, names);
                runOnThread(first, names);
                runOnThread(first, names);
            });
            threads.add(unstartedJavaLangThread);
        }

        for (var t : threads)
            t.start();

        for (var t : threads)
            t.join();

        System.out.println(names);
    }

    private static void runOnThread(boolean first, Set<String> names) {
        if (first) names.add(Thread.currentThread().toString());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
