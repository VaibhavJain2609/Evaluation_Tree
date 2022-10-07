// Evaluate tree class
public class EvaluateTree{
      Node root;
//vInitializes the root node
    public EvaluateTree(Node roota){
        root = roota;
    }
//Basic constructor
    public EvaluateTree(){ root = null; }
// Returns the information about the author
    public String about(){
        String information = "My name is Vaibhav Jain and I am a student from India";
        return information;
    }
    // Prints the tree through the node class, initialling the indent 0 which = 0
    public void print(){
        root.print(0);
    }
    // Calls the evaluate function
    public double evaluate(){ return root.evaluate(); }
}
class Node{

    private Node left, right;
    private String data;
// Basin node constructor
    public Node(String value){
        data = value;
        left = null;
        right = null;
    }
// Node constructor with a value, a left and right nodes
    public Node(String value, Node lft, Node rt){
        data = value;
        left = lft;
        right = rt;
    }
// Prints the view of the tree and how it looks based on the indent
    public void print(int indent) {

        for (int i = 0; i <= indent; i++) {
            System.out.print(" ");
        }
        System.out.print("+--");

        System.out.println(this.data);
        if (this.left != null){
            this.left.print(indent + 1);
        }
        if (this.right != null) {
            this.right.print(indent + 1);
        }
    }
// Evaluates the expression tree and gives the result
    public double evaluate(){

        double result = 0;

        switch (this.data){
            case "+":
                result =this.left.evaluate() + this.right.evaluate();
                break;
            case "-":
                result = this.left.evaluate() - this.right.evaluate();
                break;
            case "/":
                result = this.left.evaluate() / this.right.evaluate();
                break;
            case "*":
                result = this.left.evaluate() * this.right.evaluate();
                break;
            default:
                result = Double.parseDouble(this.data);
        }

        return result;

    }
}