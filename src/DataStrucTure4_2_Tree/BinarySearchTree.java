package DataStrucTure4_2_Tree;


import java.util.LinkedList;
import java.util.Queue;

 class Node{
    int key;
    Node left;
    Node right;

    Node(int key, Node left, Node right){
        this.key = key;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {
    Node head;

    BinarySearchTree(int key){
        this.head = new Node(key , null, null);
    }

    public void addNode(int key){
        if(this.head == null){
            this.head = new Node(key, null, null);
        }else{
            Node cur = this.head;

            while(true){
                Node pre = cur;
                if(key < cur.key){
                    cur = cur.left;
                    if(cur == null){
                        pre.left = new Node(key, null, null);
                        break;
                    }
                }else{
                    cur = cur.right;

                    if(cur == null){
                        pre.right = new Node(key, null, null);
                        break;
                    }
                }
            }
        }
    }

    public void removeNode(int key){
        Node parent = null; // 부모노드를 가리킴
        Node successor = null; // 지우려는 대상의 노드에 새로운 null값을 넣어줌.
        Node predecessor = null; // successor의 부모를 가리킬 노드
        Node child = null; // successor의 child가 있는지 없는지 확인해볼 변수

        Node cur = this.head;
        while(cur != null){
            if(key == cur.key){
                break;
            }

            parent = cur;
            if(key < cur.key){
                cur = cur.left;
            }else{
                cur = cur.right;
            }
        }

        if(cur == null){
            System.out.println("key에 해당하는 노드가 없습니다.");
            return;
        }

        if(cur.left == null && cur.right == null){ // leaf노드인 경우
            if(parent == null){ // 노드가 한개밖에 없는 케이스
                this.head = null; // 삭제하여 없는것으로 함.
            }else{
                if(parent.left == cur){
                    parent.left = null;
                }else{
                    parent.right = null;
                }
            }
        }else if(cur.left != null && cur.right == null || cur.left == null && cur.right != null){ // 자식노드가 하나인 경우
            if(cur.left != null){
                child = cur.left;
            }else{
                child = cur.right;
            }

            if(parent == null){ // root노드의 자식노드가 1개만있는 트리라면
                this.head = child;
            }else{ // 그게아니라 root노드의 자식노드가 2개이상 있다면
                if(parent.left == cur){
                    parent.left = child;
                }else{
                    parent.right = child;
                }
            }
        }else{ // 자식노드가 둘인경우
                predecessor = cur; // 찾아진 key값이 cur.key값인것을 인지하고있어야함.
                successor = cur.left;

                while(successor.right != null){
                    predecessor = successor; // 여기서의 successor은 뒤의 successor보다 조금 작은값.
                    successor = successor.right;
                }

                predecessor.right = successor.left; // 여기서의 successor은 가장 큰값임.(successor.right = null임, left는 가장큰값보다 조금작은값, 그러나 위의successor보단 큼(predessessor보단))
                successor.left = cur.left;
                successor.right = cur.right;

                if(parent == null){
                    this.head = successor;
                }else{
                    if(parent.left == cur){
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                }

        }
    }

    public void levelOrder(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node cur = queue.poll();

            System.out.print(cur.key + " ");
            if(cur.left != null){
                queue.offer(cur.left);
            }
            if(cur.right != null){
                queue.offer(cur.right);
            }
        }
        System.out.println();
    }

}

class Main{
    public static void main(String[] args) {
//        Test code
//        노드 삽입
        BinarySearchTree bst = new BinarySearchTree(20);
        bst.addNode(10);
        bst.addNode(30);
        bst.addNode(1);
        bst.addNode(15);
        bst.addNode(25);
        bst.addNode(13);
        bst.addNode(35);
        bst.addNode(27);
        bst.addNode(40);
    }
}