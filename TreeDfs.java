class tree{
    int data;
    tree left;
    tree right;
    tree(int data)
    {
        this.data = data;
        this.left =null;
        this.right =null;
    }
}
public class TreeDfs {
    public static int heightCalculation(tree Tree)
    {
        if(Tree ==null)
        {
            return 0;
        }
        int height1 = heightCalculation(Tree.left);
        int height2= heightCalculation(Tree.right);
        if(height1>height2)
        {
            return height1+1;
        }
        else
        {
            return height2+1;
        }
    }
    public static void main(String args[])
    {
        tree Tree = new tree(1);
        Tree.left = new tree(2);
        Tree.left.left = new tree(4);
        Tree.left.right = new tree(5);
        Tree.right = new tree(3);
        System.out.println(heightCalculation(Tree));
    }
}
