public class Code8 {

    String name;
    String idNumber;
    String major;

    
    public Code8(String name, String idNumber, String major) {
        this.name = name;
        this.idNumber = idNumber;
        this.major = major;
    }

    public String getInfo() {
        return name + ", ID: " + idNumber + ", Major: " + major;
    }

    public static void main(String[] args) {
        Code8 s1 = new Code8("Abc", "101", "CSE");
        Code8 s2 = new Code8("def", "102", "CSE");
        Code8 s3 = new Code8("xyz", "103", "ECE");

        System.out.println(s1.getInfo());
        System.out.println(s2.getInfo());
        System.out.println(s3.getInfo());
    }
}
