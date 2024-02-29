public class PolymorphismeExemple {
    public static void main(String arg[]) {
        //Creation des objets
        Animal animal = new Animal(); //Objet animal
        Animal chien = new Chien(); //Objet chien
        Animal chat = new Chat (); //Objet chat
        Animal canard = new Canard(); //Objet Canard
        animal.son();
        chien.son();
        chat.son();
        canard.son ();
    }
}
