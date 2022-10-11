import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner intscanner = new Scanner(System.in);
	int km,yas,tip;
	double yindirim,gdindirim;
	double gdindirimoran=0,yindirimoran,tutar,btutar = 0.10;


	System.out.println("Mesafeyi km türünden giriniz: ");
	km = intscanner.nextInt();
	System.out.print("Yaşınızı giriniz: ");
	yas = intscanner.nextInt();
	System.out.println("yolculuk tipini giriniz\n1 => Tek Yön\n2 => Gidiş Dönüş\n ");

	tip = intscanner.nextInt();


	if(0<=yas&&yas<12){yindirimoran=0.50;}
	else if(12<=yas&&yas<=24){yindirimoran=0.10;}
	else if(65<=yas){yindirimoran=0.30;}
	else{yindirimoran=0;}

	if(tip==1){gdindirimoran=0;}
	else if(tip==2){gdindirimoran=0.20;}

	tutar = btutar*km;
	yindirim =tutar * yindirimoran;
	tutar = tutar - yindirim;
	gdindirim = tutar * gdindirimoran;

	if(yas>=0&&km>0) {
		switch (tip) {
			case 1:
				System.out.println("Toplam Tutar = " + tutar + " TL");
				break;
			case 2:
				tutar = (tutar - gdindirim) * 2;
				System.out.println("Toplam Tutar = " + tutar+" TL");
				break;
			default:
				System.out.println("Hatalı veri girdiniz.");
		}
	}
	else{System.out.println("Hatalı veri girdiniz.");}


    }
}
