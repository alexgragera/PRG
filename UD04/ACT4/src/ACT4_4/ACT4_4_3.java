package ACT4_4;

import ACT4_1.UtilitatsArrays;
import ACT4_2.UtilitatsMatrius;
import ACT4_3.UtilitatsConsola;


 /**
  * Crea una classe que inicialitzi una matriu quadrada, pe 5x5:
  *      Mostra-la per pantalla, cada fila a una línia.
  */
public class ACT4_4_3 {
     /**
     *
     * @param posicio
     * @param car
     * @param mida
     * @return args Els arguments passats per la línia de comandes
     */
    /*
        FULLA --> fulla
        BUIT --> res
        des de 1 fins a (FULLA-1) --> cuc
    */   
    static int FULLA = 99;
    static int BUIT = 0;
    static int[][] tauler;
    static int[] posicio;
    
    public static void posicionarFulla(int[][] tauler) {
        int mida = tauler.length;
        int[] fulla;
        boolean ok = true;
        
        do {
            fulla  = UtilitatsArrays.generaArray(2,0, mida-1);
            if (tauler[fulla[0]][fulla[1]] == 0) {
                tauler[fulla[0]][fulla[1]] = FULLA;
                ok = false;
            }
        } while (ok);
        
    }
    
    public static int cambiarPosicio(int[][] tauler, int[] posicio, int accio, int longitudCuc) {
        int mida = tauler.length;
 
        switch (accio) {
            case 4 -> // ESQ
                posicio[1] = (posicio[1] == 0 ? mida-1 : posicio[1]-1); 
            case 6  -> // DRETA
                posicio[1] = (posicio[1] == mida-1 ? 0 : posicio[1]+1); 
            case 8  -> // ALT
                posicio[0] = (posicio[0] == 0 ? mida-1 : posicio[0]-1); 
            case 2 -> //BAIX
                posicio[0] = (posicio[0] == mida-1 ? 0 : posicio[0]+1); 
        }
        
        if ((tauler[posicio[0]][posicio[1]]) == FULLA) {        // cuc menja fulla
            longitudCuc++;
            tauler[posicio[0]][posicio[1]] = longitudCuc;
            
            posicionarFulla(tauler); // nova fulla
        } else if ((tauler[posicio[0]][posicio[1]]) == BUIT) {  // cuc es mou
            for (int i=0; i<mida; i++) {
                for (int j=0; j<mida; j++) {
                    if ((tauler[i][j] > BUIT) & (tauler[i][j] < FULLA)) {
                        tauler[i][j] = tauler[i][j] - 1;
                    }
                }
            }
            tauler[posicio[0]][posicio[1]] = longitudCuc;
        } else {                                                // cuc es tropitja
            longitudCuc = BUIT-1;                               // fi de la partida !!!
        }
        
        return longitudCuc;
    }
    
    public static void main(String[] args) {
        final int MIDA = UtilitatsConsola.llegirSencer("Mida del tauler: ");
        int longitudCuc = 1;
        int accio;
        
        tauler = UtilitatsMatrius.generaMatriu(MIDA, 0, 0);
        posicio = UtilitatsArrays.generaArray(2,0, MIDA-1); // primera posició cuc
        tauler[posicio[0]][posicio[1]] = longitudCuc;   // situar el cuc al tauler
        posicionarFulla(tauler);                           // situar la primera fulla
        
        do {
            UtilitatsJocs.mostrarTauler(tauler, longitudCuc);
            accio = UtilitatsConsola.llegirSencer("Puntuació: " + (float) longitudCuc +  " | 8:ALT, 4:ESQUERRA, 6:DRETA, 2:BAIX; 0:SORTIR: ");
            if ((accio == 2) | (accio == 4)| (accio == 6)| (accio == 8)) {
                longitudCuc = cambiarPosicio(tauler, posicio, accio, longitudCuc);
                accio = (longitudCuc == BUIT-1 ? 0 : accio); // fi de la partida ?
            }
        } while (accio != 0);
    }
}
