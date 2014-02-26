package IUT.BoBot.SmartCells;

/**
 * Created by p12003701 on 26/02/14.
 */
public class RomanCell {

        public int decode(final String chaine) {
            int nB = 0;
            final int trois = 3;
            final int cinq = 5;
            final int huit = 8;
            final int dix = 10;
            final int trente = 30;
            final int cinquante = 50;
            final int qvingt = 80;
            final int cent = 100;
            final int tcent = 300;
            final int ccent = 500;
            final int hcent = 800;
            final int mille = 1000;

            for (int i = 0; i < chaine.length(); ++i) {
                switch (chaine.charAt(i)) {
                    case 'I' :
                        nB++;
                        break;

                    case 'V' :
                        if (i != 0 && chaine.charAt(i - 1) == 'I') {
                            nB += trois;
                        }
                        else {
                            nB += cinq;
                        }
                        break;

                    case 'X' :
                        if (i != 0 && chaine.charAt(i - 1) == 'I') {
                            nB += huit;
                        }
                        else {
                            nB += dix;
                        }
                        break;

                    case 'L' :
                        if (i != 0 && chaine.charAt(i - 1) == 'X') {
                            nB += trente;
                        }
                        else {
                            nB += cinquante;
                        }
                        break;

                    case 'C' :
                        if (i != 0 && chaine.charAt(i - 1) == 'X') {
                            nB += qvingt;
                        }
                        else {
                            nB += cent;
                        }
                        break;

                    case 'D' :
                        if (i != 0 && chaine.charAt(i - 1) == 'C') {
                            nB += tcent;
                        }
                        else {
                            nB += ccent;
                        }
                        break;

                    case 'M' :
                        if (i != 0 && chaine.charAt(i - 1) == 'C') {
                            nB += hcent;
                        }
                        else {
                            nB += mille;
                        }
                        break;
                    default:
                        throw new ArithmeticException();
                }
            }
            return nB;
        }
}
