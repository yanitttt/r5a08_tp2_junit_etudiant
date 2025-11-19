//
// Utilisation nominale des classes td3.Buffer, Killring et td3.Editor
//
////////////////////////////////////////////////////////////////

import fr.einfolearning.tp2.metiers.EmacsKillRing;
import fr.einfolearning.tp2.metiers.TextBuffer;
import fr.einfolearning.tp2.metiers.TextEditor;
import fr.einfolearning.tp2.metiers.exceptions.EmacsKillRingOverflowException;

public class App {

    public static void main(String[] args) throws EmacsKillRingOverflowException {
        // A completer

        TextEditor textEditorCourant = new TextEditor("je suis un editeur de texte");
        textEditorCourant.setCursor(3);
        textEditorCourant.setMark(7);

        textEditorCourant.killRingBackup();

        System.out.println(textEditorCourant.getBuffer());

        //decoupe une sous-chaine
        textEditorCourant.setCursor(11);
        textEditorCourant.setMark(16);

        textEditorCourant.killSection();

        System.out.println(textEditorCourant.getBuffer());

    }
}
