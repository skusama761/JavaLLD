package Builder;public class Client {
    public static void main(String[] args) {
//        Builder builder = Student.getBuilder();
//        builder.setName("Usama");
//        builder.setAge(24);
//        builder.setGradYear(2021);
//        builder.setBatch("2024");
//        builder.setUniversityName("STRM");
//        builder.setPhoneNo("9922");
//        builder.setPsp(86);
//
//        Student S1 = builder.build();

    Student st = Student.getBuilder().setName("Usama").setAge(24).setGradYear(2021).setBatch("2024").setUniversityName("SRTM").setPhoneNo("9922").setPsp(86).build();

        System.out.println("DEBUG");
    }
}
