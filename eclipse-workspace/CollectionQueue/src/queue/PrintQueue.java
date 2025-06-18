package queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
    public static void main(String[] args) {
        Queue<String> printJobs = new LinkedList<>();
        printJobs.add("Document1.pdf");
        printJobs.add("Report.docx");
        printJobs.add("Invoice.xlsx");

        while (!printJobs.isEmpty()) {
            System.out.println("Printing: " + printJobs.poll());
        }
    }
}
