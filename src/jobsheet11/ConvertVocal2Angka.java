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
    private static String vocal2Angka(String kalimat) {
        char [] [] arConvert =
        {{'a','4'},{'i','1'},{'u','2'},{'e','3'},{'o','0'}};
        
        kalimat = kalimat.toLowerCase();
        for(int i=0;i<arConvert.length;i++)
            kalimat = kalimat.replace(arConvert[i][0], arConvert[i][1]);
        
        return kalimat;
}
    private static void tampilPerKata(String kalimat, String convert) {
        String[] arrKal = kalimat.split(" ");
        String[] arrCon = convert.split(" ");
        
        for(int i=0;i<arrKal.length;i++)
            System.out.println(arrKal[i]+" => "+arrCon[i]);
}
    private static void tampilHasil(String convert) {
        System.out.println("Kalimat Alay Angka : " + convert);
}
}