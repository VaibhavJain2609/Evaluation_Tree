public class main {
    public static void main(String[] args)
    {
        EvaluateTree tree = new EvaluateTree();
        tree.root = new Node("/", new Node("5"), new Node("/", new Node("7"), new Node("2")));
        tree.print();
        System.out.println(tree.evaluate());
    }
}
