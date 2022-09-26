package DataStrucTure;

class LinkedList2 extends LinkedList {

    LinkedList2(Node node){
        this.head = node;
    }

    //연결 리스트에 데이터 추가
    //before_data가 null인경우, 가장 뒤에 추가
    //befor_data에 값이 있는경우, 해당 값을 가진 노드 앞에 추가

    public void addData(int data, Integer beforeData){
        if(this.head == null){
            this.head = new Node(data, null);
        }else if(beforeData == null){
            Node cur = this.head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        }else{
            Node cur = this.head;
            Node pre = cur;
            while(cur != null){
                if(cur.data == beforeData){
                    if(cur == this.head){
                        this.head = new Node(data, this.head);
                    }  else{
                        pre.next = new Node(data, cur);
                    }
                    break;
                }
            }
        }
    }
}

public class Practice1 {
    public static void main(String[] args) {

    }
}
