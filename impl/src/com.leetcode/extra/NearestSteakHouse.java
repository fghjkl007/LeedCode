package com.leetcode.extra;

import java.util.List;
import java.util.*;

public class NearestSteakHouse {
    public static void main(String args[]){
        int totalSteakhours = 10;
        List<List<Integer>> aaa = new ArrayList<>();
        List<Integer> bbb1 = new ArrayList<>();
        bbb1.add(1);
        bbb1.add(-3);
        List<Integer> bbb2 = new ArrayList<>();
        bbb2.add(1);
        bbb2.add(5);
        List<Integer> bbb3 = new ArrayList<>();
        bbb3.add(3);
        bbb3.add(4);
        aaa.add(bbb1);
        aaa.add(bbb2);
        aaa.add(bbb3);

    //    nearestXsteakHouses(10, aaa, 1);



        Collections.sort(aaa, new Comparator<List<Integer>>(){
            public int compare(List<Integer> a, List<Integer> b){
                return a.get(1)-b.get(1);
            }
        });
        System.out.println(aaa);
    }

        // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
        public static List<List<Integer>> nearestXsteakHouses(int totalSteakhouses,
                                                List<List<Integer>> allLocations,
                                                int numSteakhouses)
        {
            List<Integer> origin  = new ArrayList<Integer>();
            origin.add(0);
            origin.add(0);

            System.out.println(origin);
            PriorityQueue<List<Integer>> pq = new PriorityQueue<List<Integer>> (numSteakhouses, new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> a, List<Integer> b){
                    return (int) (getDistance(a, origin)-getDistance(b, origin));
                }
            });



            for(int i = 0; i<allLocations.size(); i++){
                pq.offer(allLocations.get(i));
                if(pq.size()>numSteakhouses)
                    pq.poll();
            }
            List<List<Integer>> result = new ArrayList<List<Integer>>();
            while(!pq.isEmpty()){
                result.add(pq.poll());
            }
            return result;





        }

        private static double getDistance(List<Integer> a, List<Integer> b){
            return Math.sqrt((a.get(0)-b.get(0))*(a.get(0)-b.get(0))+(a.get(1)-b.get(1))*(a.get(1)-b.get(1)));
        }
        // METHOD SIGNATURE ENDS

}
