package codeforces.difficulty800;

import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int polyhedrons = scanner.nextInt();
        scanner.nextLine();

        int faces = 0;
        for (int i = 0; i < polyhedrons; i++) {
            String polyhedron = scanner.nextLine();

            if (polyhedron.startsWith("T")) {
                faces += 4;
            } else if (polyhedron.startsWith("C")) {
                faces += 6;
            } else if (polyhedron.startsWith("O")) {
                faces += 8;
            } else if (polyhedron.startsWith("D")) {
                faces += 12;
            } else if (polyhedron.startsWith("I")) {
                faces += 20;
            }
        }

        System.out.println(faces);

    }
}
