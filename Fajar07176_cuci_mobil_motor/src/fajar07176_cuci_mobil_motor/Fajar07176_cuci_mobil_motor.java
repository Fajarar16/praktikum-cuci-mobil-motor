package fajar07176_cuci_mobil_motor;
import java.util.ArrayList;
import java.util.Scanner;

public class Fajar07176_cuci_mobil_motor {
     ArrayList <fajar07176_MotorEntity> datamotor = new ArrayList();
     ArrayList <fajar07176_MobilEntity> datamobil = new ArrayList();
     Scanner input = new Scanner(System.in);
    
public static void main(String[] args) {
    Fajar07176_cuci_mobil_motor data07176 = new Fajar07176_cuci_mobil_motor(); 
    System.out.println("Selamat Datang di tempat cuci motor&mobil");
    int fajar07176_pilih;
    do{
        System.out.println("Pilih Menu :");
        System.out.println("1. Cuci Motor");
        System.out.println("2. Cuci Mobil");
        System.out.println("3. Tampilkan Data");
        System.out.println("4. Hapus Data");
        System.out.println("5. Update Data");
        System.out.println("6. Exit");
        System.out.println("Pilih = ");
        fajar07176_pilih = data07176.input.nextInt();
        switch(fajar07176_pilih){
            
                case 1 : data07176.fajar07176_dataMotor();
                         break;
                case 2 : data07176.fajar07176_dataMobil();
                         break;
                case 3 : System.out.println("Tampilan data cuci motor&mobil");
                         data07176.fajar07176_tampilkandata();
                         break;
                case 4 : data07176.fajar07176_hapusData();
                         break;
                case 5 : data07176.fajar07176_updateData();
                         break;
                }
        }while(fajar07176_pilih!=6);
  }  
     void fajar07176_dataMotor(){
        System.out.print("Masukan Nomer motor: ");
        String fajar07176_nomormotor = input.next();
        System.out.print("Masukan Pemilik motor: ");
        String fajar07176_pemilikmotor = input.next();
        System.out.print("Masukan Merek motor: ");
        String fajar07176_merekmotor = input.next();
        System.out.print("Masukan warna motor: ");
        String fajar07176_warnamotor = input.next();
        datamotor.add(new fajar07176_MotorEntity(fajar07176_nomormotor,fajar07176_pemilikmotor,
        fajar07176_merekmotor,fajar07176_warnamotor));
    }
    void fajar07176_dataMobil(){
        System.out.println("Masukan Nomer Mobil");
        String fajar07176_nomormobil = input.next();
        System.out.println("Masukan Pemilik Mobil");
        String fajar07176_pemilikmobil = input.next();
        System.out.println("Masukan Merek Mobil");
        String fajar07176_merekmobil = input.next();
        System.out.println("Masukan Warna Mobil");
        String fajar07176_warnamobil = input.next();
        datamobil.add(new fajar07176_MobilEntity(fajar07176_nomormobil,fajar07176_pemilikmobil,
        fajar07176_merekmobil,fajar07176_warnamobil));
    }
    void fajar07176_tampilkandata(){
        for (int i=0; i<datamotor.size(); i++){
            System.out.println("Data Motor ke : "+(i));
            System.out.println("Nomor motor : "+datamotor.get(i).getfajar07176_nomormotor());
            System.out.println("Pemilik motor : "+datamotor.get(i).getfajar07176_pemilikmotor());
            System.out.println("Merek motor : "+datamotor.get(i).getfajar07176_merekmotor());
            System.out.println("warna motor : "+datamotor.get(i).getfajar07176_warnamotor());
            System.out.println();
            }
        for (int i=0; i<datamobil.size(); i++){
            System.out.println("Data Mobil ke : "+(i));
            System.out.println("Nomor Mobil : "+datamobil.get(i).getfajar07176_nomormobil());
            System.out.println("Pemilik Mobil : "+datamobil.get(i).getfajar07176_pemilikmobil());
            System.out.println("Merek Mobil : "+datamobil.get(i).getfajar07176_merekmobil());
            System.out.println("Warna Mobil : "+datamobil.get(i).getfajar07176_warnamobil()); 
            System.out.println();
        }
    }
    void fajar07176_hapusData(){
            String fajar07176_nomormotor,fajar07176_nomormobil;
            int fajar07176_pilih;
            System.out.println("1. Data Motor");
            System.out.println("2. Data Mobil");
            System.out.print("pilih data : ");
            fajar07176_pilih = input.nextInt();
            switch(fajar07176_pilih){
                case 1 : System.out.print("Pilih nomer yang dihapus: ");
                         fajar07176_nomormotor = input.next();
                         for (int i=0; i<datamotor.size(); i++){
                            if(fajar07176_nomormotor.equals(datamotor.get(i).getfajar07176_nomormotor())){
                                datamotor.remove(i);
                                System.out.println("Data telah terhapus");
                            }
                        }break;
                case 2 : System.out.print("Pilih nomer yang dihapus: ");
                         fajar07176_nomormobil = input.next();
                         for (int i=0; i<datamobil.size(); i++){
                            if(fajar07176_nomormobil.equals(datamobil.get(i).getfajar07176_nomormobil())){
                                datamobil.remove(i);
                                System.out.println("Data telah terhapus");
                            }
                        }break;
            }
    }
    void fajar07176_updateData(){
        int update;
        String nomor07176,nama07176,merek07176,warna07176;
        System.out.print(" Masukkan jenis kendaraan anda (roda2/roda4) : ");
        String jenis = input.next();
        if(jenis.equals("roda2")){
            for(int i=0;i<datamotor.size();i++){
                System.out.println("Data Motor ke : "+(i));
                System.out.println(" nomor motor  : " + datamotor.get(i).getfajar07176_nomormotor());
                System.out.println(" nama pemilik : " + datamotor.get(i).getfajar07176_pemilikmotor());
                System.out.println(" merek        : " + datamotor.get(i).getfajar07176_merekmotor());
                System.out.println(" warna        : " + datamotor.get(i).getfajar07176_warnamotor());
            }
                System.out.println("");
                System.out.println("ingin menganti data index ke : ");
                update = input.nextInt();
                System.out.println("Masukkan data baru: ");
                System.out.print("Masukan nomor: ");nomor07176 = input.next();
                datamotor.get(update).fajar07176_nomormotor=nomor07176;
                System.out.print("Masukan nama: ");nama07176 = input.next();
                datamotor.get(update).fajar07176_pemilikmotor=nama07176;
                System.out.print("Masukan merek: ");merek07176 = input.next();
                datamotor.get(update).fajar07176_merekmotor=merek07176;
                System.out.print("Masukan warna: ");warna07176 = input.next();
                datamotor.get(update).fajar07176_warnamotor=warna07176;
             
               
        }else if(jenis.equals("roda4")){
            for(int i=0;i<datamobil.size();i++){
                System.out.println("Data Mobil ke : "+(i));
                System.out.println(" nomor mobil  : " + datamobil.get(i).getfajar07176_nomormobil());
                System.out.println(" nama pemilik : " + datamobil.get(i).getfajar07176_pemilikmobil());
                System.out.println(" merek        : " + datamobil.get(i).getfajar07176_merekmobil());
                System.out.println(" warna        : " + datamobil.get(i).getfajar07176_warnamobil());
            }
                System.out.println("");
                System.out.println("ingin menganti data index ke : ");
                update = input.nextInt();
                System.out.println("Masukkan data baru: ");
                System.out.print("Masukan nomor: ");nomor07176 = input.next();
                datamobil.get(update).fajar07176_nomormobil=nomor07176;
                System.out.print("Masukan nama: ");nama07176 = input.next();
                datamobil.get(update).fajar07176_pemilikmobil=nama07176;
                System.out.print("Masukan merek: ");merek07176 = input.next();
                datamobil.get(update).fajar07176_merekmobil=merek07176;
                System.out.print("Masukan warna: ");warna07176 = input.next();
                datamobil.get(update).fajar07176_warnamobil=warna07176;
        }
    }
}