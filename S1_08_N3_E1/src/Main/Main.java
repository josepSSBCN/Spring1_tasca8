package Main;

import ClassPackage.Alumne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumne> myAlumneList = new ArrayList<>(Arrays.asList(
                new Alumne("Andreu", (byte) 17, "PHP", (byte) 6),
                new Alumne("Cristòfol", (byte) 45, "JAVA", (byte) 10),
                new Alumne("Albert", (byte) 35, "ANGULAR", (byte) 4),
                new Alumne("Salvador", (byte) 16, "REACT", (byte) 3),
                new Alumne("Antoni", (byte) 17, "JAVA", (byte) 9),
                new Alumne("Yuri", (byte) 25, "JAVASCRIPT", (byte) 7),
                new Alumne("Jesus", (byte) 34, "PHP", (byte) 5),
                new Alumne("Marie", (byte) 17, "REACT", (byte) 6),
                new Alumne("Sandford", (byte) 55, "JAVA", (byte) 4),
                new Alumne("Nikola", (byte) 27, "JAVA", (byte) 5),
                new Alumne("Steve", (byte) 21, "JAVA", (byte) 9),
                new Alumne("", (byte) 0, "JAVA", (byte) 0),
                new Alumne("", (byte) -1, "", (byte) -1)
        ));


        System.out.println(" 1) Mostra nom alumne i nota: ");
        System.out.println(showData(myAlumneList));

        System.out.println(" 2) Filtre per primera lletra 'a': ");
        System.out.println(filterA(myAlumneList));

        System.out.println(" 3) Filtre alumnes amb nota igual o superior a 5");
        System.out.println(filterNoteUp5(myAlumneList));

        System.out.println(" 4) Filtre alumenes amb nota igual o superior a 5 i no son del curs PHP") ;
        System.out.println(filterNoteUp5NoPHP(myAlumneList));

        System.out.println(" 5) Filtre alumnes del curs JAVA i tenen 18 o més anys");
        System.out.println(filterOnlyJavaAgeUp18(myAlumneList));

    }


    public static String showData(ArrayList<Alumne> myAlumnes){

        return myAlumnes.stream()
                .filter(Objects::nonNull)
                .filter(p-> p.getName().length()>0)
                .filter(p-> p.getCurse().length()>0)
                .map(p->p.getName()+":"+p.getNote())
                .collect(Collectors.joining(" \\ "));

    }

    public static List<Alumne> filterA(ArrayList<Alumne>myAlumneList){
        return myAlumneList.stream()
                .filter(Objects::nonNull)
                .filter(p->p.getName().length()>0)
                .filter(p->p.getCurse().length()>0)
                .filter(p->p.getName().substring(0,1).contains("A"))
                .collect(Collectors.toList());
    }

    public static List<Alumne> filterNoteUp5(ArrayList<Alumne> myAlumneList){
        return myAlumneList.stream()
                .filter(Objects::nonNull)
                .filter(p-> p.getNote()>=5)
                .collect(Collectors.toList());
    }

    public static List<Alumne> filterNoteUp5NoPHP(ArrayList<Alumne>myAlumneList){
        return myAlumneList.stream()
                .filter(Objects::nonNull)
                .filter(p->p.getNote()>=5)
                .filter(p-> !p.getCurse().equals("PHP"))
                .collect(Collectors.toList());
    }

    public static List<Alumne> filterOnlyJavaAgeUp18(ArrayList<Alumne>myAlumneList){
        return myAlumneList.stream()
                .filter(Objects::nonNull)
                .filter(p-> p.getCurse().equals("JAVA"))
                .filter(p->p.getAge()>=18)
                .collect(Collectors.toList());
    }

}