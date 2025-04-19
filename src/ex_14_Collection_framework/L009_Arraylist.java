package ex_14_Collection_framework;

public class L009_Arraylist {
    class Employ {


        private String name;
        private String rollNo;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRollNo() {
            return rollNo;
        }

        public void setRollNo(String rollNo) {
            this.rollNo = rollNo;
        }

        public Employ(String name, String rollNo) {
            this.name = name;
            this.rollNo = rollNo;


        }

        @Override
        public String toString() {
            return "L009_arraylist{" +
                    "name='" + name + '\'' +
                    ", rollNo='" + rollNo + '\'' +
                    '}';
        }

        public void printDetails() {
            System.out.println("student name:" + this.name);
            System.out.println("student rollNo:" + this.rollNo);

        }
    }
}