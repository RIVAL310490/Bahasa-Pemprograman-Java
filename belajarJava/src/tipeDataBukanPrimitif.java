import java.util.Scanner;
public class tipeDataBukanPrimitif {
    public static void main(String[] args) {

/*
Tipe Data Bukan Primitif
* Tipe data primitif adalah tipe bawaan di dalam bahasa pemprograman. Tipe data primitif tidak bisa diubah lagi.
* Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif selalu memiliki default value.
* Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null.
* Di Java, semua tipe data primitif memiliki representasi  tipe data bukan primitifnya.
 */

/*
Representasi Tipe Data Primitif (1)
Tipe Data Primitif    / Tipe Data Bukan Primitif // tipe data bukan primitif default value null
byte                  / Byte
short                 / Short
int                   / Integer
long                  / Long
float                 / Float
double                / Double
char                  / Character
boolean               / Boolean
 */

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        int iniInt = 100;
        Integer iniObject = iniInt;
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();

        Long amount = 100000000L;
        Integer angka = 19;
        int angka2 = angka.intValue();
        System.out.println(angka2);

        }


    }

