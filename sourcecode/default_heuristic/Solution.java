package hadzakee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

    static List<Street> streets = new ArrayList<>();
    static List<Car> cars = new ArrayList<>();
    static List<String> answers = new ArrayList<>();

    static int D, I, S, V, F;

    public static void main(String[] args) throws FileNotFoundException {
        getInput();

        for (int i=0; i<I; i++) {

            int points=-1;
            String name=null;
            final int intersection = i;
            List<Street> valid = streets.stream().filter(street -> street.getEnd() == intersection).collect(Collectors.toList());

            for (Street street : valid) {
                if (street.getPoints() > points) {
                    points = street.getPoints();
                    name = street.getName();
                }
            }

            answers.add(name);

        }


        System.out.println(answers.size());
        for (int i=0; i<I; ++i) {
            System.out.println(i);
            System.out.println(1);
            System.out.println(answers.get(i) + " " + D);
        }




    }









    public static void getInput() throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\Desktop\\Practice\\src\\hadzakee\\B.txt");
        Scanner sc = new Scanner(file);

        D = sc.nextInt();
        I = sc.nextInt();
        S = sc.nextInt();
        V = sc.nextInt();
        F = sc.nextInt();

        for (int i=0; i<S; ++i) {
            int b, e; b = sc.nextInt();
            e = sc.nextInt();
            String name = sc.next();
            int time = sc.nextInt();
            streets.add(new Street(name, b, e, time));
        }

        for (int i=0; i<V; ++i) {
            int n = sc.nextInt();
            List<Street> path = new ArrayList<>();
            for (int j=0; j<n; ++j) {
                final String name = sc.next();
                Optional<Street> match = streets.stream().filter(street -> street.getName().equalsIgnoreCase(name)).findFirst();
                if (!match.isEmpty()) {
//                    path.add(match.get());
                    match.get().addPoint();
                }
            }
//            cars.add(new Car(n, path));
        }
    }

}
