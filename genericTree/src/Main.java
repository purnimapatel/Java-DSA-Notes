// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void printTree(GenericTree<Integer>root) {
        if(root==null){
            return;
        }
        System.out.print(root.data+":");

        if(root.children!=null){
            for(GenericTree<Integer>child: root.children){
                System.out.print(child.data+" ");
            }
            System.out.println();
            for(GenericTree<Integer> root1:root.children){
                printTree(root1);
            }
        }
    }
    public static int countNode(GenericTree<Integer>root){
        int res = 0;
        if(root!=null){
            res++;
            if(root.children!=null){
                for(GenericTree<Integer>child: root.children){
                    res+=countNode(child);
                }

            }
        }
        return res;
    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        GenericTree<Integer> root = new GenericTree<>(4);
        GenericTree<Integer> node1 = new GenericTree<>(2);
        GenericTree<Integer> node2 = new GenericTree<>(3);
        GenericTree<Integer> node3 = new GenericTree<>(1);
        GenericTree<Integer> node4 = new GenericTree<>(5);
        GenericTree<Integer> node5 = new GenericTree<>(6);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);
        node2.children.add(node5);
        printTree(root);
        System.out.println("Number of Nodes: "+countNode(root));
    }


}