package Structural_pattern.Composite_pattern.B6;

public class MainB6 {
    public static void main(String[] args) {
        BNote tree = new InnerNode(3);
        BNote tree1 = new InnerNode(5);
        BNote tree2 = new InnerNode(6);
        BNote tree3 = new InnerNode(7);
        BNote Node1;
        BNote Node2;
        BNote Node3;
        BNote Node4;
        Node1 = new InnerNode(5);
        Node2 = new InnerNode(0);
        Node3 = new Leaft(4);
        Node4 = new Leaft(5);
        tree.AddR(tree1);
        tree.AddL(tree2);
        tree1.AddL(tree3);
        tree1.AddR(tree2);
        System.out.println(tree.travel());



    }



}
