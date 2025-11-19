//
// Utilisation nominale des classes td3.Buffer, Killring et td3.Editor
//
////////////////////////////////////////////////////////////////

import fr.einfolearning.tp2.metiers.EmacsKillRing;
import fr.einfolearning.tp2.metiers.TextBuffer;
import fr.einfolearning.tp2.metiers.TextEditor;
import fr.einfolearning.tp2.metiers.exceptions.EmacsKillRingOverflowException;

public class App {


    public static void main(String[] args) throws EmacsKillRingOverflowException, IllegalAccessException {
        // A completer

        System.out.println("ETAPE 1 : ");
        TextEditor textEditorCourant = new TextEditor("je suis un editeur de texte");
        System.out.println("TextEditor instancié");

        System.out.println("ETAPE 2 : ");
        textEditorCourant.setCursor(3);
        textEditorCourant.setMark(7);

        textEditorCourant.killRingBackup();

        displayBuffer(textEditorCourant);

        System.out.println("ETAPE 3 : ");

        //decoupe une sous-chaine
        textEditorCourant.setCursor(11);
        textEditorCourant.setMark(16);

        textEditorCourant.killSection();

        displayBuffer(textEditorCourant);

        System.out.println("ETAPE 4 : ");
        textEditorCourant.setCursor(8);

        textEditorCourant.yank();

        displayBuffer(textEditorCourant);

        System.out.println("ETAPE 5 : ");
        textEditorCourant.yankPop();

        displayBuffer(textEditorCourant);

    }

    private static void displayBuffer(TextEditor t){
        System.out.println(t.getBuffer());
    }
}
