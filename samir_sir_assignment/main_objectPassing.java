package samir_sir_assignment;

class adress {

    public String recipient;
    public String adress_line_1;
    public String adress_line_2;
    public String district;
    public String post_code;
    public String country;

    void setadress(String rec, String add1, String add2, String dis, String post, String coun) {
        recipient = rec;
        adress_line_1 = add1;
        adress_line_2 = add2;
        district = dis;
        post_code = post;
        country = coun;
    }
    String printAdress() {
        return (recipient + System.lineSeparator()
                + adress_line_1 + System.lineSeparator()
                + adress_line_2 + System.lineSeparator()
                + district + System.lineSeparator()
                + post_code + System.lineSeparator()
                + country);
    }
    @Override
    public String toString() {
        return (recipient + System.lineSeparator()
                + adress_line_1 + System.lineSeparator()
                + adress_line_2 + System.lineSeparator()
                + district + System.lineSeparator()
                + post_code + System.lineSeparator()
                + country);
    }
}

public class main_objectPassing {

    public static void main(String[] args) {
        adress Himel_add = new adress();
        
        Himel_add.setadress("Humayun Kabir", "House - 12, Road - 25,", "Section 11, Mirpur", "Dhaka", "1216", "Bangladesh");

//        Himel_add.recipient = "Humayun Kabir";
//        Himel_add.adress_line_1 = "House - 12, Road - 25,";
//        Himel_add.adress_line_2 = "Section 11, Mirpur";
//        Himel_add.district = "Dhaka";
//        Himel_add.post_code = "1216";
//        Himel_add.country = "Bangladesh";

//        Himel_add.setadress("Himel", "#12/25", "Mirpur-11", "Dhaka", "Dhaka", "Bangladesh");
//        System.out.println(Himel_add.recipient + System.lineSeparator()
//                + Himel_add.adress_line_1 + System.lineSeparator()
//                + Himel_add.adress_line_2 + System.lineSeparator()
//                + Himel_add.district + System.lineSeparator()
//                + Himel_add.post_code + System.lineSeparator()
//                + Himel_add.country);
        System.out.println(Himel_add);
    }
}
