package com.softserve.quizs;

public class MyC1ass {
    public enum TrafficLights {
        RED, YELLOW, GREEN;

        public TrafficLights next() {
            if (this == TrafficLights.RED) return TrafficLights.YELLOW;
            else if (this == TrafficLights.YELLOW) return TrafficLights.GREEN;
            else if (this == TrafficLights.GREEN) return TrafficLights.YELLOW;
            else return TrafficLights.RED;
        }
    }

    public static void main(String[] args) {
        TrafficLights color = TrafficLights.RED;
        color.next();  // Assign the result of next() back to the variable
        int[] a={1,2,3,4,5};

        double res=0;
        for (int j = 0; j < a.length; j++) {
            res+=res+a[j];
            System.out.println(res);
        }
        System.out.println(res/a.length);


        int i=0;

 int [][] x= new int[2][];x[0]=new int[2];
        switch (color) {
            case RED:
                System.out.print("Stop");
                break;
            case YELLOW:
                System.out.print("Wait");

            case GREEN:
                System.out.print("Go");
                break;
            default:
                System.out.print("Do nothing");
                break;  // Adding a break for the default case
        }
    }
}
