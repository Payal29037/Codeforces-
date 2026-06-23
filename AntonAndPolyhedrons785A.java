import java.util.Scanner;
public class AntonAndPolyhedrons785A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int totalFaces = 0;
        
        for (int i = 0; i < n; i++) {
            String polyhedron = scanner.next();
            switch (polyhedron) {
                case "Tetrahedron":
                    totalFaces += 4;
                    break;
                case "Cube":
                    totalFaces += 6;
                    break;
                case "Octahedron":
                    totalFaces += 8;
                    break;
                case "Dodecahedron":
                    totalFaces += 12;
                    break;
                case "Icosahedron":
                    totalFaces += 20;
                    break;
            }
        }
    
        System.out.println(totalFaces);
        scanner.close();
    }
}
