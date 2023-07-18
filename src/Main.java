public class Main {
    public static void main(String[] args) {
            Girl girl = new Girl("Maral","Bakytova",2002,"female");
            Boy boy = new Boy("Nurjigit","Mederbekov",1994,"male");
            if (2023-girl.getYearOfBirth()> 2023-boy.getYearOfBirth()){
                System.out.println(girl);
            } else if (2023-girl.getYearOfBirth()== 2023-boy.getYearOfBirth()) {
                System.out.println("Barabar");
            }else {
                System.out.println(boy);

            }
    }
}