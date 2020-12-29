import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        People people = new People();

        int input;
        do {
            System.out.println("1: Thêm người thuê phòng");
            System.out.println("2: Hiển thị thông tin người thuê");
            System.out.println("3: Trả phòng");
            System.out.println("0: Exit");
            input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    people.addPeople();
                    break;
                case 2:
                    people.showPeople();
                    break;
                case 3:
                    people.totalPrice();
            }
        }
        while (input != 0);
    }
}