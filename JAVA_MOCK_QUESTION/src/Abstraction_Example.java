abstract class Jspiders {
    void courseDetails() {
        String s[] = {"HTML, CSS, JS, ReactJS", "CORE JAVA, ADVANCE JAVA", "SQL"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    abstract void contactDetails();

    abstract void locationDetails();
}

class JspidersBTM extends Jspiders {
    @Override
    void locationDetails() {
        System.out.println("BTM LAYOUT");
    }

    @Override
    void contactDetails() {
        System.out.println("9576704073");
    }
}

public class Abstraction_Example {
    public static void main(String[] args) {
        JspidersBTM b1 = new JspidersBTM();
        b1.courseDetails();
        b1.contactDetails();
        b1.locationDetails();
    }
}
