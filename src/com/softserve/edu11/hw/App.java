package com.softserve.edu11.hw;

import java.util.regex.*;

public class App {
    public static void main(String[] args) {

        //Task 1
 //       System.out.println("Task 1");
   //     System.out.println("Input sentences for analyze: ");
     //   var sentence1 = com.softserve.edu10.pt.Task_1.getName();
       // var text = Task_1.getWordsFromSentences(sentence1);
 //       Task_1.getWordMaxLen(text);
   //     Task_1.getSecondWord(text);
     //   System.out.println();

        //Task 2
 //       System.out.println("Task 2");
  //      System.out.println("Input sentences for analyze: ");
   //     var sentence2 = com.softserve.edu10.pt.Task_1.getName();
    //    Task_2.removeDoubleGap(sentence2);

        //Task 3
        System.out.println("Task 3");
        System.out.println("Input sentences with numbers: ");
        var sentence3 = com.softserve.edu10.pt.Task_1.getName();
        var tt = Task_2.getListFromSentence(sentence3);
        var list = Task_3.getNumbersFromArray(tt);
        Task_3.replacedFormatNumbers(list,sentence3);

    }
}



