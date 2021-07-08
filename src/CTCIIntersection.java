import java.util.*;

public class CTCIIntersection {
    public static void main(String[] args) {
        ListNode intersectionNode = new ListNode("q");
        ListNode intersectionNodeRunner = intersectionNode;
        intersectionNodeRunner .next = new ListNode("i");
        intersectionNodeRunner = intersectionNodeRunner.next;
        intersectionNodeRunner .next = new ListNode("n");
        intersectionNodeRunner = intersectionNodeRunner.next;
        intersectionNodeRunner .next = new ListNode("t");
        intersectionNodeRunner = intersectionNodeRunner.next;
        intersectionNodeRunner .next = new ListNode("e");
        intersectionNodeRunner = intersectionNodeRunner.next;
        intersectionNodeRunner .next = new ListNode("r");
        intersectionNodeRunner = intersectionNodeRunner.next;
        intersectionNodeRunner .next = new ListNode("s");
        intersectionNodeRunner = intersectionNodeRunner.next;
        intersectionNodeRunner .next = new ListNode("e");
        intersectionNodeRunner = intersectionNodeRunner.next;
        intersectionNodeRunner .next = new ListNode("c");
        intersectionNodeRunner = intersectionNodeRunner.next;
        intersectionNodeRunner .next = new ListNode("t");
        intersectionNodeRunner = intersectionNodeRunner.next;
        ListNode inputList = new ListNode("e");
        ListNode inputListRunner = inputList;
        inputListRunner.next = new ListNode("c");
        inputListRunner = inputListRunner.next;
        inputListRunner.next = new ListNode("b");
        inputListRunner = inputListRunner.next;
        inputListRunner.next = new ListNode("b");
        inputListRunner = inputListRunner.next;
        inputListRunner.next = new ListNode("r");
        inputListRunner = inputListRunner.next;
        inputListRunner.next = new ListNode("e");
        inputListRunner = inputListRunner.next;
        inputListRunner.next = new ListNode("l");
        inputListRunner = inputListRunner.next;
        inputListRunner.next = new ListNode("b");
        inputListRunner = inputListRunner.next;
        inputListRunner.next = intersectionNode;
        inputListRunner = inputListRunner.next;
        ListNode inputList2 = new ListNode("s");
        ListNode inputList2Runner = inputList2;
        inputList2Runner.next = new ListNode("e");
        inputList2Runner = inputList2Runner.next;
        inputList2Runner.next = new ListNode("c");
        inputList2Runner = inputList2Runner.next;
        inputList2Runner.next = new ListNode("o");
        inputList2Runner = inputList2Runner.next;
        inputList2Runner.next = new ListNode("n");
        inputList2Runner = inputList2Runner.next;
        inputList2Runner.next = new ListNode("d");
        inputList2Runner = inputList2Runner.next;
        inputList2Runner.next = intersectionNode;

        ListNode newThing = isIntersecting(inputList,inputList2);
        System.out.println(newThing);
    }

    public static ListNode isIntersecting(ListNode list1,ListNode list2) {
      ListNode list1Runner = list1;
      ListNode list2Runner = list2;
      HashSet<ListNode> visitedNodes = new HashSet<>();
      while(list1Runner != null){
          visitedNodes.add(list1Runner);
          list1Runner = list1Runner.next;
      }
        while(list2Runner != null){
            if(visitedNodes.contains(list2Runner))return list2Runner;
            list2Runner = list2Runner.next;
        }
        return null;
    }
}

class ListNode {
    String val;
    ListNode next;

    ListNode() {
    }

    ListNode(String val) {
        this.val = val;
    }

    ListNode(String val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
