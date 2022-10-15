package com.company;



import java.util.*;

class Word {
    public static class ListNode {
        int val = 0;
        ListNode next = null;
        ListNode random = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode copyRandomList(ListNode head) {
        ListNode newList = new ListNode(-1);
        ListNode curr = head;
        ListNode nLHead = newList;


        // Create new list clone without random pointer
        while(curr != null){
            ListNode nNode = new ListNode(curr.val);
            newList.next = nNode;
            newList = newList.next;
        }

        // Create alternate list using original list
        curr = head;
        newList = nLHead.next;

        while(curr != null){
            ListNode next1 = curr.next;
            ListNode next2 = newList.next;
            curr.next = newList;
            newList.next = next1;
            curr = next1;
            newList = next2;
        }

        // setting random pointer
        curr = head;
        while(newList != null){
            curr.next.random = curr.random == null ? null : curr.random.next;
            curr = curr.next.next;
        }

        // recover orignal list
        ListNode ohead = new ListNode(-1);
        ListNode chead = new ListNode(-1);
        ListNode temp = head;
        while(temp != null){
            ohead.next = temp;
            chead.next = temp.next;
            ohead = temp;
            chead = temp.next;
        }
        ohead.next = null;
        return nLHead.next;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        ListNode[] arr = new ListNode[n];
        ListNode prev = null;

        for (int i = 0; i < n; i++) {
            arr[i] = new ListNode(0);
            if (prev != null)
                prev.next = arr[i];
            prev = arr[i];
        }

        for (int i = 0; i < n; i++) {
            int val = scn.nextInt();
            int idx = scn.nextInt();

            arr[i].val = val;
            if(idx != -1) arr[i].random = arr[idx];
        }

        ListNode head = copyRandomList(arr[0]);
        while (head != null) {
            System.out.print("(" + head.val + ", " + (head.random != null ? head.random.val : -1) + ") ");
            head = head.next;
        }
    }
}

