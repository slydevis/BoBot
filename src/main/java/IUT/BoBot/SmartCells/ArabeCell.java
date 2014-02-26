package IUT.BoBot.SmartCells;

/**
 * Created by p12003701 on 26/02/14.
 */
public class ArabeCell {

        public String decode (int nombre) {
            String Chaine = "";
            int multiple;

            if (nombre > 1000) {

            multiple = (nombre - nombre%1000) / 1000;
            for (int i = 0; i < multiple ; ++i) {
                Chaine = Chaine + 'M';
            }

            nombre = nombre%1000;
            }

            if (nombre > 100) {
            multiple = (nombre - nombre%100) / 100;
            switch (multiple) {
                case 9:
                    Chaine = Chaine + 'C' + 'M';
                    break;
                case 8:
                    Chaine = Chaine + 'D' + 'C' + 'C' + 'C';
                    break;
                case 7:
                    Chaine = Chaine + 'D' + 'C' + 'C';
                    break;
                case 6:
                    Chaine = Chaine + 'D' + 'C';
                    break;
                case 5:
                    Chaine = Chaine + 'D';
                    break;
                case 4:
                    Chaine = Chaine + 'C' + 'D';
                    break;
                case 3:
                    Chaine = Chaine + 'C' + 'C' + 'C';
                    break;
                case 2:
                    Chaine = Chaine + 'C' + 'C';
                    break;
                case 1:
                    Chaine = Chaine + 'C';
                    break;
            }

            nombre = nombre%100;
            }

            if (nombre > 10) {
            multiple = (nombre - nombre%10) / 10;
            switch (multiple) {
                case 9:
                    Chaine = Chaine + 'X' + 'C';
                    break;
                case 8:
                    Chaine = Chaine + 'L' + 'X' + 'X' + 'X';
                    break;
                case 7:
                    Chaine = Chaine + 'L' + 'X' + 'X';
                    break;
                case 6:
                    Chaine = Chaine + 'L' + 'X';
                    break;
                case 5:
                    Chaine = Chaine + 'L';
                    break;
                case 4:
                    Chaine = Chaine + 'X' + 'L';
                    break;
                case 3:
                    Chaine = Chaine + 'X' + 'X' + 'X';
                    break;
                case 2:
                    Chaine = Chaine + 'X' + 'X';
                    break;
                case 1:
                    Chaine = Chaine + 'X';
                    break;
            }

            nombre = nombre%10;

            }
            if (nombre > 0) {
            switch (nombre) {
                case 9:
                    Chaine = Chaine + 'I' + 'X';
                    break;
                case 8:
                    Chaine = Chaine + 'V' + 'I' + 'I' + 'I';
                    break;
                case 7:
                    Chaine = Chaine + 'V' + 'I' + 'I';
                    break;
                case 6:
                    Chaine = Chaine + 'V' + 'I';
                    break;
                case 5:
                    Chaine = Chaine + 'V';
                    break;
                case 4:
                    Chaine = Chaine + 'I' + 'V';
                    break;
                case 3:
                    Chaine = Chaine + 'I' + 'I' + 'I';
                    break;
                case 2:
                    Chaine = Chaine + 'I' + 'I';
                    break;
                case 1:
                    Chaine = Chaine + 'I';
                    break;
            }
            }
            return Chaine;
        }

}
