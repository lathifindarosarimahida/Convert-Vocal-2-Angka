package jobsheet11;
import java.util.Scanner;
public class ConvertVocal2Angka {  
    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vocal Ke angka}\n");
        
    }
    public static void main(String identitas)  {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vocal Ke angka)\n");
      
    }
    public static void main(String[] args) {
    String identitas = "Lathifinda Rosari Mahida / X RPL 2 / 19";
        
    tampilJudul(identitas);        
    }
    private static String tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        return kalimat;
    }
}
    