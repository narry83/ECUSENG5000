/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KW.CH06;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Paul
 */
public class PrintDocumentQueueExample {
    
    public void UseComparePrintDocuments() {
        Queue<PrintDocument> printQueue =
                new PriorityQueue<>(new ComparePrintDocuments());
    }
    
    public void UseLambda() {
        final double P1 = 0.8;
        final double P2 = 0.2;
        Queue<PrintDocument> printQueue =
                new PriorityQueue<>((left, right) -> {
                    double leftValue = P1 * left.getSize() + P2 * left.getSize();
                    double rightValue = P1 * right.getSize() + P2 * right.getSize();
                    return Double.compare(leftValue, rightValue);
                });
    }
    
}
