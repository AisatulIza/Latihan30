package pkgLatihan30;
import java.util.Scanner;
/**
* author
* Nama              : A`isatul Iza
* Nim                  : 22166008
* Deskripsi        : Program ini adalah program yang menampilkan pertanyaan dan jawaban tentang tugas latihan 17-30
*/
public class SIRegPagi22166008Latihan30 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("\u001b[31mKamu \u001b[32mngerjain sendiri \u001b[33mlatihan 17 sampe \u001b[34mlatihan 30 ini? \u001b[0m");
    //input jawaban
    System.out.print("\u001b[34mJawab \u001b[31m(Yoi/Enggak) \u001b[0m: ");
    String jawab = scanner.next();
    //pernyataan if else 2 kemungkinan
    if (jawab.equals("Yoi")) {
        System.out.println("\n\u001b[31mCakep Bener. \u001b[35mGood Job \u001b[0m");
    } else {
        System.out.println("\n\u001b[31mTetep cakep sih.\u001b[36mSing penting paham konsep nya yee.\u001b[0m");
        System.out.println("Keep the code works dude");
    }
  }
}
