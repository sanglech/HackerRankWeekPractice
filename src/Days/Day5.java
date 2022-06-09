package Days;

import java.util.*;

public class Day5 {

    public static String isBalanced(String s) {
        // Write your code here
        HashMap<String, String> brackets = new HashMap<>();
        brackets.put("(", ")");
        brackets.put("{", "}");
        brackets.put("[", "]");

        if(s.length()%2!=0){
            return ("NO");
        }
        Stack<String> stack2 = new Stack<String>();
        for (int i=0; i < s.length();i++){
            if(brackets.containsKey(String.valueOf(s.charAt(i)))){
                stack2.push(String.valueOf(s.charAt(i)));
            }
            else {
                if(stack2.isEmpty()){
                    return "NO";
                }

                if(!Objects.equals(brackets.get(stack2.peek()), String.valueOf(s.charAt(i)))){
                    return "NO";
                }
                else {
                    stack2.pop();
                }
            }
        }

        if(stack2.isEmpty()){
            return "YES";
        }
        else {
            return "NO";
        }
    }


    public SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode currNode = new SinglyLinkedListNode(0);
        SinglyLinkedListNode newHead =currNode;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                currNode.next=head1;
                head1=head1.next;
            }
            else if(head1.data>head2.data){
                currNode.next = head2;
                head2=head2.next;
            }
            currNode= currNode.next;
        }

        if(head1!=null){
            currNode.next=head1;
        }
        else if(head2!=null){
            currNode.next = head2;
        }

        return newHead.next;

    }
      public class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

          public SinglyLinkedListNode(int i) {
              this.data =i;
              this.next =null;
          }
      }

      public static void stackExample(String args) {
        LinkedList<Integer> stk1 = new LinkedList<>();
        LinkedList<Integer> stk2 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            if(line.startsWith("1 ")){     //both empty push to s1, else s2
                int num = Integer.parseInt( line.split(" ")[1] );

                if(stk1.isEmpty() && stk2.isEmpty())
                    stk1.push(num);
                else
                    stk2.push(num);
            } else if(line.startsWith("2")){  //s1 empty pop s2 to s1, pop s1
                if(stk1.isEmpty())
                    while(!stk2.isEmpty())
                        stk1.push(stk2.pop());

                stk1.pop();
            } else if(line.startsWith("3")){  //if s1 empty pop s2 to s1, print s1
                if(stk1.isEmpty())
                    while(!stk2.isEmpty())
                        stk1.push(stk2.pop());

                System.out.println( stk1.peek() );
            }
        }
        sc.close();
    }
}
