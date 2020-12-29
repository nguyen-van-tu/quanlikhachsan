import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.String.valueOf;

public class People {
    private String name;
    private String phone;
    private String DateOfBirth;
    private int id;
    private Hotel hotel;

    public People(String name, String phone, String dateOfBirth, int id, Hotel hotel) {
        this.name = name;
        this.phone = phone;
        this.DateOfBirth = dateOfBirth;
        this.id = id;
        this.hotel = hotel;
    }

    public People() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public String setPhone(String phone) {
        this.phone = phone;
        return phone;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Người thuê :" + '\'' +
                "Tên: " + name + '\'' +
                ", Số điện thoại: " + phone + '\'' +
                ", Ngày sinh: " + DateOfBirth + '\'' +
                ", Chứng minh thư: " + id;
    }

    ArrayList<People> peopleArrayList = new ArrayList<>();

    public void addPeople() {
        Scanner sc = new Scanner(System.in);
        People people = new People();
        Hotel hotel = new Hotel();

        System.out.println("Nhập tên khách: ");
        people.setName(sc.nextLine());
        System.out.println("Nhập SĐT: ");
//
        boolean checkPhone = false;
        do {
            String s = people.setPhone(sc.nextLine());
            String regex = "^(09|01[2|6|8|9])+([0-9]{8})\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(s);
            if (matcher.find()){
                setPhone(s);
                checkPhone = true;
            }else {
                System.out.println("Nhập lại sđt");
            }
        }while (!checkPhone);

        System.out.println("Nhập ngày sinh: ");
        people.setDateOfBirth(sc.nextLine());
        System.out.println("Nhập số cmt: ");
        people.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập số ngày thuê: ");
        hotel.setNum(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập giá: ");
        hotel.setPrice(Integer.parseInt(sc.nextLine()));

        people.setHotel(hotel);
        peopleArrayList.add(people);
    }

    public void showPeople() {
        for (People p : peopleArrayList) {
            System.out.println(p.toString());
        }
    }

    public void totalPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cmt khách trả phòng");
        int id = sc.nextInt();


        People people1 = null;
        for (People p : peopleArrayList) {
            if (id == getId()) {
                int price = people1.getHotel().getPrice(Integer.parseInt(sc.nextLine())) * people1.getHotel().getNum();
                System.out.println("Tổng giá phòng là: " + price + " VNĐ");
            }
        }
//          (people1 == null) {
//            System.out.println("Mời nhập lại");
//        }
    }

}

