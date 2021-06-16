package edu.prahlad.patterns2.iterator;

import edu.prahlad.patterns2.iterator.before.BrowserHistoryBefore;

public class Main {
    public static void main(String[] args) {
        var historyBefore = new BrowserHistoryBefore();
        historyBefore.push("a");
        historyBefore.push("b");
        historyBefore.push("c");

        for (int i = 0; i < historyBefore.getUrls().size(); i++) {
            System.out.println(historyBefore.getUrls().get(i));
        }


        var history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }


        var arrayHistory = new BrowserHistoryWithArray();
        arrayHistory.push("a");
        arrayHistory.push("b");
        arrayHistory.push("c");

        Iterator iteratorArray = history.createIterator();
        while (iteratorArray.hasNext()){
            System.out.println(iteratorArray.current());
            iteratorArray.next();
        }
    }
}
