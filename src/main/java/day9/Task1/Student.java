package day9.Task1;

class Student extends Human {
    private String groupName;
    private String profession="студент";

    public String getGroupName(){return groupName;}
    public String getProfession(){
       return profession;
    }

    public Student(String name, String groupName){
        super(name);
        this.groupName=groupName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Это студент по имени "+getName());
    }
}
