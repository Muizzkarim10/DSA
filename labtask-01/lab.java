import java.util.Scanner;

class NTS {
    int std_id;
    String std_name;
    int marks_obt;
    String address;
    NTS first, pre, cur, next;

    NTS() {
        first = null;
        pre = null;
        cur = null;
        next = null;

    }

    NTS(int id, String name, int marks, String addr) {
        std_id = id;
        std_name = name;
        marks_obt = marks;
        address = addr;
        first = null;
    }

    void insert(int id, String name, int marks, String addr) {
        NTS newNode = new NTS(id, name, marks, addr);

        if (first == null) {
            first = newNode;
            return;
        }

        NTS temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.pre = temp;
    }

    int size() {
        int count = 0;
        NTS temp = first;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void count_pass_fail() {
        int pass = 0;
        int fail = 0;
        NTS temp = first;

        while (temp != null) {
            if (temp.marks_obt > 50) {
                pass++;
            }

            if (temp.marks_obt <= 50) {
                fail++;
            }

            temp = temp.next;
        }
        System.out.println("Passed students: " + pass);
        System.out.println("Failed students: " + fail);
    }

    void delete_failed() {
        NTS temp = first;

        while (temp != null) {
            NTS nextNode = temp.next;
            if (temp.marks_obt < 50) {
                if (temp == first) {
                    first = temp.next;
                    if (first != null) {
                        first.pre = null;
                    }
                } else {
                    if (temp.pre != null) {
                        temp.pre.next = temp.next;
                    }
                    if (temp.next != null) {
                        temp.next.pre = temp.pre;
                    }
                }

                temp.next = null;
                temp.pre = null;
            }
            temp = nextNode;
        }
    }

    void delete_first() {
        NTS temp = first;
        int id = 0;

        while (temp != null) {
            id = temp.std_id;
            if (temp.marks_obt < 50) {
                if (temp == first) {
                    first = temp.next;
                    if (first != null) {
                        first.pre = null;
                    }
                } else {
                    if (temp.pre != null) {
                        temp.pre.next = temp.next;
                    }
                    if (temp.next != null) {
                        temp.next.pre = temp.pre;
                    }
                }

                temp.next = null;
                temp.pre = null;
                System.out.println("First occurrence at " + id + " deleted:");
                return;
            }
            temp = temp.next;
        }
    }

    void kthElementInfo(int k) {
        int count = 1;
        NTS temp = first;
        while (temp != null) {
            if (count == k) {
                System.out.println("Student ID: " + temp.std_id);
                System.out.println("Name: " + temp.std_name);
                System.out.println("Marks: " + temp.marks_obt);
                System.out.println("Address: " + temp.address);
                return;
            }
            temp = temp.next;
            count++;
        }
        System.out.println("No such element exists.");
        System.exit(1);
    }

    void deletekthElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        int count = 1;
        NTS temp = first;
        sc.close();

        while (temp != null) {
            if (count == k) {
                if (temp == first) {
                    first = temp.next;
                    if (first != null) {
                        first.pre = null;
                    }
                } else {
                    if (temp.pre != null) {
                        temp.pre.next = temp.next;
                    }
                    if (temp.next != null) {
                        temp.next.pre = temp.pre;
                    }
                }

                temp.next = null;
                temp.pre = null;
                System.out.println(k + "th element deleted.");
                return;
            }
            temp = temp.next;
            count++;
        }
        System.out.println("No such element exists.");
    }

    void divided_list() {
        int count = 0;
        NTS temp = first;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int mid = count / 2;

        NTS firstList = first;
        temp = first;
        for (int i = 1; i < mid; i++) {
            temp = temp.next;
        }

        NTS secondList = temp.next;
        if (secondList != null) {
            secondList.pre = null;
        }
        temp.next = null;
        System.out.println("First sublist:");
        printList(firstList);

        System.out.println("Second sublist:");
        printList(secondList);
    }

    void printList(NTS head) {
        NTS temp = head;
        while (temp != null) {
            System.out.println(temp.std_id + " " + temp.std_name + " " + temp.marks_obt + " " + temp.address);
            temp = temp.next;
        }

    }

    void mergeLists(NTS other) {
        if (other == null || other.first == null) {
            return;
        }

        if (first == null) {
            first = other.first;
        }

        NTS temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = other.first;
        other.first.pre = temp;
    }

    void insertNode(int id, String name, int marks, String addr) {
        NTS temp = first;
        while (temp != null) {
            if (temp.std_id == id) {
                System.out.println("Error: Student with ID " + id + " already exists in the list.");
                return;
            }
            temp = temp.next;
        }

        NTS newNode = new NTS(id, name, marks, addr);

        if (first == null) {
            first = newNode;
            return;
        }

        temp = first;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.pre = temp;

        System.out.println("New Student Added");
    }

}

public class lab {
    public static void main(String[] args) {
        NTS list = new NTS();
        list.insert(1, "Muizz", 85, "Danyore");
        list.insert(2, "Aryan", 90, "Danyore");
        list.insert(3, "Irfan", 78, "Hunza");
        list.insert(4, "Sohail", 45, "Hunza");
        list.insert(5, "Sohail", 65, "Hunza");

        // System.out.println("Total number of students: " + list.size());
        // list.count_pass_fail();

        // list.delete_failed();
        // System.out.println("Students After deletion: " + list.size());

        // list.delete_first();
        // list.divided_list();
        list.insertNode(1, "Moin", 20, "Danyore");
        list.printList(list.first);
    }
}